# 완주하지 못한 선수

## 문제 설명
수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.

마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때, 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.

## 제한사항
- 마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
- completion의 길이는 participant의 길이보다 1 작습니다.
- 참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
- 참가자 중에는 동명이인이 있을 수 있습니다.

## 해결방향
1. 문제 인식
    * '참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.' : 대소문자 구문x
    
    * 참가자 중에는 동명이인이 있을 수 있다. : 단순히 '이름'을 기준으로 진행하면, 중복 삭제가 될 수 있다.

    * 'completion의 길이는 participant의 길이보다 1 작습니다.' : 완주하지 못한 선수는 무조건 1명이다.

2. 문제 해결
    1. 같은 이름의 인덱스도 구분해야하기 때문에, HashMap으로 key-value에 해당하는 재너릭 변수명을 각각 '이름', '중복횟수'로 지정하고 인스턴스를 초기화 한다.

    2. '참가자 배열'을 향상된 for문을 돌려 해쉬맵에 "이름", 1로 put 하되, 같은 이름의 인덱스로 put을 하게 될때마다, 기존 '중복횟수'에서 1을 더한다.

    3. '경쟁자 배열' 향상된 for문을 돌려 동일하게 해쉬맵에 적용하되, 이미 적용된 해쉬맵이 검색될 때마다. 기존 중복횟수에서 -1을 한다.

    4. 해쉬맵 인스턴스가 두개의 for문을 거치면, 결과적으로 0 혹은 1의 값을 가진 키셋이 형성된다.
        해당 해쉬맵에 Iterator와 Entry를 이용해, 해쉬 테이블을 전체적으로 검색하고 그중에서 중복횟수 '값'이 1을 가진 키가 검색된다면, 그 키 값을 리턴하고, 프로그램을 끝낸다. 

3. 주의사항
    * 다른 사람의 풀이를 보면, 간혹 해쉬앱을 바로 for문에 적용하여, 검색하는 풀이를 볼 수 있는데, 코드의 길이와 가독성을 보면 언듯 더 편리해보이지만, EntrySet의 getValue()가 HashMap의 get() 보다 사용하는 함수의 갯수가 더 적고, 실행 속도도 빠르기 때문에, 해쉬에서 값이나 키를 출력할 때는 EntrySet을 사용하는 것이 결과적으로는 더 효율적이다.

    * [출처 : https://stackoverflow.com/questions/3870064/performance-considerations-for-keyset-and-entryset-of-map](https://stackoverflow.com/questions/3870064/performance-considerations-for-keyset-and-entryset-of-map)

출처 [https://programmers.co.kr/learn/courses/30/lessons/42576?language=java](https://programmers.co.kr/learn/courses/30/lessons/42576?language=java)
