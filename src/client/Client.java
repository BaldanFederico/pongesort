/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;


import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import static java.lang.System.in;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author baldan.federico
 */
public class Client {
    public static void main(String[] args){
      System.out.println("Apertua connessione");
      try{
            Socket server = new Socket("10.1.33.27", 5500);
           char [] array = {'a','b','C','L','l','J','p','S','o','f'};
           OutputStream versoIlClient= server.getOutputStream();
           BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(versoIlClient));
           bw.write(array[1]);
           bw.close(); 
           server.close();
            }catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("chiusura connessione");
         
}
}
}

