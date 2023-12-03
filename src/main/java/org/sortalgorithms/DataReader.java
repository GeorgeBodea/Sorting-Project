package org.sortalgorithms;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class DataReader {
    public static ArrayList<Integer> readNumbersFromFile(String filePath) {
        ArrayList<Integer> allNumbers = new ArrayList<>();
        InputStream inputStream = DataReader.class.getClassLoader().getResourceAsStream(filePath);

        assert inputStream != null;

        try (Scanner scanner = new Scanner(inputStream)) {
            while (scanner.hasNext()) {
                if (scanner.hasNextInt()) {
                    allNumbers.add(scanner.nextInt());
                }
                else {
                    scanner.next();
                }
            }
        }

        return allNumbers;
    }

}
