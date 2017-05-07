package controllers;

import java.util.List;

import models.dao.StudentDao;
import models.dto.Student;
import views.StudentView;

public class StudentController {
	private StudentDao studentDao;
	private StudentView view;
	public void updateStudentView(){
		view=new StudentView();
		studentDao=new StudentDao();
		List<Student> list= studentDao.getStudents();
		
		if(list!=null) view.printStudentDetail(list);
	}
}
