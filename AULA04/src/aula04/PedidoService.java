package aula04;

public class PedidoService {
	PedidoDAO dao;
	
	public void ItemPedido(){
		dao = new PedidoDAO();
	}
	
	public void criar(ItemPedido p) {   
		dao.incluir(p);  
	} 
	
	public void atualizar(ItemPedido p) {   
		  dao.atualizar(p);  
	} 
	
	public void excluir(ItemPedido p) {   
		  dao.excluir(p);  
	 } 
	  
	  
	  public ItemPedido carregar(int id) { 
	  ItemPedido p = dao.carregar(id);   
	  return p;  
	  }

	@Override
	public String toString() {
		return "PedidoService [dao=" + dao + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	} 
	 
	
}
