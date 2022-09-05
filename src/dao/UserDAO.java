package dao;

import java.sql.*;


import database.Database;
import modelo.User;

public class UserDAO{
	
	private Connection connection;
	public UserDAO(){
	this.connection = new Database().getConnection();
	}
	
	public void create(User user) {
		String sql = ("INSERT INTO user(cpf,nome,telefone,email,rg)")+ "VALUES(?,?,?,?,?)";
		
		try {
			PreparedStatement stat = connection.prepareStatement(sql);
			stat.setString(1 ,user.getCpf());
			stat.setString(2 ,user.getNome());
			stat.setString(3 ,user.getTelefone());
			stat.setString(4 ,user.getEmail());
			stat.setString(5 ,user.getRg());
			stat.execute();
			stat.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}