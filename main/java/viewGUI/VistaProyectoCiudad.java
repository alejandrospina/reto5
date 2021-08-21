package viewGUI;

import java.sql.*;
import javax.swing.table.DefaultTableModel;
import util.JDBCUtilities;

public class VistaProyectoCiudad extends javax.swing.JFrame {    
    
    DefaultTableModel model;
    
    public VistaProyectoCiudad() {
        initComponents();
        setLocationRelativeTo(null);
        this.setTitle("Reto 5 Alejandro Ospina Cubides");
        
        String[] titulo ={"Constructora", "Fecha_Inicio", "Clasificacion"};
                model = new DefaultTableModel(null, titulo);
                
                jTable1.setModel (model);
                
                mostrarDatos();
    }      
   
    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

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
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Arial Bold", 0, 14));
        jLabel1.setText("Consulta N° 2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(jLabel1)
                .addContainerGap(159, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        pack();
    }
    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaProyectoCiudad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaProyectoCiudad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaProyectoCiudad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaProyectoCiudad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaProyectoCiudad().setVisible(true);
            }
        });
    }

   
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    
    private void mostrarDatos() {
        
        JDBCUtilities objConexion= new JDBCUtilities();
        
        try {
            ResultSet resultado = objConexion.consultarRegistros("SELECT Constructora,"+ "Fecha_Inicio,"+ "Clasificacion "+ "FROM Proyecto "+ "WHERE Ciudad = 'Armenia';");       
            
            while (resultado.next()){
            Object[] datos= {resultado.getString("Constructora"),
            resultado.getString("Fecha_Inicio"),
            resultado.getString("Clasificacion")

            }; 
            model.addRow(datos); }
        
                       
            }
            catch (Exception e) { 
    System.out.print(e);
        } 


        }
        
    }

