function solution(a, b) {
    const days = ["MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"];
    var answer = '';
    const date = new Date(`${a} ${b} 2016`).getUTCDay();
    answer = days[date];
    return answer;
}

solution(6, 9);