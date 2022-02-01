package com.company;

public abstract class Work {

    private int salary; //Зарплата
    private int workingDays; //Робочих днів

    public Work( int salary, int workingDays){
        super();
        this.salary = salary;
        this.workingDays = workingDays;
    }

    public Work(int workingDays) {
        this.workingDays = workingDays;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getWorkingDays() {
        return workingDays;
    }

    public void setWorkingDays(int workingDays) {
        this.workingDays = workingDays;
    }



    @Override
    public String toString() {
        return "Work{" +
                "salary=" + salary +
                ", workingDays=" + workingDays +
                '}' ;
    }
}
