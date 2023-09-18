package com.citihive.payvote.controller;
/**
 * @author Sreekanth Varidhireddy
 * Sep 18, 2023
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.citihive.payvote.entity.Voter;
import com.citihive.payvote.repository.VoterRepository;

@RestController
public class VoterController {
	
	@Autowired
	private VoterRepository voterRepository;
	
	@PostMapping("/voter")
	public Voter saveVoter(@RequestBody Voter voter) {
		return voterRepository.save(voter);
	}
	
	@GetMapping("/voter/{id}")
	public Voter getVoter(@PathVariable("id") String voterID) {
		return voterRepository.getVoterByID(voterID);
	}

	@DeleteMapping("/voter/{id}")
	public String deleteVoter(@PathVariable("id") String voterID) {
		
		return voterRepository.delete(voterID);
	}
	@PutMapping("/voter/{id}")
	public String updateEmployee(@PathVariable("id") String voterID, @RequestBody Voter voter) {
		
		return voterRepository.update(voterID, voter);
		
	}
	
	
}
