/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package securechar_server;

import java.io.*;
import java.net.*;
import Messages.Packet;
import Forms.MainForm;

/**
 *
 * @author Kareem Lawal
 */
public class Server {

    private ObjectOutputStream outStream;
    private ObjectInputStream inStream;
    private static int serverPort;
    private Packet sendPkt;
    private Packet rcvPkt;
    private ServerSocket serverSocket;
    private Socket clientSocket;

    void strat() {
        try {
            serverPort = Info.getServerPort();
            if (serverPort == 0) {
                System.out.println("Error");
                System.exit(0);
            }

            serverSocket = new ServerSocket(serverPort);
            new MainForm().setVisible(true);
            MainForm.logText.append("server started \n");

            while (true) {
                clientSocket = serverSocket.accept();
                new ReceiverThread(clientSocket).start();

                System.out.println("START");

            }

        } catch (IOException ex) {
            //  System.out.println(ex);
        }
    }
}
