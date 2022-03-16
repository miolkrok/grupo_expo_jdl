package ec.edu.uce.repository.deberes;

import ec.edu.uce.modelo.deberes.Student;

public interface IStudentRepo {

	public void save(Student student);
	public Student findEmail(String email);
	public boolean selectExistEmail(String email);
}
