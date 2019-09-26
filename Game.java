/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameRMI;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
/**
 *
 * @author gokpraz
 */
public class Game extends UnicastRemoteObject implements GameInterface 
{   
   private String[] foto = {"zaki.png", "renaldy.PNG" , "agusta2.png" , "agus.PNG", "dany2.PNG"       , "dhimas.PNG", "dicky y.PNG", "gran.PNG", "helmi.PNG", "pres.PNG", "renaldy2.PNG", "son2.png", "wahyu.PNG"};
   private String[] jawaban = {"Zaki"  ,"Renaldy"     , "Agusta"      , "Agus"    , "Dany"            , "Dhimas"  , "Dicky"     , "Grandis"    , "Helmi"   , "Pres"     , "Renaldy" , "Son"         , "Wahyu"};
   private String[] soalA = {"Dicky"   ,"Renaldy"     , "Wahyu"      , "Helmi"   , "Agusta"          , "Dany"  , "Dicky"     , "Agusta"     , "Wahyu"   , "Ody"      , "Renaldy"     , "Ody"         , "Wahyu"};
   private String[] soalB = {"Grandis" ,"Dimas"       , "Odi"         , "Grandis" , "Dany"            , "Dhimas"  , "Zaki"      , "Helmi"      , "Helmi"   , "Pres"     , "Zaki"    , "Son"        , "Greg"}; 
   private String[] soalC = {"Odi"     ,"Agus"        , "Agusta"        , "Son"     , "Helmi"           , "Dicky"  , "Dimas"     , "Grandis"    , "Agus"    , "Zaki"     , "Wahyu"   , "Grandis"     , "Zaki"};
   private String[] soalD = {"Zaki"    ,"Agusta"      , "Dany"        , "Agus"    , "Agusta"          , "Ody"   ,"Wahyu"      , "Ody"        , "Grandis" , "Son"      , "Helmi"   , "Zaki"        , "Agus" };
   
   public Game() throws RemoteException
   {
      
   }

   @Override
   public String ambilSoalA(int index) throws RemoteException {
      String a = soalA[index];
      
      return a;
   }

   @Override
   public String ambilSoalB(int index) throws RemoteException {
      String dataArr = soalB[index];
      
      return dataArr;
   }

   @Override
   public String ambilSoalC(int index) throws RemoteException {
      String dataArr = soalC[index];
      
      return dataArr;
   }

   @Override
   public String ambilSoalD(int index) throws RemoteException {
      String dataArr = soalD[index];
      
      return dataArr;
   }



   @Override
   public String ambilFoto(int index) throws RemoteException {
      String dataArr = foto[index];
      
      return dataArr;
   }

   @Override
   public boolean jawabA(int index) throws RemoteException {
      boolean jwb = false;
      if (soalA[index].equals(jawaban[index])) {
         jwb = true;
         System.out.println("Soal A Benar");
      } else {
         System.out.println("Soal A Salah");
      }
      
      return jwb;
   }

   @Override
   public boolean jawabB(int index) throws RemoteException {
      boolean b = false;
      if (soalB[index].equals(jawaban[index])) {
         b = true;
         System.out.println("Soal B Benar");
      } else {
         System.out.println("Soal B Salah");
      }
      
      return b;
   }

   @Override
   public boolean jawabC(int index) throws RemoteException {
      boolean jwb = false;
      if (soalC[index].equals(jawaban[index])) {
         jwb = true;
         System.out.println("Soal C Benar");
      } else {
         System.out.println("Soal C Salah");
      }
      
      return jwb;
   }

   @Override
   public boolean jawabD(int index) throws RemoteException {
      boolean jwb = false;
      if (soalD[index].equals(jawaban[index])) {
         jwb = true;
         System.out.println("Soal D Benar");
      } else {
         System.out.println("Soal D Salah");
      }
      
      return jwb;
   }
}
