package Server;

import java.net.*;
import java.io.*;

public class ReversEcho {
    public static void main(String[] args) throws Exception {

        ServerSocket ss = new ServerSocket(2000);
        System.out.println("Server is Running Succesfully! ");
        Socket stk = ss.accept();

        BufferedReader br = new BufferedReader(new InputStreamReader(stk.getInputStream()));
        PrintStream ps = new PrintStream(stk.getOutputStream());

        String msg;
        StringBuilder sb;
        do {
            msg = br.readLine();

            sb = new StringBuilder(msg);
            sb.reverse();
            msg = sb.toString();

            ps.println(msg);
        } while (!msg.equals("dne"));
    }
}

// #######################################CLINT################
class Client {
    public static void main(String[] args) throws Exception {

        Socket stk = new Socket("192.168.52.1", 2000);

        BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(stk.getInputStream()));
        PrintStream ps = new PrintStream(stk.getOutputStream());

        String msg;

        do {
            msg = key.readLine();

            ps.println(msg);

            msg = br.readLine();
            System.out.println(" From Server " + msg);
        } while (!msg.equals("dne"));
    }
}
