package example;

import org.apache.commons.cli.*;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Example {
    public static void main(String[] args) throws ParseException {
        Options options = new Options();
        options.addOption("t", false, "display current time");
        CommandLineParser parser = new DefaultParser();
        CommandLine cmd = parser.parse(options, args);

        if(cmd.hasOption("t")) {
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

            System.out.println("Current date/time is " + formatter.format(new Date()));
        }
        else {
            HelpFormatter formatter = new HelpFormatter();
            formatter.printHelp("JakeExample", options);
        }
    }
}
