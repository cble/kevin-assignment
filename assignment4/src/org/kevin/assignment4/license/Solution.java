package org.kevin.assignment4.license;

public class Solution {

    public String generateLicenseKey(String s, int k) {
        StringBuilder stringBuilder = new StringBuilder();
        String sWithoutDash = s.replace("-", "");

        int lengthOfCurrentGroup = 0;
        for (int i = sWithoutDash.length() - 1; i >= 0; i--) {
            char c = sWithoutDash.charAt(i);
            if (lengthOfCurrentGroup == k) {
                lengthOfCurrentGroup = 0;
                stringBuilder.insert(0, '-');
            }
            stringBuilder.insert(0, Character.toUpperCase(c));
            lengthOfCurrentGroup ++;
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.generateLicenseKey("2-4A0r7-4k", 4));
        System.out.println(solution.generateLicenseKey("2-4A0r7-4k", 3));
        System.out.println(solution.generateLicenseKey("2-4A0r7-4k", 2));
        System.out.println(solution.generateLicenseKey("---", 2));
        System.out.println(solution.generateLicenseKey("1A2B-", 2));
    }
}
