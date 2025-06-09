#!/bin/bash

echo "Enter Hex number"
read hex
echo -n "Hex value of it: " 
echo "obase=10; ibase=16; $hex" | bc