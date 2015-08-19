package FirstScheme;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class CrudsOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	SessionFactory sf = new Configuration().configure().buildSessionFactory();
	System.out.println("Configuration Loaded successfully");
	Session session = sf.openSession();
	session.beginTransaction();
	System.out.println("Transaction began");

	}

}
