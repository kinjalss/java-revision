package com.revision.in;

import com.serial.Employee;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EmployeMain {
    public static void main(String[] args) throws Exception{
        ObjectOutputStream o=new ObjectOutputStream(new FileOutputStream("employee.txt"));
        o.writeObject(new Employe("Kinjal","900000"));
        o.writeObject(new Employe("Siddhi","650000"));
        o.writeObject(new Employe("Riya","1000000"));
        o.close();
        System.out.println("Employee created successfully!");

        }
    }

