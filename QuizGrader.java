public class QuizGrader{
    public static void main(String[] args) {
        // Gawa muna tayo ng arrays para sa tamang sagot at sagot ng estudyante
        char[] answerKey = {'A', 'C', 'B', 'D', 'A', 'B', 'C', 'D', 'A', 'C'};
        char[] studentAnswers = {'A', 'C', 'D', 'D', 'A', 'B', 'A', 'D', 'B', 'C'};

        // I-check na natin kung ilan yung tama at ilista ang mga mali
        int correctCount = 0;

        for (int i = 0; i < answerKey.length; i++) {
            // ikumpara na lahat ng sagot
            if (studentAnswers[i] == answerKey[i]) {
                correctCount++;
            } else {
                // Dinagdagan ng 1 yung i kasi 0-indexed ang array, pero Question 1 simula sa tao
                System.out.println("Question " + (i + 1) + ": Incorrect. You answered '" + studentAnswers[i] + "', correct answer is '" + answerKey[i] + "'");
            }
        }

        // Kwentahin na yung percentage
        // Ginawang double yung correctCount para hindi maging zero yung sagot sa division
        double scorePercentage = ((double) correctCount / answerKey.length) * 100;

        System.out.println("Correct Answers: " + correctCount + "/" + answerKey.length);
        System.out.println("Score Percentage: " + scorePercentage + "%");

        // Alamin kung pasado o bagsak
        if (scorePercentage >= 70.0) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result: FAIL");
        }
    }
}