package com.company;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class qheap {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */


        PriorityQueue<Integer> pq = new PriorityQueue<>();

        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for (int i=0; i<q; i++){
            int option = in.nextInt();
            switch (option){
                case 1:
                    int val = in.nextInt();
                    pq.add(val);
                    break;
                case 2:
                     val = in.nextInt();
                    pq.remove(val);
                    break;
                case 3:
                    System.out.println(pq.peek());
                    break;
            }

        }
        in.close();

    }

}
