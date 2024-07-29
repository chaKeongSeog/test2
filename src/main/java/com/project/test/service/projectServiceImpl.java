package com.project.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.test.dao.projectDAO;
import com.project.test.vo.projectVO;

@Service("projectService")
public class projectServiceImpl implements projectService{
	@Autowired
	private projectDAO projectMapper;

	@Override
	@Transactional
	public List<projectVO> selectProjectList() throws Exception {
		return projectMapper.selectProjectList();
	}

}
