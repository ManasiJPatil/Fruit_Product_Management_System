
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
public class employee_payment extends javax.swing.JFrame {

       Connection cn=null;
    Statement st=null;
    Database db=new Database();
    String result=db.Connectdb();
    PreparedStatement pst=null;
    ResultSet rs=null;
            
    /**
     * Creates new form employee_payment
     */
    public employee_payment() {
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtdate = new javax.swing.JTextField();
        txttime = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnsave = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btntotalsalary = new javax.swing.JButton();
        bntback = new javax.swing.JButton();
        txtid = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        txtworkingdays = new javax.swing.JTextField();
        txtabsentdays = new javax.swing.JTextField();
        txtperdaysalary = new javax.swing.JTextField();
        txtsalary = new javax.swing.JTextField();
        txttotalsalary = new javax.swing.JTextField();
        searchbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(1900, 1000));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setText(" Emloyee_Payment ");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText(" Date : ");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText(" Time : ");

        txtdate.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txttime.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txttime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttimeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(563, 563, 563)
                .addComponent(jLabel1)
                .addGap(145, 145, 145)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtdate, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                    .addComponent(txttime))
                .addContainerGap(315, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(txttime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel9))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText(" Employee ID : ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Employee Name : ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText(" Working Days : ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText(" Absent Days :  ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Per Day Salary : ");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText(" Salary : ");

        btnsave.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnsave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-save-16.png"))); // NOI18N
        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });

        btnupdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnupdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-available-updates-16.png"))); // NOI18N
        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        btntotalsalary.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btntotalsalary.setText(" Total Salary : ");
        btntotalsalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntotalsalaryActionPerformed(evt);
            }
        });

        bntback.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bntback.setText("<<Back");
        bntback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntbackActionPerformed(evt);
            }
        });

        txtid.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });
        txtid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtidKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtidKeyReleased(evt);
            }
        });

        txtname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnameKeyPressed(evt);
            }
        });

        txtworkingdays.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtworkingdays.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtworkingdaysKeyPressed(evt);
            }
        });

        txtabsentdays.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtabsentdays.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtabsentdaysKeyPressed(evt);
            }
        });

        txtperdaysalary.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtperdaysalary.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtperdaysalaryKeyPressed(evt);
            }
        });

        txtsalary.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtsalary.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtsalaryKeyPressed(evt);
            }
        });

        txttotalsalary.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txttotalsalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttotalsalaryActionPerformed(evt);
            }
        });
        txttotalsalary.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txttotalsalaryKeyPressed(evt);
            }
        });

        searchbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        searchbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-search-16.png"))); // NOI18N
        searchbtn.setText("Search");
        searchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(462, 462, 462)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING))
                                .addComponent(jLabel7))
                            .addComponent(btntotalsalary))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtname)
                            .addComponent(txtworkingdays)
                            .addComponent(txtabsentdays)
                            .addComponent(txtperdaysalary)
                            .addComponent(txtsalary)
                            .addComponent(txttotalsalary, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                            .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(99, 99, 99)
                        .addComponent(searchbtn))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(437, 437, 437)
                        .addComponent(btnsave)
                        .addGap(82, 82, 82)
                        .addComponent(btnupdate)
                        .addGap(62, 62, 62)
                        .addComponent(bntback)))
                .addContainerGap(622, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchbtn))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtworkingdays, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtabsentdays, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtperdaysalary, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtsalary, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btntotalsalary, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txttotalsalary))
                .addGap(51, 51, 51)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsave)
                    .addComponent(btnupdate)
                    .addComponent(bntback))
                .addContainerGap(209, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 275, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 204, Short.MAX_VALUE))
        );

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

    private void txttotalsalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttotalsalaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttotalsalaryActionPerformed

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

    private void searchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbtnActionPerformed
        // TODO add your handling code here:
         try{
    
        Class.forName("com.mysql.jdbc.Driver");
        cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/manufacturing_fruit_product_management","root","root");
    
        String sql="select * from employee_payment where id='"+txtid.getText()+"'|| name='"+txtname.getText().toString()+"' " ;
        pst=cn.prepareStatement(sql);
        rs=pst.executeQuery();
         
        while(rs.next())
         {
           txtid.setText(rs.getString("id"));
           txtname.setText(rs.getString("name"));
           txtworkingdays.setText(rs.getString("workingdays"));
           txtabsentdays.setText(rs.getString("absentdays"));
           txtperdaysalary.setText(rs.getString("perdaysalary"));
           txtsalary.setText(rs.getString("salary"));
           txttotalsalary.setText(rs.getString("totalsalary"));
           txtdate.setText(rs.getString("date"));
         txttime.setText(rs.getString("time"));
        
         }
             }   
         catch(Exception ex)
                {
                  JOptionPane.showMessageDialog(null, ex.toString());
                }
    }//GEN-LAST:event_searchbtnActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        // TODO add your handling code here:
          try
        {
         String insert = db.Insert("insert into employee_payment(id, name, workingdays, absentdays, perdaysalary, salary,totalsalary,date,time)values('"+txtid.getText()+"','"+txtname.getText().toString()+"','"+txtworkingdays.getText()+"','"+txtabsentdays.getText()+"','"+txtperdaysalary.getText().toString()+"','"+txtsalary.getText().toString()+"','"+txttotalsalary.getText().toString()+"','"+txtdate.getText().toString()+"','"+txttime.getText().toString()+"')");
          JOptionPane.showMessageDialog(null, insert);
        }catch(Exception ex)
        {
         JOptionPane.showMessageDialog(null, ex.toString());
        }
    }//GEN-LAST:event_btnsaveActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        // TODO add your handling code here:
         try
        {
         String update = db.update("update employee_payment set id='"+txtid.getText()+"',name='"+txtname.getText().toString()+"',workingdays='"+txtworkingdays.getText().toString()+"',absentdays='"+txtabsentdays.getText().toString()+"',perdaysalary='"+txtperdaysalary.getText()+"',salary='"+txtsalary.getText().toString()+"',date='"+txtdate.getText().toString()+"',time='"+txttime.getText().toString()+"' where id='"+txtid.getText()+"' ");
          JOptionPane.showMessageDialog(null, update);
        }catch(Exception ex)
        {
         JOptionPane.showMessageDialog(null, ex.toString());
        }
    }//GEN-LAST:event_btnupdateActionPerformed

    private void bntbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntbackActionPerformed
        // TODO add your handling code here:
         home_page obj=new home_page();
        obj.setVisible(true);
        this.hide();
    }//GEN-LAST:event_bntbackActionPerformed

    private void btntotalsalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntotalsalaryActionPerformed
    // TODO add your handling code here:
       
        int total_salary;
        int perdaysalary=Integer.parseInt(txtperdaysalary.getText().toString());
        int salary=Integer.parseInt(txtsalary.getText().toString());
        int absentdays=Integer.parseInt(txtabsentdays.getText().toString());
        total_salary=salary=salary-absentdays*perdaysalary;
        txttotalsalary.setText(String.valueOf(total_salary));    
    }//GEN-LAST:event_btntotalsalaryActionPerformed

    private void txtidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtidKeyReleased
        // TODO add your handling code here:
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
       cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/manufacturing_fruit_product_management","root","root");
    
        String sql="select * from employeedetails where id='"+txtid.getText()+"' " ;
        pst=cn.prepareStatement(sql);
        rs=pst.executeQuery();
        while(rs.next())
        {
         txtid.setText(rs.getString("id"));
           txtname.setText(rs.getString("name"));
           txtsalary.setText(rs.getString("salary"));

          }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
        
    }//GEN-LAST:event_txtidKeyReleased

    private void txtidKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtidKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9' || evt.getKeyCode() == evt.VK_BACK_SPACE)
 {

txtid.setEditable(true);

}
 else
 {
txtid.setEditable(false);

}
    }//GEN-LAST:event_txtidKeyPressed

    private void txtnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnameKeyPressed
        // TODO add your handling code here:
          if (Character.isAlphabetic(evt.getKeyChar())  || evt.getKeyCode()==46 || evt.getKeyCode()==32 || evt.getKeyCode() == evt.VK_BACK_SPACE)
 {
        txtname.setEditable(true);
        
    }
 else 
{
        txtname.setEditable(false);
       
    }
    }//GEN-LAST:event_txtnameKeyPressed

    private void txtworkingdaysKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtworkingdaysKeyPressed
        // TODO add your handling code here:
         if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9' || evt.getKeyCode() == evt.VK_BACK_SPACE)
 {

txtworkingdays.setEditable(true);

}
 else
 {
txtworkingdays.setEditable(false);

}
    }//GEN-LAST:event_txtworkingdaysKeyPressed

    private void txtabsentdaysKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtabsentdaysKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9' || evt.getKeyCode() == evt.VK_BACK_SPACE)
 {

txtabsentdays.setEditable(true);

}
 else
 {
txtabsentdays.setEditable(false);

}
    }//GEN-LAST:event_txtabsentdaysKeyPressed

    private void txtperdaysalaryKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtperdaysalaryKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9' || evt.getKeyCode() == evt.VK_BACK_SPACE || evt.getKeyCode()==46 )
 {

txtperdaysalary.setEditable(true);

}
 else
 {
txtperdaysalary.setEditable(false);

}

    }//GEN-LAST:event_txtperdaysalaryKeyPressed

    private void txtsalaryKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsalaryKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9' || evt.getKeyCode() == evt.VK_BACK_SPACE || evt.getKeyCode()==46 )
 {

txtsalary.setEditable(true);

}
 else
 {
txtsalary.setEditable(false);

}

    }//GEN-LAST:event_txtsalaryKeyPressed

    private void txttotalsalaryKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttotalsalaryKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9' || evt.getKeyCode() == evt.VK_BACK_SPACE || evt.getKeyCode()==46 )
 {

txttotalsalary.setEditable(true);

}
 else
 {
txttotalsalary.setEditable(false);

}

    }//GEN-LAST:event_txttotalsalaryKeyPressed

    private void txttimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttimeActionPerformed
          public void setTime()
    {
        new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(product_details.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(employee_payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(employee_payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(employee_payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(employee_payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new employee_payment().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntback;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btntotalsalary;
    private javax.swing.JButton btnupdate;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton searchbtn;
    private javax.swing.JTextField txtabsentdays;
    private javax.swing.JTextField txtdate;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtperdaysalary;
    private javax.swing.JTextField txtsalary;
    private javax.swing.JTextField txttime;
    private javax.swing.JTextField txttotalsalary;
    private javax.swing.JTextField txtworkingdays;
    // End of variables declaration//GEN-END:variables
}