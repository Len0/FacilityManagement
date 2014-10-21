package ba.atlantbh.fm.service;

import ba.atlantbh.fm.model.Student;

public interface StudentService {
	Student save(Student student);
	boolean findByLogin(String userName, String password);
	boolean findByUserName(String userName);
}
