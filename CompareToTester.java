package tests;

import java.util.Random;

public class CompareToTester {

    public static void main(String[] args) {
        testCompareToMethod();
    }

    public static void testCompareToMethod() {
        Random random = new Random();
        int successfulTests = 0;

        for (int i = 1; i <= 1000; i++) {
            String str1 = generateRandomString(random.nextInt(10) + 1);
            String str2 = generateRandomString(random.nextInt(10) + 1);

            int result1 = str1.compareTo(str2);
            int result2 = str1.compareTo(str2);

            if (result1 == result2) {
                System.out.println("--------- Test " + i + " is successful");
                successfulTests++;
            } else {
                System.err.println("--------- Test " + i + " is invalid");
            }
        }

        System.out.println("Tests completed. Successful tests: " + successfulTests);
    }

    public static String generateRandomString(int length) {
        Random random = new Random();
        char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char c = chars[random.nextInt(chars.length)];
            sb.append(c);
        }
        return sb.toString();
    }
}