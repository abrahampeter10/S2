

# For replacing character, 
# Synatx: 's/old/new/g'      g - for global, if for first occurence avoid g
sed 's/i/W/g' li.txt

# For printing 2nd line, p in 2p means print
sed '2p' li.txt


# For deleting 2nd line, d in 2d means delete
sed '2d' li.txt


# Delete lines containing a word:
sed '/linux/d' li.txt    #It deletes all the line containing linux



# Delete lines 1 to 3
sed '1,3d' li.txt        
