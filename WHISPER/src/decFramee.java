
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rahaa
 */

//Whisper 2019 , Made by: 
/*Majd Bandar Bin Musibeh	438200829
Ghada Abdurrahman AlGhurairi	438201865
Shahad Omar AlHarbi	438201706
Lujain Abdullah Almuhaitheef	438201099
Rahaf Mohammed Al-Omar	438202048*/


public class decFramee extends javax.swing.JFrame {

    /**
     * Creates new form decFramee
     */
    public decFramee() {
        initComponents();
        //ADDED BY SHAHAD. DELETE IF IT RUINS SMTH.
        PlainText3.setEditable(false);
        //ADDED BY SHAHAD
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CipherText3 = new javax.swing.JTextArea();
        Decryption = new javax.swing.JButton();
        ProName2 = new javax.swing.JLabel();
        ProName3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        PlainText3 = new javax.swing.JTextArea();
        Home3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(153, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(262, 236));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Enter your cipher text:");

        CipherText3.setColumns(20);
        CipherText3.setRows(5);
        jScrollPane1.setViewportView(CipherText3);

        Decryption.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Decryption.setText("Decryption");
        Decryption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DecryptionActionPerformed(evt);
            }
        });

        ProName2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        ProName2.setForeground(new java.awt.Color(255, 255, 255));
        ProName2.setText("Whisper");

        ProName3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ProName3.setForeground(new java.awt.Color(255, 255, 255));
        ProName3.setText("(decryption)");

        PlainText3.setColumns(20);
        PlainText3.setRows(5);
        jScrollPane2.setViewportView(PlainText3);

        Home3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Home3.setText("Home Page");
        Home3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Home3ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 153, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("whisper");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("(decryption)");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(37, 37, 37)
                .addComponent(jLabel3))
        );

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lu.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(ProName2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ProName3)
                .addGap(117, 117, 117))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(Decryption))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(187, 187, 187)
                                .addComponent(Home3))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2)))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(Decryption)
                .addGap(39, 39, 39)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(Home3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ProName3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ProName2))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 674, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DecryptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DecryptionActionPerformed
        // TODO add your handling code here:
         //added by shahad
        String userInput2="";
       boolean flag2 =true;
       while(flag2){
           try{
          userInput2 = CipherText3.getText(); 
         decryption dec = new decryption(userInput2);
         if(! dec.validate(userInput2))
             throw new Exception(); 
         System.out.println("Here");
         flag2=false;
           }catch(Exception e){
           CipherText3.setText("");
           //case 1:
           if(userInput2.length()<1){
           JOptionPane.showMessageDialog(this, "Please enter a ciphertext","Error", WIDTH);
           }
           
           //case 2:
           else
           for(int i=0 ; i<userInput2.length() ;i++)
           if (!Character.isDigit(userInput2.charAt(i)) ){
           JOptionPane.showMessageDialog(this, "You are allowed to enter digits only","Error", WIDTH);  
           return;}
           
           //case 3:
           else if(userInput2.length() % 12 !=0){
           JOptionPane.showMessageDialog(this, "The length of your ciphertext has to be multiplier of 12","Error", WIDTH);
           return;}

         
           /*for(int i=0 ; i<userInput2.length() ;i++)
           if (!Character.isDigit(userInput2.charAt(i)) ){
           JOptionPane.showMessageDialog(this, "You are allowed to enter digits only","Error", WIDTH);  
           return;} */
      
           else
           JOptionPane.showMessageDialog(this, "You are allowed to enter digits only","Error", WIDTH);  
           return;}
           
           
           }
    
       
       decryption dec = new decryption(userInput2);
        String decc ="";
        
        
        String convert2 = dec.convertAscii(userInput2);

        String ascii2 = dec.ASCII(convert2);
     
        decc= decrypt( dec ,ascii2 );
        decc= decrypt( dec ,decc );
         if (decc.length() < 1)
             JOptionPane.showMessageDialog(this, "our system didn't recognize this ciphertext","Error", WIDTH);  
             
          PlainText3.setText(decc);
        //System.out.println(decc);
    }//GEN-LAST:event_DecryptionActionPerformed

    private void Home3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Home3ActionPerformed
         this.dispose();
        new whisper().setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_Home3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(decFramee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(decFramee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(decFramee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(decFramee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new decFramee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea CipherText3;
    private javax.swing.JButton Decryption;
    private javax.swing.JButton Home3;
    private javax.swing.JTextArea PlainText3;
    private javax.swing.JLabel ProName2;
    private javax.swing.JLabel ProName3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

public static String decrypt(decryption dec ,String input ){
    

      
        String RF = dec.RialFence(input);
  
        String swap = dec.swap(RF);
    
        String convert = dec.convert(swap); 
     
    
     return convert;
    
}
}