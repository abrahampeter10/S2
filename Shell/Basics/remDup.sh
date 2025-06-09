


sort fi.txt | uniq > remUnq.txt

cat remUnq.txt




#Just sort and remove dupli:

sort file.txt | uniq


# Count occurence

sort file.txt | uniq -c



#Only duplicate lines:

sort file.txt | uniq -d


#Only unique

sort file.txt | uniq -u
