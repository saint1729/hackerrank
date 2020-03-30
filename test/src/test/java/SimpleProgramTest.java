import static org.junit.Assert.*;

import java.io.*;

import org.junit.*;

public class SimpleProgramTest {
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
    public void testCase1() throws IOException {

        final String testString = "input00.txt";
        provideInput(testString);
        SimpleProgram.main(new String[0]);
        String outputFromFile = outputAsString("output00.txt");
        String outputFromMain = getOutput();

        assertEquals(outputFromFile, outputFromMain.substring(0, outputFromMain.length() - 1));

    }
}
