package day03_comments_escape_sequence;

public class Quotes {

     public static void main(String[] args) {

         System.out.println("Everyone loves JAVA programming");

         /*
            Q: How if i want to print it with double quotes like below
          */

         System.out.println("Everyone loves \"JAVA\" programming");
         System.out.println("\"Everyone loves JAVA programming\"");


         /*
           Q: since we use \ slash an as part of the syntax, then how i print backward slash itself
          */

         System.out.println("There programming languages like java\\python");

         System.out.println("There programming languages like java\\\\python");

         System.out.println("There programming languages like java/python");


     }
}
