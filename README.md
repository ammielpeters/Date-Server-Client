Date Server & Client (Java TCP Sockets)

This project demonstrates a simple **Date Server and Client** using **Java TCP Sockets**.  
The server listens on a port and sends the current date & time to any client that connects.

---

 How It Works
- **DateServer.java**  
  - Runs on port `5052`  
  - Waits for client connections  
  - Sends the current system date & time  

- **DateClient.java**  
  - Connects to the server on `localhost:5052`  
  - Reads the date & time from the server  
  - Prints it to the console  
