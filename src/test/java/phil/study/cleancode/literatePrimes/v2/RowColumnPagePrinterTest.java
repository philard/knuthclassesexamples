package phil.study.cleancode.literatePrimes.v2;

import org.junit.*;
import phil.study.cleancode.literatePrimes.v2.RowColumnPagePrinter;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class RowColumnPagePrinterTest {


    private ByteArrayOutputStream printerOutput = new ByteArrayOutputStream();

    @Before
    public void setUpAllRowColumnPagePrinterInstances() {
        printerOutput = new ByteArrayOutputStream();
    }


    @Test
    public void shouldPrintAThreeByThreePage() {
        int[] inputNumbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        String expectedOutput = "Three by three page. --- Page 1\n" +
                "\n" +
                "         0         3         6\n" +
                "         1         4         7\n" +
                "         2         5         8\n" +
                "\f\n" +
                "Three by three page. --- Page 2\n" +
                "\n" +
                "         9\n" +
                "\n" +
                "\n" +
                "\f\n";
        assertInstancePrintsInputAsExpected(threeByThreePagePrinter(), inputNumbers, expectedOutput);
    }

    @Test
    public void shouldReturnEmptyStringForNullArray() {
        int[] inputNumbers = null;
        String expectedOutput = "";
        assertInstancePrintsInputAsExpected(threeByThreePagePrinter(), inputNumbers, expectedOutput);
    }

    @Test 
    public void shouldReturnEmptyStringForEmptyArray() {
        int[] inputNumbers = new int[]{};
        String expectedOutput = "";
        assertInstancePrintsInputAsExpected(threeByThreePagePrinter(), inputNumbers, expectedOutput);
    }

    @Test
    public void shouldPrintWideAndShortPages() {
        int[] inputNumbers = new int[]{0,1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9};
        String expectedOutput = "wideAndShortPagePrinter --- Page 1\n" +
                "\n" +
                "         0         1         2         3         4         5         6         7         8         9         0         1         2         3         4         5         6         7         8         9         0         1         2         3         4         5         6         7         8         9         0         1         2         3         4         5         6         7         8         9         0         1         2         3         4         5         6         7         8         9         0         1         2         3         4         5         6         7         8         9         0         1         2         3         4         5         6         7         8         9         0         1         2         3         4         5         6         7         8         9         0         1         2         3         4         5         6         7         8         9         0         1         2         3         4         5         6         7         8         9\n" +
                "\f\n" +
                "wideAndShortPagePrinter --- Page 2\n" +
                "\n" +
                "         0         1         2         3         4         5         6         7         8         9         0         1         2         3         4         5         6         7         8         9         0         1         2         3         4         5         6         7         8         9         0         1         2         3         4         5         6         7         8         9\n" +
                "\f\n";
        assertInstancePrintsInputAsExpected(wideAndShortPagePrinter(), inputNumbers, expectedOutput);
    }

    @Test
    public void shouldPrintNarrowAndLongPages() {
        int[] inputNumbers = new int[]{0,1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9};
        String expectedOutput = "wideAndShortPagePrinter --- Page 1\n" +
                "\n         0\n         1\n         2\n         3\n         4\n         5\n         6\n         7\n         8\n         9\n         0\n         1\n         2\n         3\n         4\n         5\n         6\n         7\n         8\n         9\n         0\n         1\n         2\n         3\n         4\n         5\n         6\n         7\n         8\n         9\n         0\n         1\n         2\n         3\n         4\n         5\n         6\n         7\n         8\n         9\n         0\n         1\n         2\n         3\n         4\n         5\n         6\n         7\n         8\n         9\n         0\n         1\n         2\n         3\n         4\n         5\n         6\n         7\n         8\n         9\n         0\n         1\n         2\n         3\n         4\n         5\n         6\n         7\n         8\n         9\n         0\n         1\n         2\n         3\n         4\n         5\n         6\n         7\n         8\n         9\n         0\n         1\n         2\n         3\n         4\n         5\n         6\n         7\n         8\n         9\n         0\n         1\n         2\n         3\n         4\n         5\n         6\n         7\n         8\n         9" +
                "\n\f\nwideAndShortPagePrinter --- Page 2\n\n         0\n         1\n         2\n         3\n         4\n         5\n         6\n         7\n         8\n         9\n         0\n         1\n         2\n         3\n         4\n         5\n         6\n         7\n         8\n         9\n         0\n         1\n         2\n         3\n         4\n         5\n         6\n         7\n         8\n         9\n         0\n         1\n         2\n         3\n         4\n         5\n         6\n         7\n         8\n         9\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\f\n";
        assertInstancePrintsInputAsExpected(narrowAndLongPagesPagePrinter(), inputNumbers, expectedOutput);
    }


    private void assertInstancePrintsInputAsExpected(RowColumnPagePrinter pagePrinter,
                                                     int[] inputNumbers,
                                                     String expectedOutput) {
        pagePrinter.print(inputNumbers);
        String printedOutput = printerOutput.toString();

        assertNotNull("Out stream is not null", printedOutput);
        assertEquals("Exact output match", expectedOutput, printedOutput);
    }

    private RowColumnPagePrinter threeByThreePagePrinter() {
        return new RowColumnPagePrinter(3, 3, 
                "Three by three page.",
                new PrintStream(printerOutput));
    }

    private RowColumnPagePrinter wideAndShortPagePrinter() {
        return new RowColumnPagePrinter(1, 100,
                "wideAndShortPagePrinter",
                new PrintStream(printerOutput));
    }

    private RowColumnPagePrinter narrowAndLongPagesPagePrinter() {
        return new RowColumnPagePrinter(100, 1,
                "wideAndShortPagePrinter",
                new PrintStream(printerOutput));
    }

    private RowColumnPagePrinter zeroWidthPagePrinter() {
        return new RowColumnPagePrinter(0, 3,
                "wideAndShortPagePrinter",
                new PrintStream(printerOutput));
    }


}
