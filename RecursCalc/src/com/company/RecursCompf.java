package com.company;

public class RecursCompf {
    private static final int DEFSIZE = 255;
    private char[] str;
    private int index;
    private void compileF() {
        compileT();
        while (index >= str.length) return;
        if (str[index] == '+'){
            while (str[index] == '+'){
                index++;
                compileT();
                System.out.print("+ ");
                if (index >= str.length) return;
            }
        }
        if (str[index] == '-'){
        while (str[index] == '-') {
            index++;
            compileT();
            System.out.print("- ");
            if (index >= str.length) return;
            }
        }
    }
    private void compileT() {
        compileM();
        while (index >= str.length) return;
        if (str[index] == '*') {
            while (str[index] == '*') {
                index++;
                compileM();
                System.out.print("* ");
                if (index >= str.length) return;
            }
        }
        if (str[index] == '/') {
            while (str[index] == '/') {
                index++;
                compileM();
                System.out.print("/ ");
                if (index >= str.length) return;
            }
        }
    }
    private void compileM() {
        if (str[index] == '(') {
            index++;
            compileF();
            index++;
        } else
        compileV();
    }
    private void compileV() {
        System.out.print("" + str[index++] + " ");
    }
    public void RecursCompf() {
        str = new char[DEFSIZE];
    }
    public void compile(char[] str) {
        this.str = str;
        index = 0;
        compileF();
        System.out.print("\n");
    }
}
