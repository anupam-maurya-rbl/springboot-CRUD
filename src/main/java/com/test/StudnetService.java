package com.test;

import java.util.List;

public interface StudnetService{
 
	       public List<Student> getStudents();
	       public Student getStudentById(int id);
	       public boolean addStudnet(Student st);
	       public boolean updateStudnet(int id, Student st);
	       public boolean deleteStudent(int id);
}
