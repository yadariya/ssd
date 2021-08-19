import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class UrlRequester {
    public static void main(String[] args) {
        try {
            String fileName = args[0];
            String line;
            BufferedReader bufferReader = new BufferedReader(new FileReader(fileName));
            FileWriter file = new FileWriter("output.txt");
            while ((line = bufferReader.readLine()) != null) {
                try {
                    URL url = new URL(line);
                    BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
                    String lineRead;
                    while ((lineRead = in.readLine()) != null) {
                        file.append(lineRead);
                    }
                    file.append("\n");
                    file.append("------");
                    file.append("\n");
                } catch (MalformedURLException e) {
                    System.out.println("Malformed URL: " + e.getMessage());

                } catch (IOException e) {
                    System.out.println("I/O Error: " + e.getMessage());
                }
            }
        } catch (IOException e) {
            System.out.println("I/O Error: " + e.getMessage());
        }
    }
}
