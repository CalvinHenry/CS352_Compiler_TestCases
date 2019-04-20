#!/bin/bash

RED='\033[0;31m'
NC='\033[0m'
BLUE='\033[0;34m'
ORANGE='\033[;33m'
PINK='\033[;35m'
EXT=".java"
error=0
fails=0
tests=0
compFail=0
typeFail=0
runFail=0
pass=0
dir="$( cd "$( dirname "${BASH_SOURCE[0]}"  )" >/dev/null 2>&1 && pwd  )"

if [ "$dir" != "" ]; then
    cd $dir
fi


for file in *.java
do
    tests=$((tests+1))
    printf "Test Case: %s\n" $file
    ../mjavac  $file
    
    if [ $? -eq 0 ]; then
        outputFileName="${file%%.*}.s"
        printf "Output file name: %s\n" $outputFileName
        solutionsFileName="${file%%.*}.txt"
        mv ${outputFileName} filesToTest/
        javac $file
        if [ $? -eq 0 ]; then

            for classFile in p_*.class
            do
                name="${classFile%%.*}"
                java $name  > filesToTest/${solutionsFileName}
            done
            
            

            for tempFile in *.class
            do
                rm $tempFile
            done
        else
            printf "${ORANGE}Test case %s Failed to compile with javac\n\n${NC}" $file
            compFail=$((compFail+1))
        fi
        
    else
        cat userOutput.txt
        printf "${RED}Test Case %s Failed in TypeChecking\n\n${NC}" $file
        fails=$((fails+1))
        typeFail=$((typeFail+1))
    fi

done
rm javaOutput.txt
rm userOutput.txt

printf "=================================================\n"
printf "Finished testing with %d Failures out of %d tests\n" $fails $tests
printf "\n"
printf "Passes:                              %d\n" $pass
printf "Grammar and Type checking failures:  %d\n" $typeFail
printf "Interpretation failures:             %d\n" $runFail

if [ $compFail -ne 0 ]; then
    printf "\n"
    printf "${ORANGE}%d Test case(s) failed to compile with Javac. Please check the test cases and try to run them again" $compFail
fi

exit 0
