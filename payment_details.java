
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class payment_details extends javax.swing.JFrame {
    Connection cn=null;
    Statement st=null;
    Database db=new Database();
    String result=db.Connectdb();
    PreparedStatement pst=null;
    ResultSet rs=null;
 
    /**
     * Creates new form payment_details
     */
    public payment_details() {
        initComponents();
        setTime();
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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtinvoiceno = new javax.swing.JTextField();
        txtcname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtnetamt = new javax.swing.JTextField();
        combomodeofpay = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        txtremainamt = new javax.swing.JTextField();
        txtpaidamt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        remainbtn = new javax.swing.JButton();
        savebtn = new javax.swing.JButton();
        backbtn = new javax.swing.JButton();
        exitbtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        combostatus = new javax.swing.JComboBox();
        searchbtn = new javax.swing.JButton();
        txtdate = new javax.swing.JTextField();
        txttime = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1900, 1000));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setText("PAYMENT DETAILS");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), null, null));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText(" Invoice No.: ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText(" Customer Name : ");

        txtinvoiceno.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtinvoiceno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtinvoicenoKeyReleased(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtinvoicenoKeyPressed(evt);
            }
        });

        txtcname.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtcname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcnameActionPerformed(evt);
            }
        });
        txtcname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcnameKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText(" Net Amount : ");

        txtnetamt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtnetamt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnetamtKeyPressed(evt);
            }
        });

        combomodeofpay.setBackground(new java.awt.Color(204, 204, 204));
        combomodeofpay.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        combomodeofpay.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Credit Card", "Digital Wallet", "Cash" }));
        combomodeofpay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combomodeofpayActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText(" Mode Of Payment : ");

        txtremainamt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtremainamt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtremainamtKeyPressed(evt);
            }
        });

        txtpaidamt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtpaidamt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpaidamtActionPerformed(evt);
            }
        });
        txtpaidamt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtpaidamtKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText(" Paid Amount :  ");

        remainbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        remainbtn.setText(" Remaining Amount : ");
        remainbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remainbtnActionPerformed(evt);
            }
        });

        savebtn.setBackground(new java.awt.Color(204, 204, 204));
        savebtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        savebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-save-16.png"))); // NOI18N
        savebtn.setText("Save");
        savebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebtnActionPerformed(evt);
            }
        });

        backbtn.setBackground(new java.awt.Color(204, 204, 204));
        backbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        backbtn.setText("<<Back");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });

        exitbtn.setBackground(new java.awt.Color(204, 204, 204));
        exitbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        exitbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-close-window-16.png"))); // NOI18N
        exitbtn.setText("Exit");
        exitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbtnActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Payment Status :");

        combostatus.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        combostatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Paid", "UnPaid" }));

        searchbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        searchbtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\manufacturing_fruit_product_management_system\\src\\icons8-search-16.png")); // NOI18N
        searchbtn.setText("Search");
        searchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(337, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(savebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(backbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(exitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel5))
                                    .addGap(47, 47, 47))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(remainbtn)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtpaidamt, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                                .addComponent(txtcname, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                                .addComponent(txtnetamt, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                                .addComponent(combomodeofpay, 0, 145, Short.MAX_VALUE)
                                .addComponent(txtremainamt, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                                .addComponent(combostatus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtinvoiceno, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(searchbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(161, 161, 161))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {combomodeofpay, txtcname, txtnetamt, txtpaidamt, txtremainamt});

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {backbtn, searchbtn});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtinvoiceno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(searchbtn))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(combomodeofpay, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnetamt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpaidamt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtremainamt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(remainbtn))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combostatus, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(savebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {combomodeofpay, txtcname, txtinvoiceno, txtnetamt, txtpaidamt, txtremainamt});

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel7, remainbtn});

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {backbtn, searchbtn});

        txtdate.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdateActionPerformed(evt);
            }
        });

        txttime.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txttime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttimeActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText(" Date :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText(" Time : ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(428, 428, 428)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txttime))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(963, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txttime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1)))
                .addGap(19, 19, 19)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(414, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1910, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1011, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtpaidamtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpaidamtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpaidamtActionPerformed

    private void exitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbtnActionPerformed
        // TODO add your handling code here:
        home_page obj=new home_page();
        obj.setVisible(true);
        this.hide();
    }//GEN-LAST:event_exitbtnActionPerformed

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        // TODO add your handling code here:
        product_details obj=new product_details();
        obj.setVisible(true);
        this.hide();
    }//GEN-LAST:event_backbtnActionPerformed

    private void savebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebtnActionPerformed
        // TODO add your handling code here:
        try{
        String insert=db.Insert("insert into  paymentdetails(invoiceno,customername,modeofpayment,netamount, paidamount, remainingamount,paymentstatus,date,time)values('"+txtinvoiceno.getText()+"','"+txtcname.getText().toString()+"','"+combomodeofpay.getSelectedItem().toString()+"','"+txtnetamt.getText().toString()+"','"+txtpaidamt.getText().toString()+"','"+txtremainamt.getText().toString()+"','"+combostatus.getSelectedItem().toString()+"','"+txtdate.getText().toString()+"','"+txttime.getText().toString()+"')");
          JOptionPane.showMessageDialog(null, insert);     
        }catch(Exception ex)
        {
        JOptionPane.showMessageDialog(null, ex.toString()); 
        }
    }//GEN-LAST:event_savebtnActionPerformed

    private void txtpaidamtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpaidamtKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9' || evt.getKeyCode() == evt.VK_BACK_SPACE || evt.getKeyCode()==46 )
 {

txtpaidamt.setEditable(true);

}
 else
 {
txtpaidamt.setEditable(false);

}

    }//GEN-LAST:event_txtpaidamtKeyPressed

    private void txtremainamtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtremainamtKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9' || evt.getKeyCode() == evt.VK_BACK_SPACE || evt.getKeyCode()==46 )
 {

txtremainamt.setEditable(true);

}
 else
 {
txtremainamt.setEditable(false);

}

    }//GEN-LAST:event_txtremainamtKeyPressed

    private void txtcnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcnameActionPerformed

    private void combomodeofpayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combomodeofpayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combomodeofpayActionPerformed

    private void remainbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remainbtnActionPerformed
        // TODO add your handling code here:
        double remainingamount;
        double netamount= Double.parseDouble(txtnetamt.getText().toString());
        double paidamount= Double.parseDouble(txtpaidamt.getText().toString());
        remainingamount=netamount-paidamount;
        txtremainamt.setText(String.valueOf(remainingamount));

   
         
    }//GEN-LAST:event_remainbtnActionPerformed

    private void txtnetamtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnetamtKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9' || evt.getKeyCode() == evt.VK_BACK_SPACE || evt.getKeyCode()==46 )
 {

txtnetamt.setEditable(true);

}
 else
 {
txtnetamt.setEditable(false);

}
    }//GEN-LAST:event_txtnetamtKeyPressed

    private void txtinvoicenoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtinvoicenoKeyPressed
        // TODO add your handling code here:
         if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9' || evt.getKeyCode() == evt.VK_BACK_SPACE)
 {

txtinvoiceno.setEditable(true);

}
 else
 {
txtinvoiceno.setEditable(false);

}
    }//GEN-LAST:event_txtinvoicenoKeyPressed

    private void txtcnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcnameKeyPressed
        // TODO add your handling code here:
         if (Character.isAlphabetic(evt.getKeyChar())  || evt.getKeyCode()==46 || evt.getKeyCode()==32 || evt.getKeyCode() == evt.VK_BACK_SPACE)
 {
        txtcname.setEditable(true);
        
    }
 else 
{
        txtcname.setEditable(false);
       
    }
    }//GEN-LAST:event_txtcnameKeyPressed

    private void txtinvoicenoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtinvoicenoKeyReleased
        // TODO add your handling code here:
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
       cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/manufacturing_fruit_product_management","root","root");
    
        String sql="select * from saleinformation where invocenum='"+txtinvoiceno.getText()+"' " ;
        pst=cn.prepareStatement(sql);
        rs=pst.executeQuery();
        while(rs.next())
        {
         txtinvoiceno.setText(rs.getString("invocenum"));
           txtcname.setText(rs.getString("customername"));
           txtnetamt.setText(rs.getString("netamount"));

          }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
        
    }//GEN-LAST:event_txtinvoicenoKeyReleased

    private void txtdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdateActionPerformed

    private void txttimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttimeActionPerformed

    private void searchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbtnActionPerformed
        // TODO add your handling code here:
         try
        {
             Class.forName("com.mysql.jdbc.Driver");
       cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/manufacturing_fruit_product_management","root","root");
    
        String sql="select * from paymentdetails where invoiceno='"+txtinvoiceno.getText()+"' || customername='"+txtcname.getText().toString()+"' " ;
        pst=cn.prepareStatement(sql);
        rs=pst.executeQuery();
        
        while(rs.next())
        {
            txtinvoiceno.setText(rs.getString("invoiceno"));
            txtcname.setText(rs.getString("customername"));
           combomodeofpay.setSelectedItem(rs.getString("modeofpayment"));
            txtnetamt.setText(rs.getString("netamount"));
            txtpaidamt.setText(rs.getString("paidamount"));
            txtremainamt.setText(rs.getString("remainingamount"));
            combostatus.setSelectedItem(rs.getString("paymentstatus"));
            txtdate.setText(rs.getString("date"));
            txttime.setText(rs.getString("time"));
        }
        
        }
        catch(Exception ex)
        {
           JOptionPane.showMessageDialog(null,ex.toString()); 
       
    }
    }//GEN-LAST:event_searchbtnActionPerformed
     public void setTime()
    {
        new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(purchase_details.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                Date date=new Date();
                SimpleDateFormat tf=new SimpleDateFormat("h:mm:ss aa");
                SimpleDateFormat df=new SimpleDateFormat("yyy MM dd");
                String time=tf.format(date);
                txttime.setText(time.split(" ")[0]+(" ")+time.split(" ")[1]);
                txtdate.setText(df.format(date));
            }
        }).start();
    }
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
            java.util.logging.Logger.getLogger(payment_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(payment_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(payment_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(payment_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new payment_details().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbtn;
    private javax.swing.JComboBox combomodeofpay;
    private javax.swing.JComboBox combostatus;
    private javax.swing.JButton exitbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton remainbtn;
    private javax.swing.JButton savebtn;
    private javax.swing.JButton searchbtn;
    private javax.swing.JTextField txtcname;
    private javax.swing.JTextField txtdate;
    private javax.swing.JTextField txtinvoiceno;
    private javax.swing.JTextField txtnetamt;
    private javax.swing.JTextField txtpaidamt;
    private javax.swing.JTextField txtremainamt;
    private javax.swing.JTextField txttime;
    // End of variables declaration//GEN-END:variables
}
