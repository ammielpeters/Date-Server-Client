import java.io.*; 

import java.net.*; 

import java.util.Date; 

 

public class DateServer { 

    public static void main(String[] args) { 

        int port = 5052; 

        try (ServerSocket serverSocket = new ServerSocket(port)) { 

            System.out.println("Date Server started. Waiting for client..."); 

 

            while (true) { 

                Socket socket = serverSocket.accept();  

                System.out.println("Client connected: " + socket.getInetAddress()); 

 

                PrintWriter out = new PrintWriter(socket.getOutputStream(), true); 

                out.println(new Date().toString()); 

 

                socket.close(); 

            } 

 

        } catch (IOException e) { 

            e.printStackTrace(); 

        } 

    } 

} 
