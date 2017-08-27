import org.junit.Test;

import static org.junit.Assert.*;

public class upperCaseArrayTest {
    @Test
    public void count() throws Exception {
        upperCaseArray tester = new upperCaseArray();
        String testUserInput1= "ToToRo";
        assertEquals("UserInput ToToRo must return 3", 3, tester.count(testUserInput1 .toCharArray()));

        String testUserInput2= "David Hoang";
        assertEquals("UserInput David Hoang must return 2", 2, tester.count(testUserInput2 .toCharArray()));

        String testUserInput= "#@$@#%^@%$@#$";
        assertEquals("UserInput #@$@#%^@%$@#$ must return 0", 0, tester.count(testUserInput .toCharArray()));
    }

}