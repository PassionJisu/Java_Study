package 프로그래머스.Level1;

class 추억점수 {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        
        for(int i = 0; i < photo.length; i++)
        {
            int sum = 0;
            for(int j = 0; j < photo[i].length ; j++)
            {   
                for(int k = 0; k < name.length; k++)
                {
                    if(photo[i][j].equals(name[k])) sum += yearning[k];
                }
                answer[i] = sum;
            }
        
        } 
        return answer;
    }
}
