package com.marcioggs.crackingthecodeinterview.chapter4.exercise7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * Build Order: You are given a list of projects and a list of dependencies (which is a list of
 * pairs of projects, where the second project is dependent on the first project). All of a
 * project's dependencies must be built before the project is. Find a build order that will allow
 * the projects to be built. If there is no valid build order, return an error. EXAMPLE Input:
 * projects: a, b, c, d, e, f dependencies: (a, d), (f, b), (b, d), (f, a), (d, c) Output: f, e, a,
 * b, d, c
 */
public class Solution {

  public String findBuildOrder(String[] projects, String[][] dependencies) {

    List<String> projectOrder = new ArrayList<>();

    Map<String, Project> allProjects = this.createProjects(projects);
    this.addDependencies(allProjects, dependencies);

    boolean lastIterationHadChanges;

    do {
      lastIterationHadChanges = false;

      Iterator<Project> iterator = allProjects.values().iterator();
      while (iterator.hasNext()) {
        Project project = iterator.next();

        if (project.predecessors.isEmpty()) {
          lastIterationHadChanges = true;
          projectOrder.add(project.name);
          this.removeDependency(allProjects, project);
          iterator.remove();
        }
      }
    } while (lastIterationHadChanges);

    return String.join(", ", projectOrder);
  }

  private Map<String, Project> createProjects(String[] projects) {
    Map<String, Project> allProjects = new HashMap<>();

    for (String projectName : projects) {
      allProjects.put(projectName, new Project(projectName));
    }

    return allProjects;
  }

  private void addDependencies(Map<String, Project> allProjects, String[][] dependencies) {
    for (String[] dependency : dependencies) {
      Project predecessorProject = this.getProject(allProjects, dependency[0]);
      Project successorProject = this.getProject(allProjects, dependency[1]);
      successorProject.predecessors.add(predecessorProject);
    }
  }

  private Project getProject(Map<String, Project> allProjects, String projectName) {
    Project project = allProjects.get(projectName);
    if (project == null) {
      throw new RuntimeException(
          "Project"
              + projectName
              + " was found at the dependencies list, but not on the projects list");
    }
    return project;
  }

  private static class Project {

    String name;
    Set<Project> predecessors = new HashSet<>();

    Project(String name) {
      this.name = name;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (o == null || getClass() != o.getClass()) {
        return false;
      }
      Project project = (Project) o;
      return name.equals(project.name);
    }

    @Override
    public int hashCode() {
      return Objects.hash(name);
    }
  }

  private void removeDependency(Map<String, Project> allProjects, Project projectToRemove) {
    for (Project project : allProjects.values()) {
      project.predecessors.remove(projectToRemove);
    }
  }
}
