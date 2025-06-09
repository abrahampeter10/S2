
read -p "Enter a file name to search:" filename

read -p "Enter the text to search: " text
grep -i -n $text $filename 