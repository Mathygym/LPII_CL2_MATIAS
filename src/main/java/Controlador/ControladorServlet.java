package Controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.ClassCrudProductoImp;
import model.TblProductocl2;

/**
 * Servlet implementation class ControladorServlet
 */
public class ControladorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//request.getRequestDispatcher("/GestionProducto.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		//recuperamos los valores
		String nombrecl2=request.getParameter("nombre");
		double precioventacl2=Double.parseDouble(request.getParameter("precioventa"));
		double preciocompcl2=Double.parseDouble(request.getParameter("preciocompra"));
		String estadocl2=request.getParameter("estado");
		String descripcl2=request.getParameter("descrip");
		//instaciamos las respewctivas clases
		TblProductocl2 tblprod=new TblProductocl2();
		ClassCrudProductoImp crud = new ClassCrudProductoImp();
		//asignamos los valores
		tblprod.setNombrecl2(nombrecl2);
		tblprod.setPrecioventacl2(precioventacl2);
		tblprod.setPreciocompcl2(preciocompcl2);
		tblprod.setEstadocl2(estadocl2);
		tblprod.setDescripcl2(descripcl2);
		//invocamos al metood registrar
		crud.RegistrarProducto(tblprod);
		//recuperamos el listado
		List<TblProductocl2> listadoProducto=crud.ListadoProducto();
		//enviamos ala vista
		request.setAttribute("listado", listadoProducto);
		//redireccionamos
		request.getRequestDispatcher("/GestionProducto.jsp").forward(request, response);
	}

}
