package models.dao;

import java.util.ArrayList;
import java.util.List;

import models.dto.Student;

public class StudentDao {

	public List<Student> getStudents(){
		List<Student> list=new ArrayList<>();
		list.add(new Student("rathana","N001","male"));
		list.add(new Student("veyo","N002","male"));
		list.add(new Student("vansa","N003","male"));
		list.add(new Student("Em","N004","female"));
		list.add(new Student("Osdom","N005","male"));
		list.add(new Student("chhoun","N006","male"));
		
		return list;
	}
}
