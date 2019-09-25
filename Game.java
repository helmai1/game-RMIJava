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
   private String[] foto = {"renaldy.PNG", "agusta2.PNG", "agus.PNG", "dany2.PNG", "dhimas.PNG", "dicky y.PNG", "gran.PNG", "helmi.PNG", "pres.PNG", "renaldy2.PNG", "son2.PNG", "wahyu.PNG"};
   private String[] jawaban = {"Renaldy", "Agusta", "Agus", "Dany", "Dhimas", "Dicky", "Grandis", "Helmi", "Pres", "Renaldy", "Son", "Wahyu"};
   private String[] soalA = {"Renaldy", "Agusta", "Helmi", "Agusta", "Dany", "Dicky", "Agusta", "Wahyu", "Ody", "Son", "Ody"};
   private String[] soalB = {"Dimas", "Odi", "Grandis", "Dany", "Dhimas", "Ody", "Helmi", "Helmi", "Pres", "Zaki", "Agus"}; 
   private String[] soalC = {"Agus", "Greg", "Son", "Helmi", "Dicky", "Dimas", "Grandis", "Agus", "Zaki", "Wahyu", "Grandis"};
   private String[] soalD = {"Agusta", "Dany", "Agus", "Agusta", "Ody","Wahyu", "Ody", "Grandis", "Son", "Helmi", "Son"};
   
   private int dataIndex = 0;

   public int getDataIndex() {
      return dataIndex;
   }

   public void setDataIndex(int dataIndex) {
      this.dataIndex = dataIndex;
   }
   
   public Game() throws RemoteException
   {
      
   }

   @Override
   public String ambilSoalA(int index) throws RemoteException {
      String dataArr = soalA[index];
      
      return dataArr;
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
         this.actionJawabA();
      }
      
      return jwb;
   }

   @Override
   public boolean jawabB(int index) throws RemoteException {
      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   }

   @Override
   public boolean jawabC(int index) throws RemoteException {
      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   }

   @Override
   public boolean jawabD(int index) throws RemoteException {
      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   }
   
   
   private void actionJawabA()
   {
      System.out.println("Benar lho");
//      Soal soal = new Soal();
//      soal.setVisible(false);
   }
}
