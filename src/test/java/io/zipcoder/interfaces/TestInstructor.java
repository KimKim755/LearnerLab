package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {
    @Test
    public void testImplementation(){
        Instructor instructor = new Instructor("yev",1010L);
        boolean actual = instructor instanceof ITeacher;
        Assert.assertTrue(actual);
    }
    @Test
    public void testInheritance() {
        Student student = new Student("max", 2030L);
        boolean actual = student instanceof Person;
        Assert.assertTrue(actual);
    }
    @Test
    public void testTeach(){
        Student student = new Student("max", 2030L);
        Instructor instructor = new Instructor("yev", 1010L);
        double expected = 6.0;
        instructor.teach(student, 6.0);
        double actual = student.getTotalStudyTime();
       Assert.assertEquals(expected,actual,0.1);

    }
    @Test
    public void testLecture(){
        Instructor instructor = new Instructor("john", 1010);
        Student student = new Student("carry",2020L);
       Student student1 = new Student("bob", 5050L);
       Student student2= new Student ("cindy", 4560L);
        Student[] students = new Student[3];
        students[0] = student;
        students[1] = student1;
        students[2] = student2;

        double expected = 35.0;

        instructor.lecture(students, 35.0);
        double actual = 0;
        for (Student s: students){
            actual = actual + s.getTotalStudyTime();
        }
        Assert.assertEquals(expected, actual, 0.1);
    }
    }
