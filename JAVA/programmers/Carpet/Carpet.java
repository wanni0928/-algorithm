class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int yCol = 0;
        int yRow = 0;
        int o1 = 0;
        int o2 = 0;
        int result = 0;
        
        for(int i = 1; i <= yellow; i++){
            if(yellow % i == 0){
                o1 = i;
                o2 = yellow / i;
                yCol = o1 > o2 ? o1 : o2;
                yRow = o1 > o2 ? o2 : o1;
                result = (yCol + yRow + 2) * 2;
                if(brown == result){
                    answer[0] = yCol + 2;
                    answer[1] = yRow + 2;
                    break;
                };
            }
        }
        
        return answer;
    }
}