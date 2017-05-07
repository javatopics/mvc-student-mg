package views;

import java.util.List;

import models.dao.StudentDao;
import models.dto.Student;
import ui.TableFormatter;

public class StudentView {

	String[] tableHeader={"Name","Role No","Gender"};
	public void printStudentDetail(List<Student> lists){
		if(lists!=null){
			TableFormatter.tableDisplay(this.tableHeader, lists);
		}
		
	}
}
