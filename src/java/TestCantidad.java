
import java.util.ArrayList;
import java.util.List;
import modelo.Mascota;
import org.hibernate.Query;
import org.hibernate.Session;
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
public class TestCantidad {

    /**
     * @param args the command line arguments
     */
      public static void main(String[] args) {
        // TODO code application logic here
        List<Mascota> lista = new ArrayList<>();
        lista = listarMascota();
        for (int i = 0; i < lista.size(); i++) {
           System.out.println("Nombre: " +lista.get(i).getNombre()+" = "+lista.get(i).getIdMascota());
            
        }
    }
    
    public static  List<Mascota> listarMascota(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        String hql = "from Mascota";
        Query query =session.createQuery(hql);
        List<Mascota> miLista= query.list();
        return miLista;
    }
    
    
    
}
