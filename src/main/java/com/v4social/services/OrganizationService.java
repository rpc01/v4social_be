package com.v4social.services;

import com.v4social.domain.Consultation;
import com.v4social.domain.Organization;
import com.v4social.domain.User;
import com.v4social.repo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class OrganizationService {
private UserRepository userRepository;
private ConsultationRepository consultationRepository;

@Autowired
public OrganizationService(UserRepository userRepository,ConsultationRepository consultationRepository ) {
this.userRepository = userRepository;
this.consultationRepository = consultationRepository;
   }

public void addUsers(Consultation consultation, User user) {
	    }

public void assignUsersVotes(Consultation consultation, User user, int numberVotes) {
}

public void obtainResults(Consultation consultation, int sumeOfVotes) {
}

}
	

