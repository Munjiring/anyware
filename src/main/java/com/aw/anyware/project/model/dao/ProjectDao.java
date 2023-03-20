package com.aw.anyware.project.model.dao;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.aw.anyware.common.model.vo.PageInfo;
import com.aw.anyware.member.model.vo.Member;
import com.aw.anyware.project.model.vo.Like;
import com.aw.anyware.project.model.vo.Project;

@Repository
public class ProjectDao {

	public int selectListCount(SqlSessionTemplate sqlSession, HashMap<String, Object> map) {
		return sqlSession.selectOne("projectMapper.selectListCount", map);
	}

	public ArrayList<Project> selectProjectList(SqlSessionTemplate sqlSession, HashMap<String, Object> map, PageInfo pi) {
		int offset = (pi.getCurrentPage() - 1) * pi.getBoardLimit();
		int limit = pi.getBoardLimit();
		RowBounds rowBounds = new RowBounds(offset, limit);
		
		return (ArrayList)sqlSession.selectList("projectMapper.selectProjectList", map, rowBounds);
	}

	public int insertProject(SqlSessionTemplate sqlSession, Project pj) {
		return sqlSession.insert("projectMapper.insertProject", pj);
	}
	
	public int insertProjectMember(SqlSessionTemplate sqlSession, int memberNo) {
		return sqlSession.insert("projectMapper.insertProjectMember", memberNo);
	}
	
	public int deleteProject(SqlSessionTemplate sqlSession) {
		return sqlSession.delete("projectMapper.deleteProject");
	}
	
	public int selectNewProject(SqlSessionTemplate sqlSession) {
		return sqlSession.selectOne("projectMapper.selectNewProject");
	}

	public int insertLike(SqlSessionTemplate sqlSession, Like like) {
		return sqlSession.insert("projectMapper.insertLike", like);
	}

	public int deleteLike(SqlSessionTemplate sqlSession, Like like) {
		return sqlSession.delete("projectMapper.deleteLike", like);
	}

	
	
	
}
