package com.Enmin;

import io.cucumber.core.cli.Main;

import java.util.stream.Stream;


public class Start {
    private static String[] defaultOptions = {

            "--plugin", "pretty",
            "--plugin", "json:target/cucumber.json",
            "--plugin", "html:target/cucumber.html",
            "--plugin", "rerun:rerun.txt",
            "--glue", "com/Enmin/stepDefinitions",
//            "--tags", "@automationexcercisetests",
            "C:\\Users\\user\\IdeaProjects\\sample-cucumber-project\\src\\main\\java\\com\\Enmin\\features"



    };
    public static void main(String[] args) {

        System.out.println("Begin running tests...");

        Stream<String> cucumberOptions = Stream.concat(Stream.of(defaultOptions), Stream.of(args));
        try {
            //initialize();

            Main.main(cucumberOptions.toArray(String[]::new));

        } catch (SecurityException e) {
            System.out.println("Ignore exit");
        }

    }
}