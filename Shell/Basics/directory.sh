#!/bin/bash

read -p "Enter an directory to check: " directo

if [ -d $directo ]
then
echo "$directo is a directory";
else
echo "Not a" $directo;
fi
