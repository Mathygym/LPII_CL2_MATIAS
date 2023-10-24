package TestEntidades;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import DAO.ClassCrudUsuarioImp;
import model.TblUsuariocl2;

public class TestUsuario {

	public static void main(String[] args) {
		ClassCrudUsuarioImp crudusu=new ClassCrudUsuarioImp();
		TblUsuariocl2 usu= new TblUsuariocl2();
		//ingresamos valores
		usu.setUsuariocl2("cristopher");
		usu.setPasswordcl2("123456");
		
		if(crudusu.ValidarUsuario(usu)!=null){
			System.out.print("Ingresaste");
		} else {
			System.out.print("Error");
		}
			
		
		
		
	}

}
