/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.main;

import java.awt.Image;
import static java.lang.Thread.sleep;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Farmaku
 */
public class MainForm extends javax.swing.JFrame {
    /**
     * Creates new form MainForm
     */
    public MainForm() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        initMainPanel();

    }
    
    private void initMainPanel(){
        clearMainPanel();
        JPanel panel = new PanelHome();
        mainPanel.add(panel);
        mainPanel.repaint();
        mainPanel.revalidate();
    }

    private void setIcon() {
        ImageIcon icon = new ImageIcon(getClass().getResource("/com/app/icons/northwindLogo1.png"));
        Image scaled = icon.getImage().getScaledInstance(jLabel2.getWidth(), jLabel2.getHeight(), Image.SCALE_SMOOTH);
        jLabel2.setIcon(new ImageIcon(scaled));
    }

    public void test() {
        System.out.println("Test Invoked");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sidePanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        menuMyAccount = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        menuDashboard = new javax.swing.JLabel();
        menuCustomers = new javax.swing.JLabel();
        menuProducts = new javax.swing.JLabel();
        menuCategory = new javax.swing.JLabel();
        menuSupplier = new javax.swing.JLabel();
        menuRegion = new javax.swing.JLabel();
        menuShipper = new javax.swing.JLabel();
        menuOrder = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        headerPanel = new javax.swing.JPanel();
        buttonToggleMenu = new javax.swing.JLabel();
        panelButton = new javax.swing.JPanel();
        buttonSignOut = new javax.swing.JLabel();
        buttonExit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 204));
        setUndecorated(true);

        sidePanel.setBackground(new java.awt.Color(51, 51, 51));
        sidePanel.setPreferredSize(new java.awt.Dimension(240, 550));

        jPanel2.setBackground(new java.awt.Color(51, 102, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(240, 64));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/app/icons/icons8_north_direction_48px.png"))); // NOI18N
        jLabel2.setText("NorthWIND");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 210, 40));

        menuMyAccount.setBackground(new java.awt.Color(102, 102, 255));
        menuMyAccount.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        menuMyAccount.setForeground(new java.awt.Color(255, 255, 255));
        menuMyAccount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/app/icons/icons8_account_24px.png"))); // NOI18N
        menuMyAccount.setText("MY Account");
        menuMyAccount.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        menuMyAccount.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuMyAccount.setIconTextGap(10);
        menuMyAccount.setInheritsPopupMenu(false);
        menuMyAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuMyAccountMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuMyAccountMouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Main Navigation");
        jLabel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

        menuDashboard.setBackground(new java.awt.Color(102, 102, 255));
        menuDashboard.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        menuDashboard.setForeground(new java.awt.Color(255, 255, 255));
        menuDashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/app/icons/icons8_dashboard_24px.png"))); // NOI18N
        menuDashboard.setText("Dashboard");
        menuDashboard.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        menuDashboard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuDashboard.setIconTextGap(10);
        menuDashboard.setInheritsPopupMenu(false);
        menuDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuDashboardMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuDashboardMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuDashboardMouseExited(evt);
            }
        });

        menuCustomers.setBackground(new java.awt.Color(102, 102, 255));
        menuCustomers.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        menuCustomers.setForeground(new java.awt.Color(255, 255, 255));
        menuCustomers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/app/icons/icons8_customers_24px.png"))); // NOI18N
        menuCustomers.setText("Customers");
        menuCustomers.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        menuCustomers.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuCustomers.setIconTextGap(10);
        menuCustomers.setInheritsPopupMenu(false);
        menuCustomers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuCustomersMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuCustomersMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuCustomersMouseExited(evt);
            }
        });

        menuProducts.setBackground(new java.awt.Color(102, 102, 255));
        menuProducts.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        menuProducts.setForeground(new java.awt.Color(255, 255, 255));
        menuProducts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/app/icons/icons8_products_24px.png"))); // NOI18N
        menuProducts.setText("Products");
        menuProducts.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        menuProducts.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuProducts.setIconTextGap(10);
        menuProducts.setInheritsPopupMenu(false);
        menuProducts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuProductsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuProductsMouseExited(evt);
            }
        });

        menuCategory.setBackground(new java.awt.Color(102, 102, 255));
        menuCategory.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        menuCategory.setForeground(new java.awt.Color(255, 255, 255));
        menuCategory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/app/icons/icons8_category_24px.png"))); // NOI18N
        menuCategory.setText("Category");
        menuCategory.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        menuCategory.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuCategory.setIconTextGap(10);
        menuCategory.setInheritsPopupMenu(false);
        menuCategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuCategoryMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuCategoryMouseExited(evt);
            }
        });

        menuSupplier.setBackground(new java.awt.Color(102, 102, 255));
        menuSupplier.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        menuSupplier.setForeground(new java.awt.Color(255, 255, 255));
        menuSupplier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/app/icons/icons8_supplier_24px.png"))); // NOI18N
        menuSupplier.setText("Suppliers");
        menuSupplier.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        menuSupplier.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuSupplier.setIconTextGap(10);
        menuSupplier.setInheritsPopupMenu(false);
        menuSupplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuSupplierMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuSupplierMouseExited(evt);
            }
        });

        menuRegion.setBackground(new java.awt.Color(102, 102, 255));
        menuRegion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        menuRegion.setForeground(new java.awt.Color(255, 255, 255));
        menuRegion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/app/icons/icons8_region_24px.png"))); // NOI18N
        menuRegion.setText("Regions");
        menuRegion.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        menuRegion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuRegion.setIconTextGap(10);
        menuRegion.setInheritsPopupMenu(false);
        menuRegion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuRegionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuRegionMouseExited(evt);
            }
        });

        menuShipper.setBackground(new java.awt.Color(102, 102, 255));
        menuShipper.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        menuShipper.setForeground(new java.awt.Color(255, 255, 255));
        menuShipper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/app/icons/icons8_shipped_24px.png"))); // NOI18N
        menuShipper.setText("Shippers");
        menuShipper.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        menuShipper.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuShipper.setIconTextGap(10);
        menuShipper.setInheritsPopupMenu(false);
        menuShipper.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuShipperMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuShipperMouseExited(evt);
            }
        });

        menuOrder.setBackground(new java.awt.Color(102, 102, 255));
        menuOrder.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        menuOrder.setForeground(new java.awt.Color(255, 255, 255));
        menuOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/app/icons/icons8_purchase_order_24px.png"))); // NOI18N
        menuOrder.setText("Orders");
        menuOrder.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        menuOrder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuOrder.setIconTextGap(10);
        menuOrder.setInheritsPopupMenu(false);
        menuOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuOrderMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuOrderMouseExited(evt);
            }
        });

        javax.swing.GroupLayout sidePanelLayout = new javax.swing.GroupLayout(sidePanel);
        sidePanel.setLayout(sidePanelLayout);
        sidePanelLayout.setHorizontalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(menuDashboard, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menuMyAccount, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menuCustomers, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menuProducts, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menuCategory, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menuSupplier, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menuRegion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menuShipper, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menuOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE))
        );
        sidePanelLayout.setVerticalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(menuMyAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menuDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menuCustomers, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menuProducts, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menuCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menuSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menuRegion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menuShipper, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menuOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(sidePanelLayout.createSequentialGroup()
                    .addGap(72, 72, 72)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(1133, Short.MAX_VALUE)))
        );

        mainPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        mainPanel.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1152, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1161, Short.MAX_VALUE)
        );

        mainPanel.add(jPanel3, "card2");

        headerPanel.setBackground(new java.awt.Color(0, 51, 204));

        buttonToggleMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/app/icons/icons8_menu_24px.png"))); // NOI18N
        buttonToggleMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonToggleMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonToggleMenuMouseClicked(evt);
            }
        });

        panelButton.setOpaque(false);
        panelButton.setPreferredSize(new java.awt.Dimension(100, 66));

        buttonSignOut.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonSignOut.setForeground(new java.awt.Color(255, 255, 255));
        buttonSignOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/app/icons/icons8_exit_24px.png"))); // NOI18N
        buttonSignOut.setText("Sign Out");
        buttonSignOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        buttonExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/app/icons/icons8_close_window_26px_1.png"))); // NOI18N
        buttonExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonExitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelButtonLayout = new javax.swing.GroupLayout(panelButton);
        panelButton.setLayout(panelButtonLayout);
        panelButtonLayout.setHorizontalGroup(
            panelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelButtonLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(buttonSignOut, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelButtonLayout.setVerticalGroup(
            panelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonExit)
                    .addComponent(buttonSignOut))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonToggleMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonToggleMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(246, 246, 246)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(sidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(238, 238, 238)
                .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1248, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonExitMouseClicked
        System.exit(0);
//        Boolean yakin = JOptionPane.showConfirmDialog(this, "Apakah anda yakin?", "Konfirmasi", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
//        if(yakin || true){
//            System.exit(0);
//        }
    }//GEN-LAST:event_buttonExitMouseClicked


    private void buttonToggleMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonToggleMenuMouseClicked
        toggleMenu();
    }//GEN-LAST:event_buttonToggleMenuMouseClicked

    private void menuMyAccountMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuMyAccountMouseExited
        menuLabelExited(menuMyAccount, "MY Account");
    }//GEN-LAST:event_menuMyAccountMouseExited

    private void menuMyAccountMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuMyAccountMouseEntered
        menuLabelEntered(menuMyAccount, "My Account");
    }//GEN-LAST:event_menuMyAccountMouseEntered

    private void menuDashboardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuDashboardMouseEntered
        menuLabelEntered(menuDashboard, "Dashboard");
    }//GEN-LAST:event_menuDashboardMouseEntered

    private void menuDashboardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuDashboardMouseExited
        menuLabelExited(menuDashboard, "Dashboard");
    }//GEN-LAST:event_menuDashboardMouseExited

    private void menuCustomersMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuCustomersMouseEntered
        menuLabelEntered(menuCustomers, "Customers");
    }//GEN-LAST:event_menuCustomersMouseEntered

    private void menuCustomersMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuCustomersMouseExited
        menuLabelExited(menuCustomers, "Customers");
    }//GEN-LAST:event_menuCustomersMouseExited

    private void menuProductsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuProductsMouseEntered
        menuLabelEntered(menuProducts, "Products");
    }//GEN-LAST:event_menuProductsMouseEntered

    private void menuProductsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuProductsMouseExited
        menuLabelExited(menuProducts, "Products");
    }//GEN-LAST:event_menuProductsMouseExited

    private void menuCategoryMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuCategoryMouseEntered
        menuLabelEntered(menuCategory, "Category");
    }//GEN-LAST:event_menuCategoryMouseEntered

    private void menuCategoryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuCategoryMouseExited
        menuLabelExited(menuCategory, "Category");
    }//GEN-LAST:event_menuCategoryMouseExited

    private void menuSupplierMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuSupplierMouseEntered
        menuLabelEntered(menuSupplier, "Supplier");
    }//GEN-LAST:event_menuSupplierMouseEntered

    private void menuSupplierMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuSupplierMouseExited
        menuLabelExited(menuSupplier, "Supplier");
    }//GEN-LAST:event_menuSupplierMouseExited

    private void menuRegionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuRegionMouseEntered
        menuLabelEntered(menuRegion, "Regions");
    }//GEN-LAST:event_menuRegionMouseEntered

    private void menuRegionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuRegionMouseExited
        menuLabelExited(menuRegion, "Regios");
    }//GEN-LAST:event_menuRegionMouseExited

    private void menuShipperMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuShipperMouseEntered
        menuLabelEntered(menuShipper, "Shipper");
    }//GEN-LAST:event_menuShipperMouseEntered

    private void menuShipperMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuShipperMouseExited
        menuLabelExited(menuShipper, "Shipper");
    }//GEN-LAST:event_menuShipperMouseExited

    private void menuOrderMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuOrderMouseEntered
        menuLabelEntered(menuOrder, "Order");
    }//GEN-LAST:event_menuOrderMouseEntered

    private void menuOrderMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuOrderMouseExited
        menuLabelExited(menuOrder, "Order");
    }//GEN-LAST:event_menuOrderMouseExited

    private void menuCustomersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuCustomersMouseClicked
        clearMainPanel();
        //add panel customer
        JPanel panel = new PanelCustomer();
        mainPanel.add(panel);
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_menuCustomersMouseClicked

    private void menuDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuDashboardMouseClicked
        clearMainPanel();
        //add panel customer
        JPanel panel = new PanelHome();
        mainPanel.add(panel);
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_menuDashboardMouseClicked

    private void clearMainPanel() {
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    private void menuLabelEntered(JLabel label, String text) {
        label.setOpaque(true);
        label.setText(text);
    }

    private void menuLabelExited(JLabel label, String text) {
        label.setOpaque(false);
        label.setText(text + " ");
    }

    private void toggleMenu() {
        int width = sidePanel.getWidth();
        Thread th = width == 0 ? new Thread() {
            @Override
            public void run() {
                int x = mainPanel.getX();
                int y = mainPanel.getY();
                int w = mainPanel.getWidth();
                int h = mainPanel.getHeight();
                for (int i = 0; i <= 240; i++) {
                    try {
                        sidePanel.setSize(i, sidePanel.getHeight());
                        w -= 1;
                        mainPanel.setSize(w, h);
                        headerPanel.setSize(headerPanel.getWidth() - 1, headerPanel.getHeight());
                        x += 1;
                        mainPanel.setLocation(x, y);
                        headerPanel.setLocation(headerPanel.getX() + 1, headerPanel.getY());
                        panelButton.setLocation(panelButton.getX() - 1, panelButton.getY());
                        sleep(1);
                    } catch (InterruptedException ex) {

                    }
                }
            }
        } : new Thread() {
            @Override
            public void run() {
                int x = mainPanel.getX();
                int y = mainPanel.getY();
                int w = mainPanel.getWidth();
                int h = mainPanel.getHeight();
                for (int i = 240; i >= 0; i--) {
                    try {
                        sidePanel.setSize(i, sidePanel.getHeight());
                        w += 1;
                        mainPanel.setSize(w, h);
                        headerPanel.setSize(headerPanel.getWidth() + 1, headerPanel.getHeight());
                        x -= 1;
                        mainPanel.setLocation(x, y);
                        headerPanel.setLocation(headerPanel.getX() - 1, headerPanel.getY());
                        panelButton.setLocation(panelButton.getX() + 1, panelButton.getY());
                        sleep(1);
                    } catch (InterruptedException ex) {

                    }
                }
            }
        };
        th.start();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel buttonExit;
    private javax.swing.JLabel buttonSignOut;
    private javax.swing.JLabel buttonToggleMenu;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel menuCategory;
    private javax.swing.JLabel menuCustomers;
    private javax.swing.JLabel menuDashboard;
    private javax.swing.JLabel menuMyAccount;
    private javax.swing.JLabel menuOrder;
    private javax.swing.JLabel menuProducts;
    private javax.swing.JLabel menuRegion;
    private javax.swing.JLabel menuShipper;
    private javax.swing.JLabel menuSupplier;
    private javax.swing.JPanel panelButton;
    private javax.swing.JPanel sidePanel;
    // End of variables declaration//GEN-END:variables
}
