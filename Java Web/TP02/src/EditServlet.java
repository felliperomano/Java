import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/EditServlet")
//STEFANY LISBOA DA SILVA 3005551
//FELLIPE SOARES ROMANO 3005411
public class EditServlet extends HttpServlet
{
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
    {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        out.println("<h1>Update Product</h1>");
        String sid = request.getParameter("id");
        int id = Integer.parseInt(sid);

        Product e = ProductDao.getProductById(id);

        out.print("<form action='EditServlet2' method='post'>");
        out.print("<table>");
        out.print("<tr><td></td><td><input type='hidden' name='id' value='"+ e.getId()+"'/></td></tr>");
        out.print("<tr><td>Nome:</td><td><input type='text' name='nome' value='"+e.getNome()+"'/></td></tr>");
        out.print("<tr><td>Descricao:</td><td><input type='text' name='descricao' value='"+e.getDescricao()+"'/></td></tr>");
        out.print("<tr><td>Unidade de Compra:</td><td><input type='number' name='unidadeCompra' value='"+e.getUnidadeCompra()+"'/></td></tr>");
        out.print("<tr><td>Preco Maximo Comprado:</td><td><input type='number' name='precoMaxComprado' value='"+e.getPrecoMaxComprado()+"'/></td></tr>");
        out.print("<tr><td>Quantidade Prevista:</td><td><input type='number' name='qtdPrevistoMes' value='"+e.getQtdPrevistoMes()+"'/></td></tr>");
        out.print("<tr><td colspan='2'><input type='submit' value='Editar & Salvar'/></td></tr>");
        out.print("</table>");
        out.print("</form>");

        out.close();
    }
}