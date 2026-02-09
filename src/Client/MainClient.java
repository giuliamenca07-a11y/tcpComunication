package Client;

import java.net.Socket;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainClient {
    public static void main(String[] args) {
        System.out.println("CLIENT: avvio del client");
        Socket socket = new Socket("localhost",2000);

        try {
            Socket socket = new Socket("localhost",2000);
        } catch (Exception e) {
            System.out.println("");
        }
    }


}