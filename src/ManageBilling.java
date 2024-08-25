import java.sql.*;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import javax.swing.event.*;
import javax.swing.JOptionPane;
import java.util.Date;

public class ManageBilling extends javax.swing.JFrame {

    public ManageBilling() {
        initComponents();
        setResizable(false);
        Table();
    }

        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        quantity = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        BillTxt = new javax.swing.JTextArea();
        add_to_bill_button = new javax.swing.JButton();
        clear_button = new javax.swing.JButton();
        rs = new javax.swing.JLabel();
        print_button = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        productTable = new javax.swing.JTable();
        Totprice = new javax.swing.JLabel();
        grandTotal = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(4, 40, 86));
        jPanel3.setPreferredSize(new java.awt.Dimension(89, 44));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Manage Billing");

        jButton1.setBackground(new java.awt.Color(4, 4, 76));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Back");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        back.setBackground(new java.awt.Color(4, 4, 76));
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setText("Back");
        back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(back, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(31, 31, 31))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(back))
                        .addGap(338, 338, 338)))
                .addContainerGap())
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(5, 5, 65));
        jLabel3.setText("Name");

        name.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        name.setForeground(new java.awt.Color(5, 5, 65));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(5, 5, 65));
        jLabel4.setText("Quantity");

        quantity.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        quantity.setForeground(new java.awt.Color(5, 5, 65));

        BillTxt.setColumns(20);
        BillTxt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BillTxt.setForeground(new java.awt.Color(5, 5, 65));
        BillTxt.setRows(5);
        jScrollPane1.setViewportView(BillTxt);

        add_to_bill_button.setBackground(new java.awt.Color(4, 4, 76));
        add_to_bill_button.setForeground(new java.awt.Color(255, 255, 255));
        add_to_bill_button.setText("ADD TO BILL");
        add_to_bill_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add_to_bill_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add_to_bill_buttonMouseClicked(evt);
            }
        });
        add_to_bill_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_to_bill_buttonActionPerformed(evt);
            }
        });

        clear_button.setBackground(new java.awt.Color(4, 4, 76));
        clear_button.setForeground(new java.awt.Color(255, 255, 255));
        clear_button.setText("CLEAR");
        clear_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clear_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_buttonActionPerformed(evt);
            }
        });

        rs.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rs.setForeground(new java.awt.Color(5, 5, 65));
        rs.setText("RS.");

        print_button.setBackground(new java.awt.Color(4, 4, 76));
        print_button.setForeground(new java.awt.Color(255, 255, 255));
        print_button.setText("PRINT");
        print_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        print_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                print_buttonActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(5, 5, 65));
        jLabel8.setText("Product Details:");

        productTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Category", "Quantity", "Price"
            }
        ));
        productTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(productTable);

        grandTotal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        grandTotal.setForeground(new java.awt.Color(5, 5, 65));
        grandTotal.setText("0.0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(rs)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(grandTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Totprice, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(print_button)))
                .addGap(53, 53, 53)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 6, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(name, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                    .addComponent(quantity))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(add_to_bill_button)
                    .addComponent(clear_button))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add_to_bill_button))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clear_button))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Totprice, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(print_button)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(rs)
                                .addComponent(grandTotal)))))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 800, 520));

        jPanel1.setBackground(new java.awt.Color(5, 5, 65));
        jPanel1.setPreferredSize(new java.awt.Dimension(310, 500));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/small-HAPPY_MINI_MART__1_-removebg-preview.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 359, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void productTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productTableMouseClicked
        {
            DefaultTableModel model=(DefaultTableModel)productTable.getModel();
            int obj=productTable.getSelectedRow();
            name.setText(model.getValueAt(obj,1).toString());
            availableQuantity=Float.parseFloat(model.getValueAt(obj,3).toString());
            uprice=Float.parseFloat(model.getValueAt(obj,4).toString());
        }
    }//GEN-LAST:event_productTableMouseClicked

    private void print_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_print_buttonActionPerformed
        try{
            BillTxt.setText(BillTxt.getText()+"\n\n\n\t-------------------------------------------------------------------------------------------\n\t\t\t\t"+"        Total = "+finalPrice+"\n\t-------------------------------------------------------------------------------------------");
            
            // to get current date and time
            ZoneId chennaiZoneId = ZoneId.of("Asia/Kolkata");
            ZonedDateTime nowInChennai = ZonedDateTime.now(chennaiZoneId);

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String formattedDateTime = nowInChennai.format(formatter);
            
//          BillTxt.setText(BillTxt.getText()+"Printed by: ");
            BillTxt.setText(BillTxt.getText()+"\n\n\n\n\tOn "+formattedDateTime);
            BillTxt.setText(BillTxt.getText()+"\n\n\n\n\tPlease check your bill before leaving the shop");
            BillTxt.setText(BillTxt.getText()+"\n\n\n\n\t\t*****THANK YOU FOR SHOPPING WITH US*****");
            BillTxt.print();
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_print_buttonActionPerformed

    private void clear_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_buttonActionPerformed
        quantity.setText("");
        name.setText("");
    }//GEN-LAST:event_clear_buttonActionPerformed

    private void add_to_bill_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_to_bill_buttonActionPerformed
        String pname=name.getText();
        String pquantity=quantity.getText();
        Float qn=Float.parseFloat(pquantity);
        
        if(pname.equals("") || pquantity.equals("")){
            JOptionPane.showMessageDialog(null,"Invalid information.\nPlease provide Name and Quantity of the product!","Message",JOptionPane.WARNING_MESSAGE);
        }
        else if(availableQuantity < qn){
            JOptionPane.showMessageDialog(null,"Sorry! Product out of stock!","Message",JOptionPane.WARNING_MESSAGE);
        }
        else{
            i++;
            total=uprice*qn;
            finalPrice+=total;
            if(i==1){
                BillTxt.setText("\t\t      HAPPY MINI MART\n\n"+"\n\n\tNagapattinam, TamilNadu. Phone: 9087654321\n\n\n\n"+"\tS.NO\tPRODUCT\tPRICE\tQUANTITY\tPRICE\t\n"+"\t-------------------------------------------------------------------------------------------\n\t"+i+"\t"+pname+"\t"+uprice+"\t"+pquantity+"\t"+total+"\n\t");
            }
            else{
                BillTxt.setText(BillTxt.getText()+i+"\t"+name.getText()+"\t"+uprice+"\t"+pquantity+"\t"+total+"\n\t");
            }
            grandTotal.setText(String.valueOf(finalPrice));
            updateTable();
        }
        
    }//GEN-LAST:event_add_to_bill_buttonActionPerformed

    private void add_to_bill_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_to_bill_buttonMouseClicked

    }//GEN-LAST:event_add_to_bill_buttonMouseClicked

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        new SellerFront().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_backActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

public void Table(){
        try{
//           Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/happyminimart","root","");
           Connection c=CreateDbConnection.createConnection();
           Statement st=c.createStatement();
           ResultSet rs=st.executeQuery("SELECT * FROM PRODUCT");
           productTable.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e){
          System.out.println(e);  
        }
    }

    float uprice,total,availableQuantity,finalPrice;    
    
    int i=0;
            
    public void updateTable(){
        try{
           String quan=String.valueOf(availableQuantity-Float.parseFloat(quantity.getText()));
//           Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/happyminimart","root","");
           Connection c=CreateDbConnection.createConnection();
           String query="UPDATE PRODUCT SET QUANTITY=? WHERE NAME=?";
           PreparedStatement ps=c.prepareStatement(query);
           ps.setString(1,quan);
           ps.setString(2,name.getText());
           ps.executeUpdate();
           
           Table();
        }
        catch(Exception e){
            
        }
    }
    
    
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
            java.util.logging.Logger.getLogger(ManageBilling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageBilling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageBilling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageBilling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageBilling().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea BillTxt;
    private javax.swing.JLabel Totprice;
    private javax.swing.JButton add_to_bill_button;
    private javax.swing.JButton back;
    private javax.swing.JButton clear_button;
    private javax.swing.JLabel grandTotal;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField name;
    private javax.swing.JButton print_button;
    private javax.swing.JTable productTable;
    private javax.swing.JTextField quantity;
    private javax.swing.JLabel rs;
    // End of variables declaration//GEN-END:variables
}
