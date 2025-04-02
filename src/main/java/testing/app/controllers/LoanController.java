package testing.app.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import testing.app.models.Loan;
import testing.app.services.LoanService;

@RestController
@RequestMapping("api/loans")
public class LoanController {

    private LoanService loanService;

    public LoanController(LoanService loanService) {
        this.loanService = loanService;
    }
    
    @PostMapping("")  
    public Loan save(Loan loanRequest) {
        return this.loanService.save(loanRequest);
    }

}
