
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
public class TestInsertar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Mascota mimascota= new Mascota();
        
        mimascota.setIdMascota(8);
        mimascota.setNombre("Llely");
        mimascota.setEdad(2);
        mimascota.setNombreDueno("Ayllon");
        mimascota.setRaza("Pitbul");
        String mensaje = insertarMascota(mimascota);
        System.out.println(mensaje);
        
        
    }
    
    public static String insertarMascota(Mascota mascota){
        Session session= HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(mascota);
        transaction.commit();
        session.close();
        return "Se inserto una nueva mascota";
        
        
    }  
}
