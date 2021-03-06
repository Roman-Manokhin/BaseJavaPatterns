package ru.rmanokhin.basepatterns.creational.abstractfactory;

public interface ProjectTeamFactory {
    Developer getFirstDeveloper();

    Developer getSecondDeveloper();

    Tester getTester();

    ProjectManger getProjectManager();
}
