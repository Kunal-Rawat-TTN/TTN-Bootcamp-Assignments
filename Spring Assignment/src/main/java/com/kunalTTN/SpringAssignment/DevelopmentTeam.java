package com.kunalTTN.SpringAssignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class DevelopmentTeam {
    private Developer developer1;
    private Developer developer2;

    @Autowired
    DevelopmentTeam(Developer developer1, @Qualifier("frontend") Developer developer2)
    {
        this.developer1=developer1;
        this.developer2=developer2;
    }

    public Developer getDeveloper2() {
        return developer2;
    }

    public Developer getDeveloper1() {
        return developer1;
    }
}
