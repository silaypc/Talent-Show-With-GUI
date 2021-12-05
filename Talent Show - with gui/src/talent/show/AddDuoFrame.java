/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package talent.show;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class AddDuoFrame extends javax.swing.JFrame implements KeyListener{

    StagePrepFrame pf;
    MainFrame main;
    public AddDuoFrame(MainFrame mf) {
        //Color c = new Color(255, 204, 204);
        Color c = new Color(191, 216, 189);
        main = mf;
        initComponents();
        this.getContentPane().setBackground(c);
        nameText.addKeyListener(this);
        typeList.addKeyListener(this);
        nameSurnameText.addKeyListener(this);
        ageList.addKeyListener(this);
        maleButton.addKeyListener(this);
        femaleButton.addKeyListener(this);
        contactNumberText.addKeyListener(this);
        emailText.addKeyListener(this);
        addApplicantButton.addKeyListener(this);
        nameSurnameText1.addKeyListener(this);
        ageList1.addKeyListener(this);
        maleButton1.addKeyListener(this);
        femaleButton1.addKeyListener(this);
        contactNumberText1.addKeyListener(this);
        emailText1.addKeyListener(this);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        showName = new javax.swing.JLabel();
        showType = new javax.swing.JLabel();
        typeList = new javax.swing.JComboBox<>();
        nameText = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        nameSurname = new javax.swing.JLabel();
        age = new javax.swing.JLabel();
        ageList = new javax.swing.JComboBox<>();
        gender = new javax.swing.JLabel();
        maleButton = new javax.swing.JRadioButton();
        femaleButton = new javax.swing.JRadioButton();
        contactNumber = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        nameSurnameText = new javax.swing.JTextField();
        contactNumberText = new javax.swing.JTextField();
        emailText = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        nameSurname1 = new javax.swing.JLabel();
        age1 = new javax.swing.JLabel();
        ageList1 = new javax.swing.JComboBox<>();
        gender1 = new javax.swing.JLabel();
        maleButton1 = new javax.swing.JRadioButton();
        femaleButton1 = new javax.swing.JRadioButton();
        contactNumber1 = new javax.swing.JLabel();
        email1 = new javax.swing.JLabel();
        nameSurnameText1 = new javax.swing.JTextField();
        contactNumberText1 = new javax.swing.JTextField();
        emailText1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        addApplicantButton = new javax.swing.JButton();
        warning = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add Duo");
        setBackground(new java.awt.Color(188, 188, 188));
        setResizable(false);

        showName.setText("Show Name:");

        showType.setText("Show Type:");

        typeList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dance", "Comedy", "Music", "Magic", "Pet", "Skit", "Sports", "Other" }));

        jPanel2.setBackground(new java.awt.Color(221, 231, 199));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(152, 201, 163), 3, true));

        nameSurname.setText("Name Surname:");

        age.setText("Age:");

        ageList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60" }));

        gender.setText("Gender:");

        buttonGroup2.add(maleButton);
        maleButton.setSelected(true);
        maleButton.setText("Male");

        buttonGroup2.add(femaleButton);
        femaleButton.setText("Female");

        contactNumber.setText("Contact Number:");

        email.setText("Email:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(email)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(emailText, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(age)
                        .addGap(18, 18, 18)
                        .addComponent(ageList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(gender)
                        .addGap(18, 18, 18)
                        .addComponent(maleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(femaleButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(nameSurname)
                        .addGap(18, 18, 18)
                        .addComponent(nameSurnameText, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(contactNumber)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(contactNumberText)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameSurname)
                    .addComponent(nameSurnameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(age)
                    .addComponent(ageList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gender)
                    .addComponent(maleButton)
                    .addComponent(femaleButton))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contactNumber)
                    .addComponent(contactNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email)
                    .addComponent(emailText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(221, 231, 199));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(152, 201, 163), 3, true));

        nameSurname1.setText("Name Surname:");

        age1.setText("Age:");

        ageList1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60" }));

        gender1.setText("Gender:");

        buttonGroup1.add(maleButton1);
        maleButton1.setSelected(true);
        maleButton1.setText("Male");

        buttonGroup1.add(femaleButton1);
        femaleButton1.setText("Female");

        contactNumber1.setText("Contact Number:");

        email1.setText("Email:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(email1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(emailText1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(age1)
                        .addGap(18, 18, 18)
                        .addComponent(ageList1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(gender1)
                        .addGap(18, 18, 18)
                        .addComponent(maleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(femaleButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(nameSurname1)
                        .addGap(18, 18, 18)
                        .addComponent(nameSurnameText1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(contactNumber1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(contactNumberText1)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameSurname1)
                    .addComponent(nameSurnameText1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(age1)
                    .addComponent(ageList1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gender1)
                    .addComponent(maleButton1)
                    .addComponent(femaleButton1))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contactNumber1)
                    .addComponent(contactNumberText1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email1)
                    .addComponent(emailText1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Individual 1:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Individual 2:");

        addApplicantButton.setText("PROCEED");
        addApplicantButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addApplicantButtonActionPerformed(evt);
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
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(showName)
                    .addComponent(showType))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(typeList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(warning, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(addApplicantButton)))
                        .addGap(41, 41, 41))))
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(273, 273, 273))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(showName)
                    .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addApplicantButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(showType)
                    .addComponent(typeList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(warning, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clear()
    {
      nameText.setText("");
      nameSurnameText.setText("");
      emailText.setText("");
      contactNumberText.setText("");
      typeList.setSelectedIndex(0);
      ageList.setSelectedIndex(0);
      nameSurnameText1.setText("");
      emailText1.setText("");
      contactNumberText1.setText("");
      ageList1.setSelectedIndex(0);
      warning.setText("");
      maleButton.setSelected(true);
      maleButton1.setSelected(true);
      femaleButton.setSelected(false);
      femaleButton1.setSelected(false);
    }
    
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
        
         if(nameText.hasFocus())
        {
            switch(keyCode)
            {
                case KeyEvent.VK_DOWN: typeList.requestFocus();
                break;
                case KeyEvent.VK_UP: emailText1.requestFocus();
                break;
            }
        }else if(typeList.hasFocus())
        {
            if((typeList.getSelectedIndex() == 7 && keyCode == KeyEvent.VK_DOWN) || keyCode == KeyEvent.VK_ENTER)
                nameSurnameText1.requestFocus();
            else if((typeList.getSelectedIndex() == 0 && keyCode == KeyEvent.VK_UP) || keyCode == KeyEvent.VK_SHIFT)
                nameText.requestFocus();
        }else if(nameSurnameText1.hasFocus())
        {
            switch(keyCode)
            {
                case KeyEvent.VK_DOWN: ageList1.requestFocus();
                break;
                case KeyEvent.VK_UP: typeList.requestFocus();
                break;
                case KeyEvent.VK_RIGHT: nameSurnameText.requestFocus();
                break;
                case KeyEvent.VK_LEFT: nameSurnameText.requestFocus();
                break;
            }
        }else if(maleButton1.hasFocus())
        {
            switch(keyCode)
            {
                case KeyEvent.VK_DOWN: contactNumberText1.requestFocus();
                break;
                case KeyEvent.VK_UP: ageList1.requestFocus();
                break;
                case KeyEvent.VK_RIGHT: femaleButton1.setSelected(true); femaleButton1.requestFocus();
                break;
                case KeyEvent.VK_LEFT: femaleButton.setSelected(true); femaleButton.requestFocus();
            }
        }
        else if(femaleButton1.hasFocus())
        {
            switch(keyCode)
            {
                case KeyEvent.VK_DOWN: contactNumberText1.requestFocus();
                break;
                case KeyEvent.VK_UP: ageList1.requestFocus();
                break;
                case KeyEvent.VK_RIGHT: maleButton.setSelected(true); maleButton.requestFocus();
                break;
                case KeyEvent.VK_LEFT: maleButton1.setSelected(true); maleButton1.requestFocus();
            }
        } else if(ageList1.hasFocus())
        {
            if((ageList1.getSelectedIndex() == 49 && keyCode == KeyEvent.VK_DOWN) || keyCode == KeyEvent.VK_ENTER)
                maleButton1.requestFocus();
            else if((ageList1.getSelectedIndex() == 0 && keyCode == KeyEvent.VK_UP) || keyCode == KeyEvent.VK_SHIFT)
                nameSurnameText1.requestFocus();
            else if(keyCode == KeyEvent.VK_RIGHT || keyCode == KeyEvent.VK_LEFT)
                ageList.requestFocus();
        }else if(contactNumberText1.hasFocus())
        {
            switch(keyCode)
            {
                case KeyEvent.VK_DOWN: emailText1.requestFocus();
                break;
                case KeyEvent.VK_UP: maleButton1.requestFocus();
                break;
                case KeyEvent.VK_RIGHT: contactNumberText.requestFocus();
                break;
                case KeyEvent.VK_LEFT: contactNumberText.requestFocus();
            }
        }else if(emailText1.hasFocus())
        {
            switch(keyCode)
            {
                case KeyEvent.VK_DOWN: nameText.requestFocus();
                break;
                case KeyEvent.VK_UP: contactNumberText1.requestFocus();
                break;
                case KeyEvent.VK_RIGHT: emailText.requestFocus();
                break;
                case KeyEvent.VK_LEFT: emailText.requestFocus();
            }
        }else if(nameSurnameText.hasFocus())
        {
            switch(keyCode)
            {
                case KeyEvent.VK_DOWN: ageList.requestFocus();
                break;
                case KeyEvent.VK_UP: typeList.requestFocus();
                break;
                case KeyEvent.VK_RIGHT: nameSurnameText1.requestFocus();
                break;
                case KeyEvent.VK_LEFT: nameSurnameText1.requestFocus();
                break;
            }
        }else if(maleButton.hasFocus())
        {
            switch(keyCode)
            {
                case KeyEvent.VK_DOWN: contactNumberText.requestFocus();
                break;
                case KeyEvent.VK_UP: ageList.requestFocus();
                break;
                case KeyEvent.VK_RIGHT: femaleButton.setSelected(true); femaleButton.requestFocus();
                break;
                case KeyEvent.VK_LEFT: femaleButton1.setSelected(true); femaleButton1.requestFocus();
            }
        }
        else if(femaleButton.hasFocus())
        {
            switch(keyCode)
            {
                case KeyEvent.VK_DOWN: contactNumberText.requestFocus();
                break;
                case KeyEvent.VK_UP: ageList.requestFocus();
                break;
                case KeyEvent.VK_RIGHT: maleButton1.setSelected(true); maleButton1.requestFocus();
                break;
                case KeyEvent.VK_LEFT: maleButton.setSelected(true); maleButton.requestFocus();
            }
        } else if(ageList.hasFocus())
        {
            if((ageList.getSelectedIndex() == 49 && keyCode == KeyEvent.VK_DOWN) || keyCode == KeyEvent.VK_ENTER)
                maleButton.requestFocus();
            else if((ageList.getSelectedIndex() == 0 && keyCode == KeyEvent.VK_UP) || keyCode == KeyEvent.VK_SHIFT)
                nameSurnameText.requestFocus();
            else if(keyCode == KeyEvent.VK_RIGHT || keyCode == KeyEvent.VK_LEFT)
                ageList1.requestFocus();
        }else if(contactNumberText.hasFocus())
        {
            switch(keyCode)
            {
                case KeyEvent.VK_DOWN: emailText.requestFocus();
                break;
                case KeyEvent.VK_UP: maleButton.requestFocus();
                break;
                case KeyEvent.VK_RIGHT: contactNumberText1.requestFocus();
                break;
                case KeyEvent.VK_LEFT: contactNumberText1.requestFocus();
            }
        }else if(emailText.hasFocus())
        {
            switch(keyCode)
            {
                case KeyEvent.VK_DOWN: nameText.requestFocus();
                break;
                case KeyEvent.VK_UP: contactNumberText.requestFocus();
                break;
                case KeyEvent.VK_RIGHT: emailText1.requestFocus();
                break;
                case KeyEvent.VK_LEFT: emailText1.requestFocus();
            }
         
        }
         if(!ageList.hasFocus() && !typeList.hasFocus() && !ageList1.hasFocus() && keyCode == KeyEvent.VK_ENTER)
            addApplicantButton.doClick();
        
    }
         
    
    
    private void addApplicantButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addApplicantButtonActionPerformed
        if(nameText.getText().isEmpty() || nameSurnameText.getText().isEmpty() || emailText.getText().isEmpty() || contactNumber.getText().isEmpty() || nameSurnameText1.getText().isEmpty() || emailText1.getText().isEmpty() || contactNumber1.getText().isEmpty())
        warning.setText("Fill all fields!");
        else{
            char g, g1;
            if(maleButton.isSelected())
            g = 'M';
            else g = 'F';
            if(maleButton1.isSelected())
                g1 = 'M';
            else g1 = 'F';

           ArrayList<Individual_info> ind = new ArrayList();
           Individual_info ind1 = new Individual_info(Integer.parseInt((String) ageList.getSelectedItem()), nameSurnameText.getText(), g,contactNumberText.getText(), emailText.getText());
           ind.add(ind1);
           Individual_info ind2 = new Individual_info(Integer.parseInt((String) ageList1.getSelectedItem()), nameSurnameText1.getText(),g1 ,contactNumberText1.getText(), emailText1.getText());
           ind.add(ind2);
           
           
           pf = new StagePrepFrame(nameText.getText(), (String)typeList.getSelectedItem(), main, ind); 
           pf.setVisible(true);
           
           this.clear();
           this.dispose();
        }

    }//GEN-LAST:event_addApplicantButtonActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addApplicantButton;
    private javax.swing.JLabel age;
    private javax.swing.JLabel age1;
    private javax.swing.JComboBox<String> ageList;
    private javax.swing.JComboBox<String> ageList1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel contactNumber;
    private javax.swing.JLabel contactNumber1;
    private javax.swing.JTextField contactNumberText;
    private javax.swing.JTextField contactNumberText1;
    private javax.swing.JLabel email;
    private javax.swing.JLabel email1;
    private javax.swing.JTextField emailText;
    private javax.swing.JTextField emailText1;
    private javax.swing.JRadioButton femaleButton;
    private javax.swing.JRadioButton femaleButton1;
    private javax.swing.JLabel gender;
    private javax.swing.JLabel gender1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton maleButton;
    private javax.swing.JRadioButton maleButton1;
    private javax.swing.JLabel nameSurname;
    private javax.swing.JLabel nameSurname1;
    private javax.swing.JTextField nameSurnameText;
    private javax.swing.JTextField nameSurnameText1;
    private javax.swing.JTextField nameText;
    private javax.swing.JLabel showName;
    private javax.swing.JLabel showType;
    private javax.swing.JComboBox<String> typeList;
    private javax.swing.JLabel warning;
    // End of variables declaration//GEN-END:variables
}
