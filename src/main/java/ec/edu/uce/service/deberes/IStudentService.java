package ec.edu.uce.service.deberes;

import ec.edu.uce.modelo.deberes.Student;

public interface IStudentService {

	public void save(Student student);
	public Student findEmail(String email);
	public boolean selectExistEmail(String email);
}
