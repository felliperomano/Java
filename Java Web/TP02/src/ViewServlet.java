import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/ViewServlet")

//STEFANY LISBOA DA SILVA 3005551
//FELLIPE SOARES ROMANO 3005411
public class ViewServlet extends HttpServlet
{
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
    {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        out.println("<a href='index.html'>Add New Product</a>");
        out.println("<h1>Products List</h1>");
        
        List<Product> list = ProductDao.getAllProducts();
        
        out.print("<table border='1' width='100%'");
        out.print("<tr><th>Id</th><th>Nome</th><th>Unidade de Compra</th><th>Descricao</th><th>Quantidade Previsto</th><th>Preco Max Comprado</th><th>Editar</th><th>Apagar</th></tr>");

        for(Product e:list){
            out.print("<tr><td>"+e.getId()+"</td><td>"+e.getNome()+"</td><td>"+e.getUnidadeCompra()+"</td><td>"+e.getDescricao()+"</td><td>"+e.getQtdPrevistoMes()+"</td><td>"+e.getPrecoMaxComprado()+"<td></td><td><a href='EditServlet?id="+e.getId()+"'>edit</a></td><td><a href='DeleteServlet?id="+e.getId()+"'>delete</a></td></tr>");
        }
        out.print("</table>");
        out.close();
    }
}