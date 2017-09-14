package model;

import DTO.LoginDTO;

public class LoginOperation {
	
	public boolean isAuth(LoginDTO loginDTO){
		
		return loginDTO.getUsername().equals(loginDTO.getPassword());
		
	}

}
