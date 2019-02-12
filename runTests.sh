#!/bin/bash

RED='\033[0;31m'
NC='\033[0m'
BLUE='\033[0;34m'
EXT=".java"
error=0
fails=0
dir=""
if [ "$dir" != "" ]; then
    cd $dir
fi

for file in p*${EXT}
do
    printf "Test Case: %s\n" $file
    ../parser < $file
    if [ $? -eq 0 ]; then
        printf "${BLUE}Test Case %s Successful\n\n${NC}" $file
    else
        printf "${RED}Test Case %s Failed \n\n${NC}" $file
        fails=$((fails+1))
    fi
done

for file in f*${EXT}
do
    printf "Test Case: %s\n" $file
    ../parser < $file
    if [ $? -eq 0 ]; then
        printf "${RED}Test Case %s Failed \n\n${NC}" $file
        fails=$((fails+1))
    else
        printf "${BLUE}Test Case %s Successful\n\n${NC}" $file
    fi
done
printf "=================================\n"
printf "Finished testing with %d Failures\n" $fails
exit 0
