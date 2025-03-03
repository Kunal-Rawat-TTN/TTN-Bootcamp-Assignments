package com.kunalTTN.SpringAssignment;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("frontend")
public class FrontendDeveloper implements Developer
{
    @Override
    public void doWork()
    {
        System.out.println("Developing frontend of the website");
    }
}
