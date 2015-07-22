/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author soul
 */
public class DataBase {
    //Atributos
    private Connection connection = null;
    private ResultSet rs = null;
    private Statement st = null;
    private String sql = null;
    //Metodos
    public boolean conexion(){
        if (connection != null) {
            return false;
        }

        String url = "jdbc:postgresql://localhost:5432/monopolio";
        String password = "uneg";
        try {
            Class.forName("org.postgresql.Driver");

            connection = DriverManager.getConnection(url, "proyecto", password);

            if (connection != null) {
                System.out.println("Conectando a Base de Datos...");
                st= connection.createStatement();
            }
        } catch (Exception e) {
            System.out.println("Problemas de Conexión: "+e.getMessage());
            return false;
        }
        return true;
    }
    public boolean desconexion(){
        if (connection != null) {
            try {
                connection.close();
            }
            catch(Exception e){
                System.out.println("Problemas de Desconexión");
                return false;
            }
            return true;
        }
        return false;      
    }
    
    public boolean autenticarUsuario(String alias, String contraseña){
        if (connection != null) {
            try {
                sql = "SELECT 1 FROM usuarios WHERE alias='"+alias+"' AND contraseña='"+contraseña+"'";
                
                rs = st.executeQuery(sql);
                
                return rs.next();
                
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e.getMessage());
                return false;
            }
        }
        return false;      
    }
    
    public boolean registrarUsuario(String alias, String contraseña){
        if (connection != null) {
            try {
                sql = "INSERT INTO usuarios VALUES ('"+alias+"','"+contraseña+"',TRUE)";
                
                return st.executeUpdate(sql)>0;
                
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e.getMessage());
                return false;
            }
        }
        return false;      
    }

    public boolean setCambiarContraseña(String alias, String clave) {
        if (connection != null) {
            try {
                sql = "UPDATE usuarios "
                    + "SET contraseña='"+clave+"' "
                    + "WHERE alias='"+alias+"'";
                
                return st.executeUpdate(sql)>0;
                
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e.getMessage());
                return false;
            }
        }
        return false;
    }
    
    public ArrayList<PartidaGuardada> getPartidasGuardadas(String alias) {
        String id, ida = "0";
        String aliass;
        boolean activa;
        int i = 0;
        try {
            ArrayList<PartidaGuardada> partidasGuardadas = new ArrayList<PartidaGuardada>();
            
            sql = "SELECT id, alias, activa, orden_t FROM " + 
            "(SELECT * FROM partidas join jugadores " +
            "ON partidas.id = jugadores.partida) AS A JOIN " +
            "(SELECT partida FROM jugadores WHERE alias = '"+alias+"'"+
            ") AS B ON A.id = B.partida order by id;";
            
            rs = st.executeQuery(sql);
            
            while(rs.next()){
                aliass = rs.getString(2);
                id = rs.getString(1);
                activa = rs.getBoolean(3);
                PartidaGuardada nueva = null;
                if (!ida.equals(id)){
                    nueva = new PartidaGuardada();
                    nueva.setId(id);
                    nueva.setPartidaActiva(activa);
                    nueva.setAlias(aliass);
                    i = 1; ida = id;
                    partidasGuardadas.add(nueva);
                }
                else {
                    switch(i){
                        case 1:
                            partidasGuardadas.get(partidasGuardadas.size() - 1).setAliasJ2(aliass);
                            break;
                        case 2:
                            partidasGuardadas.get(partidasGuardadas.size() - 1).setAliasJ3(aliass);
                            break;
                        case 3:
                            partidasGuardadas.get(partidasGuardadas.size() - 1).setAliasJ4(aliass);
                            break;
                    } i += 1;                    
                }
            }
            if (partidasGuardadas.isEmpty()) return null;
            return partidasGuardadas;
        } catch (SQLException e) {
            return null;
        }
    
    
    }

    public boolean addPartida(int casas, int hoteles, int turnosCarcel, int duracion, int dineroInicial, int dineroPorVuelta, int impuestoLujo, int impuestoCapital, int fianza, String admin, String aliasJ1, String aliasJ2, String aliasJ3, String aliasJ4) {
        sql ="SELECT crear_partida("+casas+","+hoteles+","+ turnosCarcel+","+ duracion+","+ dineroInicial+","+ dineroPorVuelta+","+ impuestoLujo+","+ impuestoCapital+","+ fianza+",'"+ admin+"','"+ aliasJ1+"','"+ aliasJ2+"','"+ aliasJ3+"','"+aliasJ4+"')";
        JOptionPane.showMessageDialog(null, sql);
        return true;
    }

    public String getIdNuevaPartida() {
        try {
            sql = "SELECT MAX(id) FROM partidas";
        
        rs = st.executeQuery(sql);
        
        if(rs.next())
            return String.valueOf(rs.getInt(1)+1);
        return "1";
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return "-1";
        }
        
    }
    
}