package com.project.test.dao;
import java.util.List;

import com.project.test.vo.projectVO;

public interface projectDAO {
	List<projectVO> selectProjectList() throws Exception;
}