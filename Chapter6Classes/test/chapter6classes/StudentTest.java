package chapter6classes;

import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {

    public StudentTest() {
    }

    @Test
    public void testStudentConstructor() {
        // Arrage

        String expectedName = "name";
        int expectedProject1Score = 100;
        int expectedProject2Score = 100;
        int expectedProject3Score = 100;
        int expectedFinalProjectScore = 100;

        // Act
        Student student = new Student(expectedName, expectedProject1Score,
                expectedProject2Score, expectedProject3Score, expectedFinalProjectScore);
        String actualName = student.getName();
        int actualProject1Score = student.getProject1Grade();
        int actualProject2Score = student.getProject2Grade();
        int actualProject3Score = student.getProject3Grade();
        int actualFinalProjectScore = student.getFinalProjectGrade();

        // assert
        assertEquals(expectedName, actualName);
        assertEquals(expectedProject1Score, actualProject1Score);
        assertEquals(expectedProject2Score, actualProject2Score);
        assertEquals(expectedProject3Score, actualProject3Score);
        assertEquals(expectedFinalProjectScore, actualFinalProjectScore);

    }

    @Test
    public void testStudentScoreNoLessThan0() {
        // Arrage

        String expectedName = "name";
        int expectedProject1Score = 0;
        Student student = new Student(expectedName);

        // Act
        student.setProject1Grade(-10);
        int actualProject1Score = student.getProject1Grade();

        // assert
        assertEquals(expectedProject1Score, actualProject1Score);

    }

    @Test
    public void testStudentScoreNoMoreThan100() {
        // Arrage

        String expectedName = "name";
        int expectedProject1Score = 100;
        Student student = new Student(expectedName);

        // Act
        student.setProject1Grade(105);
        int actualProject1Score = student.getProject1Grade();

        // assert
        assertEquals(expectedProject1Score, actualProject1Score);

    }

    @Test
    public void testGetOverallGradeA() {

        // AAA convention
        // Arrange - setup all the variables to we need for testing
        Student student = new Student("name");
        student.setProject1Grade(100);
        student.setProject2Grade(100);
        student.setProject3Grade(100);
        student.setFinalProjectGrade(100);
        String expectedGrade = "A";

        // Act - call the code we're testing
        String actualGrade = student.getOverallGrade();

        // Assert - did we get what we expected?
        assertEquals(expectedGrade, actualGrade);

    }

    @Test
    public void testGetOverallGradeAMinus() {

        // AAA convention
        // Arrange - setup all the variables to we need for testing
        Student student = new Student("name");
        student.setProject1Grade(93);
        student.setProject2Grade(93);
        student.setProject3Grade(93);
        student.setFinalProjectGrade(93);
        String expectedGrade = "A-";

        // Act - call the code we're testing
        String actualGrade = student.getOverallGrade();

        // Assert - did we get what we expected?
        assertEquals(expectedGrade, actualGrade);

    }

    @Test
    public void testGetOverallGradeBPlus() {

        // AAA convention
        // Arrange - setup all the variables to we need for testing
        Student student = new Student("name");
        student.setProject1Grade(89);
        student.setProject2Grade(89);
        student.setProject3Grade(89);
        student.setFinalProjectGrade(89);
        String expectedGrade = "B+";

        // Act - call the code we're testing
        String actualGrade = student.getOverallGrade();

        // Assert - did we get what we expected?
        assertEquals(expectedGrade, actualGrade);

    }

    @Test
    public void testGetOverallGradeB() {

        // AAA convention
        // Arrange - setup all the variables to we need for testing
        Student student = new Student("name");
        student.setProject1Grade(85);
        student.setProject2Grade(85);
        student.setProject3Grade(85);
        student.setFinalProjectGrade(85);
        String expectedGrade = "B";

        // Act - call the code we're testing
        String actualGrade = student.getOverallGrade();

        // Assert - did we get what we expected?
        assertEquals(expectedGrade, actualGrade);

    }

    @Test
    public void testGetOverallGradeBMinus() {

        // AAA convention
        // Arrange - setup all the variables to we need for testing
        Student student = new Student("name", 83, 83, 83, 83);
        String expectedGrade = "B-";

        // Act - call the code we're testing
        String actualGrade = student.getOverallGrade();

        // Assert - did we get what we expected?
        assertEquals(expectedGrade, actualGrade);

    }
    
    @Test
    public void testGetOverallGradeCPlus() {

        // AAA convention
        // Arrange - setup all the variables to we need for testing
        Student student = new Student("name", 79, 79, 79, 79);
        String expectedGrade = "C+";

        // Act - call the code we're testing
        String actualGrade = student.getOverallGrade();

        // Assert - did we get what we expected?
        assertEquals(expectedGrade, actualGrade);

    }
    
    @Test
    public void testGetOverallGradeC() {

        // AAA convention
        // Arrange - setup all the variables to we need for testing
        Student student = new Student("name", 75, 75, 75, 75);
        String expectedGrade = "C";

        // Act - call the code we're testing
        String actualGrade = student.getOverallGrade();

        // Assert - did we get what we expected?
        assertEquals(expectedGrade, actualGrade);

    }
    
    @Test
    public void testGetOverallGradeCMinus() {

        // AAA convention
        // Arrange - setup all the variables to we need for testing
        Student student = new Student("name", 73, 73, 73, 73);
        String expectedGrade = "C-";

        // Act - call the code we're testing
        String actualGrade = student.getOverallGrade();

        // Assert - did we get what we expected?
        assertEquals(expectedGrade, actualGrade);

    }
    
     @Test
    public void testGetOverallGradeDPlus() {

        // AAA convention
        // Arrange - setup all the variables to we need for testing
        Student student = new Student("name", 69, 69, 69, 69);
        String expectedGrade = "D+";

        // Act - call the code we're testing
        String actualGrade = student.getOverallGrade();

        // Assert - did we get what we expected?
        assertEquals(expectedGrade, actualGrade);

    }
    
    @Test
    public void testGetOverallGradeD() {

        // AAA convention
        // Arrange - setup all the variables to we need for testing
        Student student = new Student("name", 65, 65, 65, 65);
        String expectedGrade = "D";

        // Act - call the code we're testing
        String actualGrade = student.getOverallGrade();

        // Assert - did we get what we expected?
        assertEquals(expectedGrade, actualGrade);

    }
    
     @Test
    public void testGetOverallGradeF() {

        // AAA convention
        // Arrange - setup all the variables to we need for testing
        Student student = new Student("name");
        String expectedGrade = "F";

        // Act - call the code we're testing
        String actualGrade = student.getOverallGrade();

        // Assert - did we get what we expected?
        assertEquals(expectedGrade, actualGrade);

    }

}
