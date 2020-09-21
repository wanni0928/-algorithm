class Solution {
    public int countStrike(int[] paramNum, int[] compareNum){
        int count = 0;
        
        for(int i = 0; i < paramNum.length; i++){
            if(paramNum[i] == compareNum[i]){
                count++;
            }
        }
        
        return count;
    }
    
    public int countBall(int[] paramNum, int[] compareNum){
        int count = 0;
        
        for(int i = 0; i < paramNum.length; i++){
            for(int j = 0; j < compareNum.length; j++){
                if(paramNum[i] == compareNum[j] && i != j){
                    count++;
                }
            }
        }
        
        return count;
    }
    
    public int[] dividedNums(int num){
        int[] answer = new int[3];
        answer[0] = num / 100;
        answer[1] = (num - (answer[0] * 100))/10;
        answer[2] = num - ((answer[0] * 100) + (answer[1] * 10));
        return answer;
    }
    
    public int solution(int[][] baseball) {
        int answer = 0;
        int[] paramNum = new int[3];
        int[] compareNum = new int[3];
        
        int paramStrike = 0;
        int paramBall = 0;
        
        int strikeCount = 0;
        int ballCount = 0;
        boolean check = false;
        
        for(int i = 123; i < 988; i++){
            check = false;
            compareNum = dividedNums(i);
            if(compareNum[0] == compareNum[1] 
               || compareNum[0] == compareNum[2] 
               || compareNum[1] == compareNum[2]
               || compareNum[1] == 0
               || compareNum[2] == 0
              ){
                continue;
            }else{
                // System.out.print(compareNum[0]);
                // System.out.print(compareNum[1]);
                // System.out.print(compareNum[2]);
                // System.out.println(baseball.length);
                for(int j = 0; j < baseball.length; j++){
                    paramNum = dividedNums(baseball[j][0]);
                    paramStrike = baseball[j][1];
                    paramBall = baseball[j][2];
                    
                    strikeCount = countStrike(paramNum, compareNum);
                    ballCount = countBall(paramNum, compareNum);
                    if(paramStrike == strikeCount && paramBall == ballCount ){
                        check = false;
                    }else{
                        check = true;
                        break;
                    }
                }
                if(!check){
                    // System.out.println(i);
                    answer++;
                }
            }
        }
        return answer;
    }
}