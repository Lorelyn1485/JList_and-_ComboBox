 
package sabanal_jlistandcombobox.act4;

import javax.swing.DefaultListModel;
  import javax.swing.JOptionPane;

public class Lorelyn_Act4 extends javax.swing.JFrame {

    DefaultListModel<String> MalePremiere_LModel= new DefaultListModel<>();
    DefaultListModel<String> FemalePremiere_LModel = new DefaultListModel<>();
    DefaultListModel<String> MaleDeluxe_LModel = new DefaultListModel<>();
    DefaultListModel<String> FemaleDeluxe_LModel = new DefaultListModel<>();
    
   
    public Lorelyn_Act4() {
        initComponents();
          lname.setText(null);
        fname.setText(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        CBgender = new javax.swing.JComboBox<>();
        CBroomtype = new javax.swing.JComboBox<>();
        fname = new javax.swing.JTextField();
        lname = new javax.swing.JTextField();
        AddUser = new javax.swing.JButton();
        EditUser = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Premfemale = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        Premmale = new javax.swing.JList<>();
        delpremmale = new javax.swing.JButton();
        delpremfemale = new javax.swing.JButton();
        clrpremmale = new javax.swing.JButton();
        clrpremfemale = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        Delfemale = new javax.swing.JList<>();
        jScrollPane8 = new javax.swing.JScrollPane();
        Delmale = new javax.swing.JList<>();
        deldeluxemale2 = new javax.swing.JButton();
        deldeluxefemale2 = new javax.swing.JButton();
        clrdeluxemale2 = new javax.swing.JButton();
        clrdeluxefemale2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel.setBackground(new java.awt.Color(173, 155, 155));
        jPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Costumer Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Berlin Sans FB Demi", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Firstname");

        jLabel2.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Lastname");

        jLabel3.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Room Type");

        jLabel4.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Gender");

        CBgender.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        CBgender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Please Select Gender", "Male", "Female" }));
        CBgender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBgenderActionPerformed(evt);
            }
        });

        CBroomtype.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        CBroomtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Room Type", "Premiere Room", "Deluxe Room" }));

        fname.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameActionPerformed(evt);
            }
        });

        lname.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        lname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnameActionPerformed(evt);
            }
        });

        AddUser.setBackground(new java.awt.Color(193, 166, 166));
        AddUser.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        AddUser.setText("Add User");
        AddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddUserActionPerformed(evt);
            }
        });

        EditUser.setBackground(new java.awt.Color(191, 166, 166));
        EditUser.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        EditUser.setText("Edit User");
        EditUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(AddUser)
                .addGap(50, 50, 50)
                .addComponent(EditUser)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(0, 23, Short.MAX_VALUE)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CBroomtype, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CBgender, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lname, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lname, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CBgender, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CBroomtype, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddUser, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EditUser, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );

        jPanel1.add(jPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 40, 370, 670));

        jPanel2.setBackground(new java.awt.Color(174, 156, 156));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PREMIERE LIST", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Berlin Sans FB Demi", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        Premfemale.setBackground(new java.awt.Color(252, 239, 239));
        Premfemale.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder(null, "Female", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14)), null)); // NOI18N
        Premfemale.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        Premfemale.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(Premfemale);

        Premmale.setBackground(new java.awt.Color(253, 240, 240));
        Premmale.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder(null, "Male", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14)), null)); // NOI18N
        Premmale.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        Premmale.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(Premmale);

        delpremmale.setBackground(new java.awt.Color(160, 128, 128));
        delpremmale.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        delpremmale.setForeground(new java.awt.Color(255, 255, 255));
        delpremmale.setText("DELETE USER");
        delpremmale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delpremmaleActionPerformed(evt);
            }
        });

        delpremfemale.setBackground(new java.awt.Color(160, 122, 122));
        delpremfemale.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        delpremfemale.setForeground(new java.awt.Color(255, 255, 255));
        delpremfemale.setText("DELETE USER");
        delpremfemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delpremfemaleActionPerformed(evt);
            }
        });

        clrpremmale.setBackground(new java.awt.Color(153, 0, 0));
        clrpremmale.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        clrpremmale.setForeground(new java.awt.Color(255, 255, 255));
        clrpremmale.setText("CLEAR LIST");
        clrpremmale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clrpremmaleActionPerformed(evt);
            }
        });

        clrpremfemale.setBackground(new java.awt.Color(153, 0, 0));
        clrpremfemale.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        clrpremfemale.setForeground(new java.awt.Color(255, 255, 255));
        clrpremfemale.setText("CLEAR LIST");
        clrpremfemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clrpremfemaleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(delpremfemale)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(clrpremfemale, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(delpremmale)
                .addGap(18, 18, 18)
                .addComponent(clrpremmale, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(delpremmale)
                    .addComponent(clrpremmale))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(delpremfemale)
                    .addComponent(clrpremfemale))
                .addGap(311, 311, 311))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, -1, 720));

        jPanel3.setBackground(new java.awt.Color(173, 156, 156));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DELUXE USERS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Berlin Sans FB Demi", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        Delfemale.setBackground(new java.awt.Color(252, 239, 239));
        Delfemale.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder(null, "Female", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14)), null)); // NOI18N
        Delfemale.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        Delfemale.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane7.setViewportView(Delfemale);

        Delmale.setBackground(new java.awt.Color(252, 239, 239));
        Delmale.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder(null, "Male", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14)), null)); // NOI18N
        Delmale.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        Delmale.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane8.setViewportView(Delmale);

        deldeluxemale2.setBackground(new java.awt.Color(160, 122, 122));
        deldeluxemale2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        deldeluxemale2.setForeground(new java.awt.Color(255, 255, 255));
        deldeluxemale2.setText("DELETE USER");
        deldeluxemale2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deldeluxemale2ActionPerformed(evt);
            }
        });

        deldeluxefemale2.setBackground(new java.awt.Color(160, 122, 122));
        deldeluxefemale2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        deldeluxefemale2.setForeground(new java.awt.Color(255, 255, 255));
        deldeluxefemale2.setText("DELETE USER");
        deldeluxefemale2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deldeluxefemale2ActionPerformed(evt);
            }
        });

        clrdeluxemale2.setBackground(new java.awt.Color(153, 0, 0));
        clrdeluxemale2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        clrdeluxemale2.setForeground(new java.awt.Color(255, 255, 255));
        clrdeluxemale2.setText("CLEAR LIST");
        clrdeluxemale2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clrdeluxemale2ActionPerformed(evt);
            }
        });

        clrdeluxefemale2.setBackground(new java.awt.Color(153, 0, 0));
        clrdeluxefemale2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        clrdeluxefemale2.setForeground(new java.awt.Color(255, 255, 255));
        clrdeluxefemale2.setText("CLEAR LIST");
        clrdeluxefemale2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clrdeluxefemale2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane8)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(deldeluxemale2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(clrdeluxemale2)
                .addGap(26, 26, 26))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(deldeluxefemale2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(clrdeluxefemale2)
                .addGap(25, 25, 25))
            .addComponent(jScrollPane7)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deldeluxemale2)
                    .addComponent(clrdeluxemale2))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(clrdeluxefemale2)
                    .addComponent(deldeluxefemale2)))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(772, 21, 340, 720));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sabanal_jlistandcombobox/act4/pic 4.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 770));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameActionPerformed
     
        
    }//GEN-LAST:event_fnameActionPerformed

    private void lnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnameActionPerformed
        
       
    }//GEN-LAST:event_lnameActionPerformed

    private void AddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddUserActionPerformed

        int selectedGenderIndex = CBgender.getSelectedIndex();
        int selectedRoomIndex = CBroomtype.getSelectedIndex();
        String Firstname = lname.getText();
        String Lastname = fname.getText();
        

        String fullName = Firstname + " " + Lastname;

        if (selectedGenderIndex == 1 && selectedRoomIndex == 1) {

            MaleDeluxe_LModel.addElement(fullName);
            Premmale.setModel(MaleDeluxe_LModel);
        } else if (selectedGenderIndex == 2 && selectedRoomIndex == 1) {

           FemaleDeluxe_LModel .addElement(fullName);
            Premfemale.setModel(FemaleDeluxe_LModel );
        } else if (selectedGenderIndex == 1 && selectedRoomIndex == 2) {

           MalePremiere_LModel.addElement(fullName);
            Delmale.setModel(MalePremiere_LModel);
        } else if (selectedGenderIndex == 2 && selectedRoomIndex == 2) {

            FemalePremiere_LModel .addElement(fullName);
            Delfemale.setModel(FemalePremiere_LModel );
        }
        
         if(fname.getText().isEmpty() || !fname.getText().matches("[ a-zA-Z]+")){
            JOptionPane.showMessageDialog(rootPane, "Invalid Input!\nPlease Enter A Proper First Name.", null, JOptionPane.ERROR_MESSAGE);
            return;
              }
        if(lname.getText().isEmpty() || !lname.getText().matches("[ a-zA-Z]+")){
            JOptionPane.showMessageDialog(rootPane, "Invalid Input!\nPlease Enter A Proper Last Name.", null, HEIGHT);
            return;
               }
        if(CBgender.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(rootPane, "please select in gender.", null, HEIGHT);
            return;
        }
        if(CBroomtype.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(rootPane, "please select a roomtype.", null, HEIGHT);
        }
        fname.setText("");
        lname.setText("");
       CBgender.setSelectedIndex(0);
       CBroomtype.setSelectedIndex(0);
    }//GEN-LAST:event_AddUserActionPerformed

    private void EditUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditUserActionPerformed
        
        int ListDeluxMle = Premmale.getSelectedIndex();
        int ListDeluxFmle = Premfemale.getSelectedIndex();
        int ListPremMle = Delmale.getSelectedIndex();
        int ListPremFmle = Delfemale.getSelectedIndex();

        if ( ListPremMle  >= 0) {

            String selectedMalePrem = MalePremiere_LModel.getElementAt( ListPremMle );

            String editedItemMalePrem = JOptionPane.showInputDialog(this, "Edit item (Male Deluxe):", selectedMalePrem);

            if (editedItemMalePrem != null) {

               MalePremiere_LModel.setElementAt(editedItemMalePrem,  ListPremMle );
                Delmale.setModel(MalePremiere_LModel);
            }
        }

        else if(ListPremFmle  >= 0) {
            String selectedFemalePrem = FemalePremiere_LModel .getElementAt(ListPremFmle);
            String editedItemFemalePrem = JOptionPane.showInputDialog(this, "Edit item (Female Deluxe):", selectedFemalePrem);

            if(editedItemFemalePrem != null) {

              FemalePremiere_LModel .setElementAt(editedItemFemalePrem, ListPremFmle);
                Delfemale.setModel(FemalePremiere_LModel );
            }
        }

        else if(ListDeluxMle >= 0){
            String selectedMaleDel = MaleDeluxe_LModel.getElementAt(ListDeluxMle);
            String editedItemMaleDel = JOptionPane.showInputDialog(this, "Edit item (Male Premiere):", selectedMaleDel);

            if (editedItemMaleDel != null) {

               MaleDeluxe_LModel.setElementAt(editedItemMaleDel, ListDeluxMle);
                Premmale.setModel(MaleDeluxe_LModel);
            }
        }

        else if(ListDeluxFmle >= 0){
            String selectedFemaleDel = FemaleDeluxe_LModel .getElementAt(ListDeluxFmle);
            String editedItemFemaleDel = JOptionPane.showInputDialog(this, "Edit item (Female Premiere):", selectedFemaleDel);

            if (editedItemFemaleDel != null) {

                FemaleDeluxe_LModel .setElementAt(editedItemFemaleDel, ListDeluxFmle);
                Premfemale.setModel(FemaleDeluxe_LModel );
            }
        }
        else {

            JOptionPane.showMessageDialog(this, "Please select an item to edit.");

        }
    }//GEN-LAST:event_EditUserActionPerformed

    private void delpremmaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delpremmaleActionPerformed
        int index = Premmale.getSelectedIndex();
        int size = MaleDeluxe_LModel.getSize();

        if (index >= 0 && index < size) {
            int reply = JOptionPane.showConfirmDialog(null, "Delete User?", "Delete", JOptionPane.YES_NO_OPTION);
            if (reply == JOptionPane.YES_OPTION) {
                MaleDeluxe_LModel.removeElementAt(index);
                JOptionPane.showMessageDialog(null, "User deleted");
            }
        }
    }//GEN-LAST:event_delpremmaleActionPerformed

    private void delpremfemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delpremfemaleActionPerformed
        int index = Premfemale.getSelectedIndex();
        int size = FemaleDeluxe_LModel .getSize();

        if (index >= 0 && index < size) {
            int reply = JOptionPane.showConfirmDialog(null, "Delete User?", "Delete", JOptionPane.YES_NO_OPTION);
            if (reply == JOptionPane.YES_OPTION) {
               FemaleDeluxe_LModel .removeElementAt(index);
                JOptionPane.showMessageDialog(null, "User deleted");
            }
        }
    }//GEN-LAST:event_delpremfemaleActionPerformed

    private void clrpremmaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clrpremmaleActionPerformed
        MaleDeluxe_LModel.removeAllElements();
    }//GEN-LAST:event_clrpremmaleActionPerformed

    private void clrpremfemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clrpremfemaleActionPerformed
       FemaleDeluxe_LModel .removeAllElements();
    }//GEN-LAST:event_clrpremfemaleActionPerformed

    private void deldeluxemale2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deldeluxemale2ActionPerformed
        int index = Delmale.getSelectedIndex();
        int size = MalePremiere_LModel.getSize();

        if (index >= 0 && index < size) {
            int reply = JOptionPane.showConfirmDialog(null, "Delete User?", "Delete", JOptionPane.YES_NO_OPTION);
            if (reply == JOptionPane.YES_OPTION) {
                MalePremiere_LModel.removeElementAt(index);
                JOptionPane.showMessageDialog(null, "User deleted");
            }
        }
    }//GEN-LAST:event_deldeluxemale2ActionPerformed

    private void deldeluxefemale2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deldeluxefemale2ActionPerformed
        int index = Delfemale.getSelectedIndex();
        int size = FemalePremiere_LModel .getSize();

        if (index >= 0 && index < size) {
            int reply = JOptionPane.showConfirmDialog(null, "Delete User", "Delete", JOptionPane.YES_NO_OPTION);
            if (reply == JOptionPane.YES_OPTION) {
               FemalePremiere_LModel .removeElementAt(index);
                JOptionPane.showMessageDialog(null, "User deleted");
            }
        }
    }//GEN-LAST:event_deldeluxefemale2ActionPerformed

    private void clrdeluxemale2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clrdeluxemale2ActionPerformed
        MalePremiere_LModel.removeAllElements();
    }//GEN-LAST:event_clrdeluxemale2ActionPerformed

    private void clrdeluxefemale2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clrdeluxefemale2ActionPerformed
        FemalePremiere_LModel.removeAllElements();
    }//GEN-LAST:event_clrdeluxefemale2ActionPerformed

    private void CBgenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBgenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBgenderActionPerformed

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
            java.util.logging.Logger.getLogger(Lorelyn_Act4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lorelyn_Act4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lorelyn_Act4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lorelyn_Act4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lorelyn_Act4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddUser;
    private javax.swing.JComboBox<String> CBgender;
    private javax.swing.JComboBox<String> CBroomtype;
    private javax.swing.JList<String> Delfemale;
    private javax.swing.JList<String> Delmale;
    private javax.swing.JButton EditUser;
    private javax.swing.JList<String> Premfemale;
    private javax.swing.JList<String> Premmale;
    private javax.swing.JButton clrdeluxefemale2;
    private javax.swing.JButton clrdeluxemale2;
    private javax.swing.JButton clrpremfemale;
    private javax.swing.JButton clrpremmale;
    private javax.swing.JButton deldeluxefemale2;
    private javax.swing.JButton deldeluxemale2;
    private javax.swing.JButton delpremfemale;
    private javax.swing.JButton delpremmale;
    private javax.swing.JTextField fname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTextField lname;
    // End of variables declaration//GEN-END:variables
}
