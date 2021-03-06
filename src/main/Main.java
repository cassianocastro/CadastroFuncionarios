package main;

import model.dao.ConnectionFactory;
import controll.FuncionarioController;
import java.sql.*;
import javax.swing.*;

/**
 * @author cassiano
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try( Connection connection = new ConnectionFactory().getConnection() )
        {
            new FuncionarioController(connection).caller();
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
