#THIS FILE SHOULD NOT BE RUN ON DATA, IT IS MEANT TO BE RUN ON THE RASPBERRY PI VM AFTER YOU RUN PREPTESTS ON DATA

#For this to run on the raspberry pi vm, you'll need to install sshpass: sudo apt-get install sshpass

sshpass -p "<Your Password>" scp -r <Your Username>@data.cs.purdue.edu:<Path to this git repo on your computer>/tests/filesToTest .
PASS=0
FAIL=0
RED='\033[0;31m'
NC='\033[0m'
BLUE='\033[0;34m'
ORANGE='\033[;33m'
PINK='\033[;35m'

for sFile in filesToTest/*.s
do
    gcc -o out $sFile > /dev/null
    ./out > myOutput.txt
    fileName="${sFile%%.*}"
    printf "File name: %s\n\n" $fileName
    if [ $? -eq 0 ]; then
        if diff myOutput.txt ${fileName}.txt; then
            printf "${BLUE}Test Case %s Successful\n\n${NC}" $fileName
            PASS=$((PASS+1))
        else
            printf "${RED}Test Case %s Failed\n${NC}" $fileName
            FAIL=$((FAIL+1))
        fi

    else
        printf "${RED}Test Case %s Failed to execute\n${NC}" $fileName
        FAIL=$FAIL+1
    fi
    printf "\n\n"
done

printf "Finished testing with\n"
printf "%d passing\n" $PASS
printf "%d failing\n" $FAIL
