/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package talent.show;

import java.awt.*;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;





/**
 *
 * @author HP
 */
public class MainFrame extends javax.swing.JFrame implements KeyListener{

    /**
     * Creates new form MainFrame
     */
    ScheduleFrame f = new ScheduleFrame(this);
    AddSoloFrame sf = new AddSoloFrame(this);
    AddDuoFrame df = new AddDuoFrame(this);
    AddGroupFrame1 gf1 = new AddGroupFrame1(this);
    boolean created = false;
    //Color c = new Color(255, 204, 204);
    Color c = new Color(191, 216, 189);
    JButton[] buttons = new JButton[6];
  
    
    
    public MainFrame() {
        
        initComponents();
        this.getContentPane().setBackground(c);
        enterName.addKeyListener(this);
        enterIdDelete.addKeyListener(this);
        box.addKeyListener(this);
        buttons[0] = displayApplicantInfo;
        buttons[1] = shortListOfApplicants;
        buttons[2] = addDeleteStatus;
        buttons[3] = createSchedule;
        buttons[4] = displaySchedule;
        buttons[5] = emailList;
        addApplicant.addKeyListener(this);
        solo.addKeyListener(this);
        duo.addKeyListener(this);
        group.addKeyListener(this);
        
  
        for(JButton temp : buttons)
        {
            temp.addKeyListener(this);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        addApplicant = new javax.swing.JButton();
        group = new javax.swing.JRadioButton();
        duo = new javax.swing.JRadioButton();
        solo = new javax.swing.JRadioButton();
        enterNameText2 = new javax.swing.JLabel();
        enterNameText = new javax.swing.JLabel();
        enterIdText = new javax.swing.JLabel();
        warning = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        emailList = new javax.swing.JButton();
        displaySchedule = new javax.swing.JButton();
        createSchedule = new javax.swing.JButton();
        addDeleteStatus = new javax.swing.JButton();
        shortListOfApplicants = new javax.swing.JButton();
        displayApplicantInfo = new javax.swing.JButton();
        deleteName = new javax.swing.JButton();
        enterName = new javax.swing.JTextField();
        deleteId = new javax.swing.JButton();
        enterIdDelete = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        box = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        setBackground(new java.awt.Color(69, 69, 69));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.white);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(221, 231, 199));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(152, 201, 163), 3, true));
        jPanel1.setPreferredSize(new java.awt.Dimension(670, 460));

        addApplicant.setText("ADD APLLICANT");
        addApplicant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addApplicantActionPerformed(evt);
            }
        });

        buttonGroup1.add(group);
        group.setText("GROUP");

        buttonGroup1.add(duo);
        duo.setText("DUO");

        buttonGroup1.add(solo);
        solo.setSelected(true);
        solo.setText("SOLO");

        enterNameText2.setText("Search Applicant:");

        enterNameText.setText("Enter Name:");

        enterIdText.setText("Enter ID:");

        warning.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        warning.setForeground(new java.awt.Color(227, 33, 33));
        warning.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        textArea.setEditable(false);
        textArea.setColumns(20);
        textArea.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        textArea.setRows(5);
        jScrollPane1.setViewportView(textArea);

        emailList.setText("EMAIL LIST");
        emailList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailListActionPerformed(evt);
            }
        });

        displaySchedule.setText("DISPLAY SCHEDULE");
        displaySchedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayScheduleActionPerformed(evt);
            }
        });

        createSchedule.setText("CREATE SCHEDULE");
        createSchedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createScheduleActionPerformed(evt);
            }
        });

        addDeleteStatus.setText("ADD/ DELETE STATUS");
        addDeleteStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDeleteStatusActionPerformed(evt);
            }
        });

        shortListOfApplicants.setText("SHORT LIST OF APPLICANTS");
        shortListOfApplicants.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shortListOfApplicantsActionPerformed(evt);
            }
        });

        displayApplicantInfo.setText("DISPLAY APPLICANT INFO");
        displayApplicantInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayApplicantInfoActionPerformed(evt);
            }
        });

        deleteName.setText("DELETE");
        deleteName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteNameActionPerformed(evt);
            }
        });

        deleteId.setText("DELETE ");
        deleteId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteIdActionPerformed(evt);
            }
        });

        jLabel1.setText("Select type of applicant to add to the list:");

        box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(emailList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(enterNameText)
                        .addComponent(enterIdText)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(displayApplicantInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addDeleteStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(createSchedule, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(displaySchedule, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(shortListOfApplicants, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(enterNameText2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(box, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(enterName, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(enterIdDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(deleteId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(deleteName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(warning, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(60, 60, 60)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(solo)
                                    .addGap(46, 46, 46)
                                    .addComponent(duo)
                                    .addGap(45, 45, 45)
                                    .addComponent(group)
                                    .addGap(85, 85, 85))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(105, 105, 105)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(addApplicant, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(143, 143, 143))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(group)
                            .addComponent(duo)
                            .addComponent(solo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addApplicant))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(enterIdText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(enterIdDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deleteId))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(enterNameText)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(warning, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(enterName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deleteName))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(enterNameText2)
                            .addComponent(box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addComponent(displayApplicantInfo)
                        .addGap(18, 18, 18)
                        .addComponent(shortListOfApplicants)
                        .addGap(18, 18, 18)
                        .addComponent(addDeleteStatus)
                        .addGap(18, 18, 18)
                        .addComponent(createSchedule)
                        .addGap(18, 18, 18)
                        .addComponent(displaySchedule)
                        .addGap(18, 18, 18)
                        .addComponent(emailList)
                        .addGap(93, 93, 93))))
        );

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(221, 231, 199));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("        \n         KEYBOARD NAVIGATION\n-----------------------------------\n[LEFT][RIGHT][UP][DOWN] to navigate\n\n\n[ENTER] to press buttons while \non them. If you can't reach a \nbutton, press [ENTER] while on \na related text field, radio \nbutton or checkbox.\n\n\n[UP] & [DOWN] will move INSIDE \na combobox. To stop at a \nspecific index and move down \nto the next JFrame component, \nuse [ENTER]. \nTo move up, use [SHIFT]\n\n");
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
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
        
            if(enterIdDelete.hasFocus())
            {
                switch(keyCode){
                    case KeyEvent.VK_DOWN: enterName.requestFocus();
                       break;
                       case KeyEvent.VK_ENTER: deleteId.doClick();
                       break;
                       case KeyEvent.VK_UP: emailList.requestFocus();
                       break;       
                }
            }
            
            if(enterName.hasFocus())
            {
                 switch(keyCode){
                    case KeyEvent.VK_DOWN: box.requestFocus();
                       break;
                       case KeyEvent.VK_ENTER: deleteName.doClick();
                       break;
                       case KeyEvent.VK_UP: enterIdDelete.requestFocus();
                       break;       
                }
            }
            
            
           if(box.hasFocus()){
               if((box.getSelectedIndex() == ApplicantSys.applicant_list.size() -1 && keyCode == KeyEvent.VK_DOWN) || keyCode == KeyEvent.VK_ENTER)
                       buttons[0].requestFocus();
               else if((box.getSelectedIndex() < 1 && keyCode == KeyEvent.VK_UP) || keyCode == KeyEvent.VK_SHIFT)
                           enterName.requestFocus();
              if(ApplicantSys.applicant_list.size() == 1)
                  box.setSelectedIndex(0);
           }
           
           int i;
           
           for(i = 0; i < 6; i++)
           {
               
               if(buttons[i].hasFocus() && keyCode == KeyEvent.VK_DOWN && i != 5)
                   buttons[i+1].requestFocus();
               else if(buttons[5].hasFocus() && keyCode == KeyEvent.VK_DOWN)
                   enterIdDelete.requestFocus();
               else if(buttons[i].hasFocus() && keyCode == KeyEvent.VK_UP && i != 0)
                   buttons[i-1].requestFocus();
               else if(buttons[0].hasFocus() && keyCode == KeyEvent.VK_UP)
                   box.requestFocus();
               
               if(buttons[i].hasFocus() && keyCode == KeyEvent.VK_ENTER)
                   buttons[i].doClick();
           }
           
           if((!solo.hasFocus() || !duo.hasFocus() || !group.hasFocus()) && keyCode == KeyEvent.VK_RIGHT)
           { 
               if(keyCode == KeyEvent.VK_RIGHT)
               {
                   solo.requestFocus();
                   solo.setSelected(true);
               }
           }
           else if((!solo.hasFocus() || !duo.hasFocus() || !group.hasFocus()) && keyCode == KeyEvent.VK_LEFT)
           {
               group.requestFocus();
               group.setSelected(true);
           }
           
               if(solo.hasFocus()){
                   switch(keyCode){
                       case KeyEvent.VK_LEFT: enterIdDelete.requestFocus(); solo.setSelected(true);
                       break;
                       case KeyEvent.VK_RIGHT: duo.requestFocus(); duo.setSelected(true);
                       break;
                       case KeyEvent.VK_ENTER: addApplicant.doClick();
                       break;             
                   }
               }
               if(duo.hasFocus()){
               switch(keyCode){
                    case KeyEvent.VK_LEFT: solo.requestFocus(); solo.setSelected(true);
                       break;
                       case KeyEvent.VK_RIGHT: group.requestFocus(); group.setSelected(true);
                       break;
                       case KeyEvent.VK_ENTER: addApplicant.doClick();
                       break;   
               }
               }
               if(group.hasFocus())
               {
                   switch(keyCode){
                    case KeyEvent.VK_LEFT: duo.requestFocus(); duo.setSelected(true);
                       break;
                       case KeyEvent.VK_RIGHT: enterIdDelete.requestFocus(); group.setSelected(true);
                       break;
                       case KeyEvent.VK_ENTER: addApplicant.doClick();
                       break; 
 
               }
               }
    }
    
    
    
      public void fillComboBox() { 
        getBox().setModel(new DefaultComboBoxModel(ApplicantSys.getApplicant())); 
    }
      private JComboBox getBox() {
        return box;
    }
      
    public void clear()
    {
        textArea.setText("");
        warning.setText("");
        enterIdDelete.setText("");
        enterName.setText("");
    }
    
    private void deleteIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteIdActionPerformed
       //clear();
        if(enterIdDelete.getText().equals(""))
            warning.setText("Enter ID!");
        else{
            try{
        if(!ApplicantSys.deleteApplicant(Integer.parseInt(enterIdDelete.getText())))
            textArea.setText("Delete failed. Applicant does not exist.");
        else {
            fillComboBox();
            textArea.setText("Applicant deleted successfully.");}
            }catch(Exception e)
            {
                warning.setText("Enter number!");
            }
        }
    }//GEN-LAST:event_deleteIdActionPerformed

   
    private void deleteNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteNameActionPerformed
         //clear();
        if(enterName.getText().equals(""))
            warning.setText("Enter Name!");
        else{
        if(!ApplicantSys.deleteApplicant((enterName.getText())))
            textArea.setText("Delete failed. Applicant does not exist.");
        else {
            fillComboBox();
            textArea.setText("Applicant deleted successfully.");
        }}
    }//GEN-LAST:event_deleteNameActionPerformed

    private void displayApplicantInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayApplicantInfoActionPerformed
      clear();
        String all = ApplicantSys.display();
      if(all.isEmpty())
          textArea.setText("Applicant list is empty.");
      else textArea.setText(all);
          
    }//GEN-LAST:event_displayApplicantInfoActionPerformed

    private void shortListOfApplicantsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shortListOfApplicantsActionPerformed
        clear();
        String all = ApplicantSys.listOfApplicants();
        if(all == null)
            textArea.setText("Applicant list is empty.");
        else textArea.setText(all);
    }//GEN-LAST:event_shortListOfApplicantsActionPerformed

    private void addDeleteStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDeleteStatusActionPerformed
       warning.setText("");
       textArea.setText(Applicant.formAddStatus());
    }//GEN-LAST:event_addDeleteStatusActionPerformed

    private void createScheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createScheduleActionPerformed
     clear();
     if(created == false)
     {
        if(ApplicantSys.applicant_list.size() < 3)
          {
             
              textArea.setText("Applicant number must be at least 3.\nPlease enter more.");
              
          }
        else if(ApplicantSys.applicant_list.size() > 12)
          {
             
               textArea.setText("Applicant number must be at most 12.\nPlease remove some applicants.");
          }else{
         
              for(int i = 0; i < ApplicantSys.applicant_list.size(); i++)
              {
                  ApplicantSys.temp.add(ApplicantSys.applicant_list.get(i).name);
              }
              if(ApplicantSys.temp.size() < 3)
              {
                  ApplicantSys.temp.clear();
                   textArea.setText("Not enough applicants to create a schedule.\nPlease add more and make sure the titles are\nnot the same.");
                  
              }else if(ApplicantSys.temp.size() > 12)
              {
                  ApplicantSys.temp.clear();
                   textArea.setText("Too many applicants for the schedule.\nPlease delete some and make sure the titles are not\nthe same.");
              }
              else{
                  f.setVisible(true);
                  setVisible(false);
                  textArea.setText("Schedule created.");  
                  created = true;
              } 
          }
     }else {
         textArea.setText("Schedule already created."); 
         warning.setText("");
     }
    }//GEN-LAST:event_createScheduleActionPerformed

    private void displayScheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayScheduleActionPerformed

        clear();
        textArea.setText(ApplicantSys.displaySchedule());
       
    }//GEN-LAST:event_displayScheduleActionPerformed

    private void emailListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailListActionPerformed
        clear();
        String all = ApplicantSys.emailList();
        if(!created)
            textArea.setText("Schedule not created yet.");
        else textArea.setText(all);
    }//GEN-LAST:event_emailListActionPerformed

    private void addApplicantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addApplicantActionPerformed
        clear();
        if(solo.isSelected())
        {
           setVisible(false);
           sf.setVisible(true);
        }else if (duo.isSelected())
        {
            setVisible(false);
            df.setVisible(true);
        }else{
            setVisible(false);
            gf1.setVisible(true);
        }
        
    }//GEN-LAST:event_addApplicantActionPerformed

    private void boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxActionPerformed
       clear();
        Applicant temp = ApplicantSys.searchApplicant((String)box.getSelectedItem());
       textArea.setText(temp.toString());
    }//GEN-LAST:event_boxActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addApplicant;
    private javax.swing.JButton addDeleteStatus;
    private javax.swing.JComboBox<String> box;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton createSchedule;
    private javax.swing.JButton deleteId;
    private javax.swing.JButton deleteName;
    private javax.swing.JButton displayApplicantInfo;
    private javax.swing.JButton displaySchedule;
    private javax.swing.JRadioButton duo;
    private javax.swing.JButton emailList;
    private javax.swing.JTextField enterIdDelete;
    private javax.swing.JLabel enterIdText;
    private javax.swing.JTextField enterName;
    private javax.swing.JLabel enterNameText;
    private javax.swing.JLabel enterNameText2;
    private javax.swing.JRadioButton group;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton shortListOfApplicants;
    private javax.swing.JRadioButton solo;
    private javax.swing.JTextArea textArea;
    private javax.swing.JLabel warning;
    // End of variables declaration//GEN-END:variables
}
