import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//FELLIPE SOARES ROMANO CB3005411
//STEFANY LISBOA DA SILVA CB3005551

@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet
{
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
    {
        String sid = request.getParameter("id");
        int id = Integer.parseInt(sid);
        ProductDao.delete(id);
        response.sendRedirect("ViewServlet");
    }
}