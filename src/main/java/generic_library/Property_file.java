package generic_library;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Property_file 
{
	public String getpropertyfile(String key) throws IOException
	{
		Properties p = new Properties();
		
		FileInputStream fil = new FileInputStream(Auto_constant.propertypath);
		
		p.load(fil);
		
		return p.getProperty(key);
	}

}
