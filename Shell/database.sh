    #!/bin/bash

i="y"
read -p "Enter name of database: " db
while [ $i = "y" ]
do
    
    echo "1. View Databse"
    echo "2. View SPecific record"
    echo "3. Add Record"
    echo "4. Delete Record"
    echo "5. Exit"
    read -p "Enter any operation: " op
    case $op in
    1)
    cat $db;;
    2)
    read -p "Enter id to view: " id
    grep -i "$id" $db;;
    3)
        read -p "Enter new student ID: " tid
        read -p "Enter new name: " nm
        read -p "Enter designation: " des
        read -p "Enter college name: " college
        echo "$tid $nm $des $college">>$db;;
    4)
        read -p "Enter id to delete" idDel
        grep -v "$idDel" $db > dbs
        echo "Record is deleted"
        cat dbs;;
    5) exit;;

    *) echo "Invalid choice"
    esac
    read -p "DO you wanna continue?" i
    if [ $i != "y" ]
    then    
        exit
    fi
done