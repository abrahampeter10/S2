#!/bin/bash

#  count=4
#  if(( $count == 5 ))
#  then
#     echo "Hey I am equal"
#  elif(( count < 5 ))
#  then
#     echo "Im not equal, but less"
# else
#     echo "I'm Greater"
# fi


n=1

while((n<10))
do
    echo $n
    let n=n+1
done

