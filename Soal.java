package kuis_rmi;

import java.awt.Image;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import java.util.Timer;
import java.util.TimerTask;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


/**
 *
 * @author GokPraz
 */
public class Soal extends javax.swing.JFrame 
{
   Game dataGame;
   String dataFoto;
   Timer timer;
   int detik = 3;

   
   private GameInterface game;
    
    public Soal()
    { 
        initComponents();
     
      if (Variabel.dataIndex == 14) {
         JOptionPane.showMessageDialog(null, "Selamat anda menang ye", "Peringatan", JOptionPane.WARNING_MESSAGE);
         System.exit(1);
         this.dispose();
       }
        
      try {
         game = (GameInterface) Naming.lookup("rmi://localhost:1099/game");
       

      } catch (NotBoundException e) {
         System.out.println("Terjadi error : " + e.getMessage());
         System.exit(1);
      } catch (MalformedURLException e) {
         System.err.println("Terjadi error : " + e.getMessage());
         System.exit(1);
      } catch (RemoteException e) {
         System.out.println("Terjadi error : " + e.getMessage());
         System.exit(1);
      }
      
  
      
        timer = new Timer();
        timer.schedule(new tampilkanWaktuMundur(), 0, 1000);
       
      coba();
      
       
    }

      class tampilkanWaktuMundur extends TimerTask
      {
                 
      @Override
      public void run() {
         if (detik > 1) {
            lblDetik.setText("0:" + String.valueOf(detik));
            detik--;
         } else {
            if (detik == 1) {
               Soal.this.setVisible(false);
               JOptionPane.showMessageDialog(null, "Waktu habis brow", "Peringatan", JOptionPane.ERROR_MESSAGE);
               
               Menu menu = new Menu();
               menu.setVisible(true);
               
               resetGame();
            }
            
            detik = 0;
            lblDetik.setText("00");
         }
      }
   }
   
    @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      jPanel1 = new javax.swing.JPanel();
      btnD = new javax.swing.JButton();
      btnA = new javax.swing.JButton();
      btnB = new javax.swing.JButton();
      btnC = new javax.swing.JButton();
      lblDetik = new javax.swing.JLabel();
      lblFoto = new javax.swing.JLabel();
      lblLevel = new javax.swing.JLabel();
      jLabel1 = new javax.swing.JLabel();

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

      jPanel1.setBackground(new java.awt.Color(204, 204, 204));

      btnD.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
      btnD.setText("Soal D");
      btnD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
      btnD.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnDActionPerformed(evt);
         }
      });

      btnA.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
      btnA.setText("Soal A");
      btnA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
      btnA.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnAActionPerformed(evt);
         }
      });

      btnB.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
      btnB.setText("Soal B");
      btnB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
      btnB.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnBActionPerformed(evt);
         }
      });

      btnC.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
      btnC.setText("Soal C");
      btnC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
      btnC.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnCActionPerformed(evt);
         }
      });

      lblDetik.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
      lblDetik.setForeground(new java.awt.Color(0, 0, 0));
      lblDetik.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      lblDetik.setText("00:30");

      lblFoto.setBackground(new java.awt.Color(0, 0, 0));
      lblFoto.setForeground(new java.awt.Color(0, 0, 0));

      lblLevel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
      lblLevel.setForeground(new java.awt.Color(0, 0, 0));
      lblLevel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      lblLevel.setText("level");

      jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
      jLabel1.setForeground(new java.awt.Color(0, 0, 0));
      jLabel1.setText("Aku Siapa ? ");

      javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
      jPanel1.setLayout(jPanel1Layout);
      jPanel1Layout.setHorizontalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(319, 319, 319)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addComponent(jLabel1)
                  .addGap(0, 0, Short.MAX_VALUE))
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addComponent(lblDetik)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 203, Short.MAX_VALUE)
                  .addComponent(lblLevel)))
            .addContainerGap())
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                  .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(189, 189, 189))
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                  .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(btnC, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(btnA, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                  .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(btnD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(btnB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addGap(17, 17, 17))))
      );
      jPanel1Layout.setVerticalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(lblDetik)
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addGap(16, 16, 16)
                  .addComponent(lblLevel)))
            .addGap(20, 20, 20)
            .addComponent(jLabel1)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(btnA, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(btnB, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(35, 35, 35)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(btnD, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(btnC, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(28, Short.MAX_VALUE))
      );

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, Short.MAX_VALUE))
      );

      pack();
      setLocationRelativeTo(null);
   }// </editor-fold>//GEN-END:initComponents

   private void btnAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAActionPerformed
      try {         
         if (game.jawabA(Variabel.dataIndex) == true) {
            timer.cancel();       
            
            Variabel.dataIndex = Variabel.dataIndex + 1;
            Soal soal = new Soal();
            this.dispose();

            soal.setVisible(true);            
         } else {
            timer.cancel();
            this.dispose();
            JOptionPane.showMessageDialog(null, "Payah anda noob", "Peringatan", JOptionPane.ERROR_MESSAGE);
            
            Menu menu = new Menu();
            menu.setVisible(true);
            resetGame();
         }
         
         
      } catch (RemoteException e) {
         System.err.println("Terjadi Error : " + e.getMessage());
         System.exit(1);
      }
   }//GEN-LAST:event_btnAActionPerformed

   private void btnBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBActionPerformed
      try {         
         if (game.jawabB(Variabel.dataIndex) == true) {
            timer.cancel();       
            
            Variabel.dataIndex = Variabel.dataIndex + 1;
            Soal soal = new Soal();
            this.dispose();

            soal.setVisible(true);            
         } else {
            timer.cancel();
            this.dispose();
            JOptionPane.showMessageDialog(null, "Payah anda noob", "Peringatan", JOptionPane.ERROR_MESSAGE);
            
            Menu menu = new Menu();
            menu.setVisible(true);
            resetGame();
         }
         
         
      } catch (RemoteException e) {
         System.err.println("Terjadi Error : " + e.getMessage());
         System.exit(1);
      }
   }//GEN-LAST:event_btnBActionPerformed

   private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
      try {         
         if (game.jawabC(Variabel.dataIndex) == true) {
            timer.cancel();       
            
            Variabel.dataIndex = Variabel.dataIndex + 1;
            Soal soal = new Soal();
            this.dispose();

            soal.setVisible(true);            
         } else {
            timer.cancel();
            this.dispose();
            JOptionPane.showMessageDialog(null, "Payah anda noob", "Peringatan", JOptionPane.ERROR_MESSAGE);
            
            Menu menu = new Menu();
            menu.setVisible(true);
            resetGame();
         }
         
         
      } catch (RemoteException e) {
         System.err.println("Terjadi Error : " + e.getMessage());
         System.exit(1);
      }
   }//GEN-LAST:event_btnCActionPerformed

   private void btnDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDActionPerformed
      try {         
         if (game.jawabD(Variabel.dataIndex) == true) {
            timer.cancel();       
            
            Variabel.dataIndex = Variabel.dataIndex + 1;
            Soal soal = new Soal();
            this.dispose();

            soal.setVisible(true);            
         } else {
            timer.cancel();
            JOptionPane.showMessageDialog(null, "Payah anda noob", "Peringatan", JOptionPane.ERROR_MESSAGE);
            this.dispose();
            
            Menu menu = new Menu();
            menu.setVisible(true);
            resetGame();
         }
         
         
      } catch (RemoteException e) {
         System.err.println("Terjadi Error : " + e.getMessage());
         System.exit(1);
      }
   }//GEN-LAST:event_btnDActionPerformed


   public void coba()
   {
      try {
         btnA.setText("A. " + game.ambilSoalA(Variabel.dataIndex));
         btnB.setText("B. " + game.ambilSoalB(Variabel.dataIndex));
         btnC.setText("C. " + game.ambilSoalC(Variabel.dataIndex));
         btnD.setText("D. " + game.ambilSoalD(Variabel.dataIndex));
                  
         dataFoto = game.ambilFoto(Variabel.dataIndex);
         
         int hitungLevel = Variabel.dataIndex + 1;
         lblLevel.setText(String.valueOf(hitungLevel));
               
         fotoGame(dataFoto);
      
      } catch (RemoteException e) {
         System.err.println("Terjadi Error : " + e.getMessage());
         System.exit(1);
      }
   }
   
   public void fotoGame(String data)
   {
         ImageIcon icon = new ImageIcon(new ImageIcon(getClass().getResource("foto/" + data))
           .getImage().getScaledInstance(300, 264, Image.SCALE_SMOOTH));
         
         lblFoto.setIcon(icon);
   }
   
   
   public void resetGame()
   {
      Variabel.dataIndex = 0;
   }
   
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Soal().setVisible(true);
            }
        });
    }

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton btnA;
   private javax.swing.JButton btnB;
   private javax.swing.JButton btnC;
   private javax.swing.JButton btnD;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JPanel jPanel1;
   private javax.swing.JLabel lblDetik;
   private javax.swing.JLabel lblFoto;
   private javax.swing.JLabel lblLevel;
   // End of variables declaration//GEN-END:variables
}
