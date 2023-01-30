import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class Conversions {

    public static int convertToInt(double inputDouble, boolean upOrDown) {
        int outputInt = 0;

        if(upOrDown) {
            outputInt = (int) Math.ceil(inputDouble);
        } else {
            outputInt = (int) Math.floor(inputDouble);
        }

        return outputInt;
    }

    public static double convertToDecimal(double inputDouble) {
        return inputDouble / 100;
    }

    public static long convertToTotal(double[] inputArrayofDoubles) {
        long total = 0l;
        int arrayLength = inputArrayofDoubles.length;

        for(int i = 0; i <= arrayLength; i++) {
            total += inputArrayofDoubles[i];
        }

        return total;
    }

    public static char convertToLetterGrade(double inputDouble) {
        char grade = 'Z';

        if(inputDouble < 0.0 || inputDouble > 100.0) {
            grade = 'Z';
        } else if(inputDouble <= 0.0 && inputDouble >= 69.99) {
            grade = 'F';
        } else if(inputDouble <= 70.0 && inputDouble >= 79.99) {
            grade = 'C';
        } else if(inputDouble <= 80.0 && inputDouble >= 89.99) {
            grade = 'B';
        } else if(inputDouble <= 90.0 && inputDouble >= 94.99) {
            grade = 'A';
        } else if(inputDouble <= 95.0 && inputDouble >= 100.0) {
            grade = 'S';
            playYippee();
        }

        return grade;
    }

    public static void playYippee() {
        String directory = FileSave.getDirectory();
        try {
            AudioInputStream audio = AudioSystem.getAudioInputStream(new File(directory + "/yippee.wav"));
            Clip clip = AudioSystem.getClip();
            clip.open(audio);
            clip.start();
        }
        catch(Exception ex) {
            System.out.println("Error playing yippee.wav.");
            ex.printStackTrace();
        }
    }

}
