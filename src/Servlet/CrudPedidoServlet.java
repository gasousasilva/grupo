package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ItemPedido_Beans.ItemPedido;
import Service.PedidoService;

@WebServlet("/CrudPedido")
public class CrudPedidoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public CrudPedidoServlet() {
        super();
 
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	/*protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}*/
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				String id = request.getParameter("id_pedido");
				String pedido = request.getParameter("nome_pedido");
				String produto = request.getParameter("nome_produto");
				String qtde = request.getParameter("qtde_produto");
				String valor = request.getParameter("valor_produto");				
				
				ItemPedido iPedido = new ItemPedido();
				Integer idFinal = Integer.parseInt(id);
				Integer quantidade = Integer.parseInt(qtde);
				iPedido.setId(idFinal);
				iPedido.setPedido(pedido);
				iPedido.setProduto(produto);
				iPedido.setQtde(quantidade); 	
				iPedido.setValor(valor);
				
				String oQueFazer = request.getParameter("oQueFazer");
				PedidoService service = new PedidoService();
				switch (oQueFazer){
				case "Cadastrar":
					service.criar(iPedido);
				break;
				case "Consultar":
					service.carregar(iPedido);
				break;
				case "Alterar":
					service.atualizar(iPedido);
				break;
				case "Excluir":
					service.excluir(iPedido);
				break;
				}
				PrintWriter out = response.getWriter();
				out.println("<html>");
				out.println("<body>");
				if (oQueFazer.equals("Consultar")) {
					out.println("Id: "+iPedido.getId()+" Pedido: "+iPedido.getPedido()+" Produto: "+iPedido.getProduto()+
							" Quantidade:"+iPedido.getQtde()+" Valor: "+iPedido.getValor());	
				} 
				if (oQueFazer.equals("Cadastrar")) {
					out.println("Id: "+iPedido.getId());	
				}
				if (oQueFazer.equals("Excluir")) {
					out.println("Pedido com o Id: "+iPedido.getId()+" removido com sucesso.");	
				}
				if (oQueFazer.equals("Alterar")) {
					out.println("Id: "+iPedido.getId()+" Pedido: "+iPedido.getPedido()+" Produto: "+iPedido.getProduto()+
								" Quantidade:"+iPedido.getQtde()+" Valor: "+iPedido.getValor());	
				}
				//else out.println(" -- Operação realizada com sucesso");
				out.println("</body>");
				out.println("</html>");
	}

}
