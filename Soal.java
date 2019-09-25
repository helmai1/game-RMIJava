package GameRMI;

import Coba.CobaTimer;
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
   String dataFoto ;
   int dataIndex = 0;
   Timer timer;
   Game dataGame;
   int detik = 10;

   
   private GameInterface game;
    
    public Soal()
    { 
        initComponents();
     
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
       
      try {
         btnA.setText("A. " + game.ambilSoalA(dataIndex));
         btnB.setText("B. " + game.ambilSoalB(dataIndex));
         btnC.setText("C. " + game.ambilSoalC(dataIndex));
         btnD.setText("D. " + game.ambilSoalD(dataIndex));
         
         dataFoto = game.ambilFoto(dataIndex);
         
         int hitungLevel = dataIndex + 1;
         lblLevel.setText(String.valueOf(hitungLevel));
         
         System.out.println(dataFoto);
      
      
      } catch (RemoteException e) {
         System.err.println("Terjadi Error : " + e.getMessage());
         System.exit(1);
      }
         fotoGame();
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
               JOptionPane.showMessageDialog(null, "Waktu habis brow", "Peringatan", JOptionPane.ERROR_MESSAGE);
               Soal.this.setVisible(false);
               
               Menu menu = new Menu();
               menu.setVisible(true);
            }
            
            detik = 0;
            lblDetik.setText("00");
         }
      }
   }
    
   public void fotoGame()
   {
         ImageIcon icon = new ImageIcon(new ImageIcon(getClass().getResource("foto/" + dataFoto))
           .getImage().getScaledInstance(300, 264, Image.SCALE_SMOOTH));
         
         lblFoto.setIcon(icon);
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

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

      jPanel1.setBackground(new java.awt.Color(204, 204, 204));

      btnD.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
      btnD.setText("Soal D");
      btnD.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnDActionPerformed(evt);
         }
      });

      btnA.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
      btnA.setText("Soal A");
      btnA.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnAActionPerformed(evt);
         }
      });

      btnB.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
      btnB.setText("Soal B");
      btnB.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnBActionPerformed(evt);
         }
      });

      btnC.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
      btnC.setText("Soal C");
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

      javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
      jPanel1.setLayout(jPanel1Layout);
      jPanel1Layout.setHorizontalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(36, 36, 36)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(btnC, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(btnA, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(btnD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(btnB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(319, 319, 319)
            .addComponent(lblDetik)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblLevel)
            .addContainerGap())
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(188, 188, 188))
      );
      jPanel1Layout.setVerticalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(lblDetik)
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addGap(16, 16, 16)
                  .addComponent(lblLevel)))
            .addGap(18, 18, 18)
            .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(43, 43, 43)
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
//         dataGame = new Game();
      try {
        
         if (game.jawabA(0)) {
//            this.setVisible(false);
            timer.cancel();           
//            timer = new Timer();
//            timer.schedule(new tampilkanWaktuMundur(), 0, 1000);
         } else {
            timer.cancel();
//            this.setVisible();
         }
         
//         System.out.println(dataGame.getDataIndex());
         
      } catch (RemoteException e) {
         System.err.println("Terjadi Error : " + e.getMessage());
         System.exit(1);
      }
        
        
   }//GEN-LAST:event_btnAActionPerformed

   private void btnBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBActionPerformed
//      try {
//         game.jawabB(0);
//         
//      } catch (RemoteException e) {
//         System.err.println("Terjadi Error : " + e.getMessage());
//         System.exit(1);
//      }
   }//GEN-LAST:event_btnBActionPerformed

   private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
//      try {
//         game.jawabC(dataIndex);
//      
//      } catch (RemoteException e) {
//         System.err.println("Terjadi Error : " + e.getMessage());
//         System.exit(1);
//      }
   }//GEN-LAST:event_btnCActionPerformed

   private void btnDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDActionPerformed
//      try {
//         game.jawabD(dataIndex);
//      
//      } catch (RemoteException e) {
//         System.err.println("Terjadi Error : " + e.getMessage());
//         System.exit(1);
//      }
   }//GEN-LAST:event_btnDActionPerformed

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
   private javax.swing.JPanel jPanel1;
   private javax.swing.JLabel lblDetik;
   private javax.swing.JLabel lblFoto;
   private javax.swing.JLabel lblLevel;
   // End of variables declaration//GEN-END:variables
}
