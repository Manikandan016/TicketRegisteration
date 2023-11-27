package org.travels.registeration.Exception;

public class InvalidCredentialsException extends RuntimeException {
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Check the email or phone or password";
	}

}
