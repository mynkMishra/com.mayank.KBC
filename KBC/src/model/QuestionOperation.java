package model;

import DTO.QuestionDTO;

public class QuestionOperation {
	
	//int quesId;
	//String question;
	//String options[];          //INITIALIZE WHERE THE TOKEN IS DECLARED.
	//char rightAnswer;
	//int score;
	
	QuestionDTO questions[] = new QuestionDTO[1];
	
	
	public QuestionDTO setQuestion(int quesId, String question, char rightAnswer, int score){
		QuestionDTO questionDTO = new QuestionDTO();	
		questionDTO.setQuesId(quesId);
		questionDTO.setQuestion(question);
		questionDTO.setRightAnswer(rightAnswer);
		questionDTO.setScore(score);
		return questionDTO;
		
	}
	
	public void getQuestion(){
		questions[0] = setQuestion(1,"No.of Class Relationships are ",'a',1000);
	}
	
	public QuestionDTO fetchQuestion(int index){
		return questions[index];
	}
}
