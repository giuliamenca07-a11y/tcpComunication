package Client;

import java.net.Socket;

public class MainClient {
    public static void main(String[] args) {
        System.out.println("CLIENT: avvio del client");

        try {
            Socket socket = new Socket("localhost",2000);
        } catch (Exception e) {
            System.out.println("");
        }
    }


}