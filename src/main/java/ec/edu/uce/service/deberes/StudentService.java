package ec.edu.uce.service.deberes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.deberes.Student;
import ec.edu.uce.repository.deberes.IStudentRepo;

@Service
public class StudentService implements IStudentService{
@Autowired
private IStudentRepo studentRepo;
	
	@Override
	public void save(Student student) {
		// TODO Auto-generated method stub
		this.studentRepo.save(student);
	}

	@Override
	public Student findEmail(String email) {
		// TODO Auto-generated method stub
		return this.studentRepo.findEmail(email);
	}

	@Override
	public boolean selectExistEmail(String email) {
		// TODO Auto-generated method stub
		return this.studentRepo.selectExistEmail(email);
	}

	
	
}
