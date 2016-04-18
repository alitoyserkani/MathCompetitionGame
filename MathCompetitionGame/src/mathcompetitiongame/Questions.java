package mathcompetitiongame;

import java.util.Random;


public class Questions {
    
    
    boolean questionType;
    int questionDiff;
    
    
    
    public Questions(boolean qT, int qD) {
        this.questionType = getQuestionType();
    }
    
    public boolean getQuestionType() {
        Random r = new Random();
        if (r.nextBoolean() == true) {
            return true;
        }
        else return false;
    }
    
    public String getQuestion() {
        if (this.questionType == true) {
            
        }
    }
    
    public String [][] scanQuestions() {
        
    } 
    
    public String makeRandQuestion() {
        
    }
    
}
