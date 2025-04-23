package LeetCode;

public class $1399_CountLargestGroup {
    public int countLargestGroup(int n) {
        int arr[] = new int[37];
        for(int i = 1; i <= n; i++){
            arr[getDigitSum(i)] ++;
        }
        return getCount(arr);
    }

    public int getDigitSum(int n){
        int sum = 0;
        while(n >= 1){
            sum += n % 10;
            n /= 10 ;
        }
        return sum;
    }

    public int getCount(int arr[]){
        int max = 0;
        int count = 0;
        for(int i = 1; i < arr.length; i++){
            max = arr[i] > max ? arr[i] : max; 
        }
        for(int value : arr){
            if(value == max) count ++;
        }
        return count;
    }
}
