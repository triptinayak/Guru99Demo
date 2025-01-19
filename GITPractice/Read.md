//This is a test read me file to handle GIT

Create new branch
=> git branch branchname1

change working directory master to branchname1
=> git checkout branchname1

Add some files to branch
read.md index.html name.jpg

create a new branch in master
=> git checkout -b emergency-fix

If branch is created locally and never pushed to GITHUB, To push the current branch and set the remote as upstream, use
 =>   git push --set-upstream origin hello-world-images" 

swicth to master than merge the emergency-fix to master branch
git checkout master
git merge emergency-fix

delete branch after changes of emergency-fix moved to master
=> git branch -d emergency-fix

