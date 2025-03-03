package com.kunalTTN.SpringAssignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SoftwareDeveloper
{
    Developer developer;

    @Autowired
    SoftwareDeveloper(Developer developer)
    {
        this.developer=developer;
    }

    public void works()
    {
        this.developer.doWork();
    }
}

