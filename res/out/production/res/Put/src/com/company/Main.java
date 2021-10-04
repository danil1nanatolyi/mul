package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int res=mull(x, y);
        System.out.println(res);
    }
    public static int mull(int x, int y) {
        int sum=0;
        for (int a = 0; a < x; a++) {
            sum = sum + y;
        }
        return sum;
    }
}
