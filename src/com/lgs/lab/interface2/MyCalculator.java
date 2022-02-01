package com.lgs.lab.interface2;

public class MyCalculator implements Numerable{

    private double argument1;
    private double argument2;

    public MyCalculator(double argument1, double argument2) {
        this.argument1 = argument1;
        this.argument2 = argument2;
        divide();
        minus();
        multiply();
        add();
    }

    @Override
    public void divide() {
        double result =  argument1 / argument2;
        System.out.println("Результат ділення: " + result);
    }

    @Override
    public void minus() {
        double result =  argument1 - argument2;
        System.out.println("Результат віднімання: " + result);
    }

    @Override
    public void multiply() {
        double result =  argument1 * argument2;
        System.out.println("Результат множення: " + result);
    }

    @Override
    public void add() {
        double result =  argument1 + argument2;
        System.out.println("Результат додавання: " + result);
    }

    public double getArgument1() {
        return argument1;
    }

    public void setArgument1(double argument1) {
        this.argument1 = argument1;
    }

    public double getArgument2() {
        return argument2;
    }

    public void setArgument2(double argument2) {
        this.argument2 = argument2;
    }

    @Override
    public String toString() {
        return "MyCalculator{" +
                "argument1=" + argument1 +
                ", argument2=" + argument2 +
                '}';
    }
}
