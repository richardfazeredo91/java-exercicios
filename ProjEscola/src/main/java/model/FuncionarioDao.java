package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import util.Conexao;

public class FuncionarioDao {
	Connection con;
	ResultSet rs;
	
	public void Login(Funcionario func) {
		try {
			func.setUsuario("");
			con = new Conexao().conectar();
			String sql = "select idfunc, nome, email, senha, usuario from funcionario where email = ? and senha = ?";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, func.getEmail());
			stmt.setString(2, func.getSenha());
			rs = stmt.executeQuery();
			if (rs.next()) {
				func.setUsuario(rs.getString("usuario"));		
			} else {
				System.out.println("NÃO ACHOU");
			}
			
		}
		catch(Exception erro) {
			System.out.println(erro);
		}
	}

}
