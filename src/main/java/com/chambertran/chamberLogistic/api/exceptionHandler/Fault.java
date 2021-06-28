package com.chambertran.chamberLogistic.api.exceptionHandler;

import java.time.LocalDateTime;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Fault {
	
	private Integer status;
	private LocalDateTime dateTime;
	private String issueTitle;
	private List<Field> fields;
	
	@AllArgsConstructor
	@Getter
	public static class Field {
		
		private String name;
		private String message;
		
	}

}
