package com.github.ming6.autoproject.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.github.ming6.autoframework.springmvc.RequestBodyParam;
import com.github.ming6.autoproject.model.Project;
import com.github.ming6.autoproject.service.ProjectService;

@RestController
@RequestMapping("/project")
public class ProjectAction {
	
	@Autowired
	private ProjectService projectService;
	
	@RequestMapping("/list")
	public List<Project> list(@RequestBodyParam("pageNumber") int pageNumber){
		return projectService.queryList(pageNumber);
	}
	
	@RequestMapping("/save")
	public Project save(@RequestBody Project project){
		projectService.save(project);
		return project;
	}
}