#!/bin/bash
read -p "Enter directory name you want to search: " dir
path="C:/Extras/S2 lab/$dir"

if [ -d "$path" ]; then
    echo "$path is a directory"
else
    echo "$path is not a directory"
fi
