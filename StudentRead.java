package com.revision.in;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class StudentRead {
    public static void main(String[] args) throws Exception{
        ObjectInputStream i=new ObjectInputStream(new FileInputStream("obj.txt"));
        Student s=(Student) i.readObject();
        System.out.println(s.name+" "+s.marks);
        i.close();

    }
}
