# Sistema de estacionamiento 

![](https://comps.canstockphoto.es/coche-estacionamiento-redondo-zona-eps-vectorial_csp69918348.jpg)

- El Sistema de estacionamiento esta Hecho en java con la JRE 1.8 y Netbeans 8.0 Cumple Con la siguiente Funcionalidades:
	- disponible en .jar 
	- contiene una base de datos SQL SERVER 2017 
	- Genera Reporte 
	- Utiliza Libreria JasperReport

- Cabe Recalcar El sistema Para que Ejecute Necesita el nombre del servidor y la instancia de la Dipositivo donde este alojada la base de datos como es un sistema pequeño no es necesario alojarlo en un servidor de base de datos  Puedes Dar Clien en el Siguente Enlace [Conectar a la Base de Datos ](https://www.youtube.com/watch?v=SVk7sezKC68)



# Java

```
public static Connection conectar(){
        Connection con = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String Driver = "jdbc:sqlserver:nombreDelServidor ylaInstanciasi Esque:1433;databaseName=nombreBaseDatos";
            con = DriverManager.getConnection(Driver,User,Pass);
            System.out.println("Conectados");
            return con;
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return con ;
    }
```

