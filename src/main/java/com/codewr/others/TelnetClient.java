/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codewr.others;

import java.io.*;
import java.net.*;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author NXCOMM
 */
public class TelnetClient {

    public static void main(String args[])  {
        try {
            System.out.println(new Date());
            Socket soc = new Socket("192.168.1.224", 8854);
            
            soc.setSoTimeout(10000);
            System.out.println(soc.isConnected());
//            String LoginName;
//            String Password;
//            String Command;
            
//            DataInputStream din = new DataInputStream(soc.getInputStream());
//            DataOutputStream dout = new DataOutputStream(soc.getOutputStream());
//            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            System.out.println("Welcome to Telnet Client");
            System.out.println("telnet ok");
            
//            System.out.print("Login Name :");
//            
//            LoginName = br.readLine();
//            
//            System.out.print("Password :");
//            Password = br.readLine();
//            
//            dout.writeUTF(LoginName);
//            dout.writeUTF(Password);
//            
//            if (din.readUTF().equals("ALLOWED")) {
//                do {
//                    System.out.print("< Telnet Prompt >");
//                    Command = br.readLine();
//                    dout.writeUTF(Command);
//                    if (!Command.equals("quit")) {
//                        System.out.println(din.readUTF());
//                    }
//                } while (!Command.equals("quit"));
//            }
            soc.close();
        } catch (IOException ex) {
             System.out.println(new Date());
            System.out.println("telnet fail");
        }
    }
}
