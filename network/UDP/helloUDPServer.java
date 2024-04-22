import java.net.*;
import java.io.*;

public class helloUDPServer {
    
    public static void main(String[] args) {

        //variable to hold input and output from/to Datagram
        byte[] receiveData = new byte[1024];
        byte[] sendData = new byte[1024];

        //define datagram socket
        try{
            DatagramSocket serverSocket = new DatagramSocket(8080);
            while(true){
                //receive data
                    DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                    serverSocket.receive(receivePacket);

                    //decode data into string
                    String receivedFromClient = new String(receiveData);
                    System.out.println("From client:"+ receivedFromClient);

                    //send data


            }
        } catch(Exception ex){
            System.out.println("Exception:"+ ex.getMessage());
        }

        
    }

}
