
public class App {
	
	public static void main(String[] args) {
		
		Config instance = Config.getInstance();
		
		System.out.println(instance.getProperty("url"));
		System.out.println(instance.getProperty("db"));
		System.out.println(instance.getProperty("port"));
		System.out.println(instance.getProperty("user"));
		System.out.println(instance.getProperty("pass"));
		
		
	}

}
