package chapter6classes;

public class Student {

    private String name;
    private int project1Grade;
    private int project2Grade;
    private int project3Grade;
    private int finalProjectGrade;
    
    // constructors don't have a return type
    // a constructors job is to set values for all of your instance attributes
    public Student(String name){
        setName(name);
        project1Grade = 0;
        project2Grade = 0;
        project3Grade = 0;
        finalProjectGrade = 0;
    }
    
    public Student(String name, int project1Grade, 
            int project2Grade, int project3Grade, int finalProjectGrade){
        setName(name);
        setProject1Grade(project1Grade);
        setProject2Grade(project2Grade);
        setProject3Grade(project3Grade);
        setFinalProjectGrade(finalProjectGrade);
    }

    // not how we are grading in this class, don't worry
    public String getOverallGrade() {
        int total = project1Grade + project2Grade + project3Grade + finalProjectGrade;

        int average = total / 4;

        if (average >= 94) {
            return "A";
        }
        if (average >= 90) {
            return "A-";
        }
        if (average >= 87) {
            return "B+";
        }
        if (average >= 84) {
            return "B";
        }
        if (average >= 80) {
            return "B-";
        }
        if (average >= 77) {
            return "C+";
        }
        if (average >= 74) {
            return "C";
        }
        if (average >= 70) {
            return "C-";
        }
        if (average >= 67) {
            return "D+";
        }
        if (average >= 64) {
            return "D";
        }
        return "F";

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setProject1Grade(int project1Grade) {
        this.project1Grade = ensureScoreIsBetween0and100(project1Grade);
    }

    public int getProject1Grade() {
        return project1Grade;
    }

    public void setProject2Grade(int project2Grade) {
        this.project2Grade = ensureScoreIsBetween0and100(project2Grade);
    }

    public int getProject2Grade() {
        return project2Grade;
    }

    public void setProject3Grade(int project3Grade) {
        this.project3Grade = ensureScoreIsBetween0and100(project3Grade);
    }

    public int getProject3Grade() {
        return project3Grade;
    }

    public void setFinalProjectGrade(int finalProjectGrade) {
        this.finalProjectGrade = ensureScoreIsBetween0and100(finalProjectGrade);
    }

    public int getFinalProjectGrade() {
        return finalProjectGrade;
    }

    // private method because no one needs to use it
    private int ensureScoreIsBetween0and100(int score) {
        if (score > 100) {
            return 100;
        } else if (score < 0) {
            return 0;
        } else {
            return score;
        }
    }
}
