package bundle.service;


public class MyServiceImpl implements MyServiceI{
	
	public MyServiceImpl() { 
		super(); 
	}
  
	public void work() {
		System.out.println("It works ! ! !");
	}
	
	public void init() {
		System.out.println("Init ! ! !");
	}
}
