/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameRMI;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author gokpraz
 */
public class Server {
   public static void main(String[] args) throws RemoteException, NotBoundException 
   {
      // Port
      Registry registry = LocateRegistry.createRegistry(1099);
      Game game = new Game();
      
      registry.rebind("game", game);
      
      System.out.println("Server is running . . .");
   }
}
