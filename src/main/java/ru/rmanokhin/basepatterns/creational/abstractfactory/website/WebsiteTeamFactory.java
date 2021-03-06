package ru.rmanokhin.basepatterns.creational.abstractfactory.website;

import ru.rmanokhin.basepatterns.creational.abstractfactory.Developer;
import ru.rmanokhin.basepatterns.creational.abstractfactory.ProjectManger;
import ru.rmanokhin.basepatterns.creational.abstractfactory.ProjectTeamFactory;
import ru.rmanokhin.basepatterns.creational.abstractfactory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getFirstDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Developer getSecondDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManger getProjectManager() {
        return new WebsitePM();
    }
}
