package com.revision.in;

public class AgeEli{
    public static void main(String[] args) {
        int age=16;
        try {
            if(age<=18) {
                throw new AgeException("You are elible to vote");
            }
            System.out.println("You are not eligible");

        } catch (AgeException e) {
            System.out.println("Handled:"+e.getMessage());
        }
    }
}
