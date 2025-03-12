package src.com.restaurante.modelos;

import java.sql.Statement;

public class MesasDAO {
    private int IdMesa;
    private int capacidad;

    public int getIdMesa(){return IdMesa;}

    public void setIdMesa(int idMesa) {this.IdMesa = IdMesa;}

    public int getCapacidad() {return capacidad;}

    public void setCapacidad(int capacidad) {this.capacidad = capacidad;}

    public void INSERT(){
        String query = "INSERT INTO mesas(IdMesa, capacidad) VALUES( '" + IdMesa + "', '" + capacidad + "');";;
        try
        {
            Statement statement = Conexion.connection.createStatement();
            statement.executeUpdate(query);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public void UPDATE(){
        String query = "INSERT INTO mesas(IdMesa, capacidad) VALUES( '" + IdMesa + "', '" + capacidad + "');";;
        try
        {
            Statement statement = Conexion.connection.createStatement();
            statement.executeUpdate(query);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }


}
