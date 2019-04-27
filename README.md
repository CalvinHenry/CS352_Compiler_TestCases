# CS352_Lab1_TestCases
Test Cases for mini java compiler


Branch for Part 1 tests only the Grammar, not the syntax of the grammar. Branch for Part 2 tests Grammar, Type Checking and interpretation. Check the readme on the other branches for info on how to run the test cases for the previous parts Master is currently on part 3 of the project.


Running the tests: 
Since Part 3 uses arm assembly, the test script runs ./mjava on data, and copies the output files over to the vm to test them. To run the test script, run ./prepTests on data, then run the testall.sh script on the virtual machine. 


Test Script Detail: The test script assumes that it is in one directory below wherever your parser executable is. (It assumes that the repo is cloned in the directory where your executable is). When run, it executes the ./parser file with all the java files in the directory as input. It expects the program to return 0 from main, or else it assumes your program reported a grammar or Typing violation. 

