package test.java.com.hokeiiiching.bottlesofbeer;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BottlesOfBeerTest {

    @Test
    public void testContentComparison() throws IOException {

        String outputFilePath = "D:\\CS FILES\\Projects\\bottles-of-beer\\src\\main\\java\\com.hokeiiiching.bottles_of_beer\\output.txt";
        BufferedReader outputFileReader = new BufferedReader(new FileReader(outputFilePath));

        String textFilePath = "D:\\CS FILES\\Projects\\bottles-of-beer\\src\\main\\java\\com.hokeiiiching.bottles_of_beer\\SongLyrics.txt";
        BufferedReader textFileReader = new BufferedReader(new FileReader(textFilePath));

        String outputLine;
        String expectedLine;
        int lineNumber = 1;

        while ((outputLine = outputFileReader.readLine()) != null && (expectedLine = textFileReader.readLine()) != null) {
            // Compare line by line
            assertEquals(expectedLine, outputLine, "Mismatch at line " + lineNumber);
            lineNumber++;
        }

        // Close readers
        outputFileReader.close();
        textFileReader.close();
    }
}
