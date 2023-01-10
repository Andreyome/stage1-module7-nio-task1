package com.epam.mjc.nio;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;


public class FileReader {

    public Profile getDataFromFile(File file) {
        try (BufferedReader reader = new BufferedReader(new java.io.FileReader(file))){
            String[] line = (reader.readLine()).split(": ");
            String name = line[1];
            String[] line1 = (reader.readLine()).split(": ");
            int age = Integer.parseInt(line1[1]);
            String[] line2 = (reader.readLine()).split(": ");
            String eMail = line2[1];
            String[] line3 = (reader.readLine()).split(": ");
            long phone = Long.parseLong(line3[1]);
            return new Profile(name, age, eMail, phone);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new Profile();
    }
}
