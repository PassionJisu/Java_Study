package 프로그래머스.Level1;

class 푸드파이트대회 {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i < food.length ; i++){
            int index = food[i] / 2;
            while(index > 0){
                sb.append(i);
                index--;
            }
        }
        StringBuilder reversed = new StringBuilder(sb).reverse();
        sb.append(0);
        sb.append(reversed);
        
        return sb.toString();
    }
}
