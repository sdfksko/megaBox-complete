package com.example.demo.dao;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.example.demo.dto.MovieDTO;

public interface MovieDAO {
	List<MovieDTO> select(SqlSession s)throws SQLException;
	MovieDTO selectByIdx(SqlSession s, int idx)throws SQLException;
	HashMap<String, Object> selectTicketing(SqlSession s, HashMap<String, Object> map)throws SQLException;
	List<MovieDTO> selectMovieName(SqlSession s,String name)throws SQLException;
}
