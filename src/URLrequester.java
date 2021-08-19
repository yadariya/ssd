import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class URLrequester {
    public static void main(String[] args) {
        try {
            String fileName = args[0];
            String line;
            BufferedReader bufferreader = new BufferedReader(new FileReader(fileName));
            while ((line = bufferreader.readLine()) != null) {
                try {
                    URL url = new URL(line);
                    FileWriter file = new FileWriter("output.txt");
                    BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
                    String lineRead;
                    while ((lineRead = in.readLine()) != null) {
                        file.append(lineRead);
                    }
                    file.append("---------------------------");
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
