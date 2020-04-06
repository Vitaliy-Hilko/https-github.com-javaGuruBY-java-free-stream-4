public class SignComparatorTest {
    public static void main(String[] args) {
        SignComparatorTest testRunner = new SignComparatorTest();
        testRunner.testNumberOne();
        testRunner.testNumberTwo();
        testRunner.testNumberThree();
    }

    public void testNumberOne() {
        SignComparator testOne = new SignComparator();

        int number = 24;
        String text = "Number is positive";
        String expectedResult = "Number is positive";
        String actualResult = testOne.getSign(number);
        checkThatEqual(expectedResult, actualResult, text);
    }

    public void checkThatEqual(String expected, String actual, String text) {
        if (expected.equals(actual)) {
            System.out.println(text + " has passed!");
        } else {
            System.out.println(text + " has failed!");
            System.out.println("Expected '" + expected + "' but was '" + actual + "'");
        }
    }

    public void testNumberTwo() {
        SignComparator testTwo = new SignComparator();

        int number = -12;
        String textTwo = "Number is negative";
        String expectedResult = "Number is negative";
        String actualResult = testTwo.getSign(number);
        checkThatEqual(expectedResult, actualResult, textTwo);
    }


    public void testNumberThree() {
        SignComparator testThree = new SignComparator();

        int number = 0;
        String textThree = "Number is equal to zero";
        String expectedResult = "Number is equal to zero";
        String actualResult = testThree.getSign(number);
        checkThatEqual(expectedResult, actualResult, textThree);
    }



}
