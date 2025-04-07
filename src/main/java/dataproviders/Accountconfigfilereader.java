package dataproviders;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Accountconfigfilereader {
	private Properties properties;
	private final String propertyFilePath= "./config/accountconfig.properties";
	public Accountconfigfilereader(){
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(propertyFilePath));
			properties = new Properties();
			try {
				properties.load(reader);
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
		}		
	}
	
	public String getAccountconfigvalue(String value) {
		String configvalue = properties.getProperty(value);
		if(configvalue!= null) return configvalue;
		else throw new RuntimeException(value + "not specified in the Configuration.properties file.");	
		
	}

}
