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


@RestController
public class Controller {
	@RequestMapping(value="/service",params = { "id", "fname","lname" })
	
	
	
	@ResponseBody
	public String getBarBySimplePathWithExplicitRequestParams(@RequestParam("id") long id) {
	    return "Narrow Get a specific Bar with id=" + id;
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