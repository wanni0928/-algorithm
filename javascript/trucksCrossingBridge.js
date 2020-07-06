function solution(bridge_length, weight, truck_weights) {
    let times = [];
    let on_bridge = [];
    let truck = [];
    let seconds = 0;
    let finish_times = 0;
    let current_total_weight = 0;
    
    while(truck_weights.length !== 0){
        // console.log(truck_weights);
        if(current_total_weight <= weight){
            times.push(++seconds);
            on_bridge.push(truck_weights.shift());
            current_total_weight += on_bridge[on_bridge.length - 1];
            if(seconds - times[times.length - 1] === bridge_length){
                current_total_weight -= on_bridge[on_bridge.length - 1];
                if(on_bridge > 0){on_bridge.pop()};
                times.push(++seconds);
            }
        }else{
            times.push(++seconds);
        }
        
        if(seconds - times[times.length - 1] === bridge_length){
            current_total_weight -= on_bridge[on_bridge.length - 1];
            if(on_bridge > 0){on_bridge.pop()};
            times.push(++seconds);
        }

    }
    // console.log(times)
    finish_times = bridge_length + times[times.length - 1];
    return finish_times;
}