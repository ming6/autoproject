package com.github.ming6.autoproject.service;

import java.util.List;

import com.github.ming6.autoproject.model.Project;

public interface ProjectService {
	
	public List<Project> queryList(int pageNumber);
	
	public void save(Project project);
	
	public void delete();
	
}