package projects.service;
import java.util.List;
import java.util.NoSuchElementException;
import projects.dao.ProjectDao;
import projects.entity.Project;
import projects.exception.DbException;

public class ProjectService {

	public Project addProject(Project project) {
		return projectDao.insertProject(project);
	}

	private ProjectDao projectDao = new ProjectDao();

	public List<Project> fetchAllProjects() {
		return projectDao.fetchAllProjects();
	}

	public Project fetchProjectById(Integer projectId) {
		return projectDao.fetchProjectById(projectId).orElseThrow(() -> 
		new NoSuchElementException("Project with project ID= " + 
		projectId + " does not exist."));
	}

	public void modifyProjectDetails(Project project) {
		if(!projectDao.modifyProjectDetails(project)) {
			throw new DbException("Proejct with ID = " + project.getProjectId() 
			+ " does not exist.");
		}
		
	}

	public void deleteProject(Integer projectId) {
		
		if(!projectDao.deleteProject(projectId)) {
			throw new DbException("Project " + projectId + "doesn't exist.");
		}
		
	}
	
	
}