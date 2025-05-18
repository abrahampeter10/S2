#!/bin/bash

read -p "Enter file name: " file3
echo "Enter content for $file3"
cat > $file3
read -p "Enter the number of line:" l
tail +$l $file3