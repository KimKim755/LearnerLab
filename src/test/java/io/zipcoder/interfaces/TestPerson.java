package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {
@Test
public void testConstructor(){
   //Given
    String expectedName ="Kim";
    long expectedId = 102030;
   //When
    Person person = new Person(expectedName,expectedId);
    //Then
    long actualId = person.getId();
    String actualName = person.getName();
    Assert.assertEquals(expectedId,actualId);
    Assert.assertEquals(expectedName,actualName);
}
@Test
    public void testSetName(){
    //Given
    String expected ="Kim";
    Person person = new Person(" ",0);
    //when
    person.setName(expected);
    String actual = person.getName();
    // Then
    Assert.assertEquals(expected,actual);
}

}
