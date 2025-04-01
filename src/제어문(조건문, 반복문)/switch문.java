public class switch문 {
    public static void main(String[] args) {
        //switch, case, default, break

        int value = 1;

        switch(value){ /*switch는 만난 케이스부터 아래로 쭈욱 실행하는 특징 
                        즉, waterfall model과 유사(폭포수) 특정 
                        한 줄만 실행을 원하다면 적절한 break 사용 필요*/
            case 1,2:
                System.out.println("1");
                break;
            case 3:
                System.out.println("3");
                break;
            default:
                System.out.println("그 외 다른 숫자");
        }

        String str = "A";
        switch(str){
            case "A":
                System.out.println("A");
                break;
            case "B":

        }
    }
}
