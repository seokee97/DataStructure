package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class List_Java {
    public static void main(String[] args) {
        //List
        List<Boolean> sArr = new ArrayList<>();

        //ArrayList
        ArrayList<Boolean> sArr2 = new ArrayList<>();

        //LinkedList
        LinkedList<Boolean> sLinkedArr = new LinkedList<>();

        //Collections 을 사용하여 List를 더 효과적으로 사용
        sArr2.add(true);
        sArr2.add(false);
        sArr2.add(true);
        sArr2.add(false);
        sArr2.add(true);
        Collections.fill(sArr2,false);
        for(Boolean data: sArr2)
            System.out.println(data);


    }
}
