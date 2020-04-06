public class PhraseAnalyserTest {
    public static void main(String[] args) {
        PhraseAnalyserTest textOne = new PhraseAnalyserTest();
        textOne.testNumberOne();
        textOne.testNumberTwo();
        textOne.testNumberThree();
    }

    public void testNumberOne() {
        PhraseAnalyser testOne = new PhraseAnalyser();
        String test = "It stands no chance";
        String expectedResult = "It stands no chance";
        String actualResult = testOne.analyses(testOne.getPhraseAnalyser());
        checkThatEqual(expectedResult, actualResult, test);
    }


    public void testNumberTwo(){
        PhraseAnalyser testTwo = new PhraseAnalyser();
        testTwo.setPhraseAnalyser("(Make good year crate ! stay home great again");
        String test = "It could be worse";
        String expectedResult = "It could be worse";
        String actualResult = testTwo.analyses(testTwo.getPhraseAnalyser());
        checkThatEqual(expectedResult, actualResult, test);
    }

    public void testNumberThree(){
        PhraseAnalyser testThree = new PhraseAnalyser();
        testThree.setPhraseAnalyser("( !Make good year crate ! stay home great !! again");
        String test = "It is fine, really";
        String expectedResult = "It is fine, really";
        String actualResult = testThree.analyses(testThree.getPhraseAnalyser());
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
