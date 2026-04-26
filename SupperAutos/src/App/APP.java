package App;

import Clases.Auto;
import Clases.AutoAlquilado;
import Clases.Empresa;
import Clases.Persona;
import javax.swing.JOptionPane;
import Clases.Marcas;
import Clases.Modelos;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;

public class APP extends javax.swing.JFrame {

    private final Empresa empresa;

    /**
     * Creates new form Main
     */
    public APP() {
        this.empresa = new Empresa();
        initComponents();
        this.setLocationRelativeTo(null);
    }

    private void initComponents() {

        titulo = new javax.swing.JLabel();
        titulo.setIcon(new ImageIcon("C:\\Users\\ivanc\\Downloads\\definitiva.jpeg"));
        tabPanel = new javax.swing.JTabbedPane();
        CobrarAlquiler = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(0, 0, 0));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                                        DevolverAuto = new javax.swing.JPanel();
                                        jLabel9 = new javax.swing.JLabel();
                                        jLabel9.setBounds(20, 11, 90, 46);
                                        placaDevolver = new javax.swing.JTextField();
                                        placaDevolver.setBounds(20, 52, 175, 25);
                                        jLabel10 = new javax.swing.JLabel();
                                        jLabel10.setBounds(20, 88, 154, 46);
                                        kilometrajeDevolver = new javax.swing.JTextField();
                                        kilometrajeDevolver.setBounds(20, 131, 175, 25);
                                        multado = new javax.swing.JCheckBox();
                                        multado.setBackground(new Color(0, 0, 0));
                                        multado.setBounds(247, 76, 186, 52);
                                        accidentado = new javax.swing.JCheckBox();
                                        accidentado.setBackground(new Color(0, 0, 0));
                                        accidentado.setBounds(247, 11, 180, 46);
                                        devolver = new javax.swing.JButton();
                                        devolver.setBackground(new Color(255, 255, 255));
                                        devolver.setBounds(247, 183, 180, 52);
                                        
                                                jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                                                jLabel9.setForeground(new Color(255, 0, 0));
                                                jLabel9.setText("Placa:");
                                                
                                                        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                                                        jLabel10.setForeground(new Color(255, 0, 0));
                                                        jLabel10.setText("Kilometraje:");
                                                        
                                                                kilometrajeDevolver.addKeyListener(new java.awt.event.KeyAdapter() {
                                                                    public void keyTyped(java.awt.event.KeyEvent evt) {
                                                                        kilometrajeDevolverKeyTyped(evt);
                                                                    }
                                                                });
                                                                
                                                                        multado.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                                                                        multado.setForeground(new Color(255, 0, 0));
                                                                        multado.setText("MULTA");
                                                                        
                                                                                accidentado.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                                                                                accidentado.setForeground(new Color(255, 0, 0));
                                                                                accidentado.setText("ACCIDENTE\r\n");
                                                                                
                                                                                        devolver.setFont(new Font("Times New Roman", Font.ITALIC, 18)); // NOI18N
                                                                                        devolver.setForeground(new Color(255, 0, 0));
                                                                                        devolver.setText("Devolver");
                                                                                        devolver.addActionListener(new java.awt.event.ActionListener() {
                                                                                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                                                                                devolverActionPerformed(evt);
                                                                                            }
                                                                                        });
                                                                                                DisponibilidadAuto = new javax.swing.JPanel();
                                                                                                jLabel8 = new javax.swing.JLabel();
                                                                                                jLabel8.setBounds(10, 11, 50, 25);
                                                                                                placaDisponibilidad = new javax.swing.JTextField();
                                                                                                placaDisponibilidad.setBounds(80, 15, 142, 25);
                                                                                                consultar = new javax.swing.JButton();
                                                                                                consultar.setBounds(80, 73, 179, 32);
                                                                                                
                                                                                                        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
                                                                                                        jLabel8.setForeground(new Color(255, 0, 0));
                                                                                                        jLabel8.setText("Placa:");
                                                                                                        
                                                                                                                consultar.setFont(new Font("Times New Roman", Font.ITALIC, 18));
                                                                                                                consultar.setForeground(new Color(255, 0, 0));
                                                                                                                consultar.setText("DISPONIBILIDAD");
                                                                                                                consultar.addActionListener(new java.awt.event.ActionListener() {
                                                                                                                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                                                                                                                        consultarActionPerformed(evt);
                                                                                                                    }
                                                                                                                });
                                                                                                                        BuscarAuto = new javax.swing.JPanel();
                                                                                                                        marcas = new javax.swing.JComboBox<>(Marcas.values());
                                                                                                                        marcas.setBounds(10, 54, 130, 32);
                                                                                                                        jLabel5 = new javax.swing.JLabel();
                                                                                                                        jLabel5.setBounds(10, 11, 78, 32);
                                                                                                                        jLabel6 = new javax.swing.JLabel();
                                                                                                                        jLabel6.setBounds(150, 11, 95, 32);
                                                                                                                        modelos = new javax.swing.JComboBox<>(Modelos.values());
                                                                                                                        modelos.setBounds(150, 54, 130, 32);
                                                                                                                        buscarMarcas = new javax.swing.JButton();
                                                                                                                        buscarMarcas.setBounds(10, 97, 130, 32);
                                                                                                                        jLabel7 = new javax.swing.JLabel();
                                                                                                                        jLabel7.setBounds(276, 133, 132, 32);
                                                                                                                        jScrollPane1 = new javax.swing.JScrollPane();
                                                                                                                        jScrollPane1.setBounds(10, 176, 481, 147);
                                                                                                                        buscarModelos = new javax.swing.JButton();
                                                                                                                        buscarModelos.setBounds(150, 97, 130, 32);
                                                                                                                        
                                                                                                                                marcas.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
                                                                                                                                marcas.setForeground(new java.awt.Color(0, 0, 0));
                                                                                                                                
                                                                                                                                        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24));
                                                                                                                                        jLabel5.setForeground(new Color(255, 0, 0));
                                                                                                                                        jLabel5.setText("Marca:");
                                                                                                                                        
                                                                                                                                                jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); 
                                                                                                                                                jLabel6.setForeground(new Color(255, 0, 0));
                                                                                                                                                jLabel6.setText("Modelo:");
                                                                                                                                                
                                                                                                                                                        modelos.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
                                                                                                                                                        modelos.setForeground(new java.awt.Color(0, 0, 0));
                                                                                                                                                        
                                                                                                                                                                buscarMarcas.setFont(new Font("Times New Roman", Font.ITALIC, 18)); 
                                                                                                                                                                buscarMarcas.setForeground(new Color(255, 0, 0));
                                                                                                                                                                buscarMarcas.setText("BUSCAR\r\n");
                                                                                                                                                                buscarMarcas.addActionListener(new java.awt.event.ActionListener() {
                                                                                                                                                                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                                                                                                                                                                        buscarMarcasActionPerformed(evt);
                                                                                                                                                                    }
                                                                                                                                                                });
                                                                                                                                                                
                                                                                                                                                                        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); 
                                                                                                                                                                        jLabel7.setForeground(new Color(255, 0, 0));
                                                                                                                                                                        jLabel7.setText("Resultados:");
                                                                                                                                                                        
                                                                                                                                                                                buscarModelos.setFont(new Font("Times New Roman", Font.ITALIC, 18)); 
                                                                                                                                                                                buscarModelos.setForeground(new Color(255, 0, 0));
                                                                                                                                                                                buscarModelos.setText("BUSCAR\r\n");
                                                                                                                                                                                buscarModelos.addActionListener(new java.awt.event.ActionListener() {
                                                                                                                                                                                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                                                                                                                                                                                        buscarModelosActionPerformed(evt);
                                                                                                                                                                                    }
                                                                                                                                                                                });
                                                                                                                                                                                
                                                                                                                                                                                        tabPanel.addTab("Buscar Auto", BuscarAuto);
                                                                                                                                                                                        BuscarAuto.setLayout(null);
                                                                                                                                                                                        BuscarAuto.add(jScrollPane1);
                                                                                                                                                                                        textAreaResultado = new javax.swing.JTextArea();
                                                                                                                                                                                        jScrollPane1.setViewportView(textAreaResultado);
                                                                                                                                                                                        
                                                                                                                                                                                                textAreaResultado.setColumns(20);
                                                                                                                                                                                                textAreaResultado.setFont(new Font("Times New Roman", Font.BOLD, 14)); 
                                                                                                                                                                                                textAreaResultado.setForeground(new java.awt.Color(0, 0, 0));
                                                                                                                                                                                                textAreaResultado.setRows(5);
                                                                                                                                                                                                BuscarAuto.add(jLabel7);
                                                                                                                                                                                                BuscarAuto.add(jLabel5);
                                                                                                                                                                                                BuscarAuto.add(marcas);
                                                                                                                                                                                                BuscarAuto.add(jLabel6);
                                                                                                                                                                                                BuscarAuto.add(modelos);
                                                                                                                                                                                                BuscarAuto.add(buscarMarcas);
                                                                                                                                                                                                BuscarAuto.add(buscarModelos);
                                                                                                                                                                                                
                                                                                                                                                                                                JLabel lblNewLabel = new JLabel("");
                                                                                                                                                                                                lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ivanc\\Downloads\\tt (1).jpeg"));
                                                                                                                                                                                                lblNewLabel.setBounds(0, 0, 669, 385);
                                                                                                                                                                                                BuscarAuto.add(lblNewLabel);
                                                                                                                
                                                                                                                        tabPanel.addTab("Disponibilidad Auto", DisponibilidadAuto);
                                                                                                                        DisponibilidadAuto.setLayout(null);
                                                                                                                        DisponibilidadAuto.add(jLabel8);
                                                                                                                        DisponibilidadAuto.add(placaDisponibilidad);
                                                                                                                        DisponibilidadAuto.add(consultar);
                                                                                                                        
                                                                                                                        JLabel lblNewLabel_1 = new JLabel("");
                                                                                                                        lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\ivanc\\Downloads\\tt (1).jpeg"));
                                                                                                                        lblNewLabel_1.setBounds(0, 0, 669, 385);
                                                                                                                        DisponibilidadAuto.add(lblNewLabel_1);
                                                                                                AlquilarAuto = new javax.swing.JPanel();
                                                                                                jLabel1 = new javax.swing.JLabel();
                                                                                                jLabel1.setBounds(10, 11, 50, 25);
                                                                                                jLabel2 = new javax.swing.JLabel();
                                                                                                jLabel2.setBounds(165, 11, 63, 25);
                                                                                                jLabel3 = new javax.swing.JLabel();
                                                                                                jLabel3.setBounds(329, 11, 76, 25);
                                                                                                jLabel4 = new javax.swing.JLabel();
                                                                                                jLabel4.setBounds(492, 11, 160, 25);
                                                                                                placa = new javax.swing.JTextField();
                                                                                                placa.setBounds(10, 47, 142, 25);
                                                                                                cedula = new javax.swing.JTextField();
                                                                                                cedula.setBounds(165, 47, 142, 25);
                                                                                                apellido = new javax.swing.JTextField();
                                                                                                apellido.setBounds(329, 47, 142, 25);
                                                                                                kilometraje = new javax.swing.JTextField();
                                                                                                kilometraje.setBounds(492, 47, 142, 25);
                                                                                                jButton1 = new javax.swing.JButton();
                                                                                                jButton1.setBounds(21, 111, 131, 49);
                                                                                                
                                                                                                        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
                                                                                                        jLabel1.setForeground(new Color(255, 0, 0));
                                                                                                        jLabel1.setText("Placa:");
                                                                                                        
                                                                                                                jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
                                                                                                                jLabel2.setForeground(new Color(255, 0, 0));
                                                                                                                jLabel2.setText("Cedula:");
                                                                                                                
                                                                                                                        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
                                                                                                                        jLabel3.setForeground(new Color(255, 0, 0));
                                                                                                                        jLabel3.setText("Apellido:");
                                                                                                                        
                                                                                                                                jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
                                                                                                                                jLabel4.setForeground(new Color(255, 0, 0));
                                                                                                                                jLabel4.setText("Kilometraje actual:");
                                                                                                                                
                                                                                                                                        cedula.addKeyListener(new java.awt.event.KeyAdapter() {
                                                                                                                                            public void keyTyped(java.awt.event.KeyEvent evt) {
                                                                                                                                                cedulaKeyTyped(evt);
                                                                                                                                            }
                                                                                                                                        });
                                                                                                                                        
                                                                                                                                                kilometraje.addKeyListener(new java.awt.event.KeyAdapter() {
                                                                                                                                                    public void keyTyped(java.awt.event.KeyEvent evt) {
                                                                                                                                                        kilometrajeKeyTyped(evt);
                                                                                                                                                    }
                                                                                                                                                });
                                                                                                                                                
                                                                                                                                                        jButton1.setFont(new Font("Times New Roman", Font.ITALIC, 18)); 
                                                                                                                                                        jButton1.setForeground(new Color(255, 0, 0));
                                                                                                                                                        jButton1.setText("ALQUILAR");
                                                                                                                                                        jButton1.addActionListener(new java.awt.event.ActionListener() {
                                                                                                                                                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                                                                                                                                                jButton1ActionPerformed(evt);
                                                                                                                                                            }
                                                                                                                                                        });
                                                                                                                                                        
                                                                                                                                                                tabPanel.addTab("Alquiler auto", AlquilarAuto);
                                                                                                                                                                AlquilarAuto.setLayout(null);
                                                                                                                                                                AlquilarAuto.add(jLabel1);
                                                                                                                                                                AlquilarAuto.add(jLabel2);
                                                                                                                                                                AlquilarAuto.add(jLabel3);
                                                                                                                                                                AlquilarAuto.add(placa);
                                                                                                                                                                AlquilarAuto.add(apellido);
                                                                                                                                                                AlquilarAuto.add(cedula);
                                                                                                                                                                AlquilarAuto.add(jButton1);
                                                                                                                                                                AlquilarAuto.add(jLabel4);
                                                                                                                                                                AlquilarAuto.add(kilometraje);
                                                                                                                                                                
                                                                                                                                                                JLabel lblNewLabel_2 = new JLabel("");
                                                                                                                                                                lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\ivanc\\Downloads\\tt (1).jpeg"));
                                                                                                                                                                lblNewLabel_2.setBounds(0, 0, 669, 385);
                                                                                                                                                                AlquilarAuto.add(lblNewLabel_2);
                                                                                        
                                                                                                tabPanel.addTab("Devolver auto", DevolverAuto);
                                                                                                DevolverAuto.setLayout(null);
                                                                                                DevolverAuto.add(jLabel9);
                                                                                                DevolverAuto.add(placaDevolver);
                                                                                                DevolverAuto.add(jLabel10);
                                                                                                DevolverAuto.add(accidentado);
                                                                                                DevolverAuto.add(kilometrajeDevolver);
                                                                                                DevolverAuto.add(multado);
                                                                                                DevolverAuto.add(devolver);
                                                                                                
                                                                                                lblNewLabel_3 = new JLabel("");
                                                                                                lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\ivanc\\Downloads\\tt (1).jpeg"));
                                                                                                lblNewLabel_3.setBounds(0, 0, 669, 385);
                                                                                                DevolverAuto.add(lblNewLabel_3);
        
        JPanel panel = new JPanel();

        javax.swing.GroupLayout CobrarAlquilerLayout = new javax.swing.GroupLayout(CobrarAlquiler);
        CobrarAlquilerLayout.setHorizontalGroup(
        	CobrarAlquilerLayout.createParallelGroup(Alignment.LEADING)
        		.addComponent(panel, GroupLayout.DEFAULT_SIZE, 693, Short.MAX_VALUE)
        );
        CobrarAlquilerLayout.setVerticalGroup(
        	CobrarAlquilerLayout.createParallelGroup(Alignment.LEADING)
        		.addComponent(panel, GroupLayout.DEFAULT_SIZE, 584, Short.MAX_VALUE)
        );
        panel.setLayout(null);
        
        JLabel lblNewLabel_4 = new JLabel("AUTO:");
        lblNewLabel_4.setForeground(new Color(255, 0, 0));
        lblNewLabel_4.setFont(new Font("Segoe UI", Font.BOLD, 18));
        lblNewLabel_4.setBounds(30, 42, 152, 35);
        panel.add(lblNewLabel_4);
        
        JLabel lblNewLabel_5 = new JLabel("TOTAL:");
        lblNewLabel_5.setForeground(new Color(255, 0, 0));
        lblNewLabel_5.setFont(new Font("Segoe UI", Font.BOLD, 18));
        lblNewLabel_5.setBounds(30, 105, 152, 35);
        panel.add(lblNewLabel_5);
        
        costo = new JTextField();
        costo.setBounds(118, 105, 197, 35);
        panel.add(costo);
        costo.setColumns(10);
        
        vehiculo = new JTextField();
        vehiculo.setBounds(118, 42, 197, 35);
        panel.add(vehiculo);
        vehiculo.setColumns(10);
        
        JLabel lblNewLabel_3_1 = new JLabel("");
        lblNewLabel_3_1.setIcon(new ImageIcon("C:\\Users\\ivanc\\Downloads\\tt (1).jpeg"));
        lblNewLabel_3_1.setBounds(0, 0, 669, 385);
        panel.add(lblNewLabel_3_1);
        CobrarAlquiler.setLayout(CobrarAlquilerLayout);

        tabPanel.addTab("Cobro Alquiler", CobrarAlquiler);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(titulo, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addComponent(tabPanel, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(211))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(titulo, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(tabPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);

        pack();
    }

    private void kilometrajeKeyTyped(java.awt.event.KeyEvent evt) {
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 & key <= 57;
        if (!numeros) {
            evt.consume();
        }
    }

    private void cedulaKeyTyped(java.awt.event.KeyEvent evt) {
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 & key <= 57;
        if (!numeros) {
            evt.consume();
        }
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        if (placa.getText().isEmpty() || apellido.getText().isEmpty()
                || cedula.getText().isEmpty() || kilometraje.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese todos los datos correspondientes por favor!");
            return;
        }

        String txtPlaca = placa.getText();
        String txtApellido = apellido.getText();
        String txtCedula = cedula.getText();
        int numKilometraje = Integer.valueOf(kilometraje.getText());

        Auto auto = empresa.buscarPorPlaca(txtPlaca, true);
        
        if (auto != null) {
            if (numKilometraje != auto.getKilometraje()) {
                JOptionPane.showMessageDialog(null, "Kilometraje incorrecto!");
                return;
            }
            Persona persona = new Persona(txtCedula, txtApellido);
            empresa.agregarAlquilado(auto, persona);
            JOptionPane.showMessageDialog(null, "Alquiler procesado correctamente!");
            return;
        }

        
        String mensaje;
        auto = empresa.buscarPorPlaca(txtPlaca, false);
        mensaje = (auto != null) ? "el auto se  encuentra ocupado!" : "no existe!";
        JOptionPane.showMessageDialog(null, "El auto asociado a la placa que desea alquilar " + mensaje);
        placa.setText("");
        apellido.setText("");
        cedula.setText("");
        kilometraje.setText("");
    }

    private void buscarMarcasActionPerformed(java.awt.event.ActionEvent evt) {
        Marcas marcaSeleccionada = (Marcas) marcas.getSelectedItem();
        textAreaResultado.setText(""); 

        ArrayList<Auto> autosDisponibles = empresa.getAutosDisponibles();
        ArrayList<AutoAlquilado> autosAlquilados = empresa.getAutosAlquilados();

        autosDisponibles.stream()
                .filter(auto -> marcaSeleccionada == null || auto.getMarca() == marcaSeleccionada)
                .forEachOrdered(this::mostrarAuto);

        autosAlquilados.stream()
                .filter(autoAlquilado -> marcaSeleccionada == null || autoAlquilado.getMarca() == marcaSeleccionada)
                .forEachOrdered(this::mostrarAuto);

        if (textAreaResultado.getText().equals("")) {
            textAreaResultado.setText("No existe el auto");
        }
    }

    private void buscarModelosActionPerformed(java.awt.event.ActionEvent evt) {
        Modelos modeloSeleccionado = (Modelos) modelos.getSelectedItem();
        textAreaResultado.setText(""); 

        ArrayList<Auto> autosDisponibles = empresa.getAutosDisponibles();
        ArrayList<AutoAlquilado> autosAlquilados = empresa.getAutosAlquilados();

        autosDisponibles.stream()
                .filter(auto -> modeloSeleccionado == null || auto.getModelo() == modeloSeleccionado)
                .forEachOrdered(this::mostrarAuto);

        autosAlquilados.stream()
                .filter(autoAlquilado -> modeloSeleccionado == null || autoAlquilado.getModelo() == modeloSeleccionado)
                .forEachOrdered(this::mostrarAuto);

        if (textAreaResultado.getText().equals("")) {
            textAreaResultado.setText("No existe el auto");
        }
    }
    private void consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarActionPerformed
        if (placaDisponibilidad.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por Favor ingrese un numero de placa valido!");
            return;
        }
        String txtPlaca = placaDisponibilidad.getText();
        Auto auto = empresa.buscarPorPlaca(txtPlaca, true);
        if (auto != null) {
            JOptionPane.showMessageDialog(null, "El auto con la placa ingresada se encuenta disponible ");
            return;
        }
        String mensaje;
        auto = empresa.buscarPorPlaca(txtPlaca, false);
        mensaje = (auto != null) ? "se encuentra alquilado!" : "No existe el auto!";
        JOptionPane.showMessageDialog(null, "El auto asociado a la placa que desea alquilar " + mensaje);
    }

    private void kilometrajeDevolverKeyTyped(java.awt.event.KeyEvent evt) {
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 & key <= 57;
        if (!numeros) {
            evt.consume();
        }
    }

    private void devolverActionPerformed(java.awt.event.ActionEvent evt) {
        if (placaDevolver.getText().isEmpty() || kilometrajeDevolver.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese los datos correctamente!");
            return;
        }

        String txtPlaca = placaDevolver.getText();
        AutoAlquilado auto = null;
        for (AutoAlquilado e : empresa.getAutosAlquilados()) {
            if (e.getPlaca().equals(txtPlaca)) {
                auto = e;
            }
        }

        if (auto == null) {
            JOptionPane.showMessageDialog(null, "La placa ingresada no corresponde a un auto alquilado");
            return;
        }

        int nuevoKilometraje = Integer.valueOf(kilometrajeDevolver.getText());
        if (nuevoKilometraje <= auto.getKilometraje()) {
            JOptionPane.showMessageDialog(null, "El kilometraje no puede ser menor o igual con el que fue entregado");
            return;
        }
        String txtVehiculo = auto.getMarca().getNombre()+" "+auto.getModelo().getAnio()+" "+auto.getPlaca();
        int costoVehiculo = empresa.recibirAlquiler(auto, nuevoKilometraje, accidentado.isSelected(), multado.isSelected());
        vehiculo.setText(txtVehiculo);
        costo.setText(costoVehiculo+"");
        tabPanel.setSelectedIndex(2);
        placaDevolver.setText("");
        kilometrajeDevolver.setText("");
    }

    
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(APP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(() -> {
            new APP().setVisible(true);
        });
    }

    
    private javax.swing.JPanel AlquilarAuto;
    private javax.swing.JPanel BuscarAuto;
    private javax.swing.JPanel CobrarAlquiler;
    private javax.swing.JPanel DevolverAuto;
    private javax.swing.JPanel DisponibilidadAuto;
    private javax.swing.JCheckBox accidentado;
    private javax.swing.JTextField apellido;
    private javax.swing.JButton buscarMarcas;
    private javax.swing.JButton buscarModelos;
    private javax.swing.JTextField cedula;
    private javax.swing.JButton consultar;
    private javax.swing.JButton devolver;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField kilometraje;
    private javax.swing.JTextField kilometrajeDevolver;
    private javax.swing.JComboBox<Marcas> marcas;
    private javax.swing.JComboBox<Modelos> modelos;
    private javax.swing.JCheckBox multado;
    private javax.swing.JTextField placa;
    private javax.swing.JTextField placaDevolver;
    private javax.swing.JTextField placaDisponibilidad;
    private javax.swing.JTabbedPane tabPanel;
    private javax.swing.JTextArea textAreaResultado;
    private javax.swing.JLabel titulo;
    private JLabel lblNewLabel_3;
    private JTextField costo;
    private JTextField vehiculo;
    // End of variables declaration//GEN-END:variables

    private void mostrarAuto(AutoAlquilado auto) {
        textAreaResultado.append("Marca: " + auto.getMarca().getNombre() + "\n");
        textAreaResultado.append("Modelo: " + auto.getModelo().getAnio() + "\n");
        textAreaResultado.append("Placa: " + auto.getPlaca() + "\n");
        textAreaResultado.append("Kilometraje: " + auto.getKilometraje() + "\n");
        textAreaResultado.append("Color: " + auto.getColor() + "\n");
        textAreaResultado.append("-------------------------------\n");
    }

    private void mostrarAuto(Auto auto) {
        textAreaResultado.append("Marca: " + auto.getMarca().getNombre() + "\n");
        textAreaResultado.append("Modelo: " + auto.getModelo().getAnio() + "\n");
        textAreaResultado.append("Placa: " + auto.getPlaca() + "\n");
        textAreaResultado.append("Kilometraje: " + auto.getKilometraje() + "\n");
        textAreaResultado.append("Color: " + auto.getColor() + "\n");
        textAreaResultado.append("-------------------------------\n");
    }
}
