package view;

import java.util.Scanner;

import model.LoginOperation;

import DTO.LoginDTO;

public class LoginView {
	
	public void login(){
		 
		System.out.println("Enter username=");
		Scanner scan = new Scanner(System.in);
		String username = scan.next();
		System.out.println("Enter the password");
		String password = scan.next();
	    LoginDTO loginDTO = new LoginDTO();
		loginDTO.setUsername(username);
		loginDTO.setPassword(password);
		LoginOperation loginOperation = new LoginOperation();
		if(loginOperation.isAuth(loginDTO)){
			System.out.println("Welcome "+ username);
			QuestionView questionView = new QuestionView();
			questionView.printQuestion();
		}
		else{
			System.out.println("Invalid username or password");
		}
		scan.close();
			
		}

}
