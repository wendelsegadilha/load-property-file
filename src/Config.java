import java.io.InputStream;
import java.util.Properties;

public class Config {
	
	private static Properties p;
	private static Config config;
	
	private Config() {
		try {
			
			if (p == null) {
				p = new Properties();
				InputStream is = this.getClass().getResourceAsStream("/config.properties");
				p.load(is);
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Config getInstance() {
		if (config == null) {
			config = new Config();
		}
		return config;
	}
	
	public String getProperty(String key) {
		return p.getProperty(key);
	}

}
