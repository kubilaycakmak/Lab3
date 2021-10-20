package com.kubilaycakmak;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Lab3Q2 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayListOriginal = new ArrayList<Integer>(10);

        Scanner sc=new Scanner(System.in);
        for(int i=0;i<10;i++){
            int randomNum = ThreadLocalRandom.current().nextInt(1, 50 + 1);
            arrayListOriginal.add(randomNum);
        }
        ArrayList<Integer> arrayListCopy = new ArrayList<Integer>(arrayListOriginal);

        arrayListOriginal.set((arrayListOriginal.size() - 1), -5);

        System.out.println(arrayListOriginal);
        System.out.println(arrayListCopy);
    }
}
