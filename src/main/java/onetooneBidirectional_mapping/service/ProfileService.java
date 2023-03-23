package onetooneBidirectional_mapping.service;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import onetooneBidirectional_mapping.model.Profile;
import onetooneBidirectional_mapping.repository.ProfileInterface;

@Service
public class ProfileService {

	
	@Autowired
	private ProfileInterface profileInterface;

	public void profileinsert(@Valid Profile p) {
		profileInterface.save(p);
		
	}
	
	
	
}
