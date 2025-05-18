    #!/bin/bash

    if [ $# -eq 1 ]
    then
        echo "Rev of $1"
        cat $1
        echo "->"
        tac $1
    fi