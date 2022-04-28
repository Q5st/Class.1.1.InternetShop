package com.company;


public class Main {

    public static void main(String[] args) {
        Shop first = new Shop(12,20,4, "New");
        Shop second = new Shop();
        second.setCondition("Used");
        second.setPrise(20);
        System.out.println(first.toString());
        System.out.println(second.toString());
    }
}
