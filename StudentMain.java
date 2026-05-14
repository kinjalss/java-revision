package com.revision.in;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class StudentMain {
    public static void main(String[] args) throws Exception{
        Student s=new Student("Kinjal",90);

        ObjectOutputStream o=new ObjectOutputStream(new FileOutputStream("obj.txt"));

        o.writeObject(s);
        o.close();
        System.out.println("Object saved successfully!!");

    }
}
