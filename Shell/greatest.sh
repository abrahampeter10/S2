#!/bin/bash

read -p "Enter 3 number: " a b c
if [ $a -gt $b ] && [ $a -gt $c ]
then
echo $a " is the largest"
elif [ $b -gt $c ]
then
echo $b " is the largest"
else
echo $c " is the largest"
fi
