package com.sumok;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array {

    // 실습 2-3, 2-4 준비물
    static int maxOf(int[] a){
        int max = a[0];
        for(int i = 1; i < a.length; i++){
            if(a[i] > max){
                max = a[i];
            }
        }
        return max;
    }

    // 실습 2-5 준비물 ( 순서 바꾸기 )
    static void swap(int[] a, int idx1, int idx2){
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    // 실습 2-5 준비물 ( 역순 정렬 )
    static void reverse(int[] a){
        for(int i = 0; i < a.length / 2; i++){
            swap(a,i, a.length-i-1);
        }
    }

    // 실습 2-6 준비물
    // x = 변환하는 정수
    // r = r진수
    static int change(int x, int r, char[] d){
        int dno = 0;
        String s = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ;";
        do {
            d[dno++] = s.charAt(x % r);
            x /= r;
        }while (x != 0);

        for(int i = 0; i < dno /2; i++){
            char t = d[i];
            d[i] = d[dno - i - 1];
            d[dno - i -1] = t;
        }

        return dno;
    }


    public static void main(String[] args) {
        // 실습 2-1
//        int[] a = new int[5];
//
//        a[1] = 37;
//        a[2] = 51;
//        a[4] = a[1] * 2;
//
//        for(int i = 0; i < 5; i++){
//            System.out.println("a["+i+"] = " + a[i]);
//        }

        // 실습 2-2
//        int a[] = {1,2,3,4,5};
//
//        for(int i = 0; i < 5; i++){
//            System.out.println("a["+i+"] = " + a[i]);
//        }

        // 실습 2-3
//       int[] height = {172, 153, 192, 140, 165};
//
//        System.out.println("키의 최대값을 구합니다");
//        System.out.println("사람 수:" + height.length);
//
//        for(int i = 0; i < height.length; i++){
//            System.out.println("height["+i+"]: "+height[i]);
//        }
//        System.out.println("최댓값은 " + maxOf(height) + "입니다.");

        // 실습 2-4
//        Random rand = new Random();
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("키의 최대값을 구합니다");
//        System.out.print("사람 수:" );
//        int num = scanner.nextInt();
//
//        int[] height = new int[num];
//
//        System.out.println("킷값은 다음과 같습니다.");
//
//        for(int i = 0; i<height.length; i++){
//            height[i] = 100 + rand.nextInt(90);
//            System.out.println("height[" + i + "]: " + height[i]);
//        }
//        System.out.println("최댓값은 " + maxOf(height) + "입니다.");

        // 실습 2-5
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("요솟수: ");
//        int num = scanner.nextInt();
//
//        int[] x = new int[num];
//        for (int i = 0; i< x.length; i++){
//            System.out.print("x[" + i + "]:");
//            x[i] = scanner.nextInt();
//        }
//
//        System.out.println("x= " + Arrays.toString(x));
//
//        System.out.println("요소를 역순으로 정렬했습니다.");
//
//        reverse(x);
//        System.out.println("x= " + Arrays.toString(x));

        // 실습 2-6
        Scanner scanner = new Scanner(System.in);
        int no;
        int cd;
        int dno;
        char[] cno = new char[36];

        System.out.print("숫자 뭐 바꿀거임?");
        no = scanner.nextInt();
        System.out.print("몇진수로 바꿀꺼임?");
        cd = scanner.nextInt();

        dno = change(no, cd, cno);

        System.out.println("다 바꿔땅");
        for(int i = 0; i < dno; i++){
            System.out.print(cno[i]);
        }










    }

}
