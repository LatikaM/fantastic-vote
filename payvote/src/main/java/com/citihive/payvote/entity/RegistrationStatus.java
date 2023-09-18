package com.citihive.payvote.entity;
/**
 * @author Sreekanth Varidhireddy
 * Sep 18, 2023
 */
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@DynamoDBDocument
public class RegistrationStatus {
	@DynamoDBAttribute
	private String voterID;
	
	@DynamoDBAttribute
	private String registrationID;
	
	@DynamoDBAttribute
	private String registrationStatus;
	
	@DynamoDBAttribute
	private String registrationSubmissionDate;
	
	@DynamoDBAttribute
	private String registeredDate;

}
