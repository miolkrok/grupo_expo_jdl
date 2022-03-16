package ec.edu.uce.repository.deberes;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import ec.edu.uce.modelo.deberes.Gender;
import ec.edu.uce.modelo.deberes.Student;





//@DataJpaTest
@SpringBootTest
@Rollback(true)
@Transactional
class StudentRepositoryTest {

	@Autowired
    private StudentRepository underTest;

	@AfterEach
    void tearDown() {
       // underTest.deleteAll();
    }
	
	@Test
	void itShouldCheckWhenStudentEmailExists() {
		 // given
        String email = "jyanez@gmail.com";
        Student student = new Student(
                "Jessi",
                email,
                Gender.FEMALE
        );
        underTest.save(student);

        // when
        boolean expected = underTest.selectExistEmail(email);

        // then
        assertThat(expected).isTrue();
    }

	//ejemplo con error
	/*
    @Test
    void itShouldCheckWhenStudentEmailDoesNotExists() {
        // given
        String email = "jyanez@gmail.com";

        // when
        boolean expected = underTest.selectExistEmail(email);

        // then
        assertThat(expected).isFalse();
    }
*/
}
