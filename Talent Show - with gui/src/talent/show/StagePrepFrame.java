/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package talent.show;


import java.util.ArrayList;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JCheckBox;

/**
 *
 * @author HP
 */
public class StagePrepFrame extends javax.swing.JFrame implements KeyListener{

    MainFrame main;
    String name;
    String type;
    ArrayList<Individual_info> ind = new ArrayList();
    //ArrayList<javax.swing.JCheckBox> check_list;
    JCheckBox[] check_list = new JCheckBox[8];
    
    public StagePrepFrame(String name, String type, MainFrame mf, ArrayList<Individual_info> ind) {
        initComponents();
        main = mf;
        this.getContentPane().setBackground(main.c);
        check_list[0] = (lights);
        check_list[1] = (music);
        check_list[2] = (audience_interaction);
        check_list[3] = (fire);
        check_list[4] = (sharp);
        check_list[5] = (basic);
        check_list[6] = (special);
        check_list[7] = (other);
        this.name = name;
        this.type = type;
        //this.ind = ind;
        for(Individual_info temp : ind)
            this.ind.add(temp);
        for(int i = 0; i < 8; i++)
            check_list[i].addKeyListener(this);
        otherText.addKeyListener(this);
        add.addKeyListener(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        add = new javax.swing.JButton();
        warning = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        otherText = new javax.swing.JTextField();
        other = new javax.swing.JCheckBox();
        special = new javax.swing.JCheckBox();
        basic = new javax.swing.JCheckBox();
        sharp = new javax.swing.JCheckBox();
        fire = new javax.swing.JCheckBox();
        audience_interaction = new javax.swing.JCheckBox();
        music = new javax.swing.JCheckBox();
        lights = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Stage Prep");

        add.setText("ADD APPLICANT");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        warning.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        warning.setForeground(new java.awt.Color(227, 33, 33));
        warning.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jPanel1.setBackground(new java.awt.Color(221, 231, 199));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(152, 201, 163), 3, true));

        other.setBackground(new java.awt.Color(221, 231, 199));
        other.setText("Other:");

        special.setBackground(new java.awt.Color(221, 231, 199));
        special.setText("Special construction");

        basic.setBackground(new java.awt.Color(221, 231, 199));
        basic.setText("Basic decoration");

        sharp.setBackground(new java.awt.Color(221, 231, 199));
        sharp.setText("Sharp tools");

        fire.setBackground(new java.awt.Color(221, 231, 199));
        fire.setText("Fire making tools and/or flammable materials");

        audience_interaction.setBackground(new java.awt.Color(221, 231, 199));
        audience_interaction.setText("Audience interaction");

        music.setBackground(new java.awt.Color(221, 231, 199));
        music.setText("Music");

        lights.setBackground(new java.awt.Color(221, 231, 199));
        lights.setText("Lights");

        jLabel1.setText("Select items that are included in the show as specified by the applicant ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(other)
                                .addGap(18, 18, 18)
                                .addComponent(otherText, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(special)
                            .addComponent(basic)
                            .addComponent(sharp)
                            .addComponent(fire)
                            .addComponent(audience_interaction)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(music)
                                .addComponent(lights))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel1)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(lights)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(music)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(audience_interaction)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fire)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sharp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(basic)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(special)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(otherText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(other))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jLabel1.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(warning, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(201, 201, 201))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(warning, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        
     
            if(check_list[0].hasFocus())
            {
                switch(keyCode)
                {
                    case KeyEvent.VK_UP: add.requestFocus();
                    break;
                    case KeyEvent.VK_DOWN: check_list[1].requestFocus();
                    break;
                    case KeyEvent.VK_ENTER: if(check_list[0].isSelected())check_list[0].setSelected(false);else check_list[0].setSelected(true);
                    break;
                            
                }
            }else if(otherText.hasFocus())
            {
                switch(keyCode)
                {
                    case KeyEvent.VK_UP: check_list[6].requestFocus();
                    break;
                    case KeyEvent.VK_DOWN: add.requestFocus();
                    break;
                    case KeyEvent.VK_ENTER: if(check_list[7].isSelected())check_list[7].setSelected(false);else check_list[7].setSelected(true);
                    break;
                        
                }
            }else if(add.hasFocus())
            {
                 switch(keyCode)
                {
                    case KeyEvent.VK_UP: otherText.requestFocus();
                    break;
                    case KeyEvent.VK_DOWN: check_list[0].requestFocus();
                    break;
                    case KeyEvent.VK_ENTER: add.doClick();
                    break;
    
                }
            }else{
        for(int i = 1; i < 7; i++)
        {
            if(check_list[i].hasFocus())
            {
                switch(keyCode){
                case KeyEvent.VK_UP: check_list[i-1].requestFocus();
                    break;
                    case KeyEvent.VK_DOWN: if(i == 6)otherText.requestFocus();else check_list[i+1].requestFocus();
                    break;
                    case KeyEvent.VK_ENTER: if(check_list[i].isSelected())check_list[i].setSelected(false);else check_list[i].setSelected(true);
                    break;
                }
            }
        }
    }
    }
    
    
    private void clear()
    {
        audience_interaction.setSelected(false);
        basic.setSelected(false);
        fire.setSelected(false);
        lights.setSelected(false);
        music.setSelected(false);
        other.setSelected(false);
        sharp.setSelected(false);
        special.setSelected(false);
        otherText.setText("");
        warning.setText("");
    }
    
    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed

        ArrayList<String> temp_list = new ArrayList();
        if(other.isSelected() && otherText.getText().equals(""))
       {
           warning.setText("Enter specification after selecting Other");
           other.setSelected(false);
       }else {
        for(int i = 0; i < 7; i++)
        {
            if(check_list[i].isSelected())
                temp_list.add(check_list[i].getText());
        }
        if(other.isSelected())
            temp_list.add(otherText.getText());
       
       String temp;
       if(temp_list.isEmpty())
           temp = "[No stage preparation specification]";
       else{
           temp = "[Stage preparation specification]:";
           for(int i = 0; i < temp_list.size(); i++)
               temp += "\n+ " + temp_list.get(i);
       }temp += "\n~~~~~~~~~~~~~~~\n[Individuals]:";
       ApplicantSys.addApplicant(name, type, ind, temp);
       this.clear();
       main.fillComboBox();
       main.clear();
       main.setVisible(true);
       this.dispose();
       }
        
    }//GEN-LAST:event_addActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JCheckBox audience_interaction;
    private javax.swing.JCheckBox basic;
    private javax.swing.JCheckBox fire;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JCheckBox lights;
    private javax.swing.JCheckBox music;
    private javax.swing.JCheckBox other;
    private javax.swing.JTextField otherText;
    private javax.swing.JCheckBox sharp;
    private javax.swing.JCheckBox special;
    private javax.swing.JLabel warning;
    // End of variables declaration//GEN-END:variables
}
