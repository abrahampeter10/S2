
awk '/windows/ {print}' "li.txt"



#Prints 3rd word
echo "-----------------------"

awk '/windows/ {print $3}' "li.txt"


#Prints 1st and 3rd word
echo "-----------------------"

awk '/windows/ {print $1,$3}' "li.txt"


#Prints 3rd line
echo "-----------------------"
awk NR==3 "li.txt"




#  Print line number + content
echo "-----------------------"
awk '{print NR, $0}' li.txt



echo "-----------------------"
awk '$1=="windows" {print}' li.txt