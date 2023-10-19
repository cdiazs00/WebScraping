import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        File inputCSV = new File("src/Pájaros.csv");
        File outputCSV = new File("src/Pruebas.csv");
        File input

        Scanner scanner = new Scanner(inputCSV);
        FileWriter writer = new FileWriter(outputCSV);

        while(scanner.hasNextLine()) {
            String line = scanner.nextLine();
            writer.write(line + "\n");
            System.out.println("Nombre " + line);
        }
        scanner.close();
        writer.close();
    }
}