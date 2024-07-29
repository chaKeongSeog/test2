package com.project.test.service;
import java.util.List;

import com.project.test.vo.projectVO;
public interface projectService {
	List<projectVO> selectProjectList() throws Exception;
}
