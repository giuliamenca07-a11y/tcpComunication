package Client;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class MainClient {
    public static void main(String[] args) {
        System.out.println("CLIENT: avvio del client");

        try {
            Socket socket = new Socket("localhost",2000);
            System.out.println("CLIENT: si è connesso al server");
            Socket clientSocket = new Socket();
            OutputStream outputStream = clientSocket.getOutputStream();
            PrintWriter pw = new PrintWriter(outputStream);
            pw.println("ciao server!");
            pw.flush();
            System.out.println("CLIENT: ha inviato un messaggio");
        } catch (Exception e) {
            System.out.println("");
        }
    }


}