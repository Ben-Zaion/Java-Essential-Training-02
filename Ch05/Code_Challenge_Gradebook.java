// Java code​​​​​‌​​​​‌​‌​‌‌‌‌​​‌​​​‌​‌‌​​‌ below
/*****************************************************
Write your answer here, and then test your code.
Implement the updateGrades() method.
******************************************************/ 

import java.util.Map;
import java.util.HashMap;

class Answer {
public static void main(String[] args) {
    var grades = new HashMap<String, Integer>();
grades.put("Isaac", 95);
grades.put("Hannah", 55);
grades.put("Charlie", 80);
grades.put("Alice", 24);
grades.put("Bob", 32);
grades.put("Jane", 63);
grades.put("Daniel", 50);
grades.put("Grace", 59);
grades.put("Frank", 40);
grades.put("Eve", 79);


var makeupGrades = new HashMap<String, Integer>();
makeupGrades.put("Isaac", 90);
makeupGrades.put("Hannah", 95);
makeupGrades.put("Charlie", 76);
makeupGrades.put("Alice", 97);
makeupGrades.put("Bob", 82);
makeupGrades.put("Jane", 62);
makeupGrades.put("Daniel", 89);
makeupGrades.put("Grace", 80);
makeupGrades.put("Frank", 98);
makeupGrades.put("Eve", 79);

var gradebook = Answer.updateGrades(grades, makeupGrades);
    System.out.println(gradebook);
}
    /***************************************************
    Change these boolean values to control whether you see
    the expected result and/or hints.
    ****************************************************/ 
    static boolean showExpectedResult = false;
    static boolean showHints = false;


    static Map<String, Integer> updateGrades(Map<String, Integer> gradebook, Map<String, Integer> makeupGrades) {
       
        // TODO: Update gradebook entry if the makeup grade is better
        for (String student : gradebook.keySet()) {

            if (makeupGrades.get(student) > gradebook.get(student)) {
                gradebook.put(student, makeupGrades.get(student));
            }
        }

        return gradebook;
    }
}
