# find find [path] [options] [expression]


# Finds files having size more than 1 MB
# c for byte, k KB, G GB, m MB
find . -size +1M


# Checking if type is file or directory
find . -type d


# Checking if file with particular name exist or not
find . -name delay.sh
find . -iname DElay.sh


#File names starting with 'a'
find . -name a*


#Find files which modified after a file
# Here finding the files which has been modified after grep.sh
find . -newer grep.sh


#Finding all empty directory
find . -empty