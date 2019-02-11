#!/bin/bash

RED='\033[0;31m'
NC='\033[0m'
BLUE='\033[0;34m'
error=0
fails=0
for file in p*.txt
do
    printf "Test Case: %s\n" $file
    ../parser < $file
    if [ $? -eq 0 ]; then
        printf "${BLUE}Test Case %s Successful\n${NC}" $file
    else
        printf "${RED}Test Case %s Failed \n${NC}" $file
        fails=$((fails+1))
    fi
done

for file in f*.txt
do
    printf "Test Case: %s\n" $file
    ../parser < $file
    if [ $? -eq 0 ]; then
        printf "${RED}Test Case %s Failed \n${NC}" $file
        fails=$((fails+1))
    else
        printf "${BLUE}Test Case %s Successful\n${NC}" $file
    fi
done
printf "Finished testing with %d Failures\n" $fails
exit 0
