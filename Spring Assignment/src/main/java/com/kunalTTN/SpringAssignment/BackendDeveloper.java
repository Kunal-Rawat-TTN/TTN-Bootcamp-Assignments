package com.kunalTTN.SpringAssignment;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class BackendDeveloper implements Developer
{
    @Override
    public void doWork()
    {
        System.out.println("Developing backend of the website");
    }
}
