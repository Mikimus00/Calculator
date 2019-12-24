package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        RecursCompf c = new RecursCompf();
        while (true) {
            System.out.println("Введите формулу -> ");
            c.compile(scan.nextLine().toCharArray());
        }
    }
}
