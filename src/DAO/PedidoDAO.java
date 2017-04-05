package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import ConnectionFactory.Pedido_ConnectionFactory;
import ItemPedido_Beans.ItemPedido;


public class PedidoDAO {
	//INCLUIR
		public void incluir(ItemPedido p) {   
			String sqlInsert = "INSERT INTO cliente(id, pedido, produto,qtde, valor) VALUES (?, ?, ?,?,?)";     
			try (Connection conn = Pedido_ConnectionFactory.obtemConexao();     
					PreparedStatement stm = conn.prepareStatement(sqlInsert);) {    
				stm.setInt(1, p.getId());    
				stm.setInt(2, p.getPedido());    
				stm.setInt(3, p.getProduto());
				stm.setInt(4, p.getQtde()); 
				stm.setString(5, p.getValor()); 
				stm.execute();   
				} catch (SQLException e) {   
					e.printStackTrace();   
			}  
		}
		
		//ATUALIZAR
		public void atualizar(ItemPedido p) {   
			String sqlUpdate = "UPDATE cliente SET pedido=?, produto=?,qtde=?, valor=? WHERE id=?";      
			try (Connection conn = Pedido_ConnectionFactory.obtemConexao();     
					PreparedStatement stm = conn.prepareStatement(sqlUpdate);) {    
					stm.setInt(1, p.getId());    
					stm.setInt(2, p.getPedido());    
					stm.setInt(3, p.getProduto());
					stm.setInt(4, p.getQtde()); 
					stm.setString(5, p.getValor());   
					stm.execute();   
					} catch (Exception e) {    
						e.printStackTrace();   }  
			} 
		
		//EXCLUIR
		public void excluir(ItemPedido p) {   
			String sqlDelete = "DELETE FROM ItemPedido WHERE id = ?";    
			try (Connection conn = Pedido_ConnectionFactory.obtemConexao(); 
					PreparedStatement stm = conn.prepareStatement(sqlDelete);) {    
				stm.setInt(1, p.getId());    
				stm.execute();   
				} catch (Exception e) {    
					e.printStackTrace();   
				}  
			} 
		
		//CARREGAR
		public ItemPedido carregar(int id) {   
			ItemPedido p = new ItemPedido();   
			String sqlSelect = "SELECT pedido, produto, qtde, valor FROM ItemPedido WHERE ItemPedido.id = ?";    
			try (Connection conn = Pedido_ConnectionFactory.obtemConexao();     
					PreparedStatement stm = conn.prepareStatement(sqlSelect);) {    
					stm.setInt(1, id);    
					try (ResultSet rs = stm.executeQuery();) {     
						if (rs.next()) {      
							p.setPedido(rs.getInt("pedido"));      
							p.setProduto(rs.getInt("produto")); 
							p.setQtde(rs.getInt("qtde")); 
							p.setValor(rs.getString("produto")); 
							}    
						} catch (SQLException e) {     
							e.printStackTrace();    }  
					} catch (SQLException e1) {    
						System. out .print(e1.getStackTrace());  
						}   return p;  
					}
		
}
