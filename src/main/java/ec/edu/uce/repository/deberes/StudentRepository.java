package ec.edu.uce.repository.deberes;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.deberes.Student;

@Repository
@Transactional
public class StudentRepository implements IStudentRepo{

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void save(Student student) {
		// TODO Auto-generated method stub
		this.entityManager.persist(student);
	}

	@Override
	public Student findEmail(String email) {
		TypedQuery<Student> myQuery=this.entityManager.createQuery("Select s from Student s where s.email=:valor", Student.class);
		myQuery.setParameter("valor", email);
		return myQuery.getSingleResult();
	}

	@Override
	public boolean selectExistEmail(String email) {
		Student st=this.findEmail(email);
		if(st!=null) {
		return true;
		}else {
			return false;
		}
		
	}
}
