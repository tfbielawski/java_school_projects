// QuizGrader.java
// Mughal, Programming Exercise 3.1

public class QuizGrader {
    /** enum type to represent the result of answering a question */
    enum Result { CORRECT, WRONG, UNANSWERED }
    
    private static final int PASS_MARK = 5;
    private static String[] correctAnswers = { "C", "A", "B", "D", "B", "C", "C", "A" };
    
    public static void main(String[] args) {
        System.out.println("Question Submitted Ans. Correct Ans. Result");
        
        // counters for miscellaneous statistics
        int numOfCorrectAnswers = 0;
        int numOfWrongAnswers = 0;
        int numOfUnanswered = 0;
        
        // loop through submitted answers and correct answers
        for (int i = 0; i < args.length; i++) {
            String submittedAnswer = args[i];
            String correctAnswer = correctAnswers[i];
            Result result = determineResult(submittedAnswer, correctAnswer);
            
            // print report for current question
            System.out.printf("%-9d%-15s%-13s%-15s\n",
                i + 1, submittedAnswer, correctAnswer, result);
            
            // accumulate statistic
            switch (result) {
                case CORRECT: numOfCorrectAnswers++; break;
                case WRONG: numOfWrongAnswers++; break;
                case UNANSWERED: numOfUnanswered++; break;
            }
        }
            
        // print summary of statistics
        System.out.println("No. of correct answers:         " + numOfCorrectAnswers);
        System.out.println("No. of wrong answers            " + numOfWrongAnswers);
        System.out.println("No. of questions unanswered:    " + numOfUnanswered);
        System.out.println("The candidate " + 
            (numOfCorrectAnswers >= PASS_MARK ? "Passed" : "Failed"));
    }
        
    /** determines result of answer to a question */
    public static Result determineResult(String submittedAnswer, String correctAnswer) {
       Result result = null;
       if (submittedAnswer.equals(correctAnswer))
           result = Result.CORRECT;
       else if (submittedAnswer.equals("X"))
           result = Result.UNANSWERED;
       else
           result = Result.WRONG;
       return result;
   }
}
    
    