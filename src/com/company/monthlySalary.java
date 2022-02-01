package com.company;

public class monthlySalary extends Work implements Salary{ //Працівник з фіксованою місячною зарплатою

    private int payDay; //Плата за день


    public monthlySalary(int salary, int workingDays, int payDay) {
        super(salary, workingDays);
        this.payDay = payDay;
        addSalary();
    }

    public int getPayDay() {
        return payDay;
    }

    public void setPayDay(int payDay) {
        this.payDay = payDay;
    }


    @Override
    public void addSalary() {
        int salary = payDay * getWorkingDays();
        setSalary(salary);
    }

    @Override
    public String toString() {
        return super.toString() + "{" +
                "payDay=" + payDay +
                '}';
    }
}
