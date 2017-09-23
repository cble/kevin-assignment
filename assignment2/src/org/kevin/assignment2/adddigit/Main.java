package org.kevin.assignment2.adddigit;

/**
 * 2. Write a java function that adds all the digits of an integer until it is single digit.
 * i. function takes an integer as input and returns its sum of digits.
 * ii. for example input = 37, sum = 3+7 = 10, sum = 1+0 = 1. result = 1.
 *
 * Here is the prototype you can work with
 *
 * public int addDigits( int input){
 * }
 */
public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.addDigits(37));
        System.out.println(solution.addDigits(1111));
        System.out.println(solution.addDigits(1234));
        System.out.println(solution.addDigits(6529));
    }
}
