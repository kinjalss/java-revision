package com.revision.in;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class EmployeRead{

    public static void main(String[] args) throws Exception{
        ObjectInputStream i=new ObjectInputStream(new FileInputStream("employee.txt"));

        for(int k=0;k<3;k++) {
            Employe e = (Employe) i.readObject();


            System.out.println(e.name + " " + e.salary);
        }
        i.close();
    }
}
//read()-read one character
//readLine()-read one line