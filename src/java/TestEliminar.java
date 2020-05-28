
import modelo.Mascota;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateUtil;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USUARIO
 */
public class TestEliminar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Mascota mipest= new Mascota();
        
        mipest.setIdMascota(7);
        mipest.setNombre("Chamu");
        mipest.setEdad(5);
        mipest.setNombreDueno("Mary");
        mipest.setRaza("Pastor Aleman");
        String mensaje = eliminmascota(mipest);
        System.out.println(mensaje);
        
    }
    
    public static String eliminmascota(Mascota mascota)
    {
        Session session= HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(mascota);
        transaction.commit();
        session.close();
        return "Se eliminó un registro de las mascotas";
    }
    
}

