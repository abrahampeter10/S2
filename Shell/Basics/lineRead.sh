read -p "Enter an filename: " file

if [ -f $file ]
then
    while IFS= read -r line
    do  
        echo "$line"
    done < $file
else
    echo "File not found"
fi