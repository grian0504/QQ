package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*********************************
         * 接連輸入三組數字(1~3000 間的正整數)，各自判斷為平年還是閏年
         *********************************/

        //以下要先讓我輸入三組數字
        Scanner scn = new Scanner(System.in);
        int v1 = scn.nextInt();

        Scanner qq = new Scanner(System.in);
        int v2 = qq.nextInt();

        Scanner aa = new Scanner(System.in);
        int v3 = aa.nextInt();

        /**********************************
         #以下要應題目寫出條件
         ******************************/

        if ((v1 < 1 || v1 >3000) || (((v1 % 4) != 0) || (((v1 % 100) == 0) && ((v1 % 400) != 0)))) { System.out.println("false\n"); }

        else  {
            System.out.println("true\n");
        }

        if ((v2 < 1 || v2 >3000) || ((v2 % 4) != 0) || (((v2 % 100) == 0) && ((v2 %400) != 0))) { System.out.println("false\n"); }

        else  {
            System.out.println("true\n");
        }

        if ((v3 < 1 || v3 >3000) || ((v3 % 4) != 0) || (((v3 % 100) == 0) && ((v3 % 400) != 0))) { System.out.println("false\n"); }

        else {
            System.out.println("true\n");

        }

    }}