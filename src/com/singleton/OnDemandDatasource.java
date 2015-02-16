package com.singleton;

import java.io.InputStream;
import java.io.Serializable;
import java.util.Properties;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class OnDemandDatasource implements Serializable{
	private static final long serialVersionUID = 1L;
	private ComboPooledDataSource pooledDS;
	
	// Constructor of Singleton Class
	private OnDemandDatasource (){
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
		
	public static OnDemandDatasource getOnDemandDatasource(){
		return HelperHolder.INSTANCE;
	}
	
	// Inner class for creating singleton on demand
	private static class HelperHolder{
		public static final OnDemandDatasource INSTANCE = new OnDemandDatasource(); 
	}
	
	protected Object readResolve(){
		return this.getOnDemandDatasource();
	}

	public ComboPooledDataSource getPooledDS() {
		return pooledDS;
	}
	
}
