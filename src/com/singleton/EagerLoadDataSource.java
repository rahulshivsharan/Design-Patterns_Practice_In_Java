package com.singleton;

import java.io.InputStream;
import java.util.Properties;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class EagerLoadDataSource {
	
	private ComboPooledDataSource pooledDS;
	
	// Eager Initialization
	private static EagerLoadDataSource instance = new EagerLoadDataSource();  
	
	private EagerLoadDataSource (){
		Properties prop = null;
		InputStream inputStream = null;
		try{
			inputStream = LoadDataSource.class.getResourceAsStream("database.properties");
			prop = new Properties();
			prop.load(inputStream);			
			this.pooledDS = new ComboPooledDataSource();
			this.pooledDS.setJdbcUrl(prop.getProperty("url"));
			this.pooledDS.setDriverClass(prop.getProperty("driverClassName"));
			this.pooledDS.setUser(prop.getProperty("username"));
			this.pooledDS.setPassword(prop.getProperty("password"));
			this.pooledDS.setAcquireIncrement(Integer.parseInt(prop.getProperty("acquireIncrement")));
			this.pooledDS.setInitialPoolSize(Integer.parseInt(prop.getProperty("initialPoolSize")));
			this.pooledDS.setMaxPoolSize(Integer.parseInt(prop.getProperty("maxPoolSize")));
			this.pooledDS.setMinPoolSize(Integer.parseInt(prop.getProperty("minPoolSize")));
			this.pooledDS.setMaxStatements(Integer.parseInt(prop.getProperty("maxStatements")));				
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static EagerLoadDataSource getInstance(){
		return instance;
	}
		
	public ComboPooledDataSource getPooledDS() {
		return pooledDS;
	}
}
