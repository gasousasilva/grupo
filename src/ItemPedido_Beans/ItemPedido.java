package ItemPedido_Beans;

public class ItemPedido {
	   private int id;
	   private String pedido;
	   private String produto;
	   private int qtde;
	   private String valor;
	   
	   public ItemPedido(){
		   	  id=0;
		      pedido="";
		      produto="";
		      qtde=0;
		      valor="";
	   }
	   
	   public void itemPedido(int id,String pedido,String produto,int qtde,String valor){
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
	   public String getPedido(){ 
		   return pedido; 
	   }
	   public String getProduto(){ 
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
	   public void setPedido(String pedido){ 
		   this.pedido=pedido; 
		 }
	   public void setProduto(String produto){ 
		   this.produto = produto; 
		 }
	   public void setQtde(int qtde){ 
		   this.qtde = qtde; 
		   }
	   public void setValor(String valor){ 
		   this.valor=valor; 
		   }
	}

