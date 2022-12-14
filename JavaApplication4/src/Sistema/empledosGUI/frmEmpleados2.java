
package Sistema.empledosGUI;

import javax.swing.table.DefaultTableModel;
import Sistema.EmpleadosBL.empleadosBL;
import Sistema.empleadosDAL.ConexionBD;
import java.sql.*;
import javax.swing.JTable;


//mediante este metodo cambiamos los nombres del index de la tabla 
public class frmEmpleados2 extends javax.swing.JFrame {
    DefaultTableModel modelo;
    
    public frmEmpleados2 (){
        initComponents();
        String []titulo={"Id","Nombre","Correo"};
        modelo=new DefaultTableModel (null,titulo);        
        tblEmpleados.setModel(modelo);
        //se llama al metodo mostrarDatos();
        mostrarDatos();
    }
    // creamos un metodo void 
    
    
public void mostrarDatos(){
    /*ESTE BUCLE ES PARA CADA VEZ QUE EL USUARIO INGRESE DATOS , BORRE O CARGE SE ACTUALIZE
    EL NUMERO DE FILAS DE NUESTRA  TABLA DE NUESTRA INTERFAZ */
    while(modelo.getRowCount()>0){
        modelo.removeRow(0);
    }
    //Hacemos una instancia del metodo  ConexionBD
    ConexionBD conexion=new ConexionBD();
     try{
         /*hacemos una instancia del metodo ResulSet y creamos un objeto llamado resultado = en el cual se llama la variable conexion que fue
         instanciada por la clase ConexionBD y llamamos el metodo consultar registros
         */
            ResultSet resultado=conexion.consultarRegistros("SELECT * FROM empleados");
            while(resultado.next()){
                System.out.println(resultado.getString("Id"));
                System.out.println(resultado.getString("Nombre"));
                System.out.println(resultado.getString("Correo"));
                Object []usuario={
                    resultado.getString("Id"),resultado.getString("Nombre"),resultado.getString("Correo") };
                modelo.addRow(usuario);

            }
            
        }
     catch(Exception e){
            e.printStackTrace();
            
        }
    
    
}

    
 


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmpleados = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblEmpleados.setModel(new javax.swing.table.DefaultTableModel(
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
        tblEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEmpleadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEmpleados);

        jLabel1.setText("Nombre");

        jLabel2.setText("Correo");

        jLabel3.setText("Id");

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 995, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                    .addComponent(txtNombre))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(137, 137, 137)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
    //Metodo agregar sentencias sql (buttonAgregar)
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        
//creamos un objeto de la instancia ConexionBD
        ConexionBD conexion=new ConexionBD();
        
        /*creamos un objeto de la clase empleadosBL donde estan nuestros atributos Nombre y Correo , y almacenamos  el metodo RecuperarDatosGUI ()
        en el cual nos retorna los atributos modificados por medio se los setter que ingresa el ususario
        */
        empleadosBL objetoEmpleados=RecuperarDatosGUI ();
        
        String sentenciasql=String.format ("INSERT INTO empleados (Id, Nombre ,Correo)"+"VALUES(NULL,'%s','%s')",objetoEmpleados.getNombre(),objetoEmpleados.getCorreo());
        
         conexion.ejecutaSentenciaSQL(sentenciasql);
         
         //para actualizar cada vez que el usuario ingrese datos
         this.mostrarDatos();
       
        
    }//GEN-LAST:event_btnAgregarActionPerformed
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
   //Creamos un nuevo metodo para captar los datos que el usuario ingrese por medio de la interfaz grafica
     public empleadosBL RecuperarDatosGUI (){
         
        //Instanciamos la clase empleados BL y creamos un objeto 
         empleadosBL Empleados=new empleadosBL();
         
         //proceso de conversion para la variable txtId de string a int
         int Id=txtId.getText().isEmpty()?0:Integer.parseInt(txtId.getText());
         Empleados.setId(Id);
         //a las demas variables txtNombre y txtCorreo no hay que hacerle ninguna conversion ya que los datos que se van a recibir son de tipo string
         Empleados.setNombre(txtNombre.getText());
         Empleados.setCorreo(txtCorreo.getText());
         
        /* retornamos el objeto de la clase empleados bl , donde estan los atributo Id,Nombre,Correo
          Vamos a retornar el objeto Empleado de la clase empleadosBL donde estan eschos los atributos Id,Nombre,Correo 
         y por donde se va a modificar los atributos por medio de los setter , sobreescribiendo su valor por medio del valor que va a ingresar el usuario por 
         la interfaz grafica de uduario
         */
         return Empleados;

        }
     //----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
    
    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        //creamos un objeto de la instancia ConexionBD
        ConexionBD conexion=new ConexionBD();
        
        /*creamos un objeto de la clase empleadosBL donde estan nuestros atributos Nombre y Correo , y almacenamos  el metodo RecuperarDatosGUI ()
        en el cual nos retorna los atributos modificados por medio se los setter que ingresa el ususario
        */
        empleadosBL objetoEmpleados=RecuperarDatosGUI ();
        //hacemos una variable  de tipo string en el cual va hacer un format en el cual ponemos nuestra sentensia sql para editar 
        String sentenciasqlEditar=String.format ("UPDATE empleados SET Nombre = '%s' ,"+" Correo = '%s'  WHERE  Id = '%d' ",objetoEmpleados.getNombre(),objetoEmpleados.getCorreo(),objetoEmpleados.getId());
         conexion.ejecutaSentenciaSQL(sentenciasqlEditar);
       
         
         //para actualizar cada vez que el usuario ingrese datos
         this.mostrarDatos();
       
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        //creamos un objeto de la instancia ConexionBD
        ConexionBD conexion=new ConexionBD();
        
        /*creamos un objeto de la clase empleadosBL donde estan nuestros atributos Nombre y Correo , y almacenamos  el metodo RecuperarDatosGUI ()
        en el cual nos retorna los atributos modificados por medio se los setter que ingresa el ususario
        */
        empleadosBL objetoEmpleados=RecuperarDatosGUI ();
        
        String sentenciasqlBorrar=String.format ("DELETE FROM empleados WHERE id = %d ",objetoEmpleados.getId());
        
         conexion.ejecutaSentenciaSQL(sentenciasqlBorrar);
         
         //para actualizar cada vez que el usuario ingrese datos
         this.mostrarDatos();
       
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void tblEmpleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmpleadosMouseClicked
      
        //cuando el usuario de click 
        //en java cuando se hace un click java lo interpreta como un 1 
        if(evt.getClickCount()==1){
           //hacemos una instancia del objeto receptor en el cual llamamos a una clase que esta en la libreria JTable
           
           /* JTable receptor = (JTable) evt.getSource(); -- esta funcion permite que cuando el usuario le da click al las tablas 
           se puedan editar y agregar a la base de datos 
           */
            JTable receptor = (JTable) evt.getSource();
            
            /*acontinuacion lo que estamos haciendo que cuando el usuario de click y modifiue los datos , se apliquen los cambios
            esta informacion la ubica por medio de indices 0,1,2
            
            */
            txtId.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(),0).toString());
            txtNombre.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(),1).toString());
            txtCorreo.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(),2).toString());

       }
    }//GEN-LAST:event_tblEmpleadosMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(frmEmpleados2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(frmEmpleados2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(frmEmpleados2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(frmEmpleados2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmEmpleados2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEmpleados;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
