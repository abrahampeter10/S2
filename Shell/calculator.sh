#!/bin/bash

while true
do
    read -p "Enter two numbers: " a b
    read -p "Enter your operator (+ - * /): " op
    case $op in
        "+")
            ans=$((a + b));;
        "-")
            ans=$((a - b));;
        "*")
            ans=$((a * b));;
        "/")
            ans=$((a / b));;
        *)
            echo "Invalid operator. Exiting..."
            exit 1;;
    esac
    echo "$a $op $b 0= "  $ans
done
