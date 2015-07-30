package rest;

import bundle.service.MyServiceI;
import bundle.service.MyServiceImpl;

public class HelloRestServiceImpl implements HelloRestService{
	
	
	public String handleGet(String name) {
		// Utilizzo di un servizio del modulo bundle
		
		MyServiceI myServiceI = new MyServiceImpl() ;
		myServiceI.work();
		
		return "Ciao " + name;
	}
	
}
