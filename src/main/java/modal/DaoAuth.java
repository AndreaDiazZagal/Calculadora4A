package modal;

import server.Methods;
import server.MySQLConection;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DaoAuth {
    Connection conn;

    PreparedStatement pstm;
    CallableStatement cstn;
    ResultSet rs;

    private final String INSERT_OPERATION = "INSERT INTO operation(type,first_number,second_number,result)values (?,?,?,?)";

    public boolean saveOperation(Methods operation){
        try{
            conn = new MySQLConection().getConnection();
            String query =INSERT_OPERATION;
            pstm = conn.prepareStatement(query);
            pstm.setDouble(1,operation.firstNumber);
            pstm.setDouble(2,operation.SecondNumber());
            return pstm.executeUpdate()==1;
        }catch (SQLException e){
            Logger.getLogger(DaoAuth.class.getName()).log(Level.SEVERE, "Error saveOperation->"+e);
            return false;
        }finally {
        }
    }



}
