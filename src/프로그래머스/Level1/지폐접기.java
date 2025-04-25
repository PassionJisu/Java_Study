package 프로그래머스.Level1;
class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        
        boolean flag = (wallet[0] >= bill[0] && wallet[1] >= bill[1]);
        
        while(!flag){
            
            if(bill[0] > bill[1]){
                bill[0] /= 2;
                answer ++;
            }
            else {
                bill[1] /= 2;
                answer ++;
                }
            if(bill[0] <= wallet[1] && bill[1] <= wallet[0]){
                int temp = bill[0];
                bill[0] = bill[1];
                bill[1] = temp;
            }
            flag = (wallet[0] >= bill[0] && wallet[1] >= bill[1]);
        }
        return answer;
    }
}