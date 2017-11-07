package com.hxf.netty.BIO2_1;

import java.io.IOException;
import java.net.ServerSocket;

/**
 * Created by hxf on 11/07/2017.
 */
public class TimeServer {

    public static void main(String[] args) {
        int port = 20000;
        try {
            ServerSocket serverSocket = new ServerSocket(port);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}








































