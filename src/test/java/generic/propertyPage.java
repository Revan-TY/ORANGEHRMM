package generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class propertyPage{
	public String getproperty(String key) throws IOException
	{
		FileInputStream fis=new FileInputStream("./src/test/resources/name/url.properties");
		Properties p=new Properties();
		p.load(fis);
		return p.getProperty(key);
	}

}
