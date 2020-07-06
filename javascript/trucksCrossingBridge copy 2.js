function solution(bridge_length, weight, truck_weights) {
    const length = truck_weights.length;
    const reducer = (a, b) => ([a[0] + b[0], 0])[0];
    let answer = 0;
    let seconds = 0;
    let total_weight = 0;
    let times = [];
    let on_bridge = [];
    let after_bridge = [];
    
    while(true){
        if(after_bridge.length === length){
            break;
        }else{
            if(on_bridge.length > 0 && on_bridge.reduce(reducer) > weight){
                if(seconds - on_bridge[on_bridge.length - 1][1] === bridge_length){
                    after_bridge.push(on_bridge.shift());
                }
                seconds++;
            }else{
                const new_truck = truck_weights.shift();
                seconds++;
                on_bridge.push([new_truck, seconds]);
                after_bridge.push(new_truck);
            }
        }
    }
    answer = bridge_length + seconds;
    return answer;
}