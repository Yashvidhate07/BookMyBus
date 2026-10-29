package com.masai.service;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.masai.exception.LoginException;
import com.masai.model.AdminDto;
import com.masai.model.CurrentUserSession;
import com.masai.repository.SessionRepo;

import net.bytebuddy.utility.RandomString;

@Service
public class AdminLoginServiceImpl implements AdminLoginService{

	@Autowired
	private SessionRepo sRepo;

	@Value("${app.admin.username}")
	private String adminUsername;

	@Value("${app.admin.password}")
	private String adminPassword;
	
	@Override
	public CurrentUserSession logIntoAccount(AdminDto dto) throws LoginException {
		// TODO Auto-generated method stub
		if(!adminUsername.equalsIgnoreCase(dto.getUsername())) {
			throw new LoginException("Please Enter a valid Username");
		}
		Optional<CurrentUserSession> validUserSessionOpt =sRepo.findById(1);
		if(validUserSessionOpt.isPresent()) {
			throw new LoginException("Admin already Logged in with this Username");
		}
		if(adminPassword.equals(dto.getPassword())) {
			String key=RandomString.make(6);
			CurrentUserSession currentUserSession=new CurrentUserSession(1,adminUsername,key,LocalDateTime.now());
			sRepo.save(currentUserSession);
			return currentUserSession;
		}else {
			throw new LoginException("Please Enter a valid Password");
		}
	}

	@Override
	public String logOutFromAccount(String key) throws LoginException {
		CurrentUserSession validUserSession=sRepo.findByUuid(key);
		
		if(validUserSession==null) {
			throw new LoginException("Admin not logged in with this Username.");
		}
		sRepo.delete(validUserSession);
		return "Logged out successfully";
	}

}
