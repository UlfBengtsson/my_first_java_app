package org.example;

public class Person {

    String firstName;
    String lastName;
    double score;

    public String getInformation() {
        String sentence = firstName + ' ' + lastName + "\ngot a score of: " + score;

        return sentence;
    }

}
