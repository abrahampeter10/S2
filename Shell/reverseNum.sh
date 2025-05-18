    #!/bin/bash

read -p "Enter a number: " num    #45


let rev=0

while [ $num -gt 0 ];
do
    let rem=num%10  #4
    let rev=(rev*10)+rem
    let num=num/10
done
echo "$rev"
