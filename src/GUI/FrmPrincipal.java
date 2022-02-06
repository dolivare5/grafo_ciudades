/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Objectos.Ciudad;
import Grafo.ListGrafo;
import java.awt.Font;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.geom.RoundRectangle2D;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author deive
 */
public class FrmPrincipal extends javax.swing.JFrame {

    ListGrafo grafo;
    String iconoZoomG = "";
    String iconoNormalG = "";
    DefaultTableModel modelo = new DefaultTableModel();

    public FrmPrincipal() {
        this.grafo = new ListGrafo();
        initComponents();
        redondearVentana();
        habilitarCamposDeTexto(false, false);
        btnGuardarCambios.setVisible(false);
        lblGuardarCambios.setVisible(false);
        habilitarCamposDeMod(false);
        verCiudades();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblMensaje2 = new javax.swing.JLabel();
        btnMinimizar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        lblNombreDestino = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        lblNombreDestino1 = new javax.swing.JLabel();
        txtCódigo = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        lblNombreDestino2 = new javax.swing.JLabel();
        txtPoblacion = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        lblNombreDestino3 = new javax.swing.JLabel();
        txtSuperficie = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        btnRegistrar = new javax.swing.JButton();
        lblAgregarDestino = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jcbxCiudadDeOrigen = new javax.swing.JComboBox<>();
        lblCiudadDeOrigen = new javax.swing.JLabel();
        lblMensaje1 = new javax.swing.JLabel();
        jcbxCiudadDeDestino = new javax.swing.JComboBox<>();
        lblCiudadDeDestino = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();
        txtHoras = new javax.swing.JTextField();
        jspHora = new javax.swing.JSeparator();
        btnConectarRuta = new javax.swing.JButton();
        lblConectarRuta = new javax.swing.JLabel();
        btnEliminarRuta = new javax.swing.JButton();
        lblEliminarRuta = new javax.swing.JLabel();
        lblEditarRuta = new javax.swing.JLabel();
        btnEditarRuta = new javax.swing.JButton();
        lblVerRutas = new javax.swing.JLabel();
        btnVerRutas = new javax.swing.JButton();
        btnGuardarCambios = new javax.swing.JButton();
        lblGuardarCambios = new javax.swing.JLabel();
        lblMensajeMod1 = new javax.swing.JLabel();
        jcbxCiudadDeOrigenMod = new javax.swing.JComboBox<>();
        lblCiudadDeOrigenMod = new javax.swing.JLabel();
        lblMensajeMod2 = new javax.swing.JLabel();
        jcbxCiudadDeDestinoMod = new javax.swing.JComboBox<>();
        lblCiudadDeDestinoMod = new javax.swing.JLabel();
        lblHoraMod = new javax.swing.JLabel();
        txtHorasMod = new javax.swing.JTextField();
        jspHora1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDatos = new javax.swing.JTable();
        btnMostrarCiudades = new javax.swing.JButton();
        lblMostrarCiudades = new javax.swing.JLabel();
        lbMatrizAdj = new javax.swing.JLabel();
        btnMatrizAdj = new javax.swing.JButton();
        btnrutaMasRapida = new javax.swing.JButton();
        lblrutaRapida = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Sistema de rutas entre Ciudades");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(130, 0, 650, 60);

        jLabel7.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("¿Qué desea hacer?");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(0, 190, 940, 40);

        lblMensaje2.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        lblMensaje2.setForeground(new java.awt.Color(0, 0, 0));
        lblMensaje2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMensaje2.setText("hacia");
        jPanel1.add(lblMensaje2);
        lblMensaje2.setBounds(420, 420, 80, 40);

        btnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/minimizar-34.png"))); // NOI18N
        btnMinimizar.setBorder(null);
        btnMinimizar.setBorderPainted(false);
        btnMinimizar.setContentAreaFilled(false);
        btnMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMinimizar.setFocusPainted(false);
        btnMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinimizarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMinimizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMinimizarMouseExited(evt);
            }
        });
        jPanel1.add(btnMinimizar);
        btnMinimizar.setBounds(780, 0, 64, 64);

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar-34.png"))); // NOI18N
        btnCerrar.setBorder(null);
        btnCerrar.setBorderPainted(false);
        btnCerrar.setContentAreaFilled(false);
        btnCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrar.setFocusPainted(false);
        btnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCerrarMouseExited(evt);
            }
        });
        jPanel1.add(btnCerrar);
        btnCerrar.setBounds(850, 0, 64, 64);

        lblNombreDestino.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        lblNombreDestino.setForeground(new java.awt.Color(0, 0, 0));
        lblNombreDestino.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreDestino.setText("Nombre de la ciudad");
        jPanel1.add(lblNombreDestino);
        lblNombreDestino.setBounds(70, 110, 150, 30);

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(0, 0, 0));
        txtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombre.setBorder(null);
        jPanel1.add(txtNombre);
        txtNombre.setBounds(70, 140, 150, 30);

        jSeparator1.setBackground(new java.awt.Color(204, 51, 0));
        jSeparator1.setForeground(new java.awt.Color(204, 51, 0));
        jSeparator1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 51, 0), 1, true));
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(70, 170, 150, 2);

        lblNombreDestino1.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        lblNombreDestino1.setForeground(new java.awt.Color(0, 0, 0));
        lblNombreDestino1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreDestino1.setText("Código");
        jPanel1.add(lblNombreDestino1);
        lblNombreDestino1.setBounds(250, 110, 150, 30);

        txtCódigo.setBackground(new java.awt.Color(255, 255, 255));
        txtCódigo.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        txtCódigo.setForeground(new java.awt.Color(0, 0, 0));
        txtCódigo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCódigo.setBorder(null);
        jPanel1.add(txtCódigo);
        txtCódigo.setBounds(250, 140, 150, 30);

        jSeparator2.setBackground(new java.awt.Color(204, 51, 0));
        jSeparator2.setForeground(new java.awt.Color(204, 51, 0));
        jSeparator2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 51, 0), 1, true));
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(250, 170, 150, 2);

        lblNombreDestino2.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        lblNombreDestino2.setForeground(new java.awt.Color(0, 0, 0));
        lblNombreDestino2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreDestino2.setText("Población");
        jPanel1.add(lblNombreDestino2);
        lblNombreDestino2.setBounds(430, 110, 150, 30);

        txtPoblacion.setBackground(new java.awt.Color(255, 255, 255));
        txtPoblacion.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        txtPoblacion.setForeground(new java.awt.Color(0, 0, 0));
        txtPoblacion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPoblacion.setBorder(null);
        jPanel1.add(txtPoblacion);
        txtPoblacion.setBounds(430, 140, 150, 30);

        jSeparator3.setBackground(new java.awt.Color(204, 51, 0));
        jSeparator3.setForeground(new java.awt.Color(204, 51, 0));
        jSeparator3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 51, 0), 1, true));
        jPanel1.add(jSeparator3);
        jSeparator3.setBounds(430, 170, 150, 2);

        lblNombreDestino3.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        lblNombreDestino3.setForeground(new java.awt.Color(0, 0, 0));
        lblNombreDestino3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreDestino3.setText("Superficie");
        jPanel1.add(lblNombreDestino3);
        lblNombreDestino3.setBounds(610, 110, 150, 30);

        txtSuperficie.setBackground(new java.awt.Color(255, 255, 255));
        txtSuperficie.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        txtSuperficie.setForeground(new java.awt.Color(0, 0, 0));
        txtSuperficie.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSuperficie.setBorder(null);
        jPanel1.add(txtSuperficie);
        txtSuperficie.setBounds(610, 140, 150, 30);

        jSeparator4.setBackground(new java.awt.Color(204, 51, 0));
        jSeparator4.setForeground(new java.awt.Color(204, 51, 0));
        jSeparator4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 51, 0), 1, true));
        jPanel1.add(jSeparator4);
        jSeparator4.setBounds(610, 170, 150, 2);

        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregar-destino-64.png"))); // NOI18N
        btnRegistrar.setBorder(null);
        btnRegistrar.setBorderPainted(false);
        btnRegistrar.setContentAreaFilled(false);
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrar.setFocusPainted(false);
        btnRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegistrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegistrarMouseExited(evt);
            }
        });
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrar);
        btnRegistrar.setBounds(770, 70, 130, 90);

        lblAgregarDestino.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        lblAgregarDestino.setForeground(new java.awt.Color(0, 0, 0));
        lblAgregarDestino.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAgregarDestino.setText("Agregar Destino");
        lblAgregarDestino.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAgregarDestino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAgregarDestinobtnRutaMasRapidaMouseClicked(evt);
            }
        });
        jPanel1.add(lblAgregarDestino);
        lblAgregarDestino.setBounds(770, 160, 130, 30);

        jLabel13.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Agregar Ciudades");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(0, 60, 950, 40);

        jcbxCiudadDeOrigen.setBackground(new java.awt.Color(255, 255, 255));
        jcbxCiudadDeOrigen.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jcbxCiudadDeOrigen.setForeground(new java.awt.Color(0, 0, 0));
        jcbxCiudadDeOrigen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcbxCiudadDeOrigen.setBorder(null);
        jPanel1.add(jcbxCiudadDeOrigen);
        jcbxCiudadDeOrigen.setBounds(230, 420, 170, 40);

        lblCiudadDeOrigen.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        lblCiudadDeOrigen.setForeground(new java.awt.Color(0, 0, 0));
        lblCiudadDeOrigen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCiudadDeOrigen.setText("Ciudad de origen");
        jPanel1.add(lblCiudadDeOrigen);
        lblCiudadDeOrigen.setBounds(230, 390, 170, 30);

        lblMensaje1.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        lblMensaje1.setForeground(new java.awt.Color(0, 0, 0));
        lblMensaje1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMensaje1.setText("Crear una ruta que va desde");
        jPanel1.add(lblMensaje1);
        lblMensaje1.setBounds(10, 420, 200, 40);

        jcbxCiudadDeDestino.setBackground(new java.awt.Color(255, 255, 255));
        jcbxCiudadDeDestino.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jcbxCiudadDeDestino.setForeground(new java.awt.Color(0, 0, 0));
        jcbxCiudadDeDestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcbxCiudadDeDestino.setBorder(null);
        jPanel1.add(jcbxCiudadDeDestino);
        jcbxCiudadDeDestino.setBounds(530, 420, 170, 40);

        lblCiudadDeDestino.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        lblCiudadDeDestino.setForeground(new java.awt.Color(0, 0, 0));
        lblCiudadDeDestino.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCiudadDeDestino.setText("Ciudad de destino");
        jPanel1.add(lblCiudadDeDestino);
        lblCiudadDeDestino.setBounds(530, 390, 170, 30);

        lblHora.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        lblHora.setForeground(new java.awt.Color(0, 0, 0));
        lblHora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHora.setText("Horas Aprox de llegada");
        jPanel1.add(lblHora);
        lblHora.setBounds(730, 390, 150, 30);

        txtHoras.setBackground(new java.awt.Color(255, 255, 255));
        txtHoras.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        txtHoras.setForeground(new java.awt.Color(0, 0, 0));
        txtHoras.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtHoras.setBorder(null);
        jPanel1.add(txtHoras);
        txtHoras.setBounds(730, 420, 150, 40);

        jspHora.setBackground(new java.awt.Color(204, 51, 0));
        jspHora.setForeground(new java.awt.Color(204, 51, 0));
        jspHora.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 51, 0), 2));
        jspHora.setOpaque(true);
        jPanel1.add(jspHora);
        jspHora.setBounds(730, 460, 150, 2);

        btnConectarRuta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ruta-mas-rapida-64.png"))); // NOI18N
        btnConectarRuta.setBorder(null);
        btnConectarRuta.setBorderPainted(false);
        btnConectarRuta.setContentAreaFilled(false);
        btnConectarRuta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConectarRuta.setFocusPainted(false);
        btnConectarRuta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnConectarRutaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnConectarRutaMouseExited(evt);
            }
        });
        btnConectarRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConectarRutaActionPerformed(evt);
            }
        });
        jPanel1.add(btnConectarRuta);
        btnConectarRuta.setBounds(340, 240, 130, 90);

        lblConectarRuta.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        lblConectarRuta.setForeground(new java.awt.Color(0, 0, 0));
        lblConectarRuta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblConectarRuta.setText("Conectar ruta");
        lblConectarRuta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(lblConectarRuta);
        lblConectarRuta.setBounds(340, 330, 130, 30);

        btnEliminarRuta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar-ruta-64.png"))); // NOI18N
        btnEliminarRuta.setBorder(null);
        btnEliminarRuta.setBorderPainted(false);
        btnEliminarRuta.setContentAreaFilled(false);
        btnEliminarRuta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarRuta.setFocusPainted(false);
        btnEliminarRuta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminarRutaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminarRutaMouseExited(evt);
            }
        });
        btnEliminarRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarRutaActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminarRuta);
        btnEliminarRuta.setBounds(470, 240, 130, 90);

        lblEliminarRuta.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        lblEliminarRuta.setForeground(new java.awt.Color(0, 0, 0));
        lblEliminarRuta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEliminarRuta.setText("Eliminar ruta");
        lblEliminarRuta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(lblEliminarRuta);
        lblEliminarRuta.setBounds(470, 330, 130, 30);

        lblEditarRuta.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        lblEditarRuta.setForeground(new java.awt.Color(0, 0, 0));
        lblEditarRuta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEditarRuta.setText("Editar ruta");
        lblEditarRuta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(lblEditarRuta);
        lblEditarRuta.setBounds(600, 330, 130, 30);

        btnEditarRuta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editar-ruta-64.png"))); // NOI18N
        btnEditarRuta.setBorder(null);
        btnEditarRuta.setBorderPainted(false);
        btnEditarRuta.setContentAreaFilled(false);
        btnEditarRuta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditarRuta.setFocusPainted(false);
        btnEditarRuta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEditarRutaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEditarRutaMouseExited(evt);
            }
        });
        btnEditarRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarRutaActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditarRuta);
        btnEditarRuta.setBounds(600, 240, 130, 90);

        lblVerRutas.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        lblVerRutas.setForeground(new java.awt.Color(0, 0, 0));
        lblVerRutas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVerRutas.setText("Ver rutas");
        lblVerRutas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(lblVerRutas);
        lblVerRutas.setBounds(200, 330, 130, 30);

        btnVerRutas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ver-grafo-64.png"))); // NOI18N
        btnVerRutas.setBorder(null);
        btnVerRutas.setBorderPainted(false);
        btnVerRutas.setContentAreaFilled(false);
        btnVerRutas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVerRutas.setFocusPainted(false);
        btnVerRutas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVerRutasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVerRutasMouseExited(evt);
            }
        });
        btnVerRutas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerRutasActionPerformed(evt);
            }
        });
        jPanel1.add(btnVerRutas);
        btnVerRutas.setBounds(200, 240, 130, 90);

        btnGuardarCambios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ver-grafo-64.png"))); // NOI18N
        btnGuardarCambios.setBorder(null);
        btnGuardarCambios.setBorderPainted(false);
        btnGuardarCambios.setContentAreaFilled(false);
        btnGuardarCambios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardarCambios.setFocusPainted(false);
        btnGuardarCambios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGuardarCambiosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGuardarCambiosMouseExited(evt);
            }
        });
        btnGuardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCambiosActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardarCambios);
        btnGuardarCambios.setBounds(790, 460, 130, 90);

        lblGuardarCambios.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        lblGuardarCambios.setForeground(new java.awt.Color(0, 0, 0));
        lblGuardarCambios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGuardarCambios.setText("Guardar");
        lblGuardarCambios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblGuardarCambios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblGuardarCambiosbtnRutaMasRapidaMouseClicked(evt);
            }
        });
        jPanel1.add(lblGuardarCambios);
        lblGuardarCambios.setBounds(790, 550, 130, 30);

        lblMensajeMod1.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        lblMensajeMod1.setForeground(new java.awt.Color(0, 0, 0));
        lblMensajeMod1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMensajeMod1.setText("Por la ruta que va de");
        jPanel1.add(lblMensajeMod1);
        lblMensajeMod1.setBounds(10, 500, 190, 40);

        jcbxCiudadDeOrigenMod.setBackground(new java.awt.Color(255, 255, 255));
        jcbxCiudadDeOrigenMod.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jcbxCiudadDeOrigenMod.setForeground(new java.awt.Color(0, 0, 0));
        jcbxCiudadDeOrigenMod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcbxCiudadDeOrigenMod.setBorder(null);
        jcbxCiudadDeOrigenMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbxCiudadDeOrigenModActionPerformed(evt);
            }
        });
        jPanel1.add(jcbxCiudadDeOrigenMod);
        jcbxCiudadDeOrigenMod.setBounds(210, 500, 150, 40);

        lblCiudadDeOrigenMod.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        lblCiudadDeOrigenMod.setForeground(new java.awt.Color(0, 0, 0));
        lblCiudadDeOrigenMod.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCiudadDeOrigenMod.setText("Ciudad de origen");
        jPanel1.add(lblCiudadDeOrigenMod);
        lblCiudadDeOrigenMod.setBounds(190, 470, 170, 30);

        lblMensajeMod2.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        lblMensajeMod2.setForeground(new java.awt.Color(0, 0, 0));
        lblMensajeMod2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMensajeMod2.setText("hacia");
        jPanel1.add(lblMensajeMod2);
        lblMensajeMod2.setBounds(370, 500, 50, 40);

        jcbxCiudadDeDestinoMod.setBackground(new java.awt.Color(255, 255, 255));
        jcbxCiudadDeDestinoMod.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jcbxCiudadDeDestinoMod.setForeground(new java.awt.Color(0, 0, 0));
        jcbxCiudadDeDestinoMod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcbxCiudadDeDestinoMod.setBorder(null);
        jPanel1.add(jcbxCiudadDeDestinoMod);
        jcbxCiudadDeDestinoMod.setBounds(440, 500, 170, 40);

        lblCiudadDeDestinoMod.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        lblCiudadDeDestinoMod.setForeground(new java.awt.Color(0, 0, 0));
        lblCiudadDeDestinoMod.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCiudadDeDestinoMod.setText("Ciudad de destino");
        jPanel1.add(lblCiudadDeDestinoMod);
        lblCiudadDeDestinoMod.setBounds(440, 470, 170, 30);

        lblHoraMod.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        lblHoraMod.setForeground(new java.awt.Color(0, 0, 0));
        lblHoraMod.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHoraMod.setText("Horas Aprox de llegada");
        jPanel1.add(lblHoraMod);
        lblHoraMod.setBounds(630, 470, 150, 30);

        txtHorasMod.setBackground(new java.awt.Color(255, 255, 255));
        txtHorasMod.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        txtHorasMod.setForeground(new java.awt.Color(0, 0, 0));
        txtHorasMod.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtHorasMod.setBorder(null);
        jPanel1.add(txtHorasMod);
        txtHorasMod.setBounds(630, 500, 150, 40);

        jspHora1.setBackground(new java.awt.Color(204, 51, 0));
        jspHora1.setForeground(new java.awt.Color(204, 51, 0));
        jspHora1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 51, 0), 2));
        jspHora1.setOpaque(true);
        jPanel1.add(jspHora1);
        jspHora1.setBounds(630, 540, 150, 2);

        jScrollPane2.setBorder(null);
        jScrollPane2.setForeground(new java.awt.Color(102, 102, 102));

        tblDatos.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        tblDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblDatos.setGridColor(new java.awt.Color(0, 0, 0));
        tblDatos.setRowHeight(30);
        tblDatos.setRowMargin(3);
        tblDatos.setSelectionBackground(new java.awt.Color(153, 255, 255));
        tblDatos.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(tblDatos);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(130, 590, 840, 160);

        btnMostrarCiudades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mostrar-64.png"))); // NOI18N
        btnMostrarCiudades.setBorder(null);
        btnMostrarCiudades.setBorderPainted(false);
        btnMostrarCiudades.setContentAreaFilled(false);
        btnMostrarCiudades.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMostrarCiudades.setFocusPainted(false);
        btnMostrarCiudades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMostrarCiudadesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMostrarCiudadesMouseExited(evt);
            }
        });
        btnMostrarCiudades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarCiudadesActionPerformed(evt);
            }
        });
        jPanel1.add(btnMostrarCiudades);
        btnMostrarCiudades.setBounds(50, 240, 130, 90);

        lblMostrarCiudades.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        lblMostrarCiudades.setForeground(new java.awt.Color(0, 0, 0));
        lblMostrarCiudades.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMostrarCiudades.setText("Mostrar datos de Ciudades");
        lblMostrarCiudades.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(lblMostrarCiudades);
        lblMostrarCiudades.setBounds(30, 330, 170, 30);

        lbMatrizAdj.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        lbMatrizAdj.setForeground(new java.awt.Color(0, 0, 0));
        lbMatrizAdj.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMatrizAdj.setText("Ver Matriz de Adyacencia");
        lbMatrizAdj.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(lbMatrizAdj);
        lbMatrizAdj.setBounds(730, 330, 170, 30);

        btnMatrizAdj.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/matrix-64.png"))); // NOI18N
        btnMatrizAdj.setBorder(null);
        btnMatrizAdj.setBorderPainted(false);
        btnMatrizAdj.setContentAreaFilled(false);
        btnMatrizAdj.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMatrizAdj.setFocusPainted(false);
        btnMatrizAdj.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMatrizAdjMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMatrizAdjMouseExited(evt);
            }
        });
        btnMatrizAdj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMatrizAdjActionPerformed(evt);
            }
        });
        jPanel1.add(btnMatrizAdj);
        btnMatrizAdj.setBounds(750, 240, 130, 90);

        btnrutaMasRapida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ver-grafo-64.png"))); // NOI18N
        btnrutaMasRapida.setBorder(null);
        btnrutaMasRapida.setBorderPainted(false);
        btnrutaMasRapida.setContentAreaFilled(false);
        btnrutaMasRapida.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnrutaMasRapida.setFocusPainted(false);
        btnrutaMasRapida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnrutaMasRapidaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnrutaMasRapidaMouseExited(evt);
            }
        });
        btnrutaMasRapida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrutaMasRapidaActionPerformed(evt);
            }
        });
        jPanel1.add(btnrutaMasRapida);
        btnrutaMasRapida.setBounds(910, 240, 130, 90);

        lblrutaRapida.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        lblrutaRapida.setForeground(new java.awt.Color(0, 0, 0));
        lblrutaRapida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblrutaRapida.setText("Ver ruta Mas Rapida");
        lblrutaRapida.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(lblrutaRapida);
        lblrutaRapida.setBounds(910, 330, 130, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1100, 910);

        setSize(new java.awt.Dimension(1105, 913));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnMinimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseEntered
        insertarIcono(btnMinimizar, "minimizar-64.png");
    }//GEN-LAST:event_btnMinimizarMouseEntered

    private void btnMinimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseExited
        insertarIcono(btnMinimizar, "minimizar-34.png");
    }//GEN-LAST:event_btnMinimizarMouseExited

    private void btnMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseClicked
        insertarIcono(btnMinimizar, "minimizar-34.png");
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_btnMinimizarMouseClicked

    private void btnCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseEntered
        insertarIcono(btnCerrar, "cerrar-54.png");
    }//GEN-LAST:event_btnCerrarMouseEntered

    private void btnCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseExited
        insertarIcono(btnCerrar, "cerrar-34.png");
    }//GEN-LAST:event_btnCerrarMouseExited

    private void btnCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseClicked
        insertarIcono(btnCerrar, "cerrar-34.png");
        System.exit(0);
    }//GEN-LAST:event_btnCerrarMouseClicked

    private void btnRegistrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMouseEntered
        insertarIcono(btnRegistrar, "agregar-destino-84.png");
    }//GEN-LAST:event_btnRegistrarMouseEntered

    private void btnRegistrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMouseExited
        insertarIcono(btnRegistrar, "agregar-destino-64.png");
    }//GEN-LAST:event_btnRegistrarMouseExited

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        try {
            registrarCiudad();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Dato no validos, intentelo nuevamente");
        }
        habilitarCamposDeTexto(false, false);
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void lblAgregarDestinobtnRutaMasRapidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAgregarDestinobtnRutaMasRapidaMouseClicked
        new FrmPrincipal().setVisible(true);
        super.dispose();
    }//GEN-LAST:event_lblAgregarDestinobtnRutaMasRapidaMouseClicked

    private void btnConectarRutaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConectarRutaMouseEntered
        insertarIcono(btnConectarRuta, "ruta-mas-rapida-84.png");
    }//GEN-LAST:event_btnConectarRutaMouseEntered

    private void btnConectarRutaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConectarRutaMouseExited
        insertarIcono(btnConectarRuta, "ruta-mas-rapida-64.png");
    }//GEN-LAST:event_btnConectarRutaMouseExited

    private void btnConectarRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConectarRutaActionPerformed
        insertarIcono(btnConectarRuta, "ruta-mas-rapida-64.png");
        habilitarBotones();
        habilitarCamposDeMod(false);
        btnGuardarCambios.setVisible(true);
        lblGuardarCambios.setVisible(true);
        btnGuardarCambios.setIcon(btnConectarRuta.getIcon());
        lblGuardarCambios.setText("Conectar Rutas");
        btnConectarRuta.setVisible(false);
        lblConectarRuta.setVisible(false);
        iconoNormalG = "ruta-mas-rapida-64.png";
        iconoZoomG = "ruta-mas-rapida-84.png";
        habilitarCamposDeTexto(true, true);
        lblMensaje1.setText("Crear una ruta que va desde");
        habilitarCamposDeMod(false);

    }//GEN-LAST:event_btnConectarRutaActionPerformed

    private void btnEliminarRutaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarRutaMouseEntered
        insertarIcono(btnEliminarRuta, "eliminar-ruta-84.png");
    }//GEN-LAST:event_btnEliminarRutaMouseEntered

    private void btnEliminarRutaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarRutaMouseExited
        insertarIcono(btnEliminarRuta, "eliminar-ruta-64.png");
    }//GEN-LAST:event_btnEliminarRutaMouseExited

    private void btnEliminarRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarRutaActionPerformed
        insertarIcono(btnEliminarRuta, "eliminar-ruta-64.png");
        habilitarBotones();
        habilitarCamposDeMod(false);
        btnGuardarCambios.setVisible(true);
        lblGuardarCambios.setVisible(true);
        btnGuardarCambios.setIcon(btnEliminarRuta.getIcon());
        lblGuardarCambios.setText("Eliminar Ruta");
        btnEliminarRuta.setVisible(false);
        lblEliminarRuta.setVisible(false);
        iconoNormalG = "eliminar-ruta-64.png";
        iconoZoomG = "eliminar-ruta-84.png";
        habilitarCamposDeTexto(true, false);
        lblMensaje1.setText("Eliminar la ruta que va de");
    }//GEN-LAST:event_btnEliminarRutaActionPerformed

    private void btnEditarRutaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarRutaMouseEntered
        insertarIcono(btnEditarRuta, "editar-ruta-84.png");
    }//GEN-LAST:event_btnEditarRutaMouseEntered

    private void btnEditarRutaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarRutaMouseExited
        insertarIcono(btnEditarRuta, "editar-ruta-64.png");
    }//GEN-LAST:event_btnEditarRutaMouseExited

    private void btnEditarRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarRutaActionPerformed
        habilitarBotones();
        insertarIcono(btnEditarRuta, "editar-ruta-64.png");
        btnGuardarCambios.setVisible(true);
        lblGuardarCambios.setVisible(true);
        btnGuardarCambios.setIcon(btnEditarRuta.getIcon());
        lblGuardarCambios.setText("Editar Ruta");
        btnEditarRuta.setVisible(false);
        lblEditarRuta.setVisible(false);
        iconoNormalG = "editar-ruta-64.png";
        iconoZoomG = "editar-ruta-84.png";
        habilitarCamposDeTexto(true, false);
        habilitarCamposDeMod(true);
        lblMensaje1.setText("Cambiar la ruta que va de ");
        lblMensajeMod1.setText("por la que va desde");
    }//GEN-LAST:event_btnEditarRutaActionPerformed

    private void btnVerRutasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerRutasMouseEntered
        insertarIcono(btnVerRutas, "ver-grafo-84.png");
    }//GEN-LAST:event_btnVerRutasMouseEntered

    private void btnVerRutasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerRutasMouseExited
        insertarIcono(btnVerRutas, "ver-grafo-64.png");
    }//GEN-LAST:event_btnVerRutasMouseExited

    private void btnVerRutasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerRutasActionPerformed
        insertarIcono(btnVerRutas, "ver-grafo-64.png");
        habilitarBotones();
        habilitarCamposDeMod(false);
        verRutas();
    }//GEN-LAST:event_btnVerRutasActionPerformed

    private void btnGuardarCambiosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarCambiosMouseEntered
        ImageIcon icono = new ImageIcon(getClass().getResource("/Imagenes/" + iconoZoomG));
        btnGuardarCambios.setIcon(icono);
    }//GEN-LAST:event_btnGuardarCambiosMouseEntered

    private void btnGuardarCambiosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarCambiosMouseExited
        ImageIcon icono = new ImageIcon(getClass().getResource("/Imagenes/" + iconoNormalG));
        btnGuardarCambios.setIcon(icono);
    }//GEN-LAST:event_btnGuardarCambiosMouseExited
    private void eliminarRuta() {
        if (grafo.eliminarArista(jcbxCiudadDeOrigen.getSelectedIndex(), jcbxCiudadDeDestino.getSelectedIndex()) == true) {
            JOptionPane.showMessageDialog(this, "Ruta eliminada correctamente");
        } else {
            JOptionPane.showMessageDialog(this, "Esta ruta no se encuentra registrada, intentelo nuevamente");
        }
    }


    private void btnGuardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCambiosActionPerformed
        ImageIcon icono = new ImageIcon(getClass().getResource("/Imagenes/" + iconoNormalG));
        btnGuardarCambios.setIcon(icono);
        guardar();

    }//GEN-LAST:event_btnGuardarCambiosActionPerformed

    private void lblGuardarCambiosbtnRutaMasRapidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGuardarCambiosbtnRutaMasRapidaMouseClicked

    }//GEN-LAST:event_lblGuardarCambiosbtnRutaMasRapidaMouseClicked

    private void jcbxCiudadDeOrigenModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbxCiudadDeOrigenModActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbxCiudadDeOrigenModActionPerformed

    private void btnMostrarCiudadesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMostrarCiudadesMouseEntered
        insertarIcono(btnMostrarCiudades, "mostrar-84.png");
    }//GEN-LAST:event_btnMostrarCiudadesMouseEntered

    private void btnMostrarCiudadesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMostrarCiudadesMouseExited
        insertarIcono(btnMostrarCiudades, "mostrar-64.png");
    }//GEN-LAST:event_btnMostrarCiudadesMouseExited

    private void btnMostrarCiudadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarCiudadesActionPerformed
        insertarIcono(btnMostrarCiudades, "mostrar-64.png");
        habilitarBotones();
        habilitarCamposDeMod(false);
        verCiudades();
    }//GEN-LAST:event_btnMostrarCiudadesActionPerformed

    private void btnMatrizAdjMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMatrizAdjMouseEntered
        insertarIcono(btnMatrizAdj, "matrix-84.png");
    }//GEN-LAST:event_btnMatrizAdjMouseEntered

    private void btnMatrizAdjMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMatrizAdjMouseExited
        insertarIcono(btnMatrizAdj, "matrix-64.png");
    }//GEN-LAST:event_btnMatrizAdjMouseExited

    private void btnMatrizAdjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMatrizAdjActionPerformed
        insertarIcono(btnMatrizAdj, "matrix-64.png");
        habilitarBotones();
        habilitarCamposDeMod(false);
        verMatriz();
    }//GEN-LAST:event_btnMatrizAdjActionPerformed

    private void btnrutaMasRapidaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnrutaMasRapidaMouseEntered
        insertarIcono(btnVerRutas, "ver-grafo-84.png");
    }//GEN-LAST:event_btnrutaMasRapidaMouseEntered

    private void btnrutaMasRapidaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnrutaMasRapidaMouseExited
        insertarIcono(btnVerRutas, "ver-grafo-64.png");
    }//GEN-LAST:event_btnrutaMasRapidaMouseExited

    private void btnrutaMasRapidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrutaMasRapidaActionPerformed
        insertarIcono(btnVerRutas, "ver-grafo-64.png");
        habilitarBotones();
        habilitarCamposDeMod(false);
        btnGuardarCambios.setVisible(true);
        lblGuardarCambios.setVisible(true);
        btnGuardarCambios.setIcon(btnrutaMasRapida.getIcon());
        lblGuardarCambios.setText("Viajar de");
        btnrutaMasRapida.setVisible(false);
        lblrutaRapida.setVisible(false);
        iconoNormalG = "ruta-mas-rapida-64.png";
        iconoZoomG = "ruta-mas-rapida-84.png";
        habilitarCamposDeTexto(true, true);
        lblMensaje1.setText("Hasta");
        habilitarCamposDeMod(false);
    }//GEN-LAST:event_btnrutaMasRapidaActionPerformed

    private void habilitarBotones() {
        btnConectarRuta.setVisible(true);
        lblConectarRuta.setVisible(true);
        btnEditarRuta.setVisible(true);
        lblEditarRuta.setVisible(true);
        btnGuardarCambios.setVisible(false);
        lblGuardarCambios.setVisible(false);
        btnEliminarRuta.setVisible(true);
        lblEliminarRuta.setVisible(true);
    }

    private void redondearVentana() {
        this.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 30, 30));
            }
        });
    }

    private void registrarCiudad() {
        insertarIcono(btnRegistrar, "agregar-destino-64.png");
        int codigo = Integer.parseInt(txtCódigo.getText());
        String nombre = txtNombre.getText().toUpperCase();
        double poblacion = Double.parseDouble(txtPoblacion.getText());
        float superficie = Float.parseFloat(txtSuperficie.getText());
        Ciudad nuevaCiudad = new Ciudad(codigo, nombre, poblacion, superficie);
        grafo.insertarVertice(nuevaCiudad);
        jcbxCiudadDeOrigen.removeAllItems();
        jcbxCiudadDeDestino.removeAllItems();
        jcbxCiudadDeDestinoMod.removeAllItems();
        jcbxCiudadDeOrigenMod.removeAllItems();
        ArrayList<String> ciudadesRegistradas = grafo.mostrarInfoVertices();
        for (String ciudadRegistrada : ciudadesRegistradas) {
            jcbxCiudadDeOrigen.addItem(ciudadRegistrada);
            jcbxCiudadDeDestino.addItem(ciudadRegistrada);
            jcbxCiudadDeOrigenMod.addItem(ciudadRegistrada);
            jcbxCiudadDeDestinoMod.addItem(ciudadRegistrada);
        }
        limpiarCampos();
        habilitarBotones();
        lblEliminarRuta.setVisible(true);
    }

    private void modificarRuta() {
        if (!txtHorasMod.getText().equals("")) {
            try {
                int origen1 = jcbxCiudadDeOrigen.getSelectedIndex();
                int destino1 = jcbxCiudadDeDestino.getSelectedIndex();
                int origen2 = jcbxCiudadDeOrigenMod.getSelectedIndex();
                int destino2 = jcbxCiudadDeDestinoMod.getSelectedIndex();
                int cantHoras = Integer.parseInt(txtHorasMod.getText());
                if (grafo.nodificarArista(origen1, destino1, origen2, destino2, cantHoras) == true) {
                    JOptionPane.showMessageDialog(this, "La modificación se ha realizado correctamente");
                } else {
                    JOptionPane.showMessageDialog(this, "Algo no esta bien. Verifique la ruta inicial existe y que la ruta nueva no se encuentre registrada");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Ha ocurrido un error, verifique la hora esta expresada en numeros enteros");
            }
        }
    }
    private void guardar() {
        if (btnConectarRuta.isVisible() == false) {
            conectarRutas();
            verMatriz();
        }
        if (btnEliminarRuta.isVisible() == false) {
            eliminarRuta();
            verMatriz();
        }
        if (btnEditarRuta.isVisible() == false) {
            modificarRuta();
            habilitarCamposDeMod(false);
            verMatriz();
        }
        if (btnrutaMasRapida.isVisible()==false) {
            verRutaMasRapida();
        }
        habilitarBotones();
        habilitarCamposDeTexto(false, false);
    }
    private void verRutaMasRapida(){
        String r = grafo.encontrarRutaMinimaDijkstra(grafo.informacionDelVertice(jcbxCiudadDeOrigen.getSelectedIndex()), grafo.informacionDelVertice(jcbxCiudadDeDestino.getSelectedIndex()));
        System.out.println(r);
        verMatriz();
    }
    private void limpiarCampos() {
        txtCódigo.setText("");
        txtNombre.setText("");
        txtPoblacion.setText("");
        txtSuperficie.setText("");
    }

    private void habilitarCamposDeTexto(boolean ocultar, boolean horaIsVisible) {
        lblMensaje1.setVisible(ocultar);
        lblCiudadDeOrigen.setVisible(ocultar);
        jcbxCiudadDeOrigen.setVisible(ocultar);
        lblMensaje2.setVisible(ocultar);
        lblCiudadDeDestino.setVisible(ocultar);
        jcbxCiudadDeDestino.setVisible(ocultar);
        lblHora.setVisible(horaIsVisible);
        txtHoras.setVisible(horaIsVisible);
        jspHora.setVisible(horaIsVisible);
        txtHoras.setText("");
    }

    private void habilitarCamposDeMod(boolean ocultar) {
        lblMensajeMod1.setVisible(ocultar);
        lblCiudadDeOrigenMod.setVisible(ocultar);
        jcbxCiudadDeOrigenMod.setVisible(ocultar);
        lblMensajeMod2.setVisible(ocultar);
        lblCiudadDeDestinoMod.setVisible(ocultar);
        jcbxCiudadDeDestinoMod.setVisible(ocultar);
        lblHoraMod.setVisible(ocultar);
        txtHorasMod.setVisible(ocultar);
        jspHora1.setVisible(ocultar);
        lblMensaje1.setText("Modificar la ruta que va desde ");
    }

    private void insertarIcono(JComponent elemento, String nombreImagen) {
        ImageIcon icono = new ImageIcon(getClass().getResource("/Imagenes/" + nombreImagen));
        if (elemento instanceof JButton) {
            ((JButton) elemento).setIcon(icono);
        } else if (elemento instanceof JLabel) {
            ((JLabel) elemento).setIcon(icono);
        }

    }

    private void conectarRutas() {
        if (!txtHoras.getText().equals("")) {
            int origen = jcbxCiudadDeOrigen.getSelectedIndex();
            int destino = jcbxCiudadDeDestino.getSelectedIndex();
            int duracion = Integer.parseInt(txtHoras.getText());
            if (origen == destino) {
                JOptionPane.showMessageDialog(this, "Ruta no valida dado que la ciudad de origen no puede ser la misma que la destino");
            } else {
                if (grafo.insertarArista(origen, destino, duracion) == true) {
                    JOptionPane.showMessageDialog(this, "La ruta de " + jcbxCiudadDeOrigen.getSelectedItem().toString() + " hacia "
                            + jcbxCiudadDeDestino.getSelectedItem().toString() + " se ha creado correctamente");
                } else {
                    JOptionPane.showMessageDialog(this, "La ruta de " + origen + " hacia " + destino + " ya se encuentra registrada. Intentelo nuevamente");
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Es obligatorio que ingrese la cantidad de horas aproximadas de llegadas para poder registrar esta ruta");
        }
    }

    private void verRutas() {
        DefaultTableModel modelo = new DefaultTableModel();
        String columnas[] = new String[]{"Ciudad de Origen", "Ciudad de Destino", "Horas Aprox de llegada"};
        modelo.setColumnIdentifiers(columnas);
        modelo.setRowCount(0);
        tblDatos.setModel(modelo);
        tblDatos.setFillsViewportHeight(true);
        cambiarFuenteDeLaTablaModificar();
        ArrayList rutas = grafo.mostrarRutas();
        try {
            int  i=0;
            for ( i = 0; i < grafo.ordenGrafo(); i++) {
                ArrayList ruta = (ArrayList) rutas.get(i);
                modelo.addRow(new Object[]{ruta.get(0), ruta.get(1), ruta.get(2)});
                
            }
            if (i>2) {
                
            }
        } catch (Exception e) {

        }
    }

    private void verCiudades() {
        DefaultTableModel model = new DefaultTableModel();
        String columnas[] = new String[]{"Código", "Nombre", "Población", "Superficie"};
        model.setColumnIdentifiers(columnas);
        model.setRowCount(0);
        tblDatos.setModel(model);
        tblDatos.setFillsViewportHeight(true);
        cambiarFuenteDeLaTablaModificar();
        ArrayList ciudades = grafo.mostrarVertices();

        for (int i = 0; i < grafo.ordenGrafo(); i++) {
            Ciudad ciudad = (Ciudad) ciudades.get(i);
            Object vec[] = {ciudad.getCodigo(), ciudad.getNombreCiudad(), ciudad.getPoblacion(), ciudad.getSuperficie()};
            model.addRow(vec);
        }

    }

    public void cambiarFuenteDeLaTablaModificar() {
        JTableHeader Theader = tblDatos.getTableHeader();
        Theader.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 16)); // font name style size
        ((DefaultTableCellRenderer) Theader.getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER); // center header text
        DefaultTableCellRenderer Alinear = new DefaultTableCellRenderer();
        Alinear.setHorizontalAlignment(SwingConstants.CENTER);
        for (int i = 0; i < tblDatos.getColumnCount(); i++) {
            
        tblDatos.getColumnModel().getColumn(i).setCellRenderer(Alinear);
        }
        tblDatos.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 14));
    }

    private void verMatriz() {
        String columnas[] = new String[grafo.ordenGrafo() + 1];
        for (int i = 0; i < columnas.length; i++) {
            if (i == 0) {
                columnas[0] = " ";
            } else {
                columnas[i] = grafo.mostrarInfoVertices().get(i - 1);
            }
        }
        modelo.setColumnIdentifiers(columnas);
        modelo.setRowCount(0);
        tblDatos.setModel(modelo);
        tblDatos.setFillsViewportHeight(true);
        cambiarFuenteDeLaTablaModificar();
        ArrayList matriz = grafo.mostrar();
        try {
            for (int i = 0; i < matriz.size(); i++) {
                ArrayList<String> mat = (ArrayList) matriz.get(i);
                String vec[] = new String[mat.size() + 1];
                for (int j = 0; j < vec.length; j++) {
                    if (j == 0) {
                        vec[j] = grafo.mostrarInfoVertices().get(i);
                    } else {
                        vec[j] = mat.get(j - 1);
                    }
                }
                modelo.addRow(vec);
            }
        } catch (Exception e) {

        }
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnConectarRuta;
    private javax.swing.JButton btnEditarRuta;
    private javax.swing.JButton btnEliminarRuta;
    private javax.swing.JButton btnGuardarCambios;
    private javax.swing.JButton btnMatrizAdj;
    private javax.swing.JButton btnMinimizar;
    private javax.swing.JButton btnMostrarCiudades;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnVerRutas;
    private javax.swing.JButton btnrutaMasRapida;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JComboBox<String> jcbxCiudadDeDestino;
    private javax.swing.JComboBox<String> jcbxCiudadDeDestinoMod;
    private javax.swing.JComboBox<String> jcbxCiudadDeOrigen;
    private javax.swing.JComboBox<String> jcbxCiudadDeOrigenMod;
    private javax.swing.JSeparator jspHora;
    private javax.swing.JSeparator jspHora1;
    private javax.swing.JLabel lbMatrizAdj;
    private javax.swing.JLabel lblAgregarDestino;
    private javax.swing.JLabel lblCiudadDeDestino;
    private javax.swing.JLabel lblCiudadDeDestinoMod;
    private javax.swing.JLabel lblCiudadDeOrigen;
    private javax.swing.JLabel lblCiudadDeOrigenMod;
    private javax.swing.JLabel lblConectarRuta;
    private javax.swing.JLabel lblEditarRuta;
    private javax.swing.JLabel lblEliminarRuta;
    private javax.swing.JLabel lblGuardarCambios;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblHoraMod;
    private javax.swing.JLabel lblMensaje1;
    private javax.swing.JLabel lblMensaje2;
    private javax.swing.JLabel lblMensajeMod1;
    private javax.swing.JLabel lblMensajeMod2;
    private javax.swing.JLabel lblMostrarCiudades;
    private javax.swing.JLabel lblNombreDestino;
    private javax.swing.JLabel lblNombreDestino1;
    private javax.swing.JLabel lblNombreDestino2;
    private javax.swing.JLabel lblNombreDestino3;
    private javax.swing.JLabel lblVerRutas;
    private javax.swing.JLabel lblrutaRapida;
    private javax.swing.JTable tblDatos;
    private javax.swing.JTextField txtCódigo;
    private javax.swing.JTextField txtHoras;
    private javax.swing.JTextField txtHorasMod;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPoblacion;
    private javax.swing.JTextField txtSuperficie;
    // End of variables declaration//GEN-END:variables
}
