package Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class MainServer {
    public static void main(String[] args) {
       System.out.println("SERVER:inizio l'esecuzione");
        try {
            ServerSocket server = new ServerSocket(2000);
            System.err.println("SERVER: in attesa di richieste dal client.");
            Socket clientSocket = server.accept();
            System.err.println("SERVER: il client si è connesso.");
            InputStream inputStream = clientSocket.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
            String messaggio = br.readLine();
            System.out.println("SERVER: il client" + clientSocket +
                    "ha scritto il messaggio" + messaggio);
            clientSocket.close();
            server.close();
        } catch (IOException e) {
            System.err.println("Porta non disponibile, " +
                    "errore nella creazione della connection socket!");
        }
    }
}
