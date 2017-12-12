/*
 * Title:Understanding DAO  
 * Author:Prashanth
 * Date:06/08/2017
 */


package com.DAOExample.Student;

import java.util.List;

public interface StudentDao {
   public List<Student> getAllStudents();
   public Student getStudent(int rollNo);
   public void updateStudent(Student student);
   public void deleteStudent(Student student);
}