function solution(bridge_length, weight, truck_weights) {
    let answer = 0;
    let bridge = [];
    let bridge_weight_sum = 0;
    
    for(let i = 0; i < bridge_length; i++){
        bridge.push(0);
    }
    
    let on_truck = truck_weights.shift();
    bridge.unshift(on_truck);
    bridge.pop();
    
    bridge_weight_sum += on_truck;
    answer++;
    
    while(bridge_weight_sum) {
        bridge_weight_sum -= bridge.pop();
        
        on_truck = truck_weights.shift();
        if(on_truck + bridge_weight_sum <= weight){
            bridge.unshift(on_truck);
            bridge_weight_sum += on_truck;
        }else{
            bridge.unshift(0);
            truck_weights.unshift(on_truck);
        }
        answer++;
    }
    return answer;
}