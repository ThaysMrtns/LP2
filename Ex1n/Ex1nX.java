import java.io.*;

public class Ex1nX {
  public static void main(String[] args) throws IOException {
    BufferedReader dataFile;
    String line;
    int location, index;
    int[] letterCount = new int[26];
    char letter;

    dataFile = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Digite uma string: ");
    line = dataFile.readLine();

    while (line.isEmpty()) // Enquando houver linhas a serem lidas
    {

      for (location = 0; location < line.length(); location++) {
        letter = line.charAt(location);

        if ((letter >= 'A' && letter <= 'Z') || (letter >= 'a' && letter <= 'z')) {
          index = (int) Character.toUpperCase(letter) - (int) 'A';
          letterCount[index]++;
        }

      }

      for (index = 0; index < letterCount.length; index++) {
        System.out.println("O número total de " + (char) (index + (int) 'A') + " é " + letterCount[index]);
      }

      System.out.println("Digite uma string: ");
      line = dataFile.readLine(); // Lê a próxima linha
    }
  }
}
