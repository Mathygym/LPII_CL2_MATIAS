package DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.IProductoable;

import model.TblProductocl2;

public class ClassCrudProductoImp  implements IProductoable{

	@Override
	public void RegistrarProducto(TblProductocl2 tblpro) {
		// establecer coneccion con la uniodad de persistencia
				EntityManagerFactory factory=Persistence.createEntityManagerFactory("LPII_CL2");
				//PERMITE gestionar las entidades
				EntityManager manager=factory.createEntityManager();
				//iniciar la transaccion..
				manager.getTransaction().begin();
				//registramos
				manager.persist(tblpro);
				//confirmamo
				manager.getTransaction().commit();
				//cerrramos
				manager.close();
		
	}//fin del metodo registrar

	@Override
	public void ActualizarProducto(TblProductocl2 tblpro) {
		// TODO Auto-generated method stub
		
	}//fin del metodo actualizar

	@Override
	public void EliminarProducto(TblProductocl2 tblpro) {
		// TODO Auto-generated method stub
		
	}//fin del metood eliminar

	@Override
	public List<TblProductocl2> ListadoProducto() {
		// 
				EntityManagerFactory factory=Persistence.createEntityManagerFactory("LPII_CL2");
				//PERMITE gestionar las entidades
				EntityManager manager=factory.createEntityManager();
				//iniciar la transaccion..
				manager.getTransaction().begin();
				List<TblProductocl2> ListaProducto=manager.createQuery("select a from TblProductocl2 a",TblProductocl2.class).getResultList();
				//confirmamos
				manager.getTransaction().commit();
				//cerramos
				manager.close();
				return ListaProducto;
	}//fin del metodo listar

	@Override
	public TblProductocl2 BuscarProducto() {
		// TODO Auto-generated method stub
		return null;
	}//fin del metodo buscar

}
