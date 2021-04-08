package com.company;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    private static Socket socket;
    private static final int PORT = 8889;
    private static final String IP_ADDRESS = "localhost";

    public static void main(String[] args) {
        try {

            socket = new Socket(IP_ADDRESS, PORT);


            Scanner inputText = new Scanner(System.in);

            Scanner input = new Scanner(socket.getInputStream());
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

            new Thread(() -> {
                //внутренний
                while (true) {
                    String str = inputText.nextLine();
                    output.println("Server: " + str);
                }
            }).start();

            while (true) {
                String str = input.nextLine();
                System.out.println(str);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}

