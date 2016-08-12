import java.lang.*;
import java.io.*;
import java.net.*;

class Server {
  public static void main(String args[]) {
    String data = "Watermelon tastes so sweet";
    try {
      // Set up server to listen at the given port 1234
      ServerSocket srvr = new ServerSocket(1234);
      /* Wait until client attempts to connect to server, send instance of 
       * Socket class */
      Socket skt = srvr.accept();
      System.out.print("Server has connected!\n");
      PrintWriter out = new PrintWriter(skt.getOutputStream(), true);
      System.out.print("Sending string: '" + data + "'\n");
      out.print(data);
      out.close();
      skt.close();
      srvr.close();
    }

    catch(Exception e) {
      System.out.print("Whoops! It didn't work!\n");
    }
  }
}
