package Client;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class MainClient {
    public static void main(String[] args) {
        System.out.println("CLIENT: avvio del client");

        try {
            Socket socket = new Socket("localhost",2000);
            System.out.println("CLIENT: si è connesso al server");
            OutputStream outputStream = socket.getOutputStream();
            PrintWriter pw = new PrintWriter(outputStream);
            pw.println("Scrivi un messaggio da inviare al server:");
            Scanner sc = new Scanner(System.in);
            String messaggio = sc.nextLine();
            pw.flush();
            System.out.println("CLIENT: ha inviato un messaggio");
        } catch (Exception e) {
            System.err.println("CLIENT: errore nella connessione");
        }
    }


}