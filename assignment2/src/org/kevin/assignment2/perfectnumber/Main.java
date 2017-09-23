package org.kevin.assignment2.perfectnumber;

/**
 * 3. Write a java function to print all perfect number between 1 and n.
 * i. Perfect number is a positive integer which is equal to the sum of its proper positive divisors.
 * ii. For example: 6 is the first perfect number, Proper divisors of 6 are 1, 2, 3. Sum of its proper divisors = 1 + 2 + 3 = 6.
 *
 * Here is the prototype you can work with
 *
 * public void printPerfectNumbers( int n){
 * }
 */
public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.printPerfectNumbers(1);
        solution.printPerfectNumbers(6);
        solution.printPerfectNumbers(100);
        solution.printPerfectNumbers(500);
    }
}
