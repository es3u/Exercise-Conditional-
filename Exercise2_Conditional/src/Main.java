

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // System.out.println("Hello world!");


//        1.Write a program that checks the role of the user
//        If the role is admin print "welcome admin"
//        If the role is superuser print "welcome superuser" If the role is user print "welcome user" (tip:
//        use if else)

        Scanner input = new Scanner(System.in);
        System.out.println("please enter your user ,for example: admin , superuser , user  ");
        String check_user = input.nextLine();
        String admin = "admin";
        String superuser = "superuser";
        String user = "user";

        if (check_user.equals(admin) ) {
            System.out.println("welcome admin");

        }else
            if(check_user.equals(superuser)){
                System.out.println("welcome superuser");

            }else if (check_user.equals(user)){
                System.out.println("welcome user");


            }else System.out.println("please try agin or example: admin , superuser , user");

                                 System.out.println(" ** End example 1 **");

            ////////////////////////////////////////End////////////////////////////////////////

//        2.Take three numbers from the user and print the greatest number.
//                Test Data
//        Input the 1st number: 25 Input the 2nd number: 78 Input the 3rd number: 87
//        Expected Output : The greatest: 87

        System.out.println("enter number 1: ");
        int num1 = input.nextInt();
        System.out.println("enter number 2: ");
        int num2 = input.nextInt();
        System.out.println("enter number 3: ");
        int num3 = input.nextInt();

        int max ;

        if (num1 > num2 && num1 > num3){
            max = num1;
            System.out.println("The greatest: " + max);
        }else
            if(num2 > num1 && num2 > num3){
                max = num2;
                System.out.println("The greatest: " + max);
            }else{
                max = num3;
                System.out.println("The greatest: " + max);
            }
                            System.out.println(" ** End example 2 **");

        ////////////////////////////////////////End////////////////////////////////////////


//        3.Write a Java program that generates an integer between 1 and 7 and displays the name of the weekday.
//                Test Data
//        number: 4
//        Expected Output: Wednesday

        System.out.print("please enter number of days:  \n");



        switch (input.nextInt()){

            case 1: System.out.println("Sunday");
                break;
            case 2:System.out.println("Monday");
                break;
            case 3:System.out.println("Tuesday");
                break;
            case 4: System.out.println("Wednesday");
                break;
            case 5: System.out.println("Thursday");
                break;
            case 6: System.out.println("Friday");
                break;
            case 7: System.out.println("Saturday");
                break;

            default:
                System.out.println("please enter from 1 to 7");


        }
                                System.out.println(" ** End example 3 **");

        ////////////////////////////////////////End////////////////////////////////////////

//        4. Write a program that takes a numeric score as input and prints the corresponding letter grade using the following grading scale:
//        A: 90-100 B: 80-89
//        C: 70-79
//        D: 60-69 F: 0-59
//        Enter your numeric score: 85 Numeric Score: 85
//        Letter Grade: B

        System.out.print("please enter your numeric score: ");
        int numeric = input.nextInt();
        System.out.println();

        if(numeric >= 90 && numeric <= 100){
            System.out.println("Numeric Score: " + numeric);
            System.out.println("Letter Grade: A" );

        }else
        if(numeric >= 80 && numeric <= 89){
            System.out.println("Numeric Score: " + numeric);
            System.out.println("Letter Grade: B" );

        }else
        if(numeric >= 70 && numeric <= 79){
            System.out.println("Numeric Score: " + numeric);
            System.out.println("Letter Grade: C" );

        }else
        if(numeric >= 60 && numeric <= 69){
            System.out.println("Numeric Score: " + numeric);
            System.out.println("Letter Grade: D" );

        }else
        if(numeric >= 0 && numeric <= 59){
            System.out.println("Numeric Score: " + numeric);
            System.out.println("Letter Grade: F" );

        }else
            System.out.println("try again , please enter numeric betwen 0 to 100");

                               System.out.println(" ** End example 4 **");

        ////////////////////////////////////////End////////////////////////////////////////



//  5. Write a Java program that takes a person's age as input and categorizes them into one of three age categories: "Child," "Teenager," or "Adult" using an if statement.
//  use an if statement to categorize the age based on the following criteria:
//• If the age is less than 13, categorize them as a "Child."
//• If the age is between 13 and 19 (inclusive), categorize them as a "Teenager."
//• If the age is 20 or older, categorize them as an "Adult."
//        Sample Output: Enter your age: 25 You are an Adult.

        System.out.println("Enter your age:");
        int age = input.nextInt();


        if(age < 13 && age != 0  ){
            System.out.println(" you are a Child.");
        }else if(age >= 13 && age <= 19){
            System.out.println(" you are a Teenager.");

        }else if(age >=20  && age < 120  ){
            System.out.println(" you are a Adult.");



        }else
            System.out.println(" *try again* ");






















    }
}