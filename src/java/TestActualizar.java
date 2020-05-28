

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
public class TestActualizar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Mascota mipest= new Mascota();
        
        mipest.setIdMascota(6);
        mipest.setNombre("Yumi");
        mipest.setEdad(5);
        mipest.setNombreDueno("Carlos");
        mipest.setRaza("Pitbull");
        String mensaje = actualmascota(mipest);
        System.out.println(mensaje);
        
    }
    
    public static String actualmascota(Mascota mascota)
    {
        Session session= HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(mascota);
        transaction.commit();
        session.close();
        return "Se actualizo las mascotas";
    }
    
}
