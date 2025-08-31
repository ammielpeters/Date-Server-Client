import java.io.*; 

import java.net.*; 

 

public class DateClient { 

    public static void main(String[] args) { 

        String serverAddress = "localhost";  

        int port = 5052; 

 

        try (Socket socket = new Socket(serverAddress, port); 

             BufferedReader in = new BufferedReader( 

                     new InputStreamReader(socket.getInputStream()))) { 

 

            String serverDate = in.readLine(); 

            System.out.println("Server Date & Time: " + serverDate); 

 

        } catch (IOException e) { 

            e.printStackTrace(); 

        } 

    } 

} 

 
