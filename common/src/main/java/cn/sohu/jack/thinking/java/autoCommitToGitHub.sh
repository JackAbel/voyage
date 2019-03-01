#! /bin/bash

# commit voyage to github on 22:00 weekday

cd /Users/JackKing/work/Idea_Projects/voyage/
commit_date=`date +%Y%m%d%H`

git commit -am "boy, good work!"
echo "push is success!"
git push

exit $?