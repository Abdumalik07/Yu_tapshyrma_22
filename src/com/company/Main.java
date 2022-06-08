package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        Random random=new Random();
        for (int i=0;i<50;i++) {
            arrayList.add(random.nextInt(0,100));
        }
        System.out.println("Arraay Listtin kolomu: "+arrayList.size());
        System.out.println("Array Listttin ichindegi sandar: "+arrayList);

        List<Integer> arrayListTakSan= new ArrayList<>(arrayList);
        System.out.print("Array Listtin ichindegi tak sandar: ");
        for (Integer a:arrayListTakSan) {
            if (a%2==1){
                System.out.print(a+" ");
            }

        }
        System.out.println();
        List<Integer> arrayListJupSan= new ArrayList<>(arrayList);
        System.out.print("Array Listtin ichindegi jup sandar: ");
        for (Integer b:arrayListTakSan) {
            if (b%2==0){
                System.out.print(b+" ");
            }

        }
    }
}
