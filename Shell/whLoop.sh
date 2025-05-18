#!/bin/bash

count=1
num=10

while [ $num -gt 0 ]
do
echo $count
let num--
let count++
done