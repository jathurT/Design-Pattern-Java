package com.uor.architectural.mvc;

public class Client {
  public static void main(String[] args) {
    // Fetch student record based on his roll no from the database
    Student model = retrieveStudentFromDatabase();

    // Create a view : to write student details on console
    StudentView view = new StudentView();

    StudentController controller = new StudentController(model, view);

    controller.updateView();

    // Update model data
    controller.setStudentName("John");

    controller.updateView();
  }

  private static Student retrieveStudentFromDatabase() {
    Student student = new Student();
    student.setName("Robert");
    student.setRollNo("10");
    return student;
  }
}
