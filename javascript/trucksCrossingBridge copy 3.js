function solution(bridge_length, weight, truck_weights) {
    // 총 시간 수.
    let answer = 0;
    // 다리 위의 트럭.
    let bridge = [];
    // 다리 위의 트럭 총 무게
    let total = 0;
    // 다리 길이만큼 큐 생성
    for(let i = 0; i < bridge_length; i++){
        bridge.push(0);
    }
    
    // 맨 앞 트럭의 무게
    let on_truck = truck_weights.shift();
    bridge.unshift(on_truck);
    bridge.pop();
    
    total += on_truck;
    answer++;
    
    while(total) {
        total -= bridge.pop();
        on_truck = truck_weights.shift();

        // 다리가 버틸 수 있다면.
        if(on_truck + total <= weight){
            bridge.unshift(on_truck);
            total += on_truck;
        }
        // 그게 아니라면.
        else{
            bridge.unshift(0);
            truck_weights.unshift(on_truck);
        }
        answer++;
    }
    return answer;
}