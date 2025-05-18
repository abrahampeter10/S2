#!/bin/bash
read -p "Enter first file name: " file1
read -p "Enter second file name: " file2
read -p "Enter third file name: " file3
echo "Enter contents of $file1: "
cat > $file1
echo "Enter contents of $file2: "
cat > $file2
echo "Differnces b/w $file1 and $file2 is saved in $file3"
diff -n $file1 $file2 > $file3
cat $file3 