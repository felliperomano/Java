import java.util.*;
import java.sql.*;

//FELLIPE SOARES ROMANO CB3005411
//STEFANY LISBOA DA SILVA CB3005551

public class ProductDao {
	 public static Connection getConnection()
	    {
	        Connection con = null;
	        try
	        {

	            String dbDriver = "com.mysql.cj.jdbc.Driver";
	            String dbURL = "jdbc:mysql://localhost:3306/";
	            // Database name to access
	            String dbName = "tp02";
	            String dbUsername = "root";
	            String dbPassword = "1234";
	            Class.forName(dbDriver);

	            con = DriverManager.getConnection(dbURL + dbName, dbUsername, dbPassword);
	        }
	        catch (Exception e) { System.out.println(e); }
	        return con;
	    }
	 
	 public static int save(Product e)
	    {
	        int status = 0;
	        try
	        {
	            Connection con = ProductDao.getConnection();
	            PreparedStatement ps = con.prepareStatement("insert into product(nome,unidadeCompra,descricao,qtdPrevistoMes,precoMaxComprado) values (?,?,?,?,?)");
	            ps.setString(1, e.getNome());
	            ps.setInt(2, e.getUnidadeCompra());
	            ps.setString(3, e.getDescricao());
	            ps.setDouble(4, e.getQtdPrevistoMes());
	            ps.setDouble(5, e.getPrecoMaxComprado());

	            status = ps.executeUpdate();

	            con.close();
	        }
	        catch (Exception ex) { ex.printStackTrace(); }

	        return status;
	    }
	 
	  public static int update(Product e)
	    {
	        int status = 0;
	        try
	        {
	            Connection con = ProductDao.getConnection();
	            PreparedStatement ps = con.prepareStatement(
	            "update product set nome=?,unidadeCompra=?,descricao=?,qtdPrevistoMes=?,precoMaxComprado=? where id=?");
	            ps.setString(1, e.getNome());
	            ps.setInt(2, e.getUnidadeCompra());
	            ps.setString(3, e.getDescricao());
	            ps.setDouble(4, e.getQtdPrevistoMes());
	            ps.setDouble(5, e.getPrecoMaxComprado());
	            ps.setInt(6, e.getId());

	            status = ps.executeUpdate();

	            con.close();
	        }
	        catch (Exception ex) { ex.printStackTrace(); }

	        return status;
	    }
	  
	  public static int delete(int id)
	    {
	        int status = 0;
	        try
	        {
	            Connection con = ProductDao.getConnection();
	            PreparedStatement ps = con.prepareStatement("delete from product where id=?");
	            ps.setInt(1, id);
	            status = ps.executeUpdate();

	            con.close();
	        }
	        catch (Exception e) { e.printStackTrace(); }

	        return status;
	    }
	  
	  public static Product getProductById(int id)
	    {
	        Product e = new Product();

	        try
	        {
	            Connection con = ProductDao.getConnection();
	            PreparedStatement ps = con.prepareStatement("select * from product where id=?");
	            ps.setInt(1, id);
	            ResultSet rs = ps.executeQuery();
	            if (rs.next())
	            {
	                e.setId(rs.getInt(1));
	                e.setNome(rs.getString(2));
	                e.setUnidadeCompra(rs.getInt(3));
	                e.setDescricao(rs.getString(4));
	                e.setQtdPrevistoMes(rs.getDouble(5));
	                e.setPrecoMaxComprado(rs.getDouble(6));          

	            }
	            con.close();
	        }
	        catch (Exception ex) { ex.printStackTrace(); }

	        return e;
	    }
	  
	  public static List<Product> getAllProducts()
	    {
	        List<Product> list = new ArrayList<Product>();

	        try
	        {
	            Connection con = ProductDao.getConnection();
	            PreparedStatement ps = con.prepareStatement("select * from product")
	           ;
	            ResultSet rs = ps.executeQuery();
	            while (rs.next())
	            {
	                Product e = new Product();
	                e.setId(rs.getInt(1));
	                e.setNome(rs.getString(2));
	                e.setUnidadeCompra(rs.getInt(3));
	                e.setDescricao(rs.getString(4));
	                e.setQtdPrevistoMes(rs.getDouble(5));
	                e.setPrecoMaxComprado(rs.getDouble(6)); 
	                list.add(e);
	            }
	            con.close();
	        }
	        catch (Exception e) { e.printStackTrace(); }

	        return list;
	    }
}
