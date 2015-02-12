package com.singleton;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Utility {
	public static Properties readProperties(String filepath) throws IOException{
		Properties dbProperties = new Properties();
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		InputStream ios = loader.getResourceAsStream(filepath);
		dbProperties.load(ios);
		return dbProperties;
	}
}
