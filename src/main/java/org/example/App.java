package org.example;

public class App 
{
    public static void main( String[] args )
    {
        /*
        System.out.println( "Hello World! from Ulf" );

        int number = 1;

        String name = "ulf";

        System.out.println(name.length());

        double resultA = number / (double)name.length();

        System.out.println(resultA);

        int numberA = 10, numberB = 3, numberC = 5;

        int resultB = numberB - numberA * numberC;

        System.out.println(resultB);

        int startAtFour = 4;

        System.out.println(startAtFour++);//read startAtFour then startAtFour = startAtFour + 1

        System.out.println(startAtFour);

        System.out.println(--startAtFour); //startAtFour = startAtFour - 1 then read startAtFour

        System.out.println(startAtFour);


        char symbolA = 'a';
        char symbolB = 'B';

        boolean result = symbolA < symbolB;

        System.out.println(result);


        int age = 19;
        boolean blackListed = false;

        if(age >= 18 && !blackListed) {
            System.out.println("You can have a beer");
        }
        else if ( age >= 15 ) {
            System.out.println("You can drive a moped.");
        }
        else {
            System.out.println("you can have a soda.");
        }


        String status = "asdfasd";

        switch (status.trim().toLowerCase()) {
            case "done":
                System.out.println("We are free to go home!");
                break;
            case "not done":
                System.out.println("We can´t leave yet!");
                break;
            default:
                System.out.println("not a valid status!");
                break;
        }
        */

        Person uffe = new Person();

        uffe.firstName = "Ulf";
        uffe.lastName = "Bengtsson";
        uffe.score = 9.9;

        System.out.println(uffe.getInformation());

        Person jonas = new Person();

        jonas.firstName = "Jonas";
        jonas.lastName = "Svensson";
        jonas.score = 5.2;

        System.out.println(jonas.getInformation());

    }
}
