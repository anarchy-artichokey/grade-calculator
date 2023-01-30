import org.jetbrains.annotations.NotNull;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Modes {
    public static boolean parseArgsForCli(@NotNull String[] args) {
        boolean hasCliArgument = false;
        for(int i = 0; i <= args.length - 1; i++) {
            if(args[i].equals("-cli")) {
                hasCliArgument = true;
                break;
            }
        }
        return hasCliArgument;
    }

    public static boolean parseArgsForHelp(@NotNull String[] args) {
        boolean hasHelpArgument = false;
        for(int i = 0; i <= args.length - 1; i++) {
            if(args[i].equals("--h") || args[i].equals("-help")) {
                hasHelpArgument = true;
                break;
            }
        }
        return hasHelpArgument;
    }

    public static void cliMode() {
        System.out.println("cli mode");
        Scanner input = new Scanner(System.in);

        input.close();
    }

    public static void helpMode() {
        try {
            System.out.println("help mode");
            String[] helpText = FileSave.readFileLines(FileSave.getDirectory() + "/help.txt");
            int linesInFile = helpText.length;
            System.out.println(linesInFile);

            for (int i = 0; i <= linesInFile; i++) {
                System.out.println(helpText[i]);
            }
            System.exit(0);
        } catch(FileNotFoundException err) {
            System.out.println("Unfortunately, the help file was not found.");
            err.printStackTrace();
            System.exit(1);
        }
    }

    public static void guiMode() {
        System.out.println("gui mode");
    }
}

