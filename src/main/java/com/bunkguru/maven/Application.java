package com.bunkguru.maven;

public class Application {
    public Application(){
        System.out.println("We re inside the application");
    }

    public static void main(String a[]){

        System.out.println("Starting application");
        Application ap = new Application();
    }
}