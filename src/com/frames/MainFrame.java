package com.frames;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.sql.*;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

public class MainFrame extends javax.swing.JFrame {

    private final String URL = "jdbc:mysql://localhost:3306/Instructor_Management_System";
    private final String USER = "user";
    private final String PASSWORD = "user";

    public MainFrame() {
        initComponents();
        viewInstructorRecords(viewRecordsTable);
        getInstructorCount();
        displayLatestInstructor(latestRecordAddedTextArea);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rootPanel = new javax.swing.JPanel();
        navPanel = new javax.swing.JPanel();
        dashboardButton = new javax.swing.JButton();
        viewButton = new javax.swing.JButton();
        settingsButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        editButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        contentPanel = new javax.swing.JPanel();
        dashBoardPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        totalInstructorCountLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        totalViewMoreButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        latestRecordAddedTextArea = new javax.swing.JTextArea();
        jLabel15 = new javax.swing.JLabel();
        totalViewMoreButton1 = new javax.swing.JButton();
        addNewRecordPanel = new javax.swing.JPanel();
        fullNameField = new javax.swing.JTextField();
        phoneNumberField = new javax.swing.JTextField();
        emailField = new javax.swing.JTextField();
        expertiseField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        bioField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        viewRecordPanel = new javax.swing.JPanel();
        viewRecordsScrollPane = new javax.swing.JScrollPane();
        viewRecordsTable = new javax.swing.JTable();
        viewRecordsButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        instructorsDetailsTextArea = new javax.swing.JTextArea();
        jButton6 = new javax.swing.JButton();
        editPanel = new javax.swing.JPanel();
        editFullNameField = new javax.swing.JTextField();
        editPhoneNumberField = new javax.swing.JTextField();
        editEmailField = new javax.swing.JTextField();
        editExpertiseField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        editBioField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        searchField = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        saveEditDetailsButton = new javax.swing.JButton();
        editIDField = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        settingsPanel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Instructor Management System - Main Frame");
        setResizable(false);

        rootPanel.setLayout(new java.awt.BorderLayout());

        navPanel.setBackground(new java.awt.Color(204, 255, 204));
        navPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        navPanel.setPreferredSize(new java.awt.Dimension(130, 488));

        dashboardButton.setText("Dash Board");
        dashboardButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dashboardButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashboardButtonMouseClicked(evt);
            }
        });

        viewButton.setText("Inspect");
        viewButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewButton.setPreferredSize(new java.awt.Dimension(95, 25));
        viewButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewButtonMouseClicked(evt);
            }
        });

        settingsButton.setText("Settings");
        settingsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        settingsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                settingsButtonMouseClicked(evt);
            }
        });

        logoutButton.setText("Log out");
        logoutButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutButtonMouseClicked(evt);
            }
        });

        jLabel1.setText("IMS");

        editButton.setText("Modify");
        editButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editButtonMouseClicked(evt);
            }
        });

        exitButton.setText("Exit");
        exitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitButtonMouseClicked(evt);
            }
        });

        addButton.setText("Create");
        addButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout navPanelLayout = new javax.swing.GroupLayout(navPanel);
        navPanel.setLayout(navPanelLayout);
        navPanelLayout.setHorizontalGroup(
            navPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(navPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(navPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(logoutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(settingsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dashboardButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        navPanelLayout.setVerticalGroup(
            navPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dashboardButton)
                .addGap(51, 51, 51)
                .addComponent(addButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(viewButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(editButton)
                .addGap(18, 18, 18)
                .addComponent(settingsButton)
                .addGap(18, 18, 18)
                .addComponent(logoutButton)
                .addGap(18, 18, 18)
                .addComponent(exitButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        rootPanel.add(navPanel, java.awt.BorderLayout.WEST);

        contentPanel.setBackground(new java.awt.Color(102, 102, 102));
        contentPanel.setPreferredSize(new java.awt.Dimension(715, 488));
        contentPanel.setLayout(new java.awt.CardLayout());

        dashBoardPanel.setBackground(new java.awt.Color(153, 255, 204));
        dashBoardPanel.setPreferredSize(new java.awt.Dimension(715, 488));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        totalInstructorCountLabel.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        totalInstructorCountLabel.setText("0");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Total Instructor Count");

        totalViewMoreButton.setText("View More");
        totalViewMoreButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        totalViewMoreButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                totalViewMoreButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(47, 47, 47))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(totalInstructorCountLabel)
                        .addGap(156, 156, 156))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(totalViewMoreButton)
                        .addGap(127, 127, 127))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel2)
                .addGap(29, 29, 29)
                .addComponent(totalInstructorCountLabel)
                .addGap(35, 35, 35)
                .addComponent(totalViewMoreButton)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        latestRecordAddedTextArea.setColumns(20);
        latestRecordAddedTextArea.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        latestRecordAddedTextArea.setRows(5);
        jScrollPane2.setViewportView(latestRecordAddedTextArea);

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel15.setText("Latest Record Added");

        totalViewMoreButton1.setText("View More");
        totalViewMoreButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        totalViewMoreButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                totalViewMoreButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 36, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(47, 47, 47))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(totalViewMoreButton1)
                                .addGap(114, 114, 114))))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel15)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(totalViewMoreButton1)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout dashBoardPanelLayout = new javax.swing.GroupLayout(dashBoardPanel);
        dashBoardPanel.setLayout(dashBoardPanelLayout);
        dashBoardPanelLayout.setHorizontalGroup(
            dashBoardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashBoardPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        dashBoardPanelLayout.setVerticalGroup(
            dashBoardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashBoardPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dashBoardPanelLayout.createSequentialGroup()
                .addContainerGap(141, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        contentPanel.add(dashBoardPanel, "card2");

        addNewRecordPanel.setBackground(new java.awt.Color(153, 255, 204));

        jLabel3.setText("Full Name");

        jLabel4.setText("Phone Number");

        jLabel5.setText("Email");

        jLabel6.setText("Expertise");

        jLabel7.setText("Bio");

        jButton5.setText("Add");
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout addNewRecordPanelLayout = new javax.swing.GroupLayout(addNewRecordPanel);
        addNewRecordPanel.setLayout(addNewRecordPanelLayout);
        addNewRecordPanelLayout.setHorizontalGroup(
            addNewRecordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addNewRecordPanelLayout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addGroup(addNewRecordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(addNewRecordPanelLayout.createSequentialGroup()
                        .addGroup(addNewRecordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(addNewRecordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bioField, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                            .addComponent(fullNameField)
                            .addComponent(phoneNumberField)
                            .addComponent(emailField)
                            .addComponent(expertiseField))))
                .addContainerGap(160, Short.MAX_VALUE))
        );
        addNewRecordPanelLayout.setVerticalGroup(
            addNewRecordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addNewRecordPanelLayout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addGroup(addNewRecordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fullNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addNewRecordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addNewRecordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addNewRecordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(expertiseField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addNewRecordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bioField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(26, 26, 26)
                .addComponent(jButton5)
                .addContainerGap(176, Short.MAX_VALUE))
        );

        contentPanel.add(addNewRecordPanel, "card3");

        viewRecordPanel.setBackground(new java.awt.Color(153, 255, 204));

        viewRecordsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Instructor ID", "Full Name", "Email", "Date Added"
            }
        ));
        viewRecordsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewRecordsTableMouseClicked(evt);
            }
        });
        viewRecordsScrollPane.setViewportView(viewRecordsTable);

        viewRecordsButton.setText("View Records");
        viewRecordsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewRecordsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewRecordsButtonMouseClicked(evt);
            }
        });

        instructorsDetailsTextArea.setColumns(20);
        instructorsDetailsTextArea.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        instructorsDetailsTextArea.setRows(5);
        instructorsDetailsTextArea.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        instructorsDetailsTextArea.setEnabled(false);
        jScrollPane1.setViewportView(instructorsDetailsTextArea);

        jButton6.setText("Delete");
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout viewRecordPanelLayout = new javax.swing.GroupLayout(viewRecordPanel);
        viewRecordPanel.setLayout(viewRecordPanelLayout);
        viewRecordPanelLayout.setHorizontalGroup(
            viewRecordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(viewRecordsScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 715, Short.MAX_VALUE)
            .addGroup(viewRecordPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(viewRecordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(viewRecordsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        viewRecordPanelLayout.setVerticalGroup(
            viewRecordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewRecordPanelLayout.createSequentialGroup()
                .addComponent(viewRecordsScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(viewRecordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(viewRecordPanelLayout.createSequentialGroup()
                        .addComponent(viewRecordsButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(viewRecordPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        contentPanel.add(viewRecordPanel, "card4");

        editPanel.setBackground(new java.awt.Color(153, 255, 204));

        jLabel8.setText("Full Name");

        jLabel9.setText("Phone Number");

        jLabel10.setText("Email");

        jLabel11.setText("Expertise");

        jLabel12.setText("Bio");

        jButton7.setText("Search");
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });

        jLabel13.setText("Search By ID to edit details");

        saveEditDetailsButton.setText("Save");
        saveEditDetailsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        saveEditDetailsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveEditDetailsButtonMouseClicked(evt);
            }
        });

        editIDField.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        editIDField.setEnabled(false);

        jLabel14.setText("ID");

        javax.swing.GroupLayout editPanelLayout = new javax.swing.GroupLayout(editPanel);
        editPanel.setLayout(editPanelLayout);
        editPanelLayout.setHorizontalGroup(
            editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editPanelLayout.createSequentialGroup()
                .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editPanelLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton7)
                            .addComponent(jLabel13)
                            .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(editPanelLayout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(editBioField)
                            .addComponent(editFullNameField)
                            .addComponent(editPhoneNumberField)
                            .addComponent(editEmailField)
                            .addComponent(editExpertiseField, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(saveEditDetailsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editIDField))))
                .addContainerGap(178, Short.MAX_VALUE))
        );
        editPanelLayout.setVerticalGroup(
            editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7)
                .addGap(49, 49, 49)
                .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editIDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editFullNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editPhoneNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editEmailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editExpertiseField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editBioField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saveEditDetailsButton)
                .addContainerGap(117, Short.MAX_VALUE))
        );

        contentPanel.add(editPanel, "card6");

        settingsPanel.setBackground(new java.awt.Color(153, 255, 204));

        jButton1.setText("View Terms & Conditions");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jButton2.setText("Language & Preferences");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jButton3.setText("Themes");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jButton4.setText("System Settings");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout settingsPanelLayout = new javax.swing.GroupLayout(settingsPanel);
        settingsPanel.setLayout(settingsPanelLayout);
        settingsPanelLayout.setHorizontalGroup(
            settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, settingsPanelLayout.createSequentialGroup()
                .addContainerGap(270, Short.MAX_VALUE)
                .addGroup(settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(278, 278, 278))
        );
        settingsPanelLayout.setVerticalGroup(
            settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingsPanelLayout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addContainerGap(231, Short.MAX_VALUE))
        );

        contentPanel.add(settingsPanel, "card5");

        rootPanel.add(contentPanel, java.awt.BorderLayout.EAST);

        getContentPane().add(rootPanel, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void dashboardButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardButtonMouseClicked
        swapPanels(dashBoardPanel);
    }//GEN-LAST:event_dashboardButtonMouseClicked

    private void addButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButtonMouseClicked
        swapPanels(addNewRecordPanel);
    }//GEN-LAST:event_addButtonMouseClicked

    private void viewButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewButtonMouseClicked
        swapPanels(viewRecordPanel);
    }//GEN-LAST:event_viewButtonMouseClicked

    private void settingsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsButtonMouseClicked
        swapPanels(settingsPanel);
    }//GEN-LAST:event_settingsButtonMouseClicked

    private void logoutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutButtonMouseClicked
        int option = JOptionPane.showConfirmDialog(null, "Are you sure you want to logout?", "Logout Confirmation", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            System.out.println("Logging out...");
            new Home().setVisible(true);
            this.dispose();
        } else {
            System.out.println("Logout canceled.");
        }
    }//GEN-LAST:event_logoutButtonMouseClicked

    private void exitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseClicked
        int option = JOptionPane.showConfirmDialog(null, "Are you sure you want to Exit?", "Exit Confirmation", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            System.out.println("Exiting...");
            this.dispose();
        } else {
            System.out.println("Exit canceled.");
        }
    }//GEN-LAST:event_exitButtonMouseClicked

    private void editButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editButtonMouseClicked
        swapPanels(editPanel);
    }//GEN-LAST:event_editButtonMouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        addInstructorRecord(fullNameField.getText(), phoneNumberField.getText(), emailField.getText(), expertiseField.getText(), bioField.getText());
    }//GEN-LAST:event_jButton5MouseClicked

    private void viewRecordsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewRecordsButtonMouseClicked
        viewInstructorRecords(viewRecordsTable);
    }//GEN-LAST:event_viewRecordsButtonMouseClicked

    private void viewRecordsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewRecordsTableMouseClicked
        populateInstructorDetailsTextArea();
    }//GEN-LAST:event_viewRecordsTableMouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        deleteInstructorData();
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        try {
            int id = Integer.parseInt(searchField.getText());
            searchInstructorByIdAndGetDetails(id + "");
        } catch (NumberFormatException e) {
            System.out.println("");
            JOptionPane.showMessageDialog(this, "Invalid ID provided. Please do not include special characters.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jButton7MouseClicked

    private void saveEditDetailsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveEditDetailsButtonMouseClicked
        updateInstructorDetails(editIDField.getText());
        editIDField.setText("");
        editBioField.setText("");
        editEmailField.setText("");
        editExpertiseField.setText("");
        editFullNameField.setText("");
        editPhoneNumberField.setText("");
        searchField.setText("");
    }//GEN-LAST:event_saveEditDetailsButtonMouseClicked

    private void totalViewMoreButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_totalViewMoreButtonMouseClicked
        swapPanels(viewRecordPanel);
    }//GEN-LAST:event_totalViewMoreButtonMouseClicked

    private void totalViewMoreButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_totalViewMoreButton1MouseClicked
        swapPanels(viewRecordPanel);
    }//GEN-LAST:event_totalViewMoreButton1MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JPanel addNewRecordPanel;
    private javax.swing.JTextField bioField;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JPanel dashBoardPanel;
    private javax.swing.JButton dashboardButton;
    private javax.swing.JTextField editBioField;
    private javax.swing.JButton editButton;
    private javax.swing.JTextField editEmailField;
    private javax.swing.JTextField editExpertiseField;
    private javax.swing.JTextField editFullNameField;
    private javax.swing.JTextField editIDField;
    private javax.swing.JPanel editPanel;
    private javax.swing.JTextField editPhoneNumberField;
    private javax.swing.JTextField emailField;
    private javax.swing.JButton exitButton;
    private javax.swing.JTextField expertiseField;
    private javax.swing.JTextField fullNameField;
    private javax.swing.JTextArea instructorsDetailsTextArea;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea latestRecordAddedTextArea;
    private javax.swing.JButton logoutButton;
    private javax.swing.JPanel navPanel;
    private javax.swing.JTextField phoneNumberField;
    private javax.swing.JPanel rootPanel;
    private javax.swing.JButton saveEditDetailsButton;
    private javax.swing.JTextField searchField;
    private javax.swing.JButton settingsButton;
    private javax.swing.JPanel settingsPanel;
    private javax.swing.JLabel totalInstructorCountLabel;
    private javax.swing.JButton totalViewMoreButton;
    private javax.swing.JButton totalViewMoreButton1;
    private javax.swing.JButton viewButton;
    private javax.swing.JPanel viewRecordPanel;
    private javax.swing.JButton viewRecordsButton;
    private javax.swing.JScrollPane viewRecordsScrollPane;
    private javax.swing.JTable viewRecordsTable;
    // End of variables declaration//GEN-END:variables
    private void swapPanels(JPanel panel) {
        dashBoardPanel.setVisible(false);
        addNewRecordPanel.setVisible(false);
        viewRecordPanel.setVisible(false);
        editPanel.setVisible(false);
        settingsPanel.setVisible(false);
        panel.setVisible(true);
    }

    public void addInstructorRecord(String fullName, String phoneNumber, String email, String expertise, String bio) {
        // Check for empty fields
        if (fullName.isBlank() || email.isBlank() || phoneNumber.isBlank() || expertise.isBlank() || bio.isBlank()) {
            JOptionPane.showMessageDialog(null, "Please do not leave blank fields.", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println("Please do not leave blank fields.");
            return;
        }

        Connection connection = null;
        try {
            // Establish connection to the database
            connection = DriverManager.getConnection(URL, USER, PASSWORD);

            // SQL query to insert a new instructor record without updated_at column
            String sql = "INSERT INTO instructors (fullName, phoneNumber, email, expertise, bio, created_at) VALUES (?, ?, ?, ?, ?, CURRENT_TIMESTAMP)";

            // Prepare the SQL statement with parameters
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, fullName);
            statement.setString(2, phoneNumber);
            statement.setString(3, email);
            statement.setString(4, expertise);
            statement.setString(5, bio);

            // Execute the SQL statement
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(null, "Record for " + fullName + " has been added successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Failed to add record.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                // Close the connection
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                System.out.println("Error: " + e);
            }
        }
    }

    /**
     *
     * @param table
     */
    public void viewInstructorRecords(JTable table) {
        Connection connection = null;
        try {
            // Establish connection to the database
            connection = DriverManager.getConnection(URL, USER, PASSWORD);

            // SQL query to select id, fullName, email, and created_at columns
            String sql = "SELECT instructorID, fullName, email, created_at FROM instructors";

            // Create statement
            Statement statement = connection.createStatement();

            // Execute the SQL query
            ResultSet resultSet = statement.executeQuery(sql);

            // Create DefaultTableModel with column names
            DefaultTableModel tableModel = new DefaultTableModel();
            tableModel.addColumn("Instructor ID");
            tableModel.addColumn("Full Name");
            tableModel.addColumn("Email");
            tableModel.addColumn("Date Created");

            // Populate the DefaultTableModel with data from the ResultSet
            while (resultSet.next()) {
                Object[] rowData = new Object[4];
                rowData[0] = resultSet.getObject("instructorID");
                rowData[1] = resultSet.getObject("fullName");
                rowData[2] = resultSet.getObject("email");
                rowData[3] = resultSet.getObject("created_at");
                tableModel.addRow(rowData);
            }

            // Set the table model to the provided JTable
            table.setModel(tableModel);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                // Close the connection
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                System.out.println("Error: " + e);
            }
        }
    }

    private void populateInstructorDetailsTextArea() {
        if (viewRecordsTable.getValueAt(0, 0) == null) {
            JOptionPane.showMessageDialog(null, "Please select an Instructor ID", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int row = viewRecordsTable.getSelectedRow();
        if (row != -1) { // If a row is selected
            String instructorID = viewRecordsTable.getValueAt(row, 0).toString(); // Assuming ID is in the first column
            if (instructorID != null && !instructorID.isEmpty()) {
                try {
                    Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
                    String query = "SELECT * FROM instructors WHERE instructorID = ?";
                    PreparedStatement pstmt = conn.prepareStatement(query);
                    pstmt.setString(1, instructorID);
                    ResultSet rs = pstmt.executeQuery();

                    if (rs.next()) {
                        // Format instructor information with labels
                        String formattedInfo = String.format("Instructor ID: %s\n"
                                + "Full Name: %s\n"
                                + "Phone Number: %s\n"
                                + "Email: %s\n"
                                + "Created At: %s\n"
                                + "Updated At: %s\n",
                                rs.getString("instructorID"),
                                rs.getString("fullName"),
                                rs.getString("phoneNumber"),
                                rs.getString("email"),
                                rs.getTimestamp("created_at"),
                                rs.getTimestamp("updated_at"));
                        // Set formatted information in JTextArea
                        instructorsDetailsTextArea.setText(formattedInfo);
                    } else {
                        JOptionPane.showMessageDialog(null, "Instructor not found", "Error", JOptionPane.ERROR_MESSAGE);
                        System.out.println("Instructor not found");
                    }

                    // Close the resources
                    rs.close();
                    pstmt.close();
                    conn.close();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Error searching instructor: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    System.out.println("Error searching instructor: " + ex.getMessage());
                }
            } else {
                JOptionPane.showMessageDialog(null, "Please select an Instructor ID", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void deleteInstructorData() {
        if (this.instructorsDetailsTextArea.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Please select a record to delete.", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println("Error Deletion: No ID selected.");
            return;
        }
        String[] lines = instructorsDetailsTextArea.getText().split("\n");
        String instructorID = null;
        for (String line : lines) {
            if (line.startsWith("Instructor ID:")) {
                instructorID = line.substring(line.indexOf(":") + 1).trim();
                break;
            }
        }
        if (instructorID != null && !instructorID.isEmpty()) {
            int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this instructor data?", "Confirmation", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                try {
                    Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
                    String query = "DELETE FROM instructors WHERE instructorID = ?";
                    PreparedStatement pstmt = conn.prepareStatement(query);
                    pstmt.setInt(1, Integer.parseInt(instructorID)); // Set the ID as an integer
                    int rowsAffected = pstmt.executeUpdate();

                    if (rowsAffected > 0) {
                        JOptionPane.showMessageDialog(null, "Instructor data deleted successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                        System.out.println("Instructor data deleted successfully.");
                        // Clear the JTextArea after deletion
                        instructorsDetailsTextArea.setText("");
                    } else {
                        JOptionPane.showMessageDialog(null, "Failed to delete instructor data.", "Error", JOptionPane.ERROR_MESSAGE);
                        System.out.println("Failed to delete instructor data.");
                    }

                    // Close the resources
                    pstmt.close();
                    conn.close();
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Invalid instructor ID.", "Error", JOptionPane.ERROR_MESSAGE);
                    System.out.println("Invalid instructor ID.");
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Error deleting instructor data: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    System.out.println("Error deleting instructor data: " + ex.getMessage());
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "No instructor data to delete.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void searchInstructorByIdAndGetDetails(String instructorID) {

        try {
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            String query = "SELECT instructorID, fullName, phoneNumber, email, expertise, bio, created_at FROM instructors WHERE instructorID = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, instructorID);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                editIDField.setText(rs.getInt("instructorID") + "");
                editFullNameField.setText(rs.getString("fullName"));
                editPhoneNumberField.setText(rs.getString("phoneNumber"));
                editEmailField.setText(rs.getString("email"));
                editExpertiseField.setText(rs.getString("expertise"));
                editBioField.setText(rs.getString("bio"));
            } else {
                JOptionPane.showMessageDialog(this, "Instructor not found", "Error", JOptionPane.ERROR_MESSAGE);
                System.out.println("Instructor not found");
            }

            // Close the resources
            rs.close();
            pstmt.close();
            conn.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error searching instructor: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println("Error searching instructor: " + ex.getMessage());
        }
    }

    private void updateInstructorDetails(String instructorID) {
        // Get updated details from fields
        String fullName = editFullNameField.getText();
        String phoneNumber = editPhoneNumberField.getText();
        String email = editEmailField.getText();
        String expertise = editExpertiseField.getText();
        String bio = editBioField.getText();

        if (fullName.isBlank() || phoneNumber.isBlank() || email.isBlank() || expertise.isBlank() || bio.isBlank()) {
            System.out.println("Please do not leave blank fields.");
            JOptionPane.showMessageDialog(this, "Please do not leave blank fields.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Confirmation dialog
        int confirmation = JOptionPane.showConfirmDialog(this, "Are you sure you want to update instructor details?", "Confirmation", JOptionPane.YES_NO_OPTION);

        if (confirmation == JOptionPane.YES_OPTION) {
            try {
                Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);

                // Update instructor details
                String query = "UPDATE instructors SET fullName = ?, phoneNumber = ?, email = ?, expertise = ?, bio = ?, updated_at = ? WHERE instructorID = ?";
                PreparedStatement pstmt = conn.prepareStatement(query);
                pstmt.setString(1, fullName);
                pstmt.setString(2, phoneNumber);
                pstmt.setString(3, email);
                pstmt.setString(4, expertise);
                pstmt.setString(5, bio);
                pstmt.setTimestamp(6, new Timestamp(System.currentTimeMillis())); // Set updated_at with current timestamp
                pstmt.setString(7, instructorID);

                int rowsAffected = pstmt.executeUpdate();

                // Close the resources
                pstmt.close();
                conn.close();

                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(this, "Instructor details updated successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "No instructor found with the provided ID", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error updating instructor details: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                System.out.println("Error updating instructor details: " + ex.getMessage());
            }
        }
    }

    private void getInstructorCount() {
        int count = 0;

        String query = "SELECT COUNT(*) AS total FROM instructors";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD); PreparedStatement pstmt = conn.prepareStatement(query); ResultSet rs = pstmt.executeQuery()) {

            if (rs.next()) {
                count = rs.getInt("total");
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        totalInstructorCountLabel.setText(count + "");
    }

    public void displayLatestInstructor(JTextArea textArea) {
        String query = "SELECT fullName, phoneNumber, email, expertise, bio, created_at "
                + "FROM instructors ORDER BY created_at DESC LIMIT 1";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD); PreparedStatement pstmt = conn.prepareStatement(query); ResultSet rs = pstmt.executeQuery()) {

            if (rs.next()) {
                String fullName = rs.getString("fullName");
                String phoneNumber = rs.getString("phoneNumber");
                String email = rs.getString("email");
                String expertise = rs.getString("expertise");
                String bio = rs.getString("bio");
                String createdAt = rs.getTimestamp("created_at").toString();

                // Format the details to display in the text area
                String instructorDetails = String.format(
                        "Full Name: %s\nPhone Number: %s\nEmail: %s\nExpertise: %s\nBio: %s\nCreated At: %s",
                        fullName, phoneNumber, email, expertise, bio, createdAt);

                textArea.setText(instructorDetails);
            } else {
                textArea.setText("No instructor records found.");
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
            textArea.setText("Error retrieving latest instructor details.");
        }
    }
}
