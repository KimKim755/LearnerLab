package io.zipcoder.interfaces;
public class Student extends Person implements Learner {
      private double totalStudyTime;

    public Student(String name, Long id) {
        super(name, id);
    }

   @Override
    public void learn(double numberOfHours) {
        this.totalStudyTime = this.totalStudyTime + numberOfHours;

    }

    @Override
    public double getTotalStudyTime() {
        return this.totalStudyTime;
    }


}

