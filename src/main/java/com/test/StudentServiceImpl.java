package com.test;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class StudentServiceImpl implements StudnetService{

	@Autowired
 private Repository repo;
	@Override
	public List<Student> getStudents() {
		return repo.findAll();
	
	}

	@Override
	public Student getStudentById(int id) {
		return repo.findById(id).get();
		
	}

	@Override
	public boolean addStudnet(Student st) {
		Student st1 = repo.save(st);
		if (st1!=null)
			      return true;
		return false;
	}

	@Override
	public boolean updateStudnet(int id, Student st) {
		Student st1 = repo.findById(id).get();
		        st1.setCity(st.getCity());
		        st1.setFee(st.getFee());
		        st1.setImage(st.getImage());
		        st1.setName(st.getName());
		        repo.save(st1);
		return true;
	}

	@Override
	public boolean deleteStudent(int id) {
		 Optional<Student> findById = repo.findById(id);
		 
		   // findById.ifPresent(null);
		return false;
	}

}
