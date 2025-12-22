package design_pattern_structural.facade_pattern.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class FacadeEverydayDemo {
    static void main() throws Exception {
        URL url = new URL("http", "www.pluralsight.com", 80, "/author/bryan-hansen");

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));

        String inputLine;

        while((inputLine = bufferedReader.readLine()) != null) {
            System.out.println(inputLine);
        }
    }
}
