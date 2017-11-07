package com.hxf.netty.BIO2_1;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by hxf on 11/07/2017.
 */
public class TimeServer {

    public static void main(String[] args) throws IOException {
        int port = 20000;
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(port);
            System.out.println("The time server is start in port : " + port);
            Socket socket = null;
            while(true){
                socket = serverSocket.accept();
                new Thread(new TimeServerHandler(socket)).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(serverSocket != null){
                System.out.println("serverSocket close");
                serverSocket.close();
                serverSocket = null;
            }
        }
    }
}








































