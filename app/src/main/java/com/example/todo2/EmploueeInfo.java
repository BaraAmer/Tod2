package com.example.todo2;

import androidx.annotation.NonNull;

public class EmploueeInfo {
    private String name;
    private String salary;


    public EmploueeInfo(String name, String salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @NonNull
    @Override
    public String toString() {
        return getName() + " -- " + getSalary();
    }
}
