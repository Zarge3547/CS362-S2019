import org.junit.Test;

import static org.junit.Assert.*;

public class UrlValidatorTest_Random {

    private static final double MAX_SIZE = 100;

    @Test
    public void URLValidatorTest_ALL() {
        int index, n;
        String URLSeqChar = "ABCDEFGHIJKLMNOPQRSTUVWXYZ./$@+,:;?=@1234567890abcdefghijklmnopqrstuvwxyz";
        String DebugMessage;
        StringBuilder testURL = new StringBuilder();
        URLValidator tester = new URLValidator();
        UrlValidatorC ref = new UrlValidatorC();

        testURL.replace(0, testURL.length(), "http://");
        n = (int) (Math.random() * MAX_SIZE);

        for (int i = 0; i < n; i++) {
            index = (int) (Math.random() * URLSeqChar.length());
            testURL.append(URLSeqChar.charAt(index));
        }
        if (ref.isValid(testURL.toString())) {
            DebugMessage = "The URL: " + testURL.toString() + "should be valid";
            assertTrue(DebugMessage, tester.isValid(testURL.toString()));
        } else{
            DebugMessage = "The URL: " + testURL.toString() + "should not be valid";
            assertFalse(DebugMessage, tester.isValid(testURL.toString()));
         }
    }

    @Test
    public void URLValidatorTest_Letters() {
        int index, n;
        String URLSeqChar = "ABCDEFGHIJKLMNOPQRSTUVWXYZ./$@+,:;?=@abcdefghijklmnopqrstuvwxyz";
        String DebugMessage;
        StringBuilder testURL = new StringBuilder();
        URLValidator tester = new URLValidator();
        UrlValidatorC ref = new UrlValidatorC();

        testURL.replace(0, testURL.length(), "http://");
        n = (int) (Math.random() * MAX_SIZE);

        for (int i = 0; i < n; i++) {
            index = (int) (Math.random() * URLSeqChar.length());
            testURL.append(URLSeqChar.charAt(index));
        }
        if (ref.isValid(testURL.toString())) {
            DebugMessage = "The URL: " + testURL.toString() + "should be valid";
            assertTrue(DebugMessage, tester.isValid(testURL.toString()));
        } else{
            DebugMessage = "The URL: " + testURL.toString() + "should not be valid";
            assertFalse(DebugMessage, tester.isValid(testURL.toString()));
        }
    }
    @Test
    public void URLValidatorTest_Numbers() {
        int index, n;
        String URLSeqChar = "./$@+,:;?=@1234567890";
        String DebugMessage;
        StringBuilder testURL = new StringBuilder();
        URLValidator tester = new URLValidator();
        UrlValidatorC ref = new UrlValidatorC();

        testURL.replace(0, testURL.length(), "http://");
        n = (int) (Math.random() * MAX_SIZE);

        for (int i = 0; i < n; i++) {
            index = (int) (Math.random() * URLSeqChar.length());
            testURL.append(URLSeqChar.charAt(index));
        }
        if (ref.isValid(testURL.toString())) {
            DebugMessage = "The URL: " + testURL.toString() + "should be valid";
            assertTrue(DebugMessage, tester.isValid(testURL.toString()));
        } else{
            DebugMessage = "The URL: " + testURL.toString() + "should not be valid";
            assertFalse(DebugMessage, tester.isValid(testURL.toString()));
        }
    }

}