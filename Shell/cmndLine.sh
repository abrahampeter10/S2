    #!/bin/bash


num1=$1  #Here $1 is the first argument
num2=$2   #Here $2 is the first argument
let sum=num1+num2
echo $sum
echo $@  #Prints all the argument

