const trucks = [7,4,5,6];
const trucks2 = [10];

function solution(bridge_length, weight, truck_weights) {
    var answer = 0;
    let trucks = truck_weights.length > 1 ? truck_weights.reverse() : truck_weights;
    let onBridge = [];
    let afterBridge = [];
    while(true){
        if(truck_weights.length != 0){
            if(onBridge.reduce((accumulator, currentValue) => accumulator + currentValue) < bridge_length){
                
            }
            onBridge.push(trucks.pop());
            // console.log(onBridge.shift());
            
        }else{
            console.log("end")
            break;
        }
    }
    console.log(onBridge);
    return answer;
}

function init() {
    solution(2, 10, trucks);
    solution(2, 10, trucks2);
}

init();