package com.historys.ensas.entity;

import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(collection = "histories")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class History {

	@Id
	private String id;

	@NotBlank
	@Size(max = 20)
	private String message;

	@LastModifiedDate
	private Date date = new Date();

	@NotBlank
	private String userId;

	@NotBlank
	private String compteId;

	public History(String userId, String compteId, String message, Date date) {
		this.userId = userId;
		this.compteId = compteId;
		this.message = message;
		this.date = date;
	}

}
