import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class wordSearch {
    public static void main(String[] args) {
        char[][] letter = new char[6][7];
        int column = 0;
        int row = 0;
        File read = new File("grid.txt");
        wordSearch call = new wordSearch();

        call.getFile(letter, column, row, read);
    }

    //Reads the file to place the contents into a 2D array
    public void getFile(char[][] letter, int column, int row, File read) {
        try (Scanner scan = new Scanner(read)) {

            while (scan.hasNextLine()) {
                String line = scan.nextLine().replace( " ", "" );

                for (column = 0; column < 6; column++) {
                    letter[column][row] = line.charAt(column);

                    //Displays the text of the file for testing purposes
                    System.out.print(letter[column][row]);
                }

                row++;
                column = 0;
            }

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}