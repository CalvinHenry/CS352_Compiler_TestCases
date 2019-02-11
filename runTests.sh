#!/bin/bash
error=0
for file in p*.txt
do
    printf "Test Case: %s\n" $file
    ../parser < $file
    if [ $? -eq 0 ]; then
        printf "Test Case %s Successful\n" $file
    else
        printf "Test Case %s Failed \n" $file
    fi
done

for file in f*.txt
do
    printf "Test Case: %s\n" $file
    ../parser < $file
    if [ $? -eq 0 ]; then
        printf "Test Case %s Failed \n" $file
    else
        printf "Test Case %s Successful\n" $file
    fi
done
exit 0
