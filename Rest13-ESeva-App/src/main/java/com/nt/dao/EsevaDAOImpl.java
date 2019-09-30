package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import com.nt.bo.EsevaBO;
import com.zaxxer.hikari.HikariDataSource;

@Repository("dao")
public class EsevaDAOImpl implements EsevaDAO {

	private static String  INSERT_QUERY="INSERT INTO ESEVA_TABLE VALUES(ESEVA_SEQ.NEXTVAL,?,?,?,?)";
	private static String  GET_BCER_QUERY="SELECT NAME,BCNO FROM ESEVA_TABLE WHERE ID=? ";
	@Autowired
	private JdbcTemplate jt;
	
	@Override
	public int insertPDetails(EsevaBO bo) {
		int count=0;
		count=jt.update(INSERT_QUERY,bo.getName(),bo.getAddrs(),bo.getBcNo(),bo.getDob());
		return count;
	}//insert

	@Override
	public EsevaBO getBCFromDB(int id) {
		BeanPropertyRowMapper<EsevaBO> mapper=null;
		
		EsevaBO bo=new EsevaBO();
		mapper=new BeanPropertyRowMapper<EsevaBO>(EsevaBO.class);
		
		bo=jt.queryForObject(GET_BCER_QUERY, mapper,id);
		
		return bo;
	}
	

}
