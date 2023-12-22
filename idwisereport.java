
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class idwisereport extends javax.swing.JFrame {

    /**
     * Creates new form idwisereport
     */
    public idwisereport() {
        initComponents();
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
        Id = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        customerdetailsbtn = new javax.swing.JButton();
        empdetailsbtn = new javax.swing.JButton();
        supplierdebtn = new javax.swing.JButton();
        prodebtn = new javax.swing.JButton();
        rawmdebtn = new javax.swing.JButton();
        saledebtn = new javax.swing.JButton();
        purchasedebtn = new javax.swing.JButton();
        emppaybtn = new javax.swing.JButton();
        paybtn = new javax.swing.JButton();
        backbtn = new javax.swing.JButton();
        suppaybtn = new javax.swing.JButton();
        salebillbtn = new javax.swing.JButton();
        purchasebillbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(1900, 1000));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setText("ID Wise Report");

        Id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText(" ID :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(507, 507, 507)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(132, 132, 132)
                .addComponent(jLabel2)
                .addGap(31, 31, 31)
                .addComponent(Id, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))))
        );

        customerdetailsbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        customerdetailsbtn.setText("Customer Details");
        customerdetailsbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerdetailsbtnActionPerformed(evt);
            }
        });

        empdetailsbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        empdetailsbtn.setText("Employee Details");
        empdetailsbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empdetailsbtnActionPerformed(evt);
            }
        });

        supplierdebtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        supplierdebtn.setText("Supplier Details");
        supplierdebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplierdebtnActionPerformed(evt);
            }
        });

        prodebtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        prodebtn.setText("Product Details");
        prodebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prodebtnActionPerformed(evt);
            }
        });

        rawmdebtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rawmdebtn.setText("Raw Material Details");
        rawmdebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rawmdebtnActionPerformed(evt);
            }
        });

        saledebtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        saledebtn.setText("Sale Details");
        saledebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saledebtnActionPerformed(evt);
            }
        });

        purchasedebtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        purchasedebtn.setText("Purchase Details");
        purchasedebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchasedebtnActionPerformed(evt);
            }
        });

        emppaybtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        emppaybtn.setText("Employee Payment");
        emppaybtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emppaybtnActionPerformed(evt);
            }
        });

        paybtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        paybtn.setText("Payment status");
        paybtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paybtnActionPerformed(evt);
            }
        });

        backbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        backbtn.setText("<<Back");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });

        suppaybtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        suppaybtn.setText("Supplier Payment ");
        suppaybtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suppaybtnActionPerformed(evt);
            }
        });

        salebillbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        salebillbtn.setText("Sale Bill");
        salebillbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salebillbtnActionPerformed(evt);
            }
        });

        purchasebillbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        purchasebillbtn.setText("Purchase Bill");
        purchasebillbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchasebillbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(rawmdebtn)
                        .addGap(97, 97, 97)
                        .addComponent(saledebtn)
                        .addGap(116, 116, 116)
                        .addComponent(purchasedebtn)
                        .addGap(71, 71, 71)
                        .addComponent(salebillbtn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(327, 327, 327)
                        .addComponent(emppaybtn)
                        .addGap(94, 94, 94)
                        .addComponent(paybtn)
                        .addGap(96, 96, 96)
                        .addComponent(purchasebillbtn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(customerdetailsbtn)
                        .addGap(82, 82, 82)
                        .addComponent(empdetailsbtn)
                        .addGap(99, 99, 99)
                        .addComponent(supplierdebtn)
                        .addGap(121, 121, 121)
                        .addComponent(prodebtn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(849, 849, 849)
                        .addComponent(backbtn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(461, 461, 461)
                        .addComponent(suppaybtn)))
                .addContainerGap(873, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customerdetailsbtn)
                    .addComponent(empdetailsbtn)
                    .addComponent(supplierdebtn)
                    .addComponent(prodebtn))
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saledebtn)
                    .addComponent(purchasedebtn)
                    .addComponent(rawmdebtn)
                    .addComponent(salebillbtn))
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(paybtn)
                    .addComponent(emppaybtn)
                    .addComponent(purchasebillbtn))
                .addGap(37, 37, 37)
                .addComponent(suppaybtn)
                .addGap(74, 74, 74)
                .addComponent(backbtn)
                .addGap(0, 514, Short.MAX_VALUE))
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

    private void customerdetailsbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerdetailsbtnActionPerformed
        // TODO add your handling code here:
        Connection cn=null;
        try
           {
               
            
              String id = Id.getText(); 
               
           Class.forName("com.mysql.jdbc.Driver");
           System.out.println("Driver Registered");
        cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/manufacturing_fruit_product_management","root","root");           
            System.out.println("Connection Success");
           String path="C:\\Users\\Admin\\Documents\\NetBeansProjects\\manufacturing_fruit_product_management_system\\src\\Report1\\customer_registration.jrxml";
            Map parameters = new HashMap();
           
           parameters.put("id",id);
           
           
           JasperDesign design = JRXmlLoader.load(path);
    //JasperReport report = JasperCompileManager.compileReport(design);
           JasperReport jr=JasperCompileManager.compileReport(design);
           
           JasperPrint jp=JasperFillManager.fillReport(jr, parameters, cn);
           JasperViewer jv=new JasperViewer(jp);
           jv.setVisible(true);
          // jv.setVisible(true);
           }catch(Exception ex)
           {
           System.out.println(ex);
           }

    }//GEN-LAST:event_customerdetailsbtnActionPerformed

    private void empdetailsbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empdetailsbtnActionPerformed
        // TODO add your handling code here:
        Connection cn=null;
        try
           {
            
              String id = Id.getText(); 
               
           Class.forName("com.mysql.jdbc.Driver");
           System.out.println("Driver Registered");
        cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/manufacturing_fruit_product_management","root","root");           
            System.out.println("Connection Success");
           String path="C:\\Users\\Admin\\Documents\\NetBeansProjects\\manufacturing_fruit_product_management_system\\src\\Report1\\employeedetails.jrxml";
            Map parameters = new HashMap();
           
           parameters.put("id",id);
           
           
           JasperDesign design = JRXmlLoader.load(path);
    //JasperReport report = JasperCompileManager.compileReport(design);
           JasperReport jr=JasperCompileManager.compileReport(design);
           
           JasperPrint jp=JasperFillManager.fillReport(jr, parameters, cn);
           JasperViewer jv=new JasperViewer(jp);
           jv.setVisible(true);
          // jv.setVisible(true);
           }catch(Exception ex)
           {
           System.out.println(ex);
           }

    }//GEN-LAST:event_empdetailsbtnActionPerformed

    private void supplierdebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplierdebtnActionPerformed
        // TODO add your handling code here:
        Connection cn=null;
        
         try
           {
            
              String id = Id.getText(); 
               
           Class.forName("com.mysql.jdbc.Driver");
           System.out.println("Driver Registered");
        cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/manufacturing_fruit_product_management","root","root");           
            System.out.println("Connection Success");
           String path="C:\\Users\\Admin\\Documents\\NetBeansProjects\\manufacturing_fruit_product_management_system\\src\\Report1\\supplierinformation.jrxml";
            Map parameters = new HashMap();
           
           parameters.put("id",id);
           
           
           JasperDesign design = JRXmlLoader.load(path);
    //JasperReport report = JasperCompileManager.compileReport(design);
           JasperReport jr=JasperCompileManager.compileReport(design);
           
           JasperPrint jp=JasperFillManager.fillReport(jr, parameters, cn);
           JasperViewer jv=new JasperViewer(jp);
           jv.setVisible(true);
          // jv.setVisible(true);
           }catch(Exception ex)
           {
           System.out.println(ex);
           }

    }//GEN-LAST:event_supplierdebtnActionPerformed

    private void IdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdActionPerformed

    private void prodebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prodebtnActionPerformed
        // TODO add your handling code here:
        Connection cn=null;
        try
           {
            
              String id = Id.getText(); 
               
           Class.forName("com.mysql.jdbc.Driver");
           System.out.println("Driver Registered");
        cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/manufacturing_fruit_product_management","root","root");           
            System.out.println("Connection Success");
           String path="C:\\Users\\Admin\\Documents\\NetBeansProjects\\manufacturing_fruit_product_management_system\\src\\Report1\\productinformation.jrxml";
            Map parameters = new HashMap();
           
           parameters.put("id",id);
           
           
           JasperDesign design = JRXmlLoader.load(path);
    //JasperReport report = JasperCompileManager.compileReport(design);
           JasperReport jr=JasperCompileManager.compileReport(design);
           
           JasperPrint jp=JasperFillManager.fillReport(jr, parameters, cn);
           JasperViewer jv=new JasperViewer(jp);
           jv.setVisible(true);
          // jv.setVisible(true);
           }catch(Exception ex)
           {
           System.out.println(ex);
           }

        
    }//GEN-LAST:event_prodebtnActionPerformed

    private void rawmdebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rawmdebtnActionPerformed
        // TODO add your handling code here:
        Connection cn=null;
        try
           {
            
              String id = Id.getText(); 
               
           Class.forName("com.mysql.jdbc.Driver");
           System.out.println("Driver Registered");
        cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/manufacturing_fruit_product_management","root","root");           
            System.out.println("Connection Success");
           String path="C:\\Users\\Admin\\Documents\\NetBeansProjects\\manufacturing_fruit_product_management_system\\src\\Report1\\raw_material_details.jrxml";
            Map parameters = new HashMap();
           
           parameters.put("id",id);
           
           
           JasperDesign design = JRXmlLoader.load(path);
    //JasperReport report = JasperCompileManager.compileReport(design);
           JasperReport jr=JasperCompileManager.compileReport(design);
           
           JasperPrint jp=JasperFillManager.fillReport(jr, parameters, cn);
           JasperViewer jv=new JasperViewer(jp);
           jv.setVisible(true);
          // jv.setVisible(true);
           }catch(Exception ex)
           {
           System.out.println(ex);
           }

    }//GEN-LAST:event_rawmdebtnActionPerformed

    private void saledebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saledebtnActionPerformed
        // TODO add your handling code here:
        Connection cn=null;
        try
           {
            
              String id = Id.getText(); 
               
           Class.forName("com.mysql.jdbc.Driver");
           System.out.println("Driver Registered");
        cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/manufacturing_fruit_product_management","root","root");           
            System.out.println("Connection Success");
           String path="C:\\Users\\Admin\\Documents\\NetBeansProjects\\manufacturing_fruit_product_management_system\\src\\Report1\\sale_information.jrxml";
            Map parameters = new HashMap();
           
           parameters.put("id",id);
           
           
           JasperDesign design = JRXmlLoader.load(path);
    //JasperReport report = JasperCompileManager.compileReport(design);
           JasperReport jr=JasperCompileManager.compileReport(design);
           
           JasperPrint jp=JasperFillManager.fillReport(jr, parameters, cn);
           JasperViewer jv=new JasperViewer(jp);
           jv.setVisible(true);
          // jv.setVisible(true);
           }catch(Exception ex)
           {
           System.out.println(ex);
           }

    }//GEN-LAST:event_saledebtnActionPerformed

    private void purchasedebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purchasedebtnActionPerformed
        // TODO add your handling code here:
        Connection cn=null;
         try
           {
            
              String id = Id.getText(); 
               
           Class.forName("com.mysql.jdbc.Driver");
           System.out.println("Driver Registered");
        cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/manufacturing_fruit_product_management","root","root");           
            System.out.println("Connection Success");
           String path="C:\\Users\\Admin\\Documents\\NetBeansProjects\\manufacturing_fruit_product_management_system\\src\\Report1\\purchase_information.jrxml";
            Map parameters = new HashMap();
           
           parameters.put("id",id);
           
           
           JasperDesign design = JRXmlLoader.load(path);
    //JasperReport report = JasperCompileManager.compileReport(design);
           JasperReport jr=JasperCompileManager.compileReport(design);
           
           JasperPrint jp=JasperFillManager.fillReport(jr, parameters, cn);
           JasperViewer jv=new JasperViewer(jp);
           jv.setVisible(true);
          // jv.setVisible(true);
           }catch(Exception ex)
           {
           System.out.println(ex);
           }

    }//GEN-LAST:event_purchasedebtnActionPerformed

    private void emppaybtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emppaybtnActionPerformed
        // TODO add your handling code here:
        Connection cn=null;
        try
           {
            
              String id = Id.getText(); 
               
           Class.forName("com.mysql.jdbc.Driver");
           System.out.println("Driver Registered");
        cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/manufacturing_fruit_product_management","root","root");           
            System.out.println("Connection Success");
           String path="C:\\Users\\Admin\\Documents\\NetBeansProjects\\manufacturing_fruit_product_management_system\\src\\Report1\\employeepayment.jrxml";
            Map parameters = new HashMap();
           
           parameters.put("id",id);
           
           
           JasperDesign design = JRXmlLoader.load(path);
    //JasperReport report = JasperCompileManager.compileReport(design);
           JasperReport jr=JasperCompileManager.compileReport(design);
           
           JasperPrint jp=JasperFillManager.fillReport(jr, parameters, cn);
           JasperViewer jv=new JasperViewer(jp);
           jv.setVisible(true);
          // jv.setVisible(true);
           }catch(Exception ex)
           {
           System.out.println(ex);
           }

    }//GEN-LAST:event_emppaybtnActionPerformed

    private void paybtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paybtnActionPerformed
        // TODO add your handling code here:
        Connection cn=null;
        try
           {
            
              String id = Id.getText(); 
               
           Class.forName("com.mysql.jdbc.Driver");
           System.out.println("Driver Registered");
        cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/manufacturing_fruit_product_management","root","root");           
            System.out.println("Connection Success");
           String path="C:\\Users\\Admin\\Documents\\NetBeansProjects\\manufacturing_fruit_product_management_system\\src\\Report1\\payment_status.jrxml";
            Map parameters = new HashMap();
           
           parameters.put("id",id);
           
           
           JasperDesign design = JRXmlLoader.load(path);
    //JasperReport report = JasperCompileManager.compileReport(design);
           JasperReport jr=JasperCompileManager.compileReport(design);
           
           JasperPrint jp=JasperFillManager.fillReport(jr, parameters, cn);
           JasperViewer jv=new JasperViewer(jp);
           jv.setVisible(true);
          // jv.setVisible(true);
           }catch(Exception ex)
           {
           System.out.println(ex);
           }

    }//GEN-LAST:event_paybtnActionPerformed

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        // TODO add your handling code here:
         home_page obj=new home_page();
        obj.setVisible(true);
        this.hide();
        
    }//GEN-LAST:event_backbtnActionPerformed

    private void suppaybtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suppaybtnActionPerformed
        // TODO add your handling code here:
        Connection cn=null;
        try
           {
            
              String id = Id.getText(); 
               
           Class.forName("com.mysql.jdbc.Driver");
           System.out.println("Driver Registered");
        cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/manufacturing_fruit_product_management","root","root");           
            System.out.println("Connection Success");
           String path="C:\\Users\\Admin\\Documents\\NetBeansProjects\\manufacturing_fruit_product_management_system\\src\\Report1\\supplier_payment_details.jrxml";
            Map parameters = new HashMap();
           
           parameters.put("id",id);
           
           
           JasperDesign design = JRXmlLoader.load(path);
    //JasperReport report = JasperCompileManager.compileReport(design);
           JasperReport jr=JasperCompileManager.compileReport(design);
           
           JasperPrint jp=JasperFillManager.fillReport(jr, parameters, cn);
           JasperViewer jv=new JasperViewer(jp);
           jv.setVisible(true);
          // jv.setVisible(true);
           }catch(Exception ex)
           {
           System.out.println(ex);
           }

    }//GEN-LAST:event_suppaybtnActionPerformed

    private void purchasebillbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purchasebillbtnActionPerformed
        // TODO add your handling code here:
        Connection cn=null;
        try
           {
            
              String id = Id.getText(); 
               
           Class.forName("com.mysql.jdbc.Driver");
           System.out.println("Driver Registered");
        cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/manufacturing_fruit_product_management","root","root");           
            System.out.println("Connection Success");
           String path="C:\\Users\\Admin\\Documents\\NetBeansProjects\\manufacturing_fruit_product_management_system\\src\\Report1\\Purchase_bill_format.jrxml";
            Map parameters = new HashMap();
           
           parameters.put("id",id);
           
           
           JasperDesign design = JRXmlLoader.load(path);
    //JasperReport report = JasperCompileManager.compileReport(design);
           JasperReport jr=JasperCompileManager.compileReport(design);
           
           JasperPrint jp=JasperFillManager.fillReport(jr, parameters, cn);
           JasperViewer jv=new JasperViewer(jp);
           jv.setVisible(true);
          // jv.setVisible(true);
           }catch(Exception ex)
           {
           System.out.println(ex);
           }

    }//GEN-LAST:event_purchasebillbtnActionPerformed

    private void salebillbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salebillbtnActionPerformed
        // TODO add your handling code here:
        Connection cn=null;
        try
           {
            
              String id = Id.getText(); 
               
           Class.forName("com.mysql.jdbc.Driver");
           System.out.println("Driver Registered");
        cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/manufacturing_fruit_product_management","root","root");           
            System.out.println("Connection Success");
           String path="C:\\Users\\Admin\\Documents\\NetBeansProjects\\manufacturing_fruit_product_management_system\\src\\Report1\\Sale_bill_format.jrxml";
            Map parameters = new HashMap();
           
           parameters.put("id",id);
           
           
           JasperDesign design = JRXmlLoader.load(path);
    //JasperReport report = JasperCompileManager.compileReport(design);
           JasperReport jr=JasperCompileManager.compileReport(design);
           
           JasperPrint jp=JasperFillManager.fillReport(jr, parameters, cn);
           JasperViewer jv=new JasperViewer(jp);
           jv.setVisible(true);
          // jv.setVisible(true);
           }catch(Exception ex)
           {
           System.out.println(ex);
           }

    }//GEN-LAST:event_salebillbtnActionPerformed

    
    
    
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
            java.util.logging.Logger.getLogger(idwisereport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(idwisereport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(idwisereport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(idwisereport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new idwisereport().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Id;
    private javax.swing.JButton backbtn;
    private javax.swing.JButton customerdetailsbtn;
    private javax.swing.JButton empdetailsbtn;
    private javax.swing.JButton emppaybtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton paybtn;
    private javax.swing.JButton prodebtn;
    private javax.swing.JButton purchasebillbtn;
    private javax.swing.JButton purchasedebtn;
    private javax.swing.JButton rawmdebtn;
    private javax.swing.JButton salebillbtn;
    private javax.swing.JButton saledebtn;
    private javax.swing.JButton suppaybtn;
    private javax.swing.JButton supplierdebtn;
    // End of variables declaration//GEN-END:variables
}
