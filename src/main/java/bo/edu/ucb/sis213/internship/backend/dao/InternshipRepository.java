package bo.edu.ucb.sis213.internship.backend.dao;

import bo.edu.ucb.sis213.internship.backend.entity.Internship;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InternshipRepository
        extends JpaRepository<Internship, Long> {
}
