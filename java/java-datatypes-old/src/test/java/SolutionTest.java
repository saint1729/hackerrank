import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    private final InputStream systemIn = System.in;
    private final PrintStream systemOut = System.out;

    private FileInputStream testIn;
    private ByteArrayOutputStream testOut;

    @Before
    public void setUpOutput() {
        testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));
    }

    private void provideInput(String fileName) throws IOException {
        testIn = new FileInputStream(fileName);
        System.setIn(testIn);
    }

    private String getOutput() {
        return testOut.toString();
    }

    private String outputAsString(String outputFile) throws IOException {
        FileInputStream fstream = new FileInputStream(outputFile);
        BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
        StringBuffer sb = new StringBuffer();
        String line;

        while ((line = br.readLine()) != null) {
            sb.append(line);
            sb.append("\n");
        }

        fstream.close();

        return sb.toString();
    }

    @After
    public void restoreSystemInputOutput() {
        System.setIn(systemIn);
        System.setOut(systemOut);
    }

    @Test
    public void test() throws IOException {

        String TEST_CASE_NUMBER = "00";

        final String testString = "input" + TEST_CASE_NUMBER + ".txt";
        provideInput(testString);
        Solution.main(new String[0]);
        String outputFromFile = outputAsString("output" + TEST_CASE_NUMBER + ".txt");
        String outputFromMain = getOutput();

        assertEquals(outputFromFile, outputFromMain); // .substring(0, outputFromMain.length() - 1));

    }
}
