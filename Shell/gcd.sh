#!/bin/bash

read -p "Enter 2 numbers: " a b

while [[ $a -gt 0 && $b -gt 0 ]]
do
if [ $a -gt $b ]
then
let a=a%b
else
let b=b%a
fi
done

if [ $a -eq 0 ]
then
echo "GCD Is $b"
else
echo "GCD is $a"
fi