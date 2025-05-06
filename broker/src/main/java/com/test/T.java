package com.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class T {
    public static void main(String[] args) throws IOException {
        File fin = new File("C:\\Users\\wljzzf\\Desktop\\aa.txt");
        FileInputStream fis = new FileInputStream(fin);

//Construct BufferedReader from InputStreamReader

        BufferedReader br = new BufferedReader(new InputStreamReader(fis));

        String line = null;

        while ((line = br.readLine()) != null) {

            System.out.println(line);

        }

        br.close();

    }

}
