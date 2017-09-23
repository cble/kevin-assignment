package org.kevin.assignment2.adddigit;

public class Solution {

    public int addDigits(int input){
        while (input >= 10) {
            input = input / 10 + input % 10;
        }
        return input;
    }
}
