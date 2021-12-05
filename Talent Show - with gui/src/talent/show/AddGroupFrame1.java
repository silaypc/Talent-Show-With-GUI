/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package talent.show;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;



/**
 *
 * @author HP
 */
public class AddGroupFrame1 extends javax.swing.JFrame implements KeyListener{
    AddIndividualFrame aif; 
    MainFrame main;
    
    public AddGroupFrame1(MainFrame mf) {
        //Color c = new Color(255, 204, 204);
        Color c = new Color(191, 216, 189);
        main = mf;
        initComponents();
        this.getContentPane().setBackground(c);
        showNameText.addKeyListener(this);
        typeList.addKeyListener(this);
        count.addKeyListener(this);
        proceedButton.addKeyListener(this);
    }

    private void clear()
    {
      showNameText.setText("");
      typeList.setSelectedIndex(0);
      count.setSelectedIndex(0);
      warning.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        showName = new javax.swing.JLabel();
        showType = new javax.swing.JLabel();
        showNameText = new javax.swing.JTextField();
        typeList = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        count = new javax.swing.JComboBox<>();
        proceedButton = new javax.swing.JButton();
        warning = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add Group");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(221, 231, 199));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(152, 201, 163), 3, true));

        showName.setText("Show Name:");

        showType.setText("Show Type:");

        typeList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dance", "Comedy", "Music", "Magic", "Pet", "Skit", "Sports", "Other" }));

        jLabel1.setText("Number of individuals in the group:");

        count.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(showName)
                            .addComponent(showType))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(typeList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(showNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(count, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(showNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(showName))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(showType)
                    .addComponent(typeList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(count, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        proceedButton.setText("PROCEED");
        proceedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proceedButtonActionPerformed(evt);
            }
        });

        warning.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        warning.setForeground(new java.awt.Color(227, 33, 33));
        warning.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(warning, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(proceedButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(warning, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(proceedButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     public void keyTyped(KeyEvent e)
    {
        //NOT USED
    }
    
    public void keyReleased(KeyEvent e)
    {
        //NOT USED
    }
    
    public void keyPressed(KeyEvent e)
    {
        int keyCode = e.getKeyCode();
        
        if(showNameText.hasFocus())
        {
             switch(keyCode){
                       case KeyEvent.VK_DOWN: typeList.requestFocus();
                       break;
                       case KeyEvent.VK_UP: proceedButton.requestFocus();
                       break;       
                }
        }else if(typeList.hasFocus()){
               if((typeList.getSelectedIndex() == 7 && keyCode == KeyEvent.VK_DOWN) || keyCode == KeyEvent.VK_ENTER)
                       count.requestFocus();
               else if((typeList.getSelectedIndex() < 1 && keyCode == KeyEvent.VK_UP) || keyCode == KeyEvent.VK_SHIFT)
                          showNameText.requestFocus();
           }else if(count.hasFocus())
           {
               if((count.getSelectedIndex() == 12 && keyCode == KeyEvent.VK_DOWN) || keyCode == KeyEvent.VK_ENTER)
                       proceedButton.requestFocus();
               else if((count.getSelectedIndex() < 1 && keyCode == KeyEvent.VK_UP) || keyCode == KeyEvent.VK_SHIFT)
                          typeList.requestFocus();
           }else if(proceedButton.hasFocus())
           {
               switch(keyCode){
                       case KeyEvent.VK_DOWN: showNameText.requestFocus();
                       break;
                       case KeyEvent.VK_UP: count.requestFocus();
                       break;     
                       case KeyEvent.VK_ENTER: proceedButton.doClick();
                }
           }
    }
    
    
    private void proceedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proceedButtonActionPerformed
        
        if(showNameText.getText().isEmpty())
        {
            warning.setText("Enter show name!");
        }
        else{
        aif = new AddIndividualFrame(this, Integer.parseInt((String)count.getSelectedItem()), showNameText.getText(), (String)typeList.getSelectedItem(), main);     
        setVisible(false);
        aif.setVisible(true);
        this.clear();     
        }
    }//GEN-LAST:event_proceedButtonActionPerformed

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> count;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton proceedButton;
    private javax.swing.JLabel showName;
    private javax.swing.JTextField showNameText;
    private javax.swing.JLabel showType;
    private javax.swing.JComboBox<String> typeList;
    private javax.swing.JLabel warning;
    // End of variables declaration//GEN-END:variables
}
