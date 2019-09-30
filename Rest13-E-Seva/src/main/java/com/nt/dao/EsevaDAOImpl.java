package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.nt.bo.EsevaBO;

@Repository("dao")
public class EsevaDAOImpl implements EsevaDAO {

	private static String  INSERT_QUERY="INSERT INTO ESEVA_TABLE VALUES(ESEVA_SEQ.NEXTVAL,?,?,?,?)";
	
	@Autowired
	private DataSource ds;
	
	@Override
	public int insertPDetails(EsevaBO bo) {
		String name=null;
		String addrs=null;
		String bcNo=null;
		String dob=null;
		Connection con=null;
		PreparedStatement ps=null;
		int count=0;
		
		
		name=bo.getName();
		addrs=bo.getAddrs();
		bcNo=bo.getBcNo();
		dob=bo.getDob();
		try {
		con=ds.getConnection();
		ps=con.prepareStatement(INSERT_QUERY);
		ps.setString(1, name);
		ps.setString(2,addrs);
		ps.setString(3,bcNo);
		ps.setString(4, dob);
		count=ps.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return count;
	}

}
