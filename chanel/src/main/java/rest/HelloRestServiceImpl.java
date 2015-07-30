package rest;

public class HelloRestServiceImpl implements HelloRestService{

	public String handleGet(String name) {
		return "Ciao" + name;
	}
	
	
}
