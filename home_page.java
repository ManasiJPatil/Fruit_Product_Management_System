
import java.awt.Image;
import javax.swing.ImageIcon;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class home_page extends javax.swing.JFrame {

    /**
     * Creates new form home_page
     */
    public home_page() {
        initComponents();
          //setImage();
    }
   // public void setImage()
    //{
      //  ImageIcon icon = new ImageIcon(getClass().getResource("image/second.jpg"));
        //Image img =icon.getImage().getScaledInstance(jLabel9.getWidth(),jLabel9.getHeight(), Image.SCALE_SMOOTH);
        //jLabel9.setIcon(new ImageIcon(img));
    //}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btncustomerregistration = new javax.swing.JButton();
        btnemployeedetails = new javax.swing.JButton();
        btnproductdetails = new javax.swing.JButton();
        btnsaledetails = new javax.swing.JButton();
        btnpuchasedetails = new javax.swing.JButton();
        btnsupplierdetails = new javax.swing.JButton();
        btnlogout = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        reportbtn = new javax.swing.JButton();
        idreport = new javax.swing.JButton();
        datereport = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        rawbtn = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(1900, 1000));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(102, 255, 102));
        jLabel1.setFont(new java.awt.Font("Engravers MT", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText(" Shivparv Foods Pvt.Ltd  ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 321, -1, 50));

        btncustomerregistration.setBackground(new java.awt.Color(255, 204, 204));
        btncustomerregistration.setFont(new java.awt.Font("Papyrus", 1, 18)); // NOI18N
        btncustomerregistration.setForeground(new java.awt.Color(64, 64, 64));
        btncustomerregistration.setText(" Customer Registration ");
        btncustomerregistration.setPreferredSize(new java.awt.Dimension(250, 50));
        btncustomerregistration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncustomerregistrationActionPerformed(evt);
            }
        });
        jPanel1.add(btncustomerregistration, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 267, 58));

        btnemployeedetails.setBackground(new java.awt.Color(255, 204, 204));
        btnemployeedetails.setFont(new java.awt.Font("Papyrus", 1, 18)); // NOI18N
        btnemployeedetails.setForeground(new java.awt.Color(64, 64, 64));
        btnemployeedetails.setText(" Employee Details ");
        btnemployeedetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnemployeedetailsActionPerformed(evt);
            }
        });
        jPanel1.add(btnemployeedetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 320, 267, 58));

        btnproductdetails.setBackground(new java.awt.Color(255, 204, 204));
        btnproductdetails.setFont(new java.awt.Font("Papyrus", 1, 18)); // NOI18N
        btnproductdetails.setForeground(new java.awt.Color(64, 64, 64));
        btnproductdetails.setText(" Product Details ");
        btnproductdetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnproductdetailsActionPerformed(evt);
            }
        });
        jPanel1.add(btnproductdetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 100, 267, 58));

        btnsaledetails.setBackground(new java.awt.Color(255, 204, 204));
        btnsaledetails.setFont(new java.awt.Font("Papyrus", 1, 18)); // NOI18N
        btnsaledetails.setForeground(new java.awt.Color(64, 64, 64));
        btnsaledetails.setText(" Sale Details ");
        btnsaledetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaledetailsActionPerformed(evt);
            }
        });
        jPanel1.add(btnsaledetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 267, 58));

        btnpuchasedetails.setBackground(new java.awt.Color(255, 204, 204));
        btnpuchasedetails.setFont(new java.awt.Font("Papyrus", 1, 18)); // NOI18N
        btnpuchasedetails.setForeground(new java.awt.Color(64, 64, 64));
        btnpuchasedetails.setText(" Purchase Details ");
        btnpuchasedetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpuchasedetailsActionPerformed(evt);
            }
        });
        jPanel1.add(btnpuchasedetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 480, 267, 58));

        btnsupplierdetails.setBackground(new java.awt.Color(255, 204, 204));
        btnsupplierdetails.setFont(new java.awt.Font("Papyrus", 1, 18)); // NOI18N
        btnsupplierdetails.setForeground(new java.awt.Color(64, 64, 64));
        btnsupplierdetails.setText(" Supplier Details ");
        btnsupplierdetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsupplierdetailsActionPerformed(evt);
            }
        });
        jPanel1.add(btnsupplierdetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 500, 267, 58));

        btnlogout.setBackground(new java.awt.Color(255, 204, 204));
        btnlogout.setFont(new java.awt.Font("Papyrus", 1, 18)); // NOI18N
        btnlogout.setForeground(new java.awt.Color(64, 64, 64));
        btnlogout.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\manufacturing_fruit_product_management_system\\src\\icons8-close-window-16.png")); // NOI18N
        btnlogout.setText("Cancel");
        btnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoutActionPerformed(evt);
            }
        });
        jPanel1.add(btnlogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 650, 140, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Downloads\\icons8-people-80.png")); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 260, -1, 58));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\manufacturing_fruit_product_management_system\\src\\image\\icons8-trust.gif")); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 31, -1, 60));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\manufacturing_fruit_product_management_system\\src\\image\\icons8-shopping-cart.gif")); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 50, 70));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-recycling-32.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 480, -1, 58));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\manufacturing_fruit_product_management_system\\src\\image\\icons8-handshake.gif")); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 430, 50, 70));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-product-description-32.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 100, -1, 58));

        reportbtn.setBackground(new java.awt.Color(255, 204, 204));
        reportbtn.setFont(new java.awt.Font("Papyrus", 1, 18)); // NOI18N
        reportbtn.setText("Report");
        reportbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportbtnActionPerformed(evt);
            }
        });
        jPanel1.add(reportbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 30));

        idreport.setBackground(new java.awt.Color(255, 204, 204));
        idreport.setFont(new java.awt.Font("Papyrus", 1, 18)); // NOI18N
        idreport.setText("IDWise Report");
        idreport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idreportActionPerformed(evt);
            }
        });
        jPanel1.add(idreport, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, -1, 30));

        datereport.setBackground(new java.awt.Color(255, 204, 204));
        datereport.setFont(new java.awt.Font("Papyrus", 1, 18)); // NOI18N
        datereport.setText("Datewise Report");
        datereport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datereportActionPerformed(evt);
            }
        });
        jPanel1.add(datereport, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, -1, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Downloads\\lofo.jpg")); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 230, 110, 90));
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 360, 110, 80));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("Gat. No. 517, \n\n\n   ");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 380, -1, 10));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText(" Near Babasaheb Patil Sanskrutik Hall,  ");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 400, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setText("A/p. Ghogaon, Tal. Palus, Maharashtra 416308\n\n\n\n");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 420, 270, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setText("E-mail:fruitleys@gmail.com\n\n\n");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 440, 170, -1));

        rawbtn.setBackground(new java.awt.Color(255, 204, 255));
        rawbtn.setFont(new java.awt.Font("Papyrus", 1, 18)); // NOI18N
        rawbtn.setText("Raw Material Details");
        rawbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rawbtnActionPerformed(evt);
            }
        });
        jPanel1.add(rawbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 580, 267, 58));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncustomerregistrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncustomerregistrationActionPerformed
      // TODO add your handling code here:
        Customer_Registraion obj=new Customer_Registraion();
        obj.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btncustomerregistrationActionPerformed

    private void btnemployeedetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnemployeedetailsActionPerformed
        // TODO add your handling code here:
        employee_details obj=new employee_details();
        obj.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btnemployeedetailsActionPerformed

    private void btnsaledetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaledetailsActionPerformed
        // TODO add your handling code here:
        product_details obj=new product_details();
        obj.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btnsaledetailsActionPerformed

    private void btnproductdetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnproductdetailsActionPerformed
        // TODO add your handling code here:
        product_information obj=new product_information();
        obj.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btnproductdetailsActionPerformed

    private void btnsupplierdetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsupplierdetailsActionPerformed
        // TODO add your handling code here:
        supplier_information obj=new supplier_information();
        obj.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btnsupplierdetailsActionPerformed

    private void btnpuchasedetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpuchasedetailsActionPerformed
        // TODO add your handling code here:
        purchase_details obj=new purchase_details();
                obj.setVisible(true);
                this.hide();
    }//GEN-LAST:event_btnpuchasedetailsActionPerformed

    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed
        // TODO add your handling code here:
        login_page obj=new login_page();
        obj.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btnlogoutActionPerformed

    private void reportbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportbtnActionPerformed
        // TODO add your handling code here:
        report obj=new report();
        obj.setVisible(true);
        this.hide();
   
    }//GEN-LAST:event_reportbtnActionPerformed

    private void idreportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idreportActionPerformed
        // TODO add your handling code here:
        idwisereport obj=new idwisereport();
        obj.setVisible(true);
        this.hide();
   
    }//GEN-LAST:event_idreportActionPerformed

    private void datereportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datereportActionPerformed
        // TODO add your handling code here:
         datewisereport obj=new datewisereport();
        obj.setVisible(true);
        this.hide();

    }//GEN-LAST:event_datereportActionPerformed

    private void rawbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rawbtnActionPerformed
        // TODO add your handling code here:
        rawmaterialdetails obj=new rawmaterialdetails();
        obj.setVisible(true);
        this.hide();
 
    }//GEN-LAST:event_rawbtnActionPerformed

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
            java.util.logging.Logger.getLogger(home_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home_page().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncustomerregistration;
    private javax.swing.JButton btnemployeedetails;
    private javax.swing.JButton btnlogout;
    private javax.swing.JButton btnproductdetails;
    private javax.swing.JButton btnpuchasedetails;
    private javax.swing.JButton btnsaledetails;
    private javax.swing.JButton btnsupplierdetails;
    private javax.swing.JButton datereport;
    private javax.swing.JButton idreport;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton rawbtn;
    private javax.swing.JButton reportbtn;
    // End of variables declaration//GEN-END:variables
}