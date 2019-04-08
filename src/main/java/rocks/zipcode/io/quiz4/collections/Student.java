package rocks.zipcode.io.quiz4.collections;

/**
 * @author leon on 11/12/2018.
 */
public class Student {

    Double totalAmountOfHoursLearned=0.0;
    Integer id;

    public Student() {
        this(null);
    }

    public Student(Integer id) {

        this.id = id;
    }

    public void learn(Double amountOfHours) {

        totalAmountOfHoursLearned+=amountOfHours;
    }

    public Double getTotalStudyTime() {

        return totalAmountOfHoursLearned;
    }

    public Double getTotalAmountOfHoursLearned() {
        return totalAmountOfHoursLearned;
    }

    public void setTotalAmountOfHoursLearned(Double totalAmountOfHoursLearned) {
        this.totalAmountOfHoursLearned = totalAmountOfHoursLearned;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
