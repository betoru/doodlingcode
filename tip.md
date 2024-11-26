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