read -p "Enter string: " str
read -p "Word to replace: " old
read -p "New word: " new

words=($str)
result=""

for word in "${words[@]}"; do
    if [ "$word" == "$old" ]; then
        result+="$new "
    else
        result+="$word "
    fi
done

echo "Modified string: $result"
