/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package judge;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Avishek
 */
public class editorPage extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    int index ;
    int time ;
    String username;
    String fname;
    String path;
    int points ;
    Connection conn = null ;
    PreparedStatement pst = null ;
    ResultSet rs = null ;
    public editorPage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        menu = new javax.swing.JComboBox<>();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jButton1.setFont(new java.awt.Font("Superclarendon", 1, 13)); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(310, 570, 100, 29);

        jTextField3.setText("Your File.");
        jPanel1.add(jTextField3);
        jTextField3.setBounds(490, 60, 120, 30);

        jScrollPane1.setViewportView(jEditorPane1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 140, 700, 410);

        jButton3.setText("Browse");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(380, 60, 97, 29);

        jLabel1.setFont(new java.awt.Font("Superclarendon", 1, 13)); // NOI18N
        jLabel1.setText("Status:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(460, 570, 60, 17);

        jTextField1.setEditable(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(530, 560, 190, 40);

        menu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "C++", "JAVA", "C", "PYTHON" }));
        menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActionPerformed(evt);
            }
        });
        jPanel1.add(menu);
        menu.setBounds(40, 570, 109, 30);

        jTextField2.setEditable(false);
        jTextField2.setAlignmentX(0.0F);
        jTextField2.setAlignmentY(0.0F);
        jTextField2.setAutoscrolls(false);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2);
        jTextField2.setBounds(10, 620, 690, 60);

        jLabel2.setFont(new java.awt.Font("Superclarendon", 1, 13)); // NOI18N
        jLabel2.setText("Enter your code :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 110, 170, 17);

        jButton2.setFont(new java.awt.Font("Superclarendon", 1, 13)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(640, 30, 83, 29);

        jLabel4.setFont(new java.awt.Font("Impact", 0, 30)); // NOI18N
        jLabel4.setText("SUBMIT SOLUTION:");
        jLabel4.setToolTipText("");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 0, 370, 80);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/judge/Screen Shot 2016-09-26 at 20.17.27.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 0, 740, 700);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 735, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 695, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jTextField2.setText("");
        jTextField1.setText("In-Queue");
        String code = "";
        if( jTextField3.getText().equals("Your File.") )
        {
            code = jEditorPane1.getText();
        }
        else
        {
            try
            {
            File in = new File(path);
            BufferedReader br = new BufferedReader(new FileReader(in));
            String temp;
            
            while((temp = br.readLine()) != null )
            {
                code += temp.trim() + "\n" ;
            }
            }   
            catch(IOException e)
            {
            System.out.println("In browsing file." +  e);
            }
        }
        String lang = menu.getSelectedItem().toString();
        System.out.println(lang);
        try 
        {
            
            jTextField1.setText("Compiling");
            Socket s = new Socket("127.0.0.1",1342);
            PrintStream p = new PrintStream(s.getOutputStream());
            p.println(""+time);
            p.println(""+index);
            p.println(lang);
            p.println(code);
            p.println("Santhuuuuu");
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            String status = br.readLine();
            //JOptionPane.showMessageDialog(rootPane, status, status, HEIGHT);
            conn = MySqlConnect.connection();
            String sql = "Select * from problems where number='"+index+"' ";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            String problem ="";
            while(rs.next())
            {
                problem = rs.getString("problem");
            }
            String q = "Insert into data1.submissions values('"+problem+"' , '"+username+"' , '"+status+"' , 1 , 1 ) " ;  
            conn.createStatement().execute(q);   
            jTextField1.setText(status);
            if( status.equals("AC") )
            {
                String sql1 = "Update data1.login set points = points + "+points+" where username='"+username+"'";
                try
                {
                    conn.createStatement().execute(sql1);
                
                }
                catch(SQLException e)
                {
                    System.out.println("Error while increasing points");
                }
                jTextField1.setForeground(Color.GREEN);
            }
            else if(status.equals("WA") )
                jTextField1.setForeground(Color.RED);
            else if(status.equals("TLE"))
                jTextField1.setForeground(Color.YELLOW);
            else if(status.equals("Compile Error"))
            {
                String ce = "" , temp;
                System.out.println("Reached Here in main");
                
                temp = br.readLine() ;
                while( true)
                {
                    if(temp.equals("Santhuuuu"))
                        break ;
                    ce += (temp.trim() + "\n");
                    //System.out.println(temp);
                    temp = br.readLine();
                }
                jTextField2.setVisible(true);
                System.out.println("ERROR\n"+ce);
                jTextField2.setText(ce);
            }
            //System.out.println(jTextField1.getText());
        } 
        catch (IOException ex) 
        {
            System.out.println("Errorrrrrr");
        } catch (SQLException ex) {
            System.out.println("SQL Exception");
        }
        jTextField3.setText("Your File.");
    }//GEN-LAST:event_jButton1ActionPerformed
    public void set(int index, int  time, String s , int p)
    {
        this.index = index ;
        this.time = time ;
        this.username = s ;
        this.points = p ;
    }
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int returnVal = jFileChooser1.showOpenDialog(this);
        if (returnVal == jFileChooser1.APPROVE_OPTION) 
        {
        File file = jFileChooser1.getSelectedFile();
        fname = file.getName();
        path = file.getAbsolutePath();
        jTextField3.setText(fname);
        } 
        else 
        {
        System.out.println("File access cancelled by user.");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JComboBox<String> menu;
    // End of variables declaration//GEN-END:variables
}
