public class Run {
    public static void main(String[] args) {
        boolean cliArg = false;
        boolean helpArg = false;

        if(args.equals(null)) {
            System.out.println("No arguments, launching GUI mode.");
        } else {
            helpArg = Modes.parseArgsForHelp(args);
            cliArg = Modes.parseArgsForCli(args);
        }

        if(helpArg) {
            try {
                Modes.helpMode();
                System.exit(0);
            } catch(Exception ex) {
                System.out.println("Error reading file");
                ex.printStackTrace();
                System.exit(1);
            }
        } else if(cliArg) {
            Modes.cliMode();
        } else {
            Modes.guiMode();
        }
    }
}