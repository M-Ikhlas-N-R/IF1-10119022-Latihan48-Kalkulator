package com.minr;
/*
 * @author
 * Nama              : M Ikhlas N R
 * Kelas             : IF-1
 * NIM               : 10119022
 * Deskripsi Program : Program Kalkulator sederhana
 *
 */
public class Main {
    public static void main(String[] args) {
        Kalkulator kasus1 = new Kalkulator();
        kasus1.setValue1(7);
        kasus1.setValue2(5);
        System.out.println("VALUE 1 = " + kasus1.getValue1());
        System.out.println("VALUE 2 = " + kasus1.getValue2());
        kasus1.setNameProject();
        kasus1.setNoteProject("This project shown you how to manage method in java");
        System.out.println("Result Add is = " + kasus1.add(kasus1.getValue1(), kasus1.getValue2()));
        System.out.println("Result Minus is = " + kasus1.minus(kasus1.getValue1(), kasus1.getValue2()));
        System.out.println("Result Multiple is = " + kasus1.multiplication(kasus1.getValue1(), kasus1.getValue2()));
        System.out.println("Result Division is = " + kasus1.division(kasus1.getValue1(), kasus1.getValue2()));
    }
}
