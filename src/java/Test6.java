
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
public class Test6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Mascota> lista1 = new ArrayList<>();
    
        
        lista1 = listedad();
        
        for (int i = 0; i < lista1.size(); i++) {
           
            System.out.println("Edad: " + lista1.get(i).getEdad());
              System.out.println("Raza: " + lista1.get(i).getRaza());
        }
    }

    public static List<Mascota> listedad() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        String hql = "from Mascota where edad='3' and raza='Pastor Aleman'";
        Query query = session.createQuery(hql);
        List<Mascota> miLista = query.list();
        return miLista;
    }
    
}
