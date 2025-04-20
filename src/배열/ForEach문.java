package 배열;

public class ForEach문 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        for(int i = 0; i<arr.length; i++){
            int value = arr[i];
            System.out.println(value);
        }

        for(int value:arr){
            System.out.println(value);
        }
    }
}
