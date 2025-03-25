@echo Off
git config --global user.name "Made Artha"
git config --global user.email "arthawebid@gmail.com"
echo
git add .
git commit -m %1
git branch -M main
git push -u origin main