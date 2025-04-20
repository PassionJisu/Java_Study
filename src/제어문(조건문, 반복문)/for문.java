public class for문 {
    public static void main(String[] args) {
        int total = 0;
        for(int i = 1;i <= 100; i++){
            // if(i % 2 != 0){
            //     continue; //아래 쪽에 반복문에 해당하는 부분은 반복하지 않고 위로 올라감
            // }
            total += i;

            if(i == 50){
                break;
            }
        }

        System.out.println(total);
    }
}
