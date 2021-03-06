package ru.rmanokhin.basepatterns.creational.abstractfactory.banking;

import ru.rmanokhin.basepatterns.creational.abstractfactory.Developer;
import ru.rmanokhin.basepatterns.creational.abstractfactory.ProjectManger;
import ru.rmanokhin.basepatterns.creational.abstractfactory.ProjectTeamFactory;
import ru.rmanokhin.basepatterns.creational.abstractfactory.Tester;

public class BankTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getFirstDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Developer getSecondDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManger getProjectManager() {
        return new BankingPM();
    }
}
