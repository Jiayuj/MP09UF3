package ex2;

import java.io.IOException;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try{
            InetAddress[] addresses = new InetAddress[3];

            addresses[0] = InetAddress.getLoopbackAddress();
            addresses[1] = InetAddress.getByName("ioc.xtec.cat");
            addresses[2] = InetAddress.getByName("elpuig.xeill.net");

            for(InetAddress adress: addresses){

                System.out.println("Host Name: " + adress.getHostName());
                System.out.println("Canonical HostName: " + adress.getCanonicalHostName());
                System.out.println("Host Address: " + adress.getHostAddress());
                System.out.println("Address: " + Arrays.toString(adress.getAddress()));
                System.out.println("loopback: " + adress.isLoopbackAddress());
                System.out.println("Link Local: " + adress.isLinkLocalAddress());

                System.out.println();

            }
        }catch(Exception e){System.out.println(e);}

        try {
            URL url = new URL("https://elpuig.xeill.net/");

            System.out.println(url.getAuthority());
            System.out.println(url.getDefaultPort());
            System.out.println(url.getFile());
            System.out.println(url.getHost());
            System.out.println(url.getPort());
            System.out.println(url.getPath());
            System.out.println(url.getProtocol());
            System.out.println(url.getUserInfo());
            System.out.println(url.getRef());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
