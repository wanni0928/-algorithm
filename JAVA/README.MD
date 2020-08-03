# Algorithm JAVA

* 전화번호 목록 [소스 코드](https://github.com/wanni0928/-algorithm/blob/master/JAVA/PhoneNumber_recap3.java)
    1. 문제 설명
        전화번호부에 적힌 전화번호 중, 한 번호가 다른 번호의 접두어인 경우가 있는지 확인하려 합니다.
        전화번호가 다음과 같을 경우, 구조대 전화번호는 영석이의 전화번호의 접두사입니다.

        * 구조대 : 119
        * 박준영 : 97 674 223
        * 지영석 : 11 9552 4421

        전화번호부에 적힌 전화번호를 담은 배열 phone_book 이 solution 함수의 매개변수로 주어질 때, 어떤 번호가 다른 번호의 접두어인 경우가 있으면 false를 그렇지 않으면 true를 return 하도록 solution 함수를 작성해주세요.
    
    2. 문제 인식
        * '어떤 번호가 다른 번호의 접두어'인 경우 : 특정 인덱스의 '번호'가  다른 인덱스의 '번호'에 0번 인덱스 부터 특정 인덱스의 길이 까지 포함된다.

        * 어떤 번호가 다른 번호의 접두어인 경우가 있으면 false : 위의 경우가 하나라도 된다면, 더이상 탐색할 필요가 없다.

        * 첫 번째 경우가 충족하려면 특정 인덱스의 값의 '길이'가 비교할 대상의 인덱스의 값의 '길이' 보다 짧아야 한다. : 배열을 값의 길이 순서로 오름차순으로 정렬하는 것이 더 효율적일 수 있다.

    3. 문제 해결
        1. 배열의 순서를 값의 길이가 짧은 것 순서대로 재배열 한다.
        
        2. 0번 인덱스를 기준으로 다음 인덱스 까지 접두어로 포함이 되는지 확인한다.

        3. 포함되는 인덱스의 값이 있으면, false를 리턴하고, 프로그램을 끝낸다.
        
        4. 포함되는 인덱스의 값이 없다면, 1번 인덱스를 기준으로 다시 2번 과정을 진행한다.

        5. 2, 3, 4번 과정을 배열의 끝까지 살펴 봤음에도, 포함되는 인덱스의 값이 없다면, true를 리턴하고 프로그램을 끝낸다.

    4. 해결방향
        1. for문을 이용하여, 배열의 길이 순으로 정리할 수 있지만, 좀더 가독성이 좋고, 시간복잡도도 줄일 수 있는 Arrays api의 sort 함수와 Comparator 인터페이스로 진행한다.(for -> n ~ n^2, Arrays, Comparator -> nlogn)

        2. 배열의 요소 하나씩 차례대로 살펴봐야 하기 때문에, 향상된 for문을 사용하고, 접두어로 포함되는 인덱스의 갯수를 리턴하기 위해, stream의 filter().count() 함수를 사용하고 그 갯수를 count 변수에 담는다.

        3. 그 갯수가 2개 이상일 경우(1개 이상으로 할 경우, 접두어의 기준으로 삼은 인덱스 의 갯수 까지 포함한다.) false를 리턴. 그렇지 않으면 true를 리턴한다.
    
    5. 주의사항
        * Arrays api를 포함한 모든 스트림 기능은 병렬처리 기능을 가진다. 여기서 병렬 처리(Parallel Operation)은 멀티 코어 CPU환경에서 하나의 작업을 분할해서 각각의 코어가 병렬적으로 처리하는 것을 정의한다. 이러한 특성을 가져, 작업 처리 시간을 줄일 수 있다. 하지만, 요소의 수가 적고 요소당 처리 시간이 짧으면, 순차 처리가 오히려 병렬 처리보다 빠를 수 있다.

        * 요약하자면, java util 내의 api 함수를 사용하는 것이 무조건 빠르다고는 할 수 없다.
    
    출처 [https://programmers.co.kr/learn/courses/30/lessons/42577](https://programmers.co.kr/learn/courses/30/lessons/42577)



* 완주하지 못한 선수 [소스 코드](https://github.com/wanni0928/-algorithm/blob/master/JAVA/marathon_fine_answer.java)

    출처 [https://programmers.co.kr/learn/courses/30/lessons/42576?language=java](https://programmers.co.kr/learn/courses/30/lessons/42576?language=java)