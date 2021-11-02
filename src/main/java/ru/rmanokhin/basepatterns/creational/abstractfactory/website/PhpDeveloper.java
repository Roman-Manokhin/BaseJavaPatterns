package ru.rmanokhin.basepatterns.creational.abstractfactory.website;

import ru.rmanokhin.basepatterns.creational.abstractfactory.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Php developer writes php code...");
    }
}
