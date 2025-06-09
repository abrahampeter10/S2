#!/bin/bash
while true
do
  read -p "Enter 2 integers: " a b
  read -p "Enter the operator (+, -, *, /): " op

  case $op in
    "+")
      ans=$((a + b))
      ;;
    "-")
      ans=$((a - b))
      ;;
    "*")
      ans=$((a * b))
      ;;
    "/")
      if [ $b -eq 0 ]; then
        echo "Error: Division by zero"
        continue
      else
        ans=$((a / b))
      fi
      ;;
    *)
      echo "Invalid operator. Exiting."
      exit 1
      ;;
  esac

  echo "$a $op $b = $ans"
done
