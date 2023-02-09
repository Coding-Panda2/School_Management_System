package com.student.management.entity;



import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="student")
public class Student {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int student_id;

	private String name;
	private String address;
	private Date dateOfBirth;
	
}
