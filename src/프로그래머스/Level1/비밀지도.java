public class 비밀지도 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for(int i = 0; i < n ; i++){
            String str = "";
            for(int j = 0; j < n; j++){
                if(arr1[i]%2 == 1 || arr2[i]%2 == 1){
                    str = "#" + str;
                }
                else{
                    str = " " + str;
                }
                arr1[i] /= 2;
                arr2[i] /= 2;
            }
            answer[i] = str;
        }
        return answer;
    }
}
