#!/bin/bash

file_path="Extras/S2 Lab/Shell/calculator.sh"

for word in $(cat "$file_path"); do
    echo "$word"
done
