package ec.edu.uce.modelo.deberes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_stud")
	@SequenceGenerator(sequenceName = "seq_stud", name = "seq_stud", allocationSize = 1)
	@Column(name = "stud_id")
	private Integer id;

	@Column(name = "stud_name")
	private String name;

	@Column(name="stud_email")
	private String email;

	@Column(name="stud_gender")
	private Gender gender;

	public Student() {
		
	}
	
	public Student(String name, String email, Gender gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
	}

	public String getEmail() {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
