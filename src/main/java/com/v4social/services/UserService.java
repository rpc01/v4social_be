package com.v4social.services;

import com.v4social.domain.Consultation;
import com.v4social.domain.Organization;
import com.v4social.domain.User;
import com.v4social.repo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class UserService {
private UserRepository userRepository;
private ConsultationRepository consultationRepository;

@Autowired
public UserService(UserRepository userRepository,ConsultationRepository consultationRepository ) {
this.userRepository = userRepository;
this.consultationRepository = consultationRepository;
   }

public String vote(Consultation consultation, Integer numberVotes) {
	String voteOption="to define";     
	return voteOption;
	    }


}
	

