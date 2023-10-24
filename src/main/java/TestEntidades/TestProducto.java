package TestEntidades;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;


import model.TblProductocl2;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// establecer la conexion con la unidad de persistencia....
				EntityManagerFactory conex=Persistence.createEntityManagerFactory("LPII_CL2");
				//gestionar entidades  
				EntityManager emanager=conex.createEntityManager();
				// iniciamos la transaccion...(iniciar las operaciones como el crud..)
				emanager.getTransaction().begin();
				
		TblProductocl2 producto=new TblProductocl2();
		// aplicamos el swicth
		String accion=JOptionPane.showInputDialog("Ingrese la accion");
		switch(accion){
		case "Registrar":
			//ingresamos valores para enviar ala base de datos
			producto.setNombrecl2("fideos");
			producto.setPrecioventacl2(4);
			producto.setPreciocompcl2(2);
			producto.setEstadocl2("vigente");
			producto.setDescripcl2("descuento");
			//registramos los datos
			emanager.persist(producto);
			//amitimos mensaje
			System.out.println("Datos registrados en la BD");
			//confirmamos
			emanager.getTransaction().commit();
			//cerramos la tranccion
			emanager.close();
			//salimos
			break;
			
		case "Listar":
			List<TblProductocl2> listado=emanager.createQuery("select a from TblProductocl2 a",TblProductocl2.class).getResultList();
			for(TblProductocl2 list:listado){
				System.out.println("codigo" + list.getIdproductocl2()+ "nombre" + list.getNombrecl2()+ "Precio venta"+
			+ list.getPrecioventacl2()+ "precio compra" + list.getPreciocompcl2()+ "estado " + list.getEstadocl2()+
			"descripcion" + list.getDescripcl2());
				
			}//fin del bucle
			//confirmamos
			emanager.getTransaction().commit();
			//cerrramos
			emanager.close();
			//salimos
			break;
		}
				
	}// fin de public  void

}// fin de la clase
