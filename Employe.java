package com.revision.in;

import java.io.Serializable;

public class Employe implements Serializable {
    String name;
    String salary;

    Employe(String name,String salary){
        this.name=name;
        this.salary=salary;
    }
}
