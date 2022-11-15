package com.sumok;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array_practice {
    // 최대값 구하기
    static int maxOf(int[] a){
        int max = a[0];
        for(int i = 1; i < a.length; i++){
            if(a[i] > max){
                max = a[i];
            }
        }
        return max;
    }

    // 순서 바꾸기
    static void swap(int[] a, int idx1, int idx2){
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    // 역순 정렬
    static void reverse(int a[]){
        int last_i = 0;
        for(int i = 0 ; i < a.length / 2; i++){
            System.out.println(Arrays.toString(a));
            last_i = a.length-i-1;
            System.out.println("a[" + i + "]과 a[" + last_i + "]을 교환합니다.");
            swap(a,i,last_i);
        }
    }

    // 배열 a 의 모든 요소의 합계를 구하여 반환하는 메서드
    static int sumOf(int[] a){
        int sum = 0;
        for (int i = 0; i < a.length; i++){
            sum += a[i];
        }
        return sum;
    }

    // 배열 b의 모든 요소를 배열 a에 복사하는 메서드
    static void copy(int[] a, int[] b){
        a = new int[b.length];
        for(int i = 0; i < b.length; i++){
            a[i] = b[i];
        }

        System.out.println("배열 b" + Arrays.toString(b));
        System.out.println("배열 a" +Arrays.toString(a));
    }


    // 배열 b의 모든 요소를 배열 a에 역순으로 복사하는 메서드
    static void rcopy(int[] a, int[] b){
        a = new int[b.length];

        for(int i = 0; i < b.length; i++){
            a[i] = b[i];
        }

        for(int i = 0; i< a.length /2; i++){
            swap(a,i,a.length-i-1);
        }
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(a));
    }

    // 진수 변환 메소드
    static int cardConv(int x, int r, char[] d){
        int digits = 0;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        System.out.println(r + "|     " + x);

        do {
            d[digits++] = dchar.charAt(x % r);
            x /= r;
            System.out.println(" +--------");
            System.out.println(r + "|     " + x +"...."+ dchar.charAt(x % r));
        }while (x != 0);


        for(int i = 0; i < digits /2; i++){
            char t = d[i];
            d[i] =d[digits - i - 1];
            d[digits - i -1] = t;
        }

        return digits;
    }



    public static void main(String[] args) {

        //연습문제 1
//        Random rand = new Random();
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("키의 최대값을 구합니다");
//        int people = rand.nextInt(10);
//        System.out.println("사람 수:" + people);
//
//        int[] height = new int[people];
//
//        System.out.println("킷값은 다음과 같습니다.");
//
//        for(int i = 0; i<height.length; i++){
//            height[i] = 100 + rand.nextInt(90);
//            System.out.println("height[" + i + "]: " + height[i]);
//        }
//        System.out.println("최댓값은 " + maxOf(height) + "입니다.");

        // 연습문제 2
        int[] a ={2,5,1,3,9,6,7};

        reverse(a);

        System.out.println(Arrays.toString(a));
        System.out.println("역순정렬을 마쳤습니다.");

        // 연습문제 3
        System.out.println("----연습문제 3 -----");
        System.out.println(sumOf(a));

        // 연습문제 4
        System.out.println("----연습문제 4 -----");
        int[] b = {11,12,13,17};
        copy(a,b);

        // 연습문제 5
        System.out.println("----연습문제 5 -----");
        rcopy(a,b);
        System.out.println("문제야 문제~");
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(a));

        // 연습문제 6
        System.out.println("----연습문제 6 -----");
        Scanner scanner = new Scanner(System.in);
        int no; // 변환 할 수
        int cd; // ? 진수 일때 ?
        int dno; // 가져올 자릿수
        char[] cno = new char[32]; // 총 자릿수

        System.out.println("10진수를 기수 변환합니다.");
        System.out.print("변환하는 음이 아닌 정수");
        no = scanner.nextInt();

        System.out.print("어떤 진수로 변환할까요?(2~36):");
        cd = scanner.nextInt();

        dno = cardConv(no,cd,cno);

        System.out.print(cd + "진수로");
        for (int i = 0; i < dno; i++){
            System.out.print(cno[i]);
        }

        System.out.println("입니다");
    }
}
