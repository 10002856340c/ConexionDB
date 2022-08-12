
package Sistema.empleadosDAL;
import java.sql. *;

public class ConexionBD {
    
    //ruta donde esta nuestra base de datos 
    String ruta="jdbc:sqlite:D://usuario//Desktop//ProyectoJDBC//basesDatos.db";
    
    //Creamos una Variable llamada "conexion" instanciado por la libreria Connection y la inicializamos con algun "valor"
    Connection conexion=null;
 //-------------------------------------------------------------------------------------------------------------------------------------//
    //METODOS :
    
    // 1)Creamos nuestro constructor para cada vez que lo llamemos podamos instanciarlo
    public ConexionBD(){
        //Hacemos un try cash
        try{//si se ejecuta
            //Hacemos la funcion principal  con Class.forName("org.sqlite.JDBC")
            Class.forName("org.sqlite.JDBC");
            
            //reescribimos la variable y alamacenamos la funcion "DriverManager.getConnection("en este apartado va ir la ruta dond se encuentra su base de datos );
            conexion=DriverManager.getConnection(ruta);
            System.out.println("Conexion Extablecida exitosamente...");
            
        }catch(Exception e){//si no se llega a ejecutar 
            //muestrame el error por panatalla
            e.printStackTrace();
            System.out.println("Hubo un error en la conexion  : "+e);
            
        }
        
        
    }
    
    
  /*2)creamos un metodo para hacer la conexion atravez de la sentencia SQL y insertar datos a la bases de datos sqlite
    Creamos una variable interna que va hacer de tipo string*/
    public int ejecutaSentenciaSQL(String sentenciaSql){
        try{ //hacemos un try cash 
            
            /*utilizamos la funcion principal  " PreparedStatement" --> nos permite definir una sentencia SQL base, que nos sirve para modificar/insertar/buscar uno o varios registros 
            con sólo cambiar los valores de los parámetros que especifiquemos
            
            * depues utilizams la funcion que es muy parecida "prepareStatement" --> que nos va a preparar en este caso ya la sentencia como tal que nosotros queramos hacer 
            en nuestra bases de datos
            */
            PreparedStatement PrepararConexion =conexion.prepareStatement(sentenciaSql);
            PrepararConexion.execute();//los ejecutamos con la funcion execute()
            
            return 1;//esto funciona con codigo booleano True= 1 , False=0
   
        }catch(Exception f){
            f.printStackTrace();
            return 0;//esto funciona con codigo booleano True= 1 , False=0
        }
    }
    

  //3)creamos un metodo para hacer la sentencias sql como por ejemplo SELECT , este metodo permite que seleccionemos la informacion 
    /*que queremos seleccionar o haya en nuestra bases de datos*/
   public ResultSet consultarRegistros(String sentenciaSql)  {
       try{
           PreparedStatement PrepararConexion =conexion.prepareStatement(sentenciaSql);
           ResultSet respuesta=PrepararConexion.executeQuery();
           return respuesta;
           
       }catch(Exception e){
           e.printStackTrace();
           return null;
           
       }
   } 
    
}
