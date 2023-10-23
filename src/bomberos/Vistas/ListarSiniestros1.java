/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bomberos.Vistas;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.plaf.basic.BasicButtonUI;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jero
 */
public class ListarSiniestros1 extends javax.swing.JPanel {

    String[] modeloCuartel = {"ID", "Nombre", "Direccion", "X", "Y", "Telefono", "Correo"};
    DefaultTableModel modeloCuartelAct = new DefaultTableModel(null, modeloCuartel) {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };

    /**
     * Creates new form ListarCuarteles
     */
    public ListarSiniestros1() {
        initComponents();
//        modeloTablaCuartel();
        botones();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        panelMain = new javax.swing.JPanel();
        panelTop = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        panelMid = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaListarAdmin = new javax.swing.JTable();
        panelBot = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        textDescSiniestro = new javax.swing.JTextArea();
        textTipoSiniestro = new javax.swing.JTextField();
        textFechaInicioSiniestro = new javax.swing.JTextField();
        textFechaFinSiniestro = new javax.swing.JTextField();
        textPuntajeSiniestro = new javax.swing.JTextField();
        textBrigadaSiniestro = new javax.swing.JTextField();
        botonModificarSiniestro = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        textPuntajeSiniestro1 = new javax.swing.JTextField();
        textPuntajeSiniestro2 = new javax.swing.JTextField();
        botonFinalizarSiniestro = new javax.swing.JButton();

        panelMain.setBackground(new Color(0,0,0,0));
        panelMain.setMinimumSize(new java.awt.Dimension(0, 0));
        panelMain.setPreferredSize(new java.awt.Dimension(980, 640));
        panelMain.setLayout(new java.awt.BorderLayout());

        panelTop.setBackground(new Color(161, 27, 27));
        panelTop.setPreferredSize(new java.awt.Dimension(0, 100));
        panelTop.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText("Seleccione un siniestro:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        panelTop.add(jLabel1, gridBagConstraints);

        jCheckBox1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jCheckBox1.setForeground(java.awt.Color.white);
        jCheckBox1.setText("Ultimas 48 horas");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        panelTop.add(jCheckBox1, gridBagConstraints);

        panelMain.add(panelTop, java.awt.BorderLayout.NORTH);

        panelMid.setBackground(new Color(161, 27, 27,220));
        panelMid.setPreferredSize(new java.awt.Dimension(0, 580));
        panelMid.setLayout(new java.awt.BorderLayout());

        jScrollPane1.setPreferredSize(new java.awt.Dimension(980, 580));

        tablaListarAdmin.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tablaListarAdmin.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tablaListarAdmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaListarAdmin.setRowHeight(30);
        jScrollPane1.setViewportView(tablaListarAdmin);

        panelMid.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        panelMain.add(panelMid, java.awt.BorderLayout.CENTER);

        panelBot.setBackground(new Color(161, 27, 27));
        panelBot.setPreferredSize(new java.awt.Dimension(0, 300));
        panelBot.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText("Descripcion:");
        panelBot.add(jLabel2);
        jLabel2.setBounds(215, 168, 88, 19);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("X:");
        panelBot.add(jLabel3);
        jLabel3.setBounds(512, 55, 13, 19);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setText("Fecha fin:");
        panelBot.add(jLabel4);
        jLabel4.setBounds(230, 55, 69, 19);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(java.awt.Color.white);
        jLabel5.setText("Fecha inicio:");
        panelBot.add(jLabel5);
        jLabel5.setBounds(210, 20, 89, 19);

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(java.awt.Color.white);
        jLabel6.setText("Puntaje:");
        panelBot.add(jLabel6);
        jLabel6.setBounds(376, 55, 57, 19);

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(java.awt.Color.white);
        jLabel7.setText("Brigada asignada");
        panelBot.add(jLabel7);
        jLabel7.setBounds(657, 20, 121, 19);

        textDescSiniestro.setBackground(new Color(193,29,29));
        textDescSiniestro.setColumns(20);
        textDescSiniestro.setRows(5);
        textDescSiniestro.setMinimumSize(new java.awt.Dimension(0, 0));
        jScrollPane2.setViewportView(textDescSiniestro);

        panelBot.add(jScrollPane2);
        jScrollPane2.setBounds(303, 92, 323, 183);

        textTipoSiniestro.setBackground(new Color(193,29,29));
        textTipoSiniestro.setPreferredSize(new java.awt.Dimension(200, 30));
        panelBot.add(textTipoSiniestro);
        textTipoSiniestro.setBounds(434, 15, 200, 30);

        textFechaInicioSiniestro.setBackground(new Color(193,29,29));
        textFechaInicioSiniestro.setPreferredSize(new java.awt.Dimension(70, 30));
        panelBot.add(textFechaInicioSiniestro);
        textFechaInicioSiniestro.setBounds(303, 15, 70, 30);

        textFechaFinSiniestro.setBackground(new Color(193,29,29));
        textFechaFinSiniestro.setPreferredSize(new java.awt.Dimension(70, 30));
        panelBot.add(textFechaFinSiniestro);
        textFechaFinSiniestro.setBounds(303, 50, 70, 30);

        textPuntajeSiniestro.setBackground(new Color(193,29,29));
        textPuntajeSiniestro.setPreferredSize(new java.awt.Dimension(40, 30));
        panelBot.add(textPuntajeSiniestro);
        textPuntajeSiniestro.setBounds(528, 50, 40, 30);

        textBrigadaSiniestro.setBackground(new Color(193,29,29));
        textBrigadaSiniestro.setPreferredSize(new java.awt.Dimension(50, 30));
        panelBot.add(textBrigadaSiniestro);
        textBrigadaSiniestro.setBounds(689, 45, 50, 30);

        botonModificarSiniestro.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        botonModificarSiniestro.setForeground(java.awt.Color.white);
        botonModificarSiniestro.setText("Modificar");
        botonModificarSiniestro.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        botonModificarSiniestro.setBorderPainted(false);
        botonModificarSiniestro.setPreferredSize(new java.awt.Dimension(120, 40));
        panelBot.add(botonModificarSiniestro);
        botonModificarSiniestro.setBounds(634, 132, 120, 40);

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(java.awt.Color.white);
        jLabel8.setText("Tipo:");
        panelBot.add(jLabel8);
        jLabel8.setBounds(398, 20, 34, 19);

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setForeground(java.awt.Color.white);
        jLabel9.setText("Y:");
        panelBot.add(jLabel9);
        jLabel9.setBounds(576, 55, 14, 19);

        textPuntajeSiniestro1.setBackground(new Color(193,29,29));
        textPuntajeSiniestro1.setPreferredSize(new java.awt.Dimension(40, 30));
        panelBot.add(textPuntajeSiniestro1);
        textPuntajeSiniestro1.setBounds(594, 50, 40, 30);

        textPuntajeSiniestro2.setBackground(new Color(193,29,29));
        textPuntajeSiniestro2.setPreferredSize(new java.awt.Dimension(40, 30));
        panelBot.add(textPuntajeSiniestro2);
        textPuntajeSiniestro2.setBounds(434, 50, 40, 30);

        botonFinalizarSiniestro.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        botonFinalizarSiniestro.setForeground(java.awt.Color.white);
        botonFinalizarSiniestro.setText("Finalizar");
        botonFinalizarSiniestro.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        botonFinalizarSiniestro.setBorderPainted(false);
        botonFinalizarSiniestro.setPreferredSize(new java.awt.Dimension(120, 40));
        panelBot.add(botonFinalizarSiniestro);
        botonFinalizarSiniestro.setBounds(634, 190, 120, 40);

        panelMain.add(panelBot, java.awt.BorderLayout.SOUTH);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cbListarAdminActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_cbListarAdminActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_cbListarAdminActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonFinalizarSiniestro;
    private javax.swing.JButton botonModificarSiniestro;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panelBot;
    private javax.swing.JPanel panelMain;
    private javax.swing.JPanel panelMid;
    private javax.swing.JPanel panelTop;
    private javax.swing.JTable tablaListarAdmin;
    private javax.swing.JTextField textBrigadaSiniestro;
    private javax.swing.JTextArea textDescSiniestro;
    private javax.swing.JTextField textFechaFinSiniestro;
    private javax.swing.JTextField textFechaInicioSiniestro;
    private javax.swing.JTextField textPuntajeSiniestro;
    private javax.swing.JTextField textPuntajeSiniestro1;
    private javax.swing.JTextField textPuntajeSiniestro2;
    private javax.swing.JTextField textTipoSiniestro;
    // End of variables declaration//GEN-END:variables

//    public void modeloTablaCuartel() {
//        tablaListarAdmin.setModel(modeloCuartelAct);
//        TableColumnModel columnaCuartel = tablaListarAdmin.getColumnModel();
//        columnaCuartel.getColumn(0).setMaxWidth(60);
//        columnaCuartel.getColumn(1).setMaxWidth(300);
//        columnaCuartel.getColumn(2).setMaxWidth(500);
//        columnaCuartel.getColumn(3).setMaxWidth(40);
//        columnaCuartel.getColumn(4).setMaxWidth(40);
//        columnaCuartel.getColumn(5).setMaxWidth(100);
//        columnaCuartel.getColumn(6).setMaxWidth(500);
//    }

    public void botones() {
        JButton btns[] = {botonModificarSiniestro, botonFinalizarSiniestro};
        for (JButton btn : btns) {
            btn.setBackground(new Color(184, 34, 34));
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
                    btn.setBackground(new Color(184, 34, 34));
                }
            });
        }
    }
}
