package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.mysql.jdbc.Connection;

import Interfaces.IUsuarioable;
import freemarker.core.ReturnInstruction.Return;

import model.TblUsuariocl2;

public class ClassCrudUsuarioImp implements IUsuarioable{

	@Override
	public TblUsuariocl2 ValidarUsuario(TblUsuariocl2 usua) {
		EntityManagerFactory conex=Persistence.createEntityManagerFactory("LPII_CL2");
        EntityManager entimanaUsuario=conex.createEntityManager();
        //aplicamos el JPQL... relacionado con entidades
        Query consulta=entimanaUsuario.createQuery("select u from TblUsuariocl2 u where u.usuariocl2=:x and u.passwordcl2=:y",TblUsuariocl2.class);
        //pasamos los parametros
        consulta.setParameter("x", usua.getUsuariocl2());
        consulta.setParameter("y", usua.getPasswordcl2());
        TblUsuariocl2 u;
        try {
            u=(TblUsuariocl2) consulta.getSingleResult();

        } catch (Exception ex) {
            u=null;

        }
        return u;
	
	}
	
	}//fin de la clases


