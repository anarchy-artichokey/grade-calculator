import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import org.json.*;

public class FileSave {

    public static String getDirectory() {
        String Directory = System.getProperty("user.dir");

        for(int i = 0; i <= Directory.length() - 1; i++) {
            String currentIndexedCharacter = String.valueOf(Directory.charAt(i));
            if(currentIndexedCharacter.equals("\\")) {
                Directory.replace("\\", "/");
            }
        }

        return Directory;
    }

    public static String[] readFileLines(String filePath) throws FileNotFoundException {
        Scanner input = new Scanner(new File(filePath));
        int linesOfFile = 0;

        while(input.hasNextLine()) {
            linesOfFile++;
        }

        String[] fileLines = new String[linesOfFile];

        for(int i = 0; i <= linesOfFile; i++) {
            fileLines[i] = input.nextLine();
        }

        input.close();
        return fileLines;
    }

    public static double[] readSaveData(String fullFilePath) {
        JSONArray jsonArray = new JSONArray(new File(fullFilePath));
        double[] returnDoubleArray = new double[jsonArray.length()];

        return new double[]{1.0, 2.0, 3.0};
    }

}
