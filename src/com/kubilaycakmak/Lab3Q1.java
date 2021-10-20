package com.kubilaycakmak;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Lab3Q1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList1 = new ArrayList<Integer>(10);
        Scanner sc=new Scanner(System.in);

        for(int i=0;i<10;i++){
            int randomNum = ThreadLocalRandom.current().nextInt(1, 50 + 1);
            arrayList1.add(randomNum);
        }

        System.out.print("Enter a number- ");
        int a= sc.nextInt();

        if(arrayList1.contains(a)){
            System.out.println("Success");
            System.out.println();
        }else{
            System.out.println("Failed");
        }
    }
}
