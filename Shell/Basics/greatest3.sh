#!/bin/bash

read -p "Enter 3 num: " a b c
if(( a >b && a>c))
then
echo "$a is bigger"
elif(( b>c))
then
echo "$b is biggest"
else
echo "$c is biggest"
fi