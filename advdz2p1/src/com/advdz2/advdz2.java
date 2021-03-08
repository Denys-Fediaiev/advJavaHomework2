package com.advdz2;
import java.util.Scanner;


public class advdz2 {
    public static void main(String[] args) {
        System.out.println("Введите целое число: ");
        Scanner scan=new Scanner(System.in);
        int digit= scan.nextInt();
        if (digit%2==0){
            System.out.println("ваше число четное");
        }
        else System.out.println("ваше число нечетное");

    }
}
