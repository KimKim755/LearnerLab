package io.zipcoder.interfaces;

public class Instructor extends Person implements ITeacher {


    public Instructor(String name, long id) {
        super(name, id);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
   double numberOfHoursPerLearner = numberOfHours / learners.length;
   for (Learner learner: learners){
       learner.learn(numberOfHoursPerLearner);

   }
    }
}
