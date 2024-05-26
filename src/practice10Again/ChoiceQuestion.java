package practice10Again;

import java.util.ArrayList;

public class ChoiceQuestion extends QuestionDemo2{
    private ArrayList<String> choices;

    public ChoiceQuestion() {
        choices = new ArrayList<String>();
    }

    public void addChoice(String choice, boolean correct) {
        choices.add(choice);
        if (correct) {
            String choiceString = "" + choices.size();
            
        }
    }



}
