package com.company;

public class hourlyWage extends Work implements Salary{ //Працівник з погодинною зарплатою

    private int hourlyPay;//Погодна плата
    private int numberOfHours;//Кількість відпрацьованих годин в день


    public hourlyWage(int salary, int workingDays, int hourlyPay, int numberOfHours) {
        super(workingDays);
        this.hourlyPay = hourlyPay;
        this.numberOfHours = numberOfHours;
        addSalary();
    }

    public int getHourlyPay() {
        return hourlyPay;
    }

    public void setHourlyPay(int hourlyPay) {
        this.hourlyPay = hourlyPay;
    }

    public int getNumberOfHours() {
        return numberOfHours;
    }

    public void setNumberOfHours(int numberOfHours) {
        this.numberOfHours = numberOfHours;
    }

    @Override
    public void addSalary() {
        int salary = (hourlyPay * numberOfHours) * getWorkingDays();
        setSalary(salary);
    }

    @Override
    public String toString() {
        return super.toString() +"{hourlyPay="+ hourlyPay +"," +" numberOfHours=" + numberOfHours + "}";
    }
}