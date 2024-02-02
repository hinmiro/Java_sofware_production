package module03.datastreams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.*;

public class ReadTemperature {
    public static void main(String[] args) {
        URL url;
        String[] headers = new String[0];
        String line;
        boolean header = true;
        String date = "01.01.2023";
        double average = 0;
        int increment = 0;

        try {
            url = new URL("https://users.metropolia.fi/~jarkkov/temploki.csv");
        } catch (MalformedURLException e) {
            System.err.println(e);
            return;
        }

        try {
            InputStream istream = url.openStream();
            InputStreamReader istreamreader = new InputStreamReader(istream);
            BufferedReader reader = new BufferedReader(istreamreader);
            do {
                line = reader.readLine();
                if (line != null) {
                    if (header) {
                        headers = line.split(";");
                        header = false;
                    } else {
                        String[] column = line.split(";");
                        for (int i = 0; i < column.length; i++) {
                            String[] date2 = column[0].split(" ");
                            if (date2[0].equals(date)) {
                          //      System.out.println(headers[0] + " " + column[0] + " Lämpötiöla: " + column[1]);   // This prints all temps from 01.01.2023
                                String temp = column[1];
                                temp = temp.replace(",", ".");
                                average += Double.parseDouble(temp);
                                increment++;
                            }
                        }
                    }
                }
            } while (line != null);
            System.out.printf("\n%s average temperature is %.2f", date, average / increment);
            reader.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
