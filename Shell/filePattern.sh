#!/bin/bash
read -p "Enter first file name: " file1
echo "Enter contents of $file1: "
cat > $file1
read -p "Enter the pattenr to search : " pat
grep -n $pat $file1

