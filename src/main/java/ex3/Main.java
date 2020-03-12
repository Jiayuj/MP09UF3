package ex3;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://elpuig.xeill.net/");

            printContent(url);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    private static void printContent(URL url) throws IOException {
        InputStream in;
        in = url.openStream();
        BufferedInputStream inr = new BufferedInputStream(in);
        BufferedReader r = new BufferedReader(new InputStreamReader(inr, StandardCharsets.UTF_8));
        while(r.readLine() != null){
            String line = r.readLine();
            System.out.println(line);
        }
    }
}

