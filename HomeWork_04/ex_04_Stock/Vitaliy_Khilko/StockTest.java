public class StockTest {
    public static void main(String[] args) {
    StockTest test = new StockTest();
    test.number1();
    test.number2();
    test.number3();
    }

    public void checkThatEqual(int expected, int actual, String testDescription) {
        if (expected == actual) {
            System.out.println(testDescription + " has passed!");
        } else {
            System.out.println(testDescription + " has failed!");
            System.out.println("expected \"" + expected + "\", but was \"" + actual + "\"");
        }
    }

    public void number1(){
        String testDescription = "Should return update maxStock";
        Stock test1 = new Stock("Qiwi",44,10,60);
        test1.updatePrice(75);
        int expectedResult = 75;
        int actualResult = test1.getMaxStock();
        checkThatEqual(expectedResult, actualResult, testDescription);
        test1.printInformation();
        System.out.println();
    }

    public void number2(){
        String testDescription = "Should return update minStock";
        Stock test2 = new Stock("Webmoney",33,20,45);
        test2.updatePrice(16);
        int expectedResult = 16;
        int actualResult = test2.getMinStock();
        checkThatEqual(expectedResult, actualResult, testDescription);
        test2.printInformation();
        System.out.println();
    }

    public void number3(){
        String testDescription = "Should return update currentSharePrice";
        Stock test3 = new Stock("Prior Bank",22,10,40);
        test3.updatePrice(34);
        int expectedResult = 34;
        int actualResult = test3.getCurrentSharePrice();
        checkThatEqual(expectedResult, actualResult, testDescription);
        test3.printInformation();
        System.out.println();
    }

}
