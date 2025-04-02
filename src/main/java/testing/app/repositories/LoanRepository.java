package testing.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import testing.app.models.Loan;

@Repository
public interface LoanRepository extends JpaRepository<Loan, Integer> {

}
