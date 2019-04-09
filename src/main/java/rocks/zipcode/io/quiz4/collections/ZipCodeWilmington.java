package rocks.zipcode.io.quiz4.collections;

import java.util.*;

/**
 * @author leon on 11/12/2018.
 */
public class ZipCodeWilmington {

   // List<Student> students = new ArrayList<>();
    Map<Student, Double> studyMap;


    public ZipCodeWilmington() {

        studyMap = new LinkedHashMap<>();

    }

    public void enroll(Student student) {

        studyMap.put(student, student.getTotalStudyTime());
    }

    public Boolean isEnrolled(Student student) {


        return studyMap.getOrDefault(student, null)!=null;
    }

    public void lecture(double numberOfHours) {

        for (Student s : studyMap.keySet()) {

            s.learn(numberOfHours);
        }


    }

    public Map<Student, Double> getStudyMap() {

        for (Student s : studyMap.keySet()) {

            studyMap.put(s, s.getTotalStudyTime());
        }
        return studyMap;
    }
}
