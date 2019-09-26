/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameRMI;

import java.rmi.Remote;
import java.rmi.RemoteException;
/**
 *
 * @author gokpraz
 */
public interface GameInterface extends Remote {
   public String ambilSoalA(int index) throws RemoteException;
   public String ambilSoalB(int index) throws RemoteException;
   public String ambilSoalC(int index) throws RemoteException;
   public String ambilSoalD(int index) throws RemoteException;
   public String ambilFoto(int index) throws RemoteException;
   
   public boolean jawabA(int index) throws RemoteException;
   public boolean jawabB(int index) throws RemoteException;
   public boolean jawabC(int index) throws RemoteException;
   public boolean jawabD(int index) throws RemoteException;
}
