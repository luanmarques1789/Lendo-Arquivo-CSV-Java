package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Programa simples de leitura de arquivo via Scanner e File
 */
public class App {
    public static void main(String[] args) throws Exception {
        File file = new File("./src/test.csv");

        Scanner scan = null;

        try {
            scan = new Scanner(file);
            while (scan.hasNextLine()) {
                System.out.println(scan.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            if (scan != null)
                scan.close();
        }
    }
}
