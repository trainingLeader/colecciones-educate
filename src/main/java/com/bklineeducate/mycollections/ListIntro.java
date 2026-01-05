package com.bklineeducate.mycollections;

import java.util.ArrayList;
import java.util.List;

public class ListIntro {
    List<String> arrayList = new ArrayList<>();
    
    public ListIntro() {
        arrayList.add("Java");
        arrayList.add("Python");
        arrayList.add("C++");
        arrayList.add("Java");
    }

    public void verData(){
        System.out.println("ArrayList: " + arrayList);
    }

}
