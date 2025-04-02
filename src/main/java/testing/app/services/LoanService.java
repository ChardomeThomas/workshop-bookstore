package testing.app.services;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import testing.app.models.Loan;
import testing.app.repositories.LoanRepository;

@Component
public class LoanService {

    private LoanRepository loanRepo;

    public LoanService(LoanRepository loanRepo) {
        this.loanRepo = loanRepo;
    }
  
    public Loan save(@RequestBody Loan loanRequest) {
        return this.loanRepo.save(loanRequest);
    }
    
}
