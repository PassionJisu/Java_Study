package 배열;

public class _2차원배열 {    
    public static void main(String[] args) {
        int[][] array = new int[3][4];
        array[0][1] = 10;
        
        int[][] array2 = new int[3][]; // column의 크기가 정해지지 않아서 2차원 배열이 아닌 1차원 배열 생성
        array2[0] = new int[1]; //0행에 1 크기의 열 생성

        int[][] array3 = {{1},{1,2},{1,2,3}};

        System.out.println(array3[0][0]);
        System.out.println(array3[2][2]);


    }
}
