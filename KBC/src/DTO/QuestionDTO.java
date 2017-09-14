package DTO;

public class QuestionDTO {
	
	int quesId;
	String question;
	char rightAnswer;
	int score;
	
	public QuestionDTO(){
		this.quesId = 00;
		this.question = "N/A";
		this.rightAnswer = '-';
		this.score = 0000;
		
	}
	
	public int getQuesId() {
		return quesId;
	}
	public void setQuesId(int quesId) {
		this.quesId = quesId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public char getRightAnswer() {
		return rightAnswer;
	}
	public void setRightAnswer(char rightAnswer) {
		this.rightAnswer = rightAnswer;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	

}
