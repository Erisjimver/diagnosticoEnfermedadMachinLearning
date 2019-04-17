package Vista;

import Controlador.IngresoParametros;
import Controlador.PrologMetodos;
import java.awt.HeadlessException;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {
    PrologMetodos pm=new PrologMetodos();
    IngresoParametros ip=new IngresoParametros();
    JFileChooser file=new JFileChooser();
    String archivo=null;
    int index;    

 
    public Principal() {
        initComponents();
        fiebre.setVisible(false);
        lblindice.setVisible(false);
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/Icono.png")).getImage());
    }
    
    public void habilitar(){
    fiebre.setEnabled(true);
    }
    public void Desabilitar(){
    fiebre.setEnabled(false);
    }


    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelSintomas = new javax.swing.JPanel();
        CheckBoxDolorCabeza = new javax.swing.JCheckBox();
        CheckBoxTos = new javax.swing.JCheckBox();
        CheckBoxManchasRojas = new javax.swing.JCheckBox();
        CheckBoxVomito = new javax.swing.JCheckBox();
        CheckBoxDiarrea = new javax.swing.JCheckBox();
        fiebre = new javax.swing.JTextField();
        lblindice = new javax.swing.JLabel();
        CheckBoxFiebre = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        TextResultado = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        BtnLimpiar1 = new javax.swing.JButton();
        BtnConsultar = new javax.swing.JButton();
        BtnConectar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextSintomas = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        BarraMenu = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Diagnostico de enfermedades");
        setResizable(false);

        PanelSintomas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SINTOMAS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));
        PanelSintomas.setMinimumSize(new java.awt.Dimension(480, 314));

        CheckBoxDolorCabeza.setText("Dolor de cabeza");

        CheckBoxTos.setText("Tos");

        CheckBoxManchasRojas.setText("Manchas rojas");

        CheckBoxVomito.setText("Vomito ");

        CheckBoxDiarrea.setText("Dearrea");

        fiebre.setEnabled(false);
        fiebre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fiebreKeyTyped(evt);
            }
        });

        lblindice.setText("Ingrese temperatura");

        CheckBoxFiebre.setText("Fiebre");
        CheckBoxFiebre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxFiebreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelSintomasLayout = new javax.swing.GroupLayout(PanelSintomas);
        PanelSintomas.setLayout(PanelSintomasLayout);
        PanelSintomasLayout.setHorizontalGroup(
            PanelSintomasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(PanelSintomasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelSintomasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CheckBoxManchasRojas)
                    .addComponent(CheckBoxTos)
                    .addComponent(CheckBoxDolorCabeza)
                    .addGroup(PanelSintomasLayout.createSequentialGroup()
                        .addComponent(CheckBoxFiebre)
                        .addGap(57, 57, 57)
                        .addComponent(lblindice)
                        .addGap(18, 18, 18)
                        .addComponent(fiebre, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(CheckBoxVomito)
                    .addComponent(CheckBoxDiarrea))
                .addContainerGap(158, Short.MAX_VALUE))
        );
        PanelSintomasLayout.setVerticalGroup(
            PanelSintomasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSintomasLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelSintomasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CheckBoxFiebre)
                    .addComponent(fiebre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblindice))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CheckBoxDolorCabeza)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CheckBoxTos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CheckBoxManchasRojas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CheckBoxDiarrea)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CheckBoxVomito)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        jLabel1.setText("Enfermedad:");

        jPanel2.setBackground(new java.awt.Color(153, 0, 0));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("DIAGNOSTICO DE ENFERMEDADES");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(284, 284, 284))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ACCIONES", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        BtnLimpiar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Borrar.png"))); // NOI18N
        BtnLimpiar1.setText("Nuevo");
        BtnLimpiar1.setBorderPainted(false);
        BtnLimpiar1.setContentAreaFilled(false);
        BtnLimpiar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BtnLimpiar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnLimpiar1.setIconTextGap(-4);
        BtnLimpiar1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnLimpiar1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnLimpiar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimpiar1ActionPerformed(evt);
            }
        });

        BtnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ejecutar.png"))); // NOI18N
        BtnConsultar.setText("CONSULTAR");
        BtnConsultar.setBorderPainted(false);
        BtnConsultar.setContentAreaFilled(false);
        BtnConsultar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BtnConsultar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnConsultar.setIconTextGap(-4);
        BtnConsultar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnConsultar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConsultarActionPerformed(evt);
            }
        });

        BtnConectar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Conectar.png"))); // NOI18N
        BtnConectar.setText("Conectar");
        BtnConectar.setBorderPainted(false);
        BtnConectar.setContentAreaFilled(false);
        BtnConectar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BtnConectar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnConectar.setIconTextGap(-4);
        BtnConectar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnConectar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConectarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnConectar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(BtnConsultar)
                .addGap(62, 62, 62)
                .addComponent(BtnLimpiar1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BtnConectar)
                    .addComponent(BtnConsultar)
                    .addComponent(BtnLimpiar1))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        TextSintomas.setColumns(20);
        TextSintomas.setRows(5);
        jScrollPane1.setViewportView(TextSintomas);

        jLabel3.setText("Sintomas:");

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Inicio.png"))); // NOI18N
        jMenu1.setText("Inicio");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir.png"))); // NOI18N
        jMenuItem1.setText("Salir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        BarraMenu.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Archivos.png"))); // NOI18N
        jMenu2.setText("Archivos");

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        jMenuItem2.setText("Buscar Archivo");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        BarraMenu.add(jMenu2);

        setJMenuBar(BarraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelSintomas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                            .addComponent(TextResultado))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel3)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(PanelSintomas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void BtnConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConectarActionPerformed
        TextResultado.setText(pm.OpenProlog());
    }//GEN-LAST:event_BtnConectarActionPerformed

    private void BtnLimpiar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimpiar1ActionPerformed
        TextResultado.setText(null);
        TextSintomas.setText(null);
    }//GEN-LAST:event_BtnLimpiar1ActionPerformed

    private void BtnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConsultarActionPerformed
    try{
        if((CheckBoxFiebre.isSelected())&&(CheckBoxDolorCabeza.isSelected())&&(CheckBoxTos.isSelected())&&
                (!CheckBoxManchasRojas.isSelected())&&(!CheckBoxDiarrea.isSelected())&&(!CheckBoxVomito.isSelected()))
        { 
            
                TextSintomas.setText(ip.SintomasGripeoPaludismo(fiebre.getText()));
                TextResultado.setText(ip.Diagnostico1y2(fiebre.getText()));
        } 
        else if((CheckBoxFiebre.isSelected())&&(CheckBoxDolorCabeza.isSelected())&&(CheckBoxTos.isSelected())&&(CheckBoxManchasRojas.isSelected())&&
                (!CheckBoxDiarrea.isSelected())&&(!CheckBoxVomito.isSelected()))
        { 
                TextSintomas.setText(ip.SintomasDengue(fiebre.getText()));
                TextResultado.setText(ip.Diagnostico3(fiebre.getText()));
        }
        else if((CheckBoxFiebre.isSelected())&&(CheckBoxDolorCabeza.isSelected())&&(CheckBoxTos.isSelected())&&(CheckBoxManchasRojas.isSelected())&&(CheckBoxDiarrea.isSelected())&&(CheckBoxVomito.isSelected()))
        { 
                TextSintomas.setText(ip.SintomasSika(fiebre.getText()));
                TextResultado.setText(ip.Diagnostico4(fiebre.getText()));
        }
        else if((!CheckBoxFiebre.isSelected())&&(!CheckBoxDolorCabeza.isSelected())&&(!CheckBoxTos.isSelected())&&(!CheckBoxManchasRojas.isSelected())&&(!CheckBoxDiarrea.isSelected())&&(!CheckBoxVomito.isSelected()))
        { 
                JOptionPane.showMessageDialog(rootPane,"Selecione los sintomas porfavor");
        } 
    
    }
    catch(HeadlessException e)
    {
    JOptionPane.showMessageDialog(rootPane,e);
    }
    }//GEN-LAST:event_BtnConsultarActionPerformed

    private void CheckBoxFiebreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxFiebreActionPerformed
        if (CheckBoxFiebre.isSelected()) {
            lblindice.setVisible(true);
            fiebre.setVisible(true);
            habilitar();
        }else
        {
            Desabilitar();
        }
    }//GEN-LAST:event_CheckBoxFiebreActionPerformed

    private void fiebreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fiebreKeyTyped
          char c=evt.getKeyChar();                    
          if(Character.isLetter(c)) {
              getToolkit().beep();    
              evt.consume();             
              JOptionPane.showMessageDialog(rootPane,"Ingrese solo numeros");
               
          } 
    }//GEN-LAST:event_fiebreKeyTyped

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        file.setFileSelectionMode(JFileChooser.FILES_ONLY);
        file.setDialogTitle("Explorador de archivos...");
        int buscar=file.showOpenDialog(this);
        if(buscar!=JFileChooser.CANCEL_OPTION)
        {
            try
            {
                archivo = file.getSelectedFile().getName();
                TextResultado.setText(ip.AbrirProlog(archivo)+"\n");           
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(rootPane, e);
            }
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar BarraMenu;
    private javax.swing.JButton BtnConectar;
    private javax.swing.JButton BtnConsultar;
    private javax.swing.JButton BtnLimpiar1;
    private javax.swing.JCheckBox CheckBoxDiarrea;
    private javax.swing.JCheckBox CheckBoxDolorCabeza;
    private javax.swing.JCheckBox CheckBoxFiebre;
    private javax.swing.JCheckBox CheckBoxManchasRojas;
    private javax.swing.JCheckBox CheckBoxTos;
    private javax.swing.JCheckBox CheckBoxVomito;
    private javax.swing.JPanel PanelSintomas;
    private javax.swing.JTextField TextResultado;
    private javax.swing.JTextArea TextSintomas;
    private javax.swing.JTextField fiebre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblindice;
    // End of variables declaration//GEN-END:variables
}
