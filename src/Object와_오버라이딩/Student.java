package Object와_오버라이딩;

public class Student {
    String name;
    String number;
    int birthYear;


    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result = prime + result + ((number == null) ? 0 : number.hashCode());
        return result;
    }

    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Student other = (Student) obj;
        if (number == null) {
            if (other.number != null) return false;
        } else if (!number.equals(other.number)) return false;
        return true;
    }

    public String toString(){
        return "Student [name=" + name + ", number =" + number + ", birthYear=" + birthYear +"]";
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "홍길동";
        s1.number = "1234";
        s1.birthYear = 1995;

        Student s2 = new Student();
        s2.name = "홍길동";
        s2.number = "1234";
        s2.birthYear = 1995;

        if(s1.equals(s2)) System.out.println("같네요!");
        else System.out.println("다르네요!");

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        System.out.println(s1);
        System.out.println(s1.toString());
    }
}
