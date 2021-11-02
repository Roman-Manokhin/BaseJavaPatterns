package ru.rmanokhin.basepatterns.creational.abstractfactory.banking;

import ru.rmanokhin.basepatterns.creational.abstractfactory.Tester;

public class QATester implements Tester {
    @Override
    public void testCode() {
        System.out.println("QA tester tests banking project...");
    }
}
