package com.github.ming6.autoproject.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.github.ming6.autoproject.model.Project;
import com.github.ming6.autoproject.service.ProjectService;

@Service
public class ProjectServiceImpl implements ProjectService {

	@Override
	public List<Project> queryList(int pageNumber) {
		List<Project> projects = new ArrayList<>();
		Project project = new Project();
		projects.add(project);
		return projects;
	}

	@Override
	public void save(Project project) {
		
	}

	@Override
	public void delete() {
		
	}
}