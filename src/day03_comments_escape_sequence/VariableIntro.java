package day03_comments_escape_sequence;

public class VariableIntro {

    public static void main(String[] args) {

        // Option 1
        int num1;    //Declared Variable called num1 and int data type
        num1 = 6;    //ASSIGNED VALUE/DATA into variable
        System.out.println(4);
        System.out.println(num1);

        //int num1; // In one/same method, we CANNOT declare SAME VARIABLE NAME more than once - it will not complete
        num1=10; //RE-ASSIGNMENT - i gave another value to already declared variable
        System.out.println(num1);


        // option 2
        int num2 = 33; //declared variable and assigned value / data in ine statement

        System.out.println(num2);
        System.out.println(20);
        System.out.println(num2);
        System.out.println(num2);
        System.out.println(num2);
        System.out.println(num2);
        System.out.println(num2);
        System.out.println(num2);
        num2 = 40;
        System.out.println(num2);



        System.out.println(4);
        byte n1 = 4;
        short n2 = 4;
        int n3 = 4;
        long n4 = 4;
        long n5 = 80000000000000L;


        //-------------------------
        System.out.println("-------------------------");

        System.out.println(4.5); // By default, it is double

        float d1 = 3.6f;
        double d2 = 3.6;

        System.out.println(d1);
        System.out.println(d2);

        System.out.println("-------------------------");


        char letter1;
        // letter 1 = 'a' ; // in single quote we cannot use more than one character
        letter1 = 'a';
        System.out.println(letter1);

        String letter2 = "a";
        String letter3 = "aa";

        System.out.println("-------------------------");

        boolean varName = true;
        System.out.println(varName);
        varName = false;
        System.out.println(varName);




















    }
}
