package com.dvd.dao;

import java.sql.SQLException;

import com.dvd.ibaconf.MySqlMapClient;
import com.dvd.vo.DVDInfoVO;
import com.ibatis.sqlmap.client.SqlMapClient;

public class DVDDAO {//xml문서내의 sql문 호출!!
    SqlMapClient smc;
    
    public DVDDAO() {
	   smc = MySqlMapClient.getSqlMapInstance();
	}

	public void create(DVDInfoVO vo) throws SQLException {
	   smc.insert("dvdinfo.create",vo);
	}

}
