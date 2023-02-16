package abc;

import model.Publisher;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        String s1="abc";
//        String s2="abde";
//        System.out.println(s1.compareTo(s2));
//        List<String> l = Arrays.asList("abc", "def", "xyzzz");
//        for (int i =0;i<l.size();++i){
//            for (int j =i+1; j<l.size();++j){
//                if (){
//
//                }
//            }
//        }


        while (true) {
            try {
                throw new Ex();
            } catch (Ex e) {
                System.out.println(e.getMessage());
            }
        }
//        throw new Ex();
        //
//        PubService1 sv1 = new PubService1();
//        Object o;
//        sv1.

//        PubService2 sv2 = new PubService2();
//        sv2.
//        Collections.sort(sv2.publisherList, new Comparator<Publisher>() {
//            super.com
//            @Override
//            public int compare(Publisher o1, Publisher o2) {
//                return 0;
//            }
//        });
    }
    public static class Ex extends Exception {

    }
}
