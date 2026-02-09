package Server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MainServer {
    public static void main(String[] args) {
       System.out.println("SERVER:inizio l'esecuzione");
        ServerSocket server = new ServerSocket(2000);
        try {
            ServerSocket server = new ServerSocket(2000);
            System.err.println("SERVER: in attesa di richieste dal client.");
            Socket clientSocket = server.accept();
            System.err.println("SERVER: il client si è connesso.");
        } catch (IOException e) {
            System.err.println("Porta non disponibile, " +
                    "errore nella creazione della connection socket!");
        }
    }
}
