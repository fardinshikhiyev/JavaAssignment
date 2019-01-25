package com;
import java.util.ArrayList;
import java.util.Random;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class OompaLoompaSong {
    int lines;
    public static ArrayList<String> oompaLoompa = new ArrayList<String>();

//Constructors:

    OompaLoompaSong(int lines) {
        this.lines = lines;
    }
    public void readText() throws FileNotFoundException {
        Scanner scan = new Scanner(new File("com\\OompaLoompaSong.txt"));
        while(scan.hasNextLine()){
            String line = scan.nextLine();
            oompaLoompa.add(line);
        }
        scan.close();
    }

    String sing() throws FileNotFoundException {

        readText();

        Random rand = new Random();
        for(int i=0; i<lines; i++){
            int value = rand.nextInt(23) + 0;
            System.out.println(oompaLoompa.get(value));
        }
        return "";
    }
}