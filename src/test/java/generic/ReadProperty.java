package generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperty {

	public static String getProperty(String key) throws IOException {
		FileInputStream fis = new FileInputStream
				("./src/test/resources/propertyFiles/config.properties");
		Properties p = new Properties();
		p.load(fis);
		return p.getProperty(key);
	}
}
