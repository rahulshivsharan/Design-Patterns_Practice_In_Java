package com.singleton;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class MyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties props = null;
		DataSource ds = null;
		Connection con = null;
		ComboPooledDataSource pooledDS = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try{
			//pooledDS = LoadDataSource.INSTANCE.getPooledDatasource();
			//pooledDS = OnDemandDatasource.getOnDemandDatasource().getPooledDS();
			pooledDS = EagerLoadDataSource.getInstance().getPooledDS();
			con = pooledDS.getConnection();
			ps = con.prepareStatement("select st_name from studentTbl");
			rs = ps.executeQuery();
			while(rs.next()){
				System.out.println("Name : "+rs.getString("ST_NAME"));
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(con != null && !con.isClosed()){
					con.close();
				}
			}catch(SQLException sqle){
				sqle.printStackTrace();
			}
		}
	}

}
