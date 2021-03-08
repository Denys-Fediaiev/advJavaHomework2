package com.dz2p2;
import java.util.Scanner;

public class dz2p2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int c = 0;
        System.out.print("Введите число: ");
        a = scan.nextInt();
        System.out.println("Введите второе число: ");
        b = scan.nextInt();
        System.out.println("Введите третье число: ");
        c = scan.nextInt();
        System.out.print("Наименьшее по модулю число: ");
        if ((Math.abs(a)) < (Math.abs(b)) && (Math.abs(a) < (Math.abs(c)))) {
            System.out.println(Math.abs(a));
        }
        else if ((Math.abs(b)) < (Math.abs(a)) && (Math.abs(b) < (Math.abs(c)))) {
            System.out.println(Math.abs(b));
        }
        else {
            System.out.println(Math.abs(c));
        }

    }


}