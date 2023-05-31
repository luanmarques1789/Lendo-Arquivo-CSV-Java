package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class ReadCSVFile {
  public static void main(String[] args) {

    String path = "./src/test.csv";
    List<Product> list = new ArrayList<Product>();

    try (BufferedReader br = new BufferedReader(new FileReader(path))) {
      String line = br.readLine(); // primeira linha (cabeçalho do csv)
      line = br.readLine(); // segunda linha (conteúdo hipoteticamente)

      while (line != null) { // verificando se a segunda linha não é nula (vazia)
        String[] content = line.split(",");

        String name = content[0];
        Double price = Double.parseDouble(content[1]);
        Integer quantity = Integer.parseInt(content[2]);

        list.add(new Product(name, price, quantity));

        line = br.readLine();
      }
    } catch (IOException e) {
      System.out.println("Erro: " + e.getMessage());
    }
    for (Product prod : list) {
      System.out.println(prod.toString());
    }
  }
}
