/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VentanaCalculadora;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Usuario
 */
public class VentanaCalculadora extends javax.swing.JFrame {
    //Para que se cambie el número que vayamos poniendo, creamos una variable
    private String cadenaNumeros="";
    
    // Variable para sumar
    private double numero1, resultado;
    private String operacion = "nula";
    private boolean activado = true; // Para evitar dejar botones pulsados
    private boolean punto = true;

    /**
     * Creates new form VentanaCalculadora
     */
    public VentanaCalculadora() {
        initComponents();
        setSize(300, 450);
        setLocationRelativeTo(null);
        
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

        jPanel1 = new javax.swing.JPanel();
        Panel = new javax.swing.JPanel();
        EtiquetaMuestra = new javax.swing.JLabel();
        Numeros = new javax.swing.JLabel();
        Clear = new javax.swing.JButton();
        RaizCuadrada = new javax.swing.JButton();
        Division = new javax.swing.JButton();
        Borrar = new javax.swing.JButton();
        Numero7 = new javax.swing.JButton();
        boton8 = new javax.swing.JButton();
        Boton9 = new javax.swing.JButton();
        BotonMultiplicar = new javax.swing.JButton();
        Boton4 = new javax.swing.JButton();
        Boton5 = new javax.swing.JButton();
        Boton6 = new javax.swing.JButton();
        Boton1 = new javax.swing.JButton();
        Boton2 = new javax.swing.JButton();
        Boton3 = new javax.swing.JButton();
        BotonMenos = new javax.swing.JButton();
        BotonMas = new javax.swing.JButton();
        CambiarSigno = new javax.swing.JButton();
        Boton0 = new javax.swing.JButton();
        BotonPunto = new javax.swing.JButton();
        BotonIgual = new javax.swing.JButton();
        Menu = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        CalculadoraEstándar = new javax.swing.JMenuItem();
        Menú = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        Salir = new javax.swing.JMenuItem();

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

        Panel.setLayout(new java.awt.GridBagLayout());

        EtiquetaMuestra.setFont(new java.awt.Font("Yu Gothic UI Semibold", 3, 36)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        Panel.add(EtiquetaMuestra, gridBagConstraints);

        Numeros.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        Numeros.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        Panel.add(Numeros, gridBagConstraints);

        Clear.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Clear.setText("C");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        Panel.add(Clear, gridBagConstraints);

        RaizCuadrada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/RaizCuadrada.png"))); // NOI18N
        RaizCuadrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RaizCuadradaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        Panel.add(RaizCuadrada, gridBagConstraints);

        Division.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Division_1.png"))); // NOI18N
        Division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DivisionActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        Panel.add(Division, gridBagConstraints);

        Borrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Borrar_1.png"))); // NOI18N
        Borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        Panel.add(Borrar, gridBagConstraints);

        Numero7.setBackground(new java.awt.Color(153, 153, 153));
        Numero7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Numero7.setText("7");
        Numero7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Numero7ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        Panel.add(Numero7, gridBagConstraints);

        boton8.setBackground(new java.awt.Color(153, 153, 153));
        boton8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        boton8.setText("8");
        boton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton8ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        Panel.add(boton8, gridBagConstraints);

        Boton9.setBackground(new java.awt.Color(153, 153, 153));
        Boton9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Boton9.setText("9");
        Boton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton9ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        Panel.add(Boton9, gridBagConstraints);

        BotonMultiplicar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BotonMultiplicar.setText("X");
        BotonMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMultiplicarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        Panel.add(BotonMultiplicar, gridBagConstraints);

        Boton4.setBackground(new java.awt.Color(153, 153, 153));
        Boton4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Boton4.setText("4");
        Boton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        Panel.add(Boton4, gridBagConstraints);

        Boton5.setBackground(new java.awt.Color(153, 153, 153));
        Boton5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Boton5.setText("5");
        Boton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton5ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        Panel.add(Boton5, gridBagConstraints);

        Boton6.setBackground(new java.awt.Color(153, 153, 153));
        Boton6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Boton6.setText("6");
        Boton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton6ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        Panel.add(Boton6, gridBagConstraints);

        Boton1.setBackground(new java.awt.Color(153, 153, 153));
        Boton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Boton1.setText("1");
        Boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        Panel.add(Boton1, gridBagConstraints);

        Boton2.setBackground(new java.awt.Color(153, 153, 153));
        Boton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Boton2.setText("2");
        Boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        Panel.add(Boton2, gridBagConstraints);

        Boton3.setBackground(new java.awt.Color(153, 153, 153));
        Boton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Boton3.setText("3");
        Boton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        Panel.add(Boton3, gridBagConstraints);

        BotonMenos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BotonMenos.setText("-");
        BotonMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMenosActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        Panel.add(BotonMenos, gridBagConstraints);

        BotonMas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BotonMas.setText("+");
        BotonMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMasActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        Panel.add(BotonMas, gridBagConstraints);

        CambiarSigno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MasMenos_1.png"))); // NOI18N
        CambiarSigno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CambiarSignoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        Panel.add(CambiarSigno, gridBagConstraints);

        Boton0.setBackground(new java.awt.Color(153, 153, 153));
        Boton0.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Boton0.setText("0");
        Boton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton0ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        Panel.add(Boton0, gridBagConstraints);

        BotonPunto.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BotonPunto.setText(".");
        BotonPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPuntoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        Panel.add(BotonPunto, gridBagConstraints);

        BotonIgual.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BotonIgual.setText("=");
        BotonIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonIgualActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        Panel.add(BotonIgual, gridBagConstraints);

        jMenu1.setText("Usos");
        jMenu1.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N

        CalculadoraEstándar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Calculadora_1.png"))); // NOI18N
        CalculadoraEstándar.setText("CalculadoraEstándar");
        CalculadoraEstándar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalculadoraEstándarActionPerformed(evt);
            }
        });
        jMenu1.add(CalculadoraEstándar);

        Menú.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/InfoAlumno.png"))); // NOI18N
        Menú.setText("Información del alumno");
        Menú.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenúActionPerformed(evt);
            }
        });
        jMenu1.add(Menú);
        jMenu1.add(jSeparator1);
        jMenu1.add(jSeparator2);
        jMenu1.add(jSeparator3);

        Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Salir.png"))); // NOI18N
        Salir.setText("EXIT");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        jMenu1.add(Salir);

        Menu.add(jMenu1);

        setJMenuBar(Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        EtiquetaMuestra.setText("");
        Numeros.setText("0");
        cadenaNumeros="";
        operacion = "nula";
        activado = true;
        punto = true;
    }//GEN-LAST:event_ClearActionPerformed

    private void DivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DivisionActionPerformed
               if ( activado == true ){
        numero1 = Double.parseDouble(cadenaNumeros);
         EtiquetaMuestra.setText(cadenaNumeros+" / ");
        cadenaNumeros= "";
       
        operacion = "dividir";
        activado = false;
        punto= true;
       }
    }//GEN-LAST:event_DivisionActionPerformed

    private void boton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton8ActionPerformed
                cadenaNumeros +="8";
        Numeros.setText(cadenaNumeros);
           activado = true;
              punto = true;
    }//GEN-LAST:event_boton8ActionPerformed

    private void Boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton1ActionPerformed

        Numeros.setText(cadenaNumeros);
        activado = true;
           punto = true;
    }//GEN-LAST:event_Boton1ActionPerformed

    private void Boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton2ActionPerformed
                cadenaNumeros +="2";
        Numeros.setText(cadenaNumeros);
           activado = true;
              punto = true;
    }//GEN-LAST:event_Boton2ActionPerformed

    private void Boton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton3ActionPerformed
               cadenaNumeros +="3";
        Numeros.setText(cadenaNumeros);
           activado = true;
              punto = true;
    }//GEN-LAST:event_Boton3ActionPerformed

    private void Boton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton0ActionPerformed
        if( cadenaNumeros != ""){
            cadenaNumeros +="0";
             Numeros.setText(cadenaNumeros);
                activado = true;
                   punto = true;
        }      
       
    }//GEN-LAST:event_Boton0ActionPerformed

    private void Boton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton4ActionPerformed
                cadenaNumeros +="4";
        Numeros.setText(cadenaNumeros);
           activado = true;
              punto = true;
    }//GEN-LAST:event_Boton4ActionPerformed

    private void Boton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton5ActionPerformed
              cadenaNumeros +="5";
        Numeros.setText(cadenaNumeros);
           activado = true;
              punto = true;
    }//GEN-LAST:event_Boton5ActionPerformed

    private void Boton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton6ActionPerformed
               cadenaNumeros +="6";
        Numeros.setText(cadenaNumeros);
                   activado = true;
                      punto = true;
    }//GEN-LAST:event_Boton6ActionPerformed

    private void Numero7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Numero7ActionPerformed
                cadenaNumeros +="7";
        Numeros.setText(cadenaNumeros);
           activado = true;
              punto = true;
    }//GEN-LAST:event_Numero7ActionPerformed

    private void Boton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton9ActionPerformed
                cadenaNumeros +="9";
        Numeros.setText(cadenaNumeros);
           activado = true;
              punto = true;
    }//GEN-LAST:event_Boton9ActionPerformed

    private void BotonMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMasActionPerformed
       if ( activado == true ){
        numero1 = Double.parseDouble(cadenaNumeros);
         EtiquetaMuestra.setText(cadenaNumeros+" + ");
        cadenaNumeros= "";
       
        operacion = "sumar";
        activado = false;
        punto = true;
       }
    }//GEN-LAST:event_BotonMasActionPerformed

    private void BotonIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonIgualActionPerformed
      double numero2;
        if(operacion.equals("nula")){
           Numeros.setText(cadenaNumeros);
       } else if (operacion.equals("sumar")){
           numero2 = Double.parseDouble(cadenaNumeros);
           resultado = numero1+numero2;
           EtiquetaMuestra.setText(String.format("%.2f",resultado));
           //Significa que pasa el double a String y solo coge dos decimales
           cadenaNumeros = String.valueOf(resultado); // Para saber el resultado actual
           operacion ="nula";
       } else if( operacion.equals("restar")){
           numero2 = Double.parseDouble(cadenaNumeros);
           resultado = numero1-numero2;
            EtiquetaMuestra.setText(String.format("%.2f",resultado));
            cadenaNumeros = String.valueOf(resultado);
            operacion = "nula";
           
       }else if( operacion.equals("multiplicar")){
           numero2 = Double.parseDouble(cadenaNumeros);
           resultado = numero1*numero2;
            EtiquetaMuestra.setText(String.format("%.2f",resultado));
            cadenaNumeros = String.valueOf(resultado);
            operacion = "nula";
           
       }else if( operacion.equals("dividir")){
           numero2 = Double.parseDouble(cadenaNumeros);
           resultado = numero1/numero2;
            EtiquetaMuestra.setText(String.format("%.2f",resultado));
            cadenaNumeros = String.valueOf(resultado);
            operacion = "nula";
           
       }

        Numeros.setText("");
           activado = true;
          
    }//GEN-LAST:event_BotonIgualActionPerformed

    private void BotonPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPuntoActionPerformed
       if(punto == true) {
        if(cadenaNumeros ==""){
           cadenaNumeros = "0.";
       }else
        cadenaNumeros += ".";
        
       }
       EtiquetaMuestra.setText(cadenaNumeros);
       Numeros.setText(cadenaNumeros);
       punto = false;
    }//GEN-LAST:event_BotonPuntoActionPerformed

    private void CambiarSignoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CambiarSignoActionPerformed
        if(cadenaNumeros.charAt(0) != '-'){
            cadenaNumeros = "-"+cadenaNumeros;
        } else {
            cadenaNumeros = cadenaNumeros.substring(1, cadenaNumeros.length());
        }
        EtiquetaMuestra.setText(cadenaNumeros);
        Numeros.setText(cadenaNumeros);
    }//GEN-LAST:event_CambiarSignoActionPerformed

    private void BorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarActionPerformed
        int tamaño = cadenaNumeros.length();
        if(tamaño>0){
            if(tamaño ==1){
                cadenaNumeros = "0";
            } else{
            cadenaNumeros = cadenaNumeros.substring(0, cadenaNumeros.length()-1);
            
            }
            Numeros.setText(cadenaNumeros);
        }
    }//GEN-LAST:event_BorrarActionPerformed

    private void BotonMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMenosActionPerformed
            if ( activado == true ){
        numero1 = Double.parseDouble(cadenaNumeros);
         EtiquetaMuestra.setText(cadenaNumeros+" - ");
        cadenaNumeros= "";
       
        operacion = "restar";
        activado = false;
        punto= true;
       }
    }//GEN-LAST:event_BotonMenosActionPerformed

    private void BotonMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMultiplicarActionPerformed
        if ( activado == true ){
        numero1 = Double.parseDouble(cadenaNumeros);
         EtiquetaMuestra.setText(cadenaNumeros+" X ");
        cadenaNumeros= "";
       
        operacion = "multiplicar";
        activado = false;
        punto= true;
       }
    }//GEN-LAST:event_BotonMultiplicarActionPerformed

    private void RaizCuadradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RaizCuadradaActionPerformed
        if (activado == true) {
            numero1 = Double.parseDouble(cadenaNumeros);
            EtiquetaMuestra.setText("sqrt(" + cadenaNumeros + ")");

            resultado = Math.sqrt(numero1);
            EtiquetaMuestra.setText(String.format("%.2f", resultado));
            cadenaNumeros = String.valueOf(resultado);

            punto = true;
        }
    }//GEN-LAST:event_RaizCuadradaActionPerformed

    private void MenúActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenúActionPerformed
 VentanaMenu ventana = new VentanaMenu();
 ventana.setVisible(true);
    }//GEN-LAST:event_MenúActionPerformed

    private void CalculadoraEstándarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalculadoraEstándarActionPerformed
        //Para abrir la calculadora, con ACTIONS
        VentanaCalculadora calculadora = new VentanaCalculadora();
        calculadora.setVisible(true);
        dispose(); //Evitamos que se abran muchas ventanas
    }//GEN-LAST:event_CalculadoraEstándarActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            /* Set the Nimbus look and feel */
            //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
            /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
            * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
            */
            
            /*
            Con lo que he hecho aquí, primero he importado un .java a las librerías
            para conseguir un formato predeterminado, y luego ponemos los catch
            para evitar errores, se pueden comentar como haré los catch
            */
            
            UIManager.setLookAndFeel("com.jtattoo.plaf.texture.TextureLookAndFeel");
        } catch (ClassNotFoundException ex) {
           // Logger.getLogger(VentanaCalculadora.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
           // Logger.getLogger(VentanaCalculadora.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
           // Logger.getLogger(VentanaCalculadora.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
           // Logger.getLogger(VentanaCalculadora.class.getName()).log(Level.SEVERE, null, ex);
        }
       

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Borrar;
    private javax.swing.JButton Boton0;
    private javax.swing.JButton Boton1;
    private javax.swing.JButton Boton2;
    private javax.swing.JButton Boton3;
    private javax.swing.JButton Boton4;
    private javax.swing.JButton Boton5;
    private javax.swing.JButton Boton6;
    private javax.swing.JButton Boton9;
    private javax.swing.JButton BotonIgual;
    private javax.swing.JButton BotonMas;
    private javax.swing.JButton BotonMenos;
    private javax.swing.JButton BotonMultiplicar;
    private javax.swing.JButton BotonPunto;
    private javax.swing.JMenuItem CalculadoraEstándar;
    private javax.swing.JButton CambiarSigno;
    private javax.swing.JButton Clear;
    private javax.swing.JButton Division;
    private javax.swing.JLabel EtiquetaMuestra;
    private javax.swing.JMenuBar Menu;
    private javax.swing.JMenuItem Menú;
    private javax.swing.JButton Numero7;
    private javax.swing.JLabel Numeros;
    private javax.swing.JPanel Panel;
    private javax.swing.JButton RaizCuadrada;
    private javax.swing.JMenuItem Salir;
    private javax.swing.JButton boton8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
