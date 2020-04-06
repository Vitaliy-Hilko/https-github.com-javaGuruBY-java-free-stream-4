public class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest num = new LightColorDetectorTest();
        num.testNumberOne();
        num.testNumberTwo();
        num.testNumberThree();
        num.testNumberFour();
    }

    public void testNumberOne(){
        LightColorDetector number = new LightColorDetector();
        String test = "Violet";
        String expectedResult = "Violet";
        String actualResult = number.detect(number.getColor());
        checkThatEqual(expectedResult, actualResult, test);
    }


    public void testNumberTwo(){
        LightColorDetector number = new LightColorDetector();
        number.setColor(475);
        String test = "Blue";
        String expectedResult = "Blue";
        String actualResult = number.detect(number.getColor());
        checkThatEqual(expectedResult, actualResult, test);
    }


    public void testNumberThree(){
        LightColorDetector number = new LightColorDetector();
        number.setColor(590);
        String test = "Orange";
        String expectedResult = "Orange";
        String actualResult = number.detect(number.getColor());
        checkThatEqual(expectedResult, actualResult, test);
    }

    public void testNumberFour(){
        LightColorDetector number = new LightColorDetector();
        number.setColor(-900);
        String test = "Invisible Light";
        String expectedResult = "Invisible Light";
        String actualResult = number.detect(number.getColor());
        checkThatEqual(expectedResult, actualResult, test);
    }

    public void checkThatEqual(String expected, String actual, String test) {
        if (expected.equals(actual)) {
            System.out.println(test + " <----> has passed!");
        } else {
            System.out.println(test + " <----> has failed!");
            System.out.println("Expected '" + expected + "' but was '" + actual + "'");
        }
    }
}
