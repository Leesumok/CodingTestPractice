package com.Practice;

import java.util.Scanner;

public class P113_Q2 {
    static int seqSearch(int[] x, int num, int key){
        int i = 0;


        System.out.print("  |");
        for(int j = 0; j < num; j++){
            System.out.print(" " + j );
        }

        System.out.println();
        System.out.println("--+---------------");

        for(int star = 0; star < num; star++ ){
            System.out.print("  | ");
            if(star == 0){
                System.out.println("*");
            }else{
                for(int ii = 0; ii < star; ii++){
                    System.out.print("  ");
                }
                System.out.println("*");
            }
            System.out.print(star + " | " );
            for(int numList = 0; numList < num; numList++){
                System.out.print(x[numList]+" ");
            }
            if(x[star] == key){
                i = star;
                break;
            }

            System.out.println();
            System.out.println("  |");
        }


        return i == num ? -1 : i;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("요솟수");
        int num = scanner.nextInt();
        int[] x = new int[num+1];

        for(int i = 0; i < num; i++){
            System.out.print("x[" + i + "]: ");
            x[i] = scanner.nextInt();
        }

        System.out.print("검색할 값: ");
        int key = scanner.nextInt();

        int idx = seqSearch(x, num, key);

        System.out.println();

        if(idx == -1)
            System.out.println("그 값의 요소가 없습니다.");
        else
            System.out.println("그 값은 x[" + idx + "]에 있습니다.");
    }
}
