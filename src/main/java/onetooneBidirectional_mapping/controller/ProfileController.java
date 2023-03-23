package onetooneBidirectional_mapping.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import onetooneBidirectional_mapping.model.Profile;
import onetooneBidirectional_mapping.service.ProfileService;

@RestController
@RequestMapping("/profile")
public class ProfileController {

	
	@Autowired
	private ProfileService profileservice;
	
	@PostMapping
	public String addProfile(@Valid @RequestBody Profile p)
	{
		
		profileservice.profileinsert(p);
		return "profile added successfully";
		
		
	}
	
	
	
}
