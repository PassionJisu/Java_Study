package javautil_exam;

import java.util.ArrayList;
import java.util.List;

public class ListExam {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(); //리스트는 중복값 개별로 저장 가능
        list.add("kim");
        list.add("kang");
        list.add("kim");

        System.out.println(list.size());

        for(int i = 0; i < list.size(); i++){
            String str = list.get(i);
            System.out.println(str);
        }
    }
}
