package viewGUI;

public class vistaRequerimientos extends javax.swing.JFrame {

    public vistaRequerimientos() {
        initComponents();

        this.setTitle("Reto 5 (Alejandro Ospina Cubides)");
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnRequerimiento1 = new javax.swing.JButton();
        btnRequerimiento2 = new javax.swing.JButton();
        btnRequerimiento3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnRequerimiento1.setFont(new java.awt.Font("Arial", 1, 18));
        btnRequerimiento1.setText("Consulta 1");
        btnRequerimiento1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequerimiento1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnRequerimiento1);

        btnRequerimiento2.setFont(new java.awt.Font("Arial", 1, 18));
        btnRequerimiento2.setText("Consulta 2");
        btnRequerimiento2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequerimiento2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnRequerimiento2);

        btnRequerimiento3.setFont(new java.awt.Font("Arial", 1, 18));
        btnRequerimiento3.setText("Consulta 3");
        btnRequerimiento3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequerimiento3ActionPerformed(evt);
            }
        });
        jPanel1.add(btnRequerimiento3);

        jLabel1.setFont(new java.awt.Font("Arial Bold", 5, 24));
        jLabel1.setText("Clic en la Opción");
        jPanel1.add(jLabel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        setBounds(600, 250, 0, 0);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER).addComponent(
                jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE));

        pack();
    }

    private void btnRequerimiento1ActionPerformed(java.awt.event.ActionEvent evt) {
        
        VistaLiderCiudad vr1 = new VistaLiderCiudad();
        vr1.setVisible(true);
    }

    private void btnRequerimiento2ActionPerformed(java.awt.event.ActionEvent evt) {
       
        VistaProyectoCiudad vr1 = new VistaProyectoCiudad();
        vr1.setVisible(true);
    }

    private void btnRequerimiento3ActionPerformed(java.awt.event.ActionEvent evt) {
        
        VistaSumaProveedor vr1 = new VistaSumaProveedor();
        vr1.setVisible(true);
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
            java.util.logging.Logger.getLogger(vistaRequerimientos.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vistaRequerimientos.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vistaRequerimientos.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vistaRequerimientos.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vistaRequerimientos().setVisible(true);
            }
        });
    }
    
    private javax.swing.JButton btnRequerimiento1;
    private javax.swing.JButton btnRequerimiento2;
    private javax.swing.JButton btnRequerimiento3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    
}