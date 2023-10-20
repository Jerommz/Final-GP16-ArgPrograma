/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bomberos.Vistas;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.plaf.basic.BasicButtonUI;

/**
 *
 * @author jero
 */
public class Siniestros extends javax.swing.JPanel {

    private ImageIcon icono;

    /**
     * Creates new form Siniestros
     */
    public Siniestros() {
        initComponents();
        botones();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        popupMenu = new javax.swing.JPopupMenu();
        popmenuMarcar = new javax.swing.JMenuItem();
        panelRoot = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        panelIzq = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        comboTipoAccidenteSiniestro = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        textFechaSiniestro = new javax.swing.JTextField();
        textCoordY = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        textAreaDescripcion = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        textCoordX1 = new javax.swing.JTextField();
        botonListarSiniestros = new javax.swing.JButton();
        panelDer = new javax.swing.JPanel();
        panelDerTop = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        panelDerMid = new javax.swing.JPanel();
        botonAsignarSiniestro = new javax.swing.JButton();
        panelDerBot = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        popmenuMarcar.setText("Marcar");
        popupMenu.add(popmenuMarcar);

        panelRoot.setPreferredSize(new java.awt.Dimension(1280, 640));

        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 640));

        jPanel2.setBackground(new Color (161, 27, 27,64));
        jPanel2.setPreferredSize(new java.awt.Dimension(1280, 640));
        jPanel2.setLayout(new java.awt.BorderLayout());

        panelIzq.setBackground(new Color (161, 27, 27,160));
        panelIzq.setPreferredSize(new java.awt.Dimension(300, 0));
        panelIzq.setLayout(new java.awt.GridBagLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText("Detalle del accidente:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 5, 0);
        panelIzq.add(jLabel2, gridBagConstraints);

        comboTipoAccidenteSiniestro.setBackground(new Color(193,29,29));
        comboTipoAccidenteSiniestro.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        comboTipoAccidenteSiniestro.setForeground(java.awt.Color.white);
        comboTipoAccidenteSiniestro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboTipoAccidenteSiniestro.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        comboTipoAccidenteSiniestro.setPreferredSize(new java.awt.Dimension(250, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 10, 0);
        panelIzq.add(comboTipoAccidenteSiniestro, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(java.awt.Color.white);
        jLabel5.setText("Tipo de accidente:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        panelIzq.add(jLabel5, gridBagConstraints);

        jLabel8.setForeground(java.awt.Color.white);
        jLabel8.setText("X:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(5, 55, 10, 0);
        panelIzq.add(jLabel8, gridBagConstraints);

        jLabel9.setForeground(java.awt.Color.white);
        jLabel9.setText("Y:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.insets = new java.awt.Insets(5, 6, 10, 0);
        panelIzq.add(jLabel9, gridBagConstraints);

        textFechaSiniestro.setBackground(new Color(193,29,29));
        textFechaSiniestro.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        textFechaSiniestro.setForeground(java.awt.Color.white);
        textFechaSiniestro.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        textFechaSiniestro.setPreferredSize(new java.awt.Dimension(70, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 10, 0);
        panelIzq.add(textFechaSiniestro, gridBagConstraints);

        textCoordY.setBackground(new Color(193,29,29));
        textCoordY.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        textCoordY.setForeground(java.awt.Color.white);
        textCoordY.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        textCoordY.setPreferredSize(new java.awt.Dimension(40, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.insets = new java.awt.Insets(5, 65, 10, 0);
        panelIzq.add(textCoordY, gridBagConstraints);

        textAreaDescripcion.setBackground(new Color(193,29,29));
        textAreaDescripcion.setColumns(20);
        textAreaDescripcion.setRows(5);
        textAreaDescripcion.setBorder(null);
        jScrollPane4.setViewportView(textAreaDescripcion);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        panelIzq.add(jScrollPane4, gridBagConstraints);

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setForeground(java.awt.Color.white);
        jLabel10.setText("Fecha:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        panelIzq.add(jLabel10, gridBagConstraints);

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setForeground(java.awt.Color.white);
        jLabel11.setText("Ubicacion:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        panelIzq.add(jLabel11, gridBagConstraints);

        textCoordX1.setBackground(new Color(193,29,29));
        textCoordX1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        textCoordX1.setForeground(java.awt.Color.white);
        textCoordX1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        textCoordX1.setPreferredSize(new java.awt.Dimension(40, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(5, 70, 10, 0);
        panelIzq.add(textCoordX1, gridBagConstraints);

        botonListarSiniestros.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        botonListarSiniestros.setForeground(java.awt.Color.white);
        botonListarSiniestros.setText("Listar siniestros");
        botonListarSiniestros.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        botonListarSiniestros.setBorderPainted(false);
        botonListarSiniestros.setPreferredSize(new java.awt.Dimension(140, 30));
        botonListarSiniestros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonListarSiniestrosActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        panelIzq.add(botonListarSiniestros, gridBagConstraints);

        jPanel2.add(panelIzq, java.awt.BorderLayout.WEST);

        panelDer.setBackground(new Color (161, 27, 27,64));
        panelDer.setPreferredSize(new java.awt.Dimension(980, 0));
        panelDer.setLayout(new java.awt.BorderLayout());

        panelDerTop.setBackground(new Color(184, 34, 34));
        panelDerTop.setPreferredSize(new java.awt.Dimension(980, 300));
        panelDerTop.setLayout(new java.awt.BorderLayout());

        jTable1.setBackground(new Color(193,29,29));
        jTable1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTable1.setForeground(java.awt.Color.white);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setRowHeight(24);
        jScrollPane1.setViewportView(jTable1);

        panelDerTop.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jLabel6.setBackground(new Color(184, 34, 34));
        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(java.awt.Color.white);
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Cuarteles");
        panelDerTop.add(jLabel6, java.awt.BorderLayout.PAGE_START);

        panelDer.add(panelDerTop, java.awt.BorderLayout.NORTH);

        panelDerMid.setBackground(new Color(184, 34, 34));
        panelDerMid.setPreferredSize(new java.awt.Dimension(980, 40));
        panelDerMid.setLayout(new java.awt.BorderLayout());

        botonAsignarSiniestro.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        botonAsignarSiniestro.setForeground(java.awt.Color.white);
        botonAsignarSiniestro.setText("Asignar");
        botonAsignarSiniestro.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        botonAsignarSiniestro.setPreferredSize(new java.awt.Dimension(71, 30));
        panelDerMid.add(botonAsignarSiniestro, java.awt.BorderLayout.CENTER);

        panelDer.add(panelDerMid, java.awt.BorderLayout.CENTER);

        panelDerBot.setBackground(new Color(184, 34, 34));
        panelDerBot.setPreferredSize(new java.awt.Dimension(980, 300));
        panelDerBot.setLayout(new java.awt.BorderLayout());

        jTable2.setBackground(new Color(193,29,29));
        jTable2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable2.setRowHeight(24);
        jScrollPane2.setViewportView(jTable2);

        panelDerBot.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        jLabel7.setBackground(new Color(184, 34, 34));
        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setForeground(java.awt.Color.white);
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Brigadas");
        panelDerBot.add(jLabel7, java.awt.BorderLayout.PAGE_START);

        panelDer.add(panelDerBot, java.awt.BorderLayout.SOUTH);

        jPanel2.add(panelDer, java.awt.BorderLayout.EAST);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondoSiniestro.png"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(1280, 853));
        jLabel1.setMinimumSize(new java.awt.Dimension(1280, 640));
        jLabel1.setPreferredSize(new java.awt.Dimension(1280, 640));

        javax.swing.GroupLayout panelRootLayout = new javax.swing.GroupLayout(panelRoot);
        panelRoot.setLayout(panelRootLayout);
        panelRootLayout.setHorizontalGroup(
            panelRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRootLayout.setVerticalGroup(
            panelRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelRoot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelRoot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonListarSiniestrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonListarSiniestrosActionPerformed
        // TODO add your handling code here:
        mostrarPanel(new ListarSiniestros());
    }//GEN-LAST:event_botonListarSiniestrosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAsignarSiniestro;
    private javax.swing.JButton botonListarSiniestros;
    private javax.swing.JComboBox<String> comboTipoAccidenteSiniestro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JPanel panelDer;
    private javax.swing.JPanel panelDerBot;
    private javax.swing.JPanel panelDerMid;
    private javax.swing.JPanel panelDerTop;
    private javax.swing.JPanel panelIzq;
    private javax.swing.JPanel panelRoot;
    private javax.swing.JMenuItem popmenuMarcar;
    private javax.swing.JPopupMenu popupMenu;
    private javax.swing.JTextArea textAreaDescripcion;
    private javax.swing.JTextField textCoordX1;
    private javax.swing.JTextField textCoordY;
    private javax.swing.JTextField textFechaSiniestro;
    // End of variables declaration//GEN-END:variables


    public void botones() {
        JButton btns[] = {botonAsignarSiniestro, botonListarSiniestros};
        for (JButton btn : btns) {
            btn.setBackground(new Color(161, 27, 27));
            btn.setUI(new BasicButtonUI());
            btn.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {
                }

                @Override
                public void mousePressed(MouseEvent e) {
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    btn.setBackground(new Color(252, 68, 22));
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    btn.setBackground(new Color(161, 27, 27));
                }
            });
        }
    }
    
        public void mostrarPanel(Component com) {
        panelDer.removeAll();
        panelDer.add(com);
        panelDer.repaint();
        panelDer.revalidate();
    }
}
