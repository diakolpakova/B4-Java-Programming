package day12_switch_statements;
/*
    Take a number and print the number as the word version
    1 -> one
    2 -> two
    ...
 */
public class NumberInWords {
    public static void main(String[] args) {
        int num = 9;    // 1 - 5  ---- it is not in the rage of 1-5


        if (num == 1) {
            System.out.println("One");
        } else if (num == 2) {
            System.out.println("Two");
        } else if (num == 3) {
            System.out.println("Three");
        } else if (num == 4) {
            System.out.println("Four");
        } else if (num == 5) {
            System.out.println("Five");
        } else {
            System.out.println("Not in range 1-5");
        }
    }
}