package observer;

public class MyApp {
	public static void main(String []args) {
		System.out.println("Enter text: ");
		EventSource ev=new EventSource();
		ev.addObserver((obj, arg)->{
			System.out.println("Received Response: "+arg);
		});
		
		new Thread(ev).start();
	}
}
