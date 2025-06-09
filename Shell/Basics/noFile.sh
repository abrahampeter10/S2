dir='./'
count=0
for var in "$dir"/*
do
    if [ -f "$var" ]
    then
    let count=count+1
    fi
done
echo $count




find . -type f | wc -l