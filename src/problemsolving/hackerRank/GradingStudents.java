package problemsSolving.hackerRank;

import java.util.List;

public class GradingStudents {

    public static List<Integer> gradingStudents(List<Integer> grades) {

        for (int i = 0; i < grades.size(); i++) {

            int grade = grades.get(i);

            if ((grade >= 38) && (grade % 5) >= 3) {
                int base = grade / 5;
                int novaGrade = (base * 5) + 5;
                grades.set(i, novaGrade);

            }
        }

        return grades;

    }
}
