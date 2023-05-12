package bo.edu.ucb.sis213.internship.backend;

import bo.edu.ucb.sis213.internship.backend.bl.InternshipBl;
import bo.edu.ucb.sis213.internship.backend.entity.Internship;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BackendApplicationTests {

	@Autowired
	private InternshipBl internshipBl;

	@Test
	void contextLoads() {
	}

	@Test
	public void createInternship() {
		Internship internship = new Internship();
		internship.setCompanyId(123);
		internship.setTitle("Pasantía de");
		internship.setDescription("Descripción de la pasantía");
		internship.setDeadline(new Date());
		internship.setCreateDate(new Date());
		internship.setStatus(true);
		internship.setVersion(1);
		internship.setTxDate(new Date());
		internship.setTxUser("John Doe");
		internship.setTxHost("localhost");
		Internship newInternship  = internshipBl.save(internship);
		assertNotNull(newInternship, "No se pudo crear la pasantía");
		assertNotNull(newInternship.getInternshipId(), "La llave primaria es nula");
	}

}
