package problems_solving.hackerRank;

import java.util.List;

public class GradingStudents {
    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */
    public static List<Integer> gradingStudents(List<Integer> grades) {

        for(int i = 0; i < grades.size(); i++){
            if((grades.get(i) >= 38)){

                int base = grades.get(i) / 5;

                if((grades.get(i) % 5) >= 3){
                    int novaGrade = (base * 5) + 5;
                    grades.set(i, novaGrade);
                }


            }
        }

        return grades;

    }
}
