package com.soni.dto;

import com.soni.model.User;

import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
public class ReelsDto {
	
	private Long id;
	private String title;
	private String video;
	
	private UserDto user;

}
