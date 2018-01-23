/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package securechar_server;

/**
 *
 * @author Kareem Lawal
 */
public class Info {

    private static int serverPort;

    public static int getServerPort() {
        return serverPort;
    }

    public static void setServerPort(int serverPort) {
        Info.serverPort = serverPort;
    }

}
