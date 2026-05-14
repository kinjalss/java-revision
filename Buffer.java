package com.revision.in;

import java.io.BufferedReader;
import java.io.FileReader;

public class Buffer {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new FileReader("obj.txt"));
        String line;
        while((line=br.readLine())!=null){
            System.out.println(line);
        }
        br.close();
    }
}
