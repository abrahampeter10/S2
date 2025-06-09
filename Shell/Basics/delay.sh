
echo "Press any key to continue"

while true
do
    read -t 2 -n 1
    if(($?==0))
    then    
        echo "You terminated the script"
        exit;
    else    
        echo "Waiting to press the key"
    fi
    done
