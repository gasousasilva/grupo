package Service;

import DAO.PedidoDAO;

public class PedidoService {
		PedidoDAO dao;
		
		//------------------------------
		public PedidoService(){
			dao = new PedidoDAO();
		}
		//---------------------------
		public void ItemPedido(){
			dao = new PedidoDAO();
		}
		
		public void criar(ItemPedido_Beans.ItemPedido p) {   
			dao.incluir(p);  
		} 
		
		public void atualizar(ItemPedido_Beans.ItemPedido p) {   
			  dao.atualizar(p);  
		} 
		
		public void excluir(ItemPedido_Beans.ItemPedido p) {   
			  dao.excluir(p);  
		 } 
		  
		public void carregar(ItemPedido_Beans.ItemPedido iPedido) {   
			  dao.carregar(iPedido);  
		 } 

		@Override
		public String toString() {
			return "PedidoService [dao=" + dao + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
					+ ", toString()=" + super.toString() + "]";
		} 
}
