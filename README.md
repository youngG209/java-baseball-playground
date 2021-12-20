# 숫자 야구 게임

## 기능 목록

- [X] 1부터 9까지의 서로 다른 임의의 수 3개를 생성한다. - NumberGenerator #createRandomNumbers()
- [X] 컴퓨터의 수(3자리)와 플레이어의 수(3자리)를 비교할 수 있다. - Referee #compare()
  - [X] 몇 개의 숫자가 같은지를 알 수 있다. - Judgment #correctCount()
  - [X] 특정 자리에 특정 숫자가 있는지 알 수 있다. - Judgment #hasPlace()
- [ ] 같은 수가 다른 자리에 있으면 **_볼_**
- [ ] 같은 수가 같은 자리에 있으면 **_스트라이크_**
- [ ] 같은 수가 전혀 없으면(일치하지 않으면) **_낫싱_**

## 기능 요구 사항

기본적으로 1부터 9까지 서로 다른 수로 이루어진 3자리의 수를 맟추는 게임

같은 수가 같은 자리에 있으면 스트라이크,
다른 자리에 있으면 볼,
같은 수가 전혀 없으면 포볼 또는 낫싱이란 힌트를 얻고,
그 힌트를 이용해서 면저 상대방(컴퓨터)의 수를 맞추면 승리

e.g. 상대방(컴퓨터)의 수가 425일 때, 
123을 제시한 경우 : 1스트라이크, 
456을 제시한 경우 : 1볼 1스트라이크, 
789를 제시한 경우 : 낫싱


## [NEXTSTEP 플레이그라운드의 미션 진행 과정](https://github.com/next-step/nextstep-docs/blob/master/playground/README.md)

---
## 학습 효과를 높이기 위해 추천하는 미션 진행 방법

---
1. 피드백 강의 전까지 미션 진행 
> 피드백 강의 전까지 혼자 힘으로 미션 진행. 미션을 진행하면서 하나의 작업이 끝날 때 마다 add, commit
> 예를 들어 다음 숫자 야구 게임의 경우 0, 1, 2단계까지 구현을 완료한 후 push

![mission baseball](https://raw.githubusercontent.com/next-step/nextstep-docs/master/playground/images/mission_baseball.png)

---
2. 피드백 앞 단계까지 미션 구현을 완료한 후 피드백 강의를 학습한다.

---
3. Git 브랜치를 master 또는 main으로 변경한 후 피드백을 반영하기 위한 새로운 브랜치를 생성한 후 처음부터 다시 미션 구현을 도전한다.

```
git branch -a // 모든 로컬 브랜치 확인
git checkout master // 기본 브랜치가 master인 경우
git checkout main // 기본 브랜치가 main인 경우

git checkout -b 브랜치이름
ex) git checkout -b apply-feedback
```