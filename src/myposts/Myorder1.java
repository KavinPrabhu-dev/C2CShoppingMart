package myposts;

import project2.*;
import java.awt.Color;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Myorder1 extends javax.swing.JFrame {

    static Object[] data = new Object[4];
    JPanel BackgroundPanel = new javax.swing.JPanel();
    JPanel jPanel2 = new javax.swing.JPanel();
    JLabel jLabel1 = new javax.swing.JLabel();
    JLabel jLabel2 = new javax.swing.JLabel();
    JSeparator jSeparator6 = new javax.swing.JSeparator();
    JTextField searchBar = new javax.swing.JTextField();
    JButton searchButton = new javax.swing.JButton();
    JLabel jLabel3 = new javax.swing.JLabel();
    JPanel jPanel3 = new javax.swing.JPanel();
    JButton electronicsButton = new javax.swing.JButton();
    JPanel cardParentPanel = new javax.swing.JPanel();
    JPanel homePanel = new javax.swing.JPanel();
    JScrollPane jScrollPane5 = new javax.swing.JScrollPane();
    JTable homeTable = new javax.swing.JTable();
    JPanel searchPanel = new javax.swing.JPanel();
    JScrollPane jScrollPane6 = new javax.swing.JScrollPane();
    JTable searchTable = new javax.swing.JTable();
    JPanel electronicsPanel = new javax.swing.JPanel();
    JScrollPane jScrollPane3 = new javax.swing.JScrollPane();
    JTable electronicsTable = new javax.swing.JTable();

    public Myorder1() {
        Display();
        ArrayList<ProductList> list = ElectronicsDB1.TableGenerator();
        Object rowData[] = new Object[6];
        DefaultTableModel model = (DefaultTableModel) homeTable.getModel();
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        homeTable.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        homeTable.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
        homeTable.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
        homeTable.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);

        model.setRowCount(0);

        for (int i = 0; i < list.size(); i++) {
            rowData[0] = list.get(i).getBrand();
            rowData[1] = list.get(i).getModel();
            rowData[2] = list.get(i).getPrice();

            rowData[3] = list.get(i).getDescription();
            ImageIcon image = new ImageIcon(new ImageIcon(list.get(i).getMimage()).getImage()
                    .getScaledInstance(160, 160, Image.SCALE_SMOOTH));
            rowData[4] = image;
            model.addRow(rowData);
            homeTable.setRowHeight(150);
            homeTable.getColumnModel().getColumn(4).setPreferredWidth(150);
        }
        list.clear();
    }

    void Display() {
        
        setBackground(new java.awt.Color(255, 255, 255));
        BackgroundPanel.setBackground(new java.awt.Color(255, 255, 255));
        BackgroundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setPreferredSize(new java.awt.Dimension(1199, 72));

        jLabel1.setBackground(new java.awt.Color(51, 102, 255));
        jLabel1.setFont(new java.awt.Font("Calibri", 0, 36));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Surety4Shopping");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator6.setForeground(new java.awt.Color(51, 102, 255));
        jSeparator6.setFont(new java.awt.Font("Tahoma", 1, 11));
        jSeparator6.setOpaque(true);

        searchBar.setBackground(new java.awt.Color(153, 153, 153));
        searchBar.setFont(new java.awt.Font("Roboto", 0, 14));
        searchBar.setForeground(new java.awt.Color(255, 255, 255));
        searchBar.setBorder(null);
        searchBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchBarMouseClicked(evt);
            }
        });
        searchBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBarActionPerformed(evt);
            }
        });

        searchButton.setBackground(new java.awt.Color(51, 102, 255));
        searchButton.setFont(new java.awt.Font("Roboto", 0, 20));
        searchButton.setForeground(new java.awt.Color(255, 255, 255));
        searchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Search_31px.png")));
        searchButton.setToolTipText("Search");
        searchButton.setBorderPainted(false);
        searchButton.setContentAreaFilled(false);
        searchButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchButton.setOpaque(true);
        searchButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchButtonMouseClicked(evt);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                searchButtonMouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                searchButtonMouseExited(evt);
            }

            public void mousePressed(java.awt.event.MouseEvent evt) {
                searchButtonMousePressed(evt);
            }

            public void mouseReleased(java.awt.event.MouseEvent evt) {
                searchButtonMouseReleased(evt);
            }
        });
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 12));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Search");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 349, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jSeparator6)
                                .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(12, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel3))
                                                .addGap(3, 3, 3))
                                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BackgroundPanel.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1250, 60));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        electronicsButton.setBackground(new java.awt.Color(51, 102, 255));
        electronicsButton.setFont(new java.awt.Font("Roboto", 0, 20));
        electronicsButton.setForeground(new java.awt.Color(255, 255, 255));
        electronicsButton.setText("My Orders");
        electronicsButton.setToolTipText("My Orders");
        electronicsButton.setBorderPainted(false);
        electronicsButton.setContentAreaFilled(false);
        electronicsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        electronicsButton.setOpaque(true);
        electronicsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                electronicsButtonMouseClicked(evt);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                electronicsButtonMouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                electronicsButtonMouseExited(evt);
            }

            public void mousePressed(java.awt.event.MouseEvent evt) {
                electronicsButtonMousePressed(evt);
            }

            public void mouseReleased(java.awt.event.MouseEvent evt) {
                electronicsButtonMouseReleased(evt);
            }
        });
        electronicsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                electronicsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGap(23, 23, 23)
                        .addComponent(electronicsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 341, Short.MAX_VALUE)
                        .addGap(21, 21, 21))
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(electronicsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                ));

        BackgroundPanel.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 60, 1210, 50));

        cardParentPanel.setLayout(new java.awt.CardLayout());

        homeTable.setFont(new java.awt.Font("Roboto", 0, 14));
        homeTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Brand Name", "Model", "Price", "Features", "Photo"
                }
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class,
                java.lang.Integer.class, java.lang.String.class, javax.swing.Icon.class
            };
            boolean[] canEdit = new boolean[]{
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

        });
        homeTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        homeTable.setSelectionBackground(new java.awt.Color(153, 153, 153));
        homeTable.getTableHeader().setReorderingAllowed(false);
        homeTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeTableMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(homeTable);

        javax.swing.GroupLayout homePanelLayout = new javax.swing.GroupLayout(homePanel);
        homePanel.setLayout(homePanelLayout);
        homePanelLayout.setHorizontalGroup(
                homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
        );
        homePanelLayout.setVerticalGroup(
                homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
        );

        cardParentPanel.add(homePanel, "card5");

        searchTable.setFont(new java.awt.Font("Roboto", 0, 14));
        searchTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Brand Name", "Model", "Price", "Features", "Photo"
                }
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class,
                java.lang.Integer.class, java.lang.String.class, javax.swing.Icon.class
            };
            boolean[] canEdit = new boolean[]{
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

        });
        searchTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchTable.setSelectionBackground(new java.awt.Color(153, 153, 153));
        searchTable.getTableHeader().setReorderingAllowed(false);
        searchTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchTableMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(searchTable);

        javax.swing.GroupLayout searchPanelLayout = new javax.swing.GroupLayout(searchPanel);
        searchPanel.setLayout(searchPanelLayout);
        searchPanelLayout.setHorizontalGroup(
                searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
        );
        searchPanelLayout.setVerticalGroup(
                searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
        );

        cardParentPanel.add(searchPanel, "card9");

        electronicsTable.setFont(new java.awt.Font("Roboto", 0, 14));
        electronicsTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Brand Name", "Model", "Price", "Features", "Photo"
                }
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class,
                java.lang.Integer.class, java.lang.String.class, javax.swing.Icon.class
            };
            boolean[] canEdit = new boolean[]{
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

        });
        electronicsTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        electronicsTable.setSelectionBackground(new java.awt.Color(153, 153, 153));
        electronicsTable.getTableHeader().setReorderingAllowed(false);
        electronicsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                electronicsTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(electronicsTable);

        javax.swing.GroupLayout electronicsPanelLayout = new javax.swing.GroupLayout(electronicsPanel);
        electronicsPanel.setLayout(electronicsPanelLayout);
        electronicsPanelLayout.setHorizontalGroup(
                electronicsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
        );
        electronicsPanelLayout.setVerticalGroup(
                electronicsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
        );

        cardParentPanel.add(electronicsPanel, "card4");

        BackgroundPanel.add(cardParentPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 1200, 590));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addComponent(BackgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(BackgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 699, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {

    }

    private void newlyAddedActionPerformed(java.awt.event.ActionEvent evt) {

        cardParentPanel.removeAll();
        cardParentPanel.add(homePanel);
        cardParentPanel.repaint();
        cardParentPanel.revalidate();

        //Adding last three entries from every categories in home
        ArrayList<ProductList> list = ElectronicsDB1.homePageContent();

        Object rowData[] = new Object[6];

        DefaultTableModel model = (DefaultTableModel) homeTable.getModel();
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        homeTable.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        homeTable.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
        homeTable.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
        homeTable.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);

        model.setRowCount(0);

        for (int i = 0; i < list.size(); i++) {
            rowData[0] = list.get(i).getBrand();
            rowData[1] = list.get(i).getModel();
            rowData[2] = list.get(i).getPrice();

            rowData[3] = list.get(i).getDescription();

            ImageIcon image = new ImageIcon(new ImageIcon(list.get(i).getMimage()).getImage()
                    .getScaledInstance(160, 160, Image.SCALE_SMOOTH));
            rowData[4] = image;

            model.addRow(rowData);
            homeTable.setRowHeight(150);
            homeTable.getColumnModel().getColumn(4).setPreferredWidth(150);
        }

    }

    private void electronicsButtonMouseClicked(java.awt.event.MouseEvent evt) {

        cardParentPanel.removeAll();
        cardParentPanel.add(electronicsPanel);
        cardParentPanel.repaint();
        cardParentPanel.revalidate();
    }

    private void electronicsButtonMouseEntered(java.awt.event.MouseEvent evt) {

        electronicsButton.setBackground(new Color(153, 153, 153));
    }

    private void electronicsButtonMouseExited(java.awt.event.MouseEvent evt) {

        electronicsButton.setBackground(new Color(51, 102, 255));
    }

    private void electronicsButtonMousePressed(java.awt.event.MouseEvent evt) {

        electronicsButton.setBackground(new Color(153, 153, 153));
    }

    private void electronicsButtonMouseReleased(java.awt.event.MouseEvent evt) {

        electronicsButton.setBackground(new Color(51, 102, 255));
    }

    private void electronicsButtonActionPerformed(java.awt.event.ActionEvent evt) {

        ProductInformation.categoryChooser = "electronics";
        ArrayList<ProductList> list = ElectronicsDB1.TableGenerator();
        Object rowData[] = new Object[6];

        DefaultTableModel model = (DefaultTableModel) electronicsTable.getModel();
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        electronicsTable.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        electronicsTable.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
        electronicsTable.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
        electronicsTable.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);

        model.setRowCount(0);

        for (int i = 0; i < list.size(); i++) {
            rowData[0] = list.get(i).getBrand();
            rowData[1] = list.get(i).getModel();
            rowData[2] = list.get(i).getPrice();

            rowData[3] = list.get(i).getDescription();

            ImageIcon image = new ImageIcon(new ImageIcon(list.get(i).getMimage()).getImage()
                    .getScaledInstance(160, 160, Image.SCALE_SMOOTH));
            rowData[4] = image;

            model.addRow(rowData);
            electronicsTable.setRowHeight(150);
            electronicsTable.getColumnModel().getColumn(4).setPreferredWidth(150);
        }
    }

    ProductInformation pi = new ProductInformation();

    private void electronicsTableMouseClicked(java.awt.event.MouseEvent evt) {

        pi.setVisible(true);
        pi.pack();

        int selectedRow = electronicsTable.getSelectedRow();
        TableModel tm = electronicsTable.getModel();

        String brand = tm.getValueAt(selectedRow, 0).toString();
        String model = tm.getValueAt(selectedRow, 1).toString();
        String price = tm.getValueAt(selectedRow, 2).toString();

        String feature = tm.getValueAt(selectedRow, 3).toString();
        ImageIcon img = (ImageIcon) tm.getValueAt(selectedRow, 4);

        pi.productInfoBrandName.setText(brand);
        pi.productInfoModel.setText(model);
        pi.productInfoPrice.setText(price);

        pi.productInfoFeature.setText(feature);
        pi.productPhoto.setIcon(img);
    }

    private void homeTableMouseClicked(java.awt.event.MouseEvent evt) {

        int rowIndex = homeTable.getSelectedRow();
        ProductInformation.categoryChooser = "electronics";

        pi.setVisible(true);
        pi.pack();

        int selectedRow = homeTable.getSelectedRow();
        TableModel tm = homeTable.getModel();

        String brand = tm.getValueAt(selectedRow, 0).toString();
        String model = tm.getValueAt(selectedRow, 1).toString();
        String price = tm.getValueAt(selectedRow, 2).toString();

        String feature = tm.getValueAt(selectedRow, 3).toString();
        ImageIcon img = (ImageIcon) tm.getValueAt(selectedRow, 4);

        pi.productInfoBrandName.setText(brand);
        pi.productInfoModel.setText(model);
        pi.productInfoPrice.setText(price);

        pi.productInfoFeature.setText(feature);
        pi.productPhoto.setIcon(img);
    }

    private void searchBarActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void searchButtonMouseClicked(java.awt.event.MouseEvent evt) {

    }

    private void searchButtonMouseEntered(java.awt.event.MouseEvent evt) {
        searchButton.setBackground(new Color(153, 153, 153));
    }

    private void searchButtonMouseExited(java.awt.event.MouseEvent evt) {
        searchButton.setBackground(new Color(51, 102, 255));
    }

    private void searchButtonMousePressed(java.awt.event.MouseEvent evt) {

        searchButton.setBackground(new Color(153, 153, 153));
    }

    private void searchButtonMouseReleased(java.awt.event.MouseEvent evt) {

        searchButton.setBackground(new Color(51, 102, 255));
    }

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {

        Search.electronics = 0;

        ArrayList<ProductList> list = Search.mobileSearch(searchBar.getText());
        Object rowData[] = new Object[6];
        int i;

        if (searchBar.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Search field empty!");
        } else if (Search.electronics == 0) {
            JOptionPane.showMessageDialog(null, "Sorry! Product does not exist!");
        } else {
            cardParentPanel.removeAll();
            cardParentPanel.add(searchPanel);
            cardParentPanel.repaint();
            cardParentPanel.revalidate();

            DefaultTableModel model = (DefaultTableModel) searchTable.getModel();
            DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
            centerRenderer.setHorizontalAlignment(JLabel.CENTER);
            searchTable.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
            searchTable.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
            searchTable.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
            searchTable.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);

            model.setRowCount(0);
            for (i = 0; i < Search.electronics; i++) {
                rowData[0] = list.get(i).getBrand();
                rowData[1] = list.get(i).getModel();
                rowData[2] = list.get(i).getPrice();

                rowData[3] = list.get(i).getDescription();

                ImageIcon image = new ImageIcon(new ImageIcon(list.get(i).getMimage()).getImage()
                        .getScaledInstance(160, 160, Image.SCALE_SMOOTH));
                rowData[4] = image;

                model.addRow(rowData);
                searchTable.setRowHeight(150);
                searchTable.getColumnModel().getColumn(4).setPreferredWidth(150);
            }

        }
    }

    private void searchBarMouseClicked(java.awt.event.MouseEvent evt) {

        searchBar.setText("");
    }

    private void searchTableMouseClicked(java.awt.event.MouseEvent evt) {

        int rowIndex = searchTable.getSelectedRow();
        ProductInformation.categoryChooser = "electronics";

        pi.setVisible(true);
        pi.pack();

        int selectedRow = searchTable.getSelectedRow();
        TableModel tm = searchTable.getModel();

        String brand = tm.getValueAt(selectedRow, 0).toString();
        String model = tm.getValueAt(selectedRow, 1).toString();
        String price = tm.getValueAt(selectedRow, 2).toString();

        String feature = tm.getValueAt(selectedRow, 3).toString();
        ImageIcon img = (ImageIcon) tm.getValueAt(selectedRow, 4);

        pi.productInfoBrandName.setText(brand);
        pi.productInfoModel.setText(model);
        pi.productInfoPrice.setText(price);

        pi.productInfoFeature.setText(feature);
        pi.productPhoto.setIcon(img);
    }

    public static void main(String args[]) {
        JFrame newMain = new Myorder1();
        newMain.setTitle("C2C Shopping Cart");
        newMain.setVisible(true);
        newMain.setResizable(false);
    }
}
