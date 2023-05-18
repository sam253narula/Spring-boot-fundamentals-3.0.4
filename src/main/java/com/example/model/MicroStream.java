package com.example.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MicroStream {

	private String courseName;
	private String courseType;
//	private String instructorName;
	private FullName instructorName;
	// All possible set of constructors


//	public MicroStream(String instructorName) {
//		this.instructorName = instructorName;
//	}
	
	

}
