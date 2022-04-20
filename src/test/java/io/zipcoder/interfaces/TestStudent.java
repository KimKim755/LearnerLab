package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {
    @Test
    public void  testImplementation(){
   Student student= new Student("max",2030L);
    boolean actual = student instanceof Learner;
        Assert.assertTrue(actual);
    }
    @Test
    public void testInheritance(){
        Student student = new Student("max",2030L);
        boolean actual = student instanceof Person;
        Assert.assertTrue(actual);

    }
    @Test
    public void testLearn(){
    Student student = new Student ("max", 2030L);
    double expected = 10.0;
    student.learn(expected);
    double actual = student.getTotalStudyTime();
    Assert.assertEquals(expected,actual,0.1);
    }
}
