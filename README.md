# CS352_Lab1_TestCases
Test Cases for mini java compiler

Test cases that have valid input should be named p_x.txt, and test cases that have invalid input are named f_x.txt

Branch for Part 1 tests only the Grammar, not the syntax of the grammar. Master is currently on part 2 of the project, testing for syntax errors. If you would like to contribute to test cases, please try to keep each file to one syntax error per file, so that the test script can be use succesfully. 

Test Script Detail: The test script assumes that it is in one directory below wherever your parser executable is. When run, it executes the ./parser file with all the f_.java and p_.java files as input. It expects the program to return 0 for p files, and not 0 for the f files. It does NOT check any of the programs output, only if it thinks the program that was inputed was parsed succesfully. 
