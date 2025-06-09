
read -p "Enter a string:" str

echo "$str" | tr 'a-z' 'A-Z'

for((i=0;i<${#str};i++))
do
    echo "${str:i:1}"
done