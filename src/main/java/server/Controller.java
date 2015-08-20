package server;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import FirstScheme.CrudsOps;
import FirstScheme.contacts;

import java.util.Date;

import org.hibernate.Session;
@RestController
public class Controller {
	@RequestMapping(value="/service",params = { "id", "fname","lname" })
	
	
	
	@ResponseBody
	public String getBarBySimplePathWithExplicitRequestParams(@RequestParam("id") long id
,@RequestParam("fname") String fname,@RequestParam("lname") String lname) {
		
		contacts user = new contacts();

		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		System.out.println("Configuration Loaded successfully");
		Session session = sf.openSession();
		session.beginTransaction();
		System.out.println("Transaction began");
		
		 user.setId((int)id);
		 user.setFname(fname);
		 user.setLname(lname);


		 session.save(user);
		 session.getTransaction().commit();
		
	    return "The id have been added to DB=" + id;
	}
	
	
	
	
	/** old code
	public String greeting(@RequestParam(value="id") String identification,
			@RequestParam(value="fname") String fname,
			@RequestParam(value="lname") String lname) {
		
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		System.out.println("Configuration Loaded successfully");
		Session session = sf.openSession();
		session.beginTransaction();
		System.out.println("Transaction began");
		
		
		if (identification.equals("Shiri") || identification.equals("Irad") || identification.equals("Nimrod"))
			return "Hi "+identification+"!"+"\n"+"Good to have you on the team!";
		return "Unknown name";

	}**/ 
	


}