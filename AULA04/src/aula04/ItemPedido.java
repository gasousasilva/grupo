package aula04;

public class ItemPedido {
	   private int id;
	   private int pedido;
	   private int produto;
	   private int qtde;
	   private String valor;
	   
	   ItemPedido(){
		   	  id=0;
		      pedido=0;
		      produto=0;
		      qtde=0;
		      valor="";
	   }
	   
	   public void itemPedido(int id,int pedido,int produto,int qtde,String valor){
		   		this.id=id;
		      this.pedido=pedido;
		      this.produto=produto;
		      this.qtde=qtde;
		      this.valor=valor;
	   }
	   
	   //GETS
	   public int getId(){ 
		   return id; 
	   }
	   public int getPedido(){ 
		   return pedido; 
	   }
	   public int getProduto(){ 
		   return produto;
	   }
	   public int getQtde(){ 
		   return qtde;
		}
	   public String getValor(){ 
		   return valor; 
		}
	   
	   
	   //SETS
	   public void setId(int id){ 
		   this.id=id; 
		}
	   public void setPedido(int pedido){ 
		   this.pedido=pedido; 
		 }
	   public void setProduto(int produto){ 
		   this.produto = produto; 
		 }
	   public void setQtde(int qtde){ 
		   this.qtde = qtde; 
		   }
	   public void setValor(String valor){ 
		   this.valor=valor; 
		   }
}
