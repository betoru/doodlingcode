### github 잔디 심기
> github 에 프로젝트 혹은 놀이터 개념으로 저장소에 업로드를 했는데 잔디가 심어지지 않았을 경우,
> credential 정보가 달라서 그럴 수 있다.
> 이럴 경우, 다음과 같이 credential 정보를 변경하고 잔디를 심어보자.
```bash
git filter-branch --env-filter '
WRONG_EMAIL="betoru@anyssign.com"
NEW_NAME="BaeHyoYeol"
NEW_EMAIL="betoru@naver.com"

if [ "$GIT_COMMITTER_EMAIL" = "$WRONG_EMAIL" ]
then
export GIT_COMMITTER_NAME="$NEW_NAME"
export GIT_COMMITTER_EMAIL="$NEW_EMAIL"
fi
if [ "$GIT_AUTHOR_EMAIL" = "$WRONG_EMAIL" ]
then
export GIT_AUTHOR_NAME="$NEW_NAME"
export GIT_AUTHOR_EMAIL="$NEW_EMAIL"
fi
' --tag-name-filter cat -- --branches --tags

# ...few moments later
git push origin +branch
```
---

### git branch 병합 팁
> 공통작업의 경우 각 서버 브랜치에 공통으로 반영해야 할 경우가 있다.
> 이럴 경우, 다음과 같이 각 브랜치에 병합을 할 수 있다.
- branch 변수에 병합 할 브랜치명들을 넣는다.
- 반복문을 통해 각 브랜치에 병합을 한다.
- 각 브랜치에 병합 후 push를 한다.
```bash
for branch in branch1 branch2 branch3; do git checkout $branch && git merge feature-branch -m "Merging feature-branch into $branch" && git push origin $branch; done
```
---
