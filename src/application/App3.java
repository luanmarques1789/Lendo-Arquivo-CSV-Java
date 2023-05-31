package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Usando bloco 'try with resources' para tratar a verbosidade do programa App2
 */
public class App3 {
  public static void main(String[] args) {
    String path = "./src/test.csv";

    try (BufferedReader br = new BufferedReader(new FileReader(path))) {
      String line = br.readLine();
      while (line != null) {
        System.out.println(line);
        line = br.readLine();
      }
    } catch (IOException e) {
      System.out.println("Erro: " + e.getMessage());
    }
  }
}
