package Controlador;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.ClassCrudUsuarioImp;
import model.TblUsuariocl2;

/**
 * Servlet implementation class ControladorLogueo
 */
public class ControladorLogueo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorLogueo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	//PrintWriter out=response.getWriter();
    	// TODO Auto-generated method stub
    			//doGet(request, response);
    			String usuario=request.getParameter("usuario");
    			String pass=request.getParameter("password");
    			String mensaje="";
    			TblUsuariocl2 usua=new TblUsuariocl2();
    			//asiganmos valores
    			
    			usua.setUsuariocl2(usuario);
    			usua.setPasswordcl2(pass);
    			
    			ClassCrudUsuarioImp crudusu=new ClassCrudUsuarioImp();
    			
    			 if(crudusu.ValidarUsuario(usua)!=null){				
    							
    					request.getRequestDispatcher("/GestionProducto.jsp").forward(request, response);	
    					
    				} else {
    					mensaje="Credenciales INCORRECTAS validado desde el servlet con BD....";
    					//enviamos a la vista...
    					request.setAttribute("mensaje",mensaje);
    					//redireccionamos
    					request.getRequestDispatcher("/index.jsp").forward(request, response);
    					
    				}  //fin del else....
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
