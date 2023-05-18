package bo.edu.ucb.sis213.internship.backend.dao;

import bo.edu.ucb.sis213.internship.backend.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}
