package com.bunkguru.maven;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public Application(){
        System.out.println("We re inside the application");
    }

    public void greet(){
        List<String> greets = new ArrayList<>();

        greets.add("hellor");

        for(String g : greets){
            System.out.println(g);
        }
    }

    public static void main(String a[]){

        System.out.println("Starting application");
        Application ap = new Application();

        ap.greet();
    }
}