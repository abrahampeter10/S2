
    str="hello"

    rev=""

    len=${#str}

    for((i=0;i<len;i++))
    do
        rev+="${str:len-i-1:1}"    
    done
    echo "$rev"