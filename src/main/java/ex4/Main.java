package ex4;

import javax.net.ssl.HttpsURLConnection;
import java.io.*;
import java.net.URL;
import java.net.URLConnection;

public class Main {

    public static void main(String[] args) {

        String nombre="JiayuTest";
        String bool = "Si";
        try {
            URL url = new URL("https://docs.google.com/forms/u/0/d/e/1FAIpQLScE6sxLFb3BmCmT2TKHQH5ormS0qvjHwO-uTAR8MXaagBvSSQ/formResponse");

            HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
            connection.setDoOutput(true);
            connection.setDoInput(true);
            connection.setRequestMethod("POST");

            OutputStreamWriter out = new OutputStreamWriter(connection.getOutputStream());
            out.write("entry.835030737="+nombre+"&entry.1616686619="+bool);
            out.flush();
            out.close();

            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            in.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
