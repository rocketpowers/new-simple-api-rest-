package rocketaPackages.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;

import lombok.Data;

@Entity
@Data
public class Users implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@NotBlank(message = "name field cannot be empty")
	@Length(min = 5, max = 30, message = "field with minimum 3 characters and maximum 30")
	private String name;

	@NotBlank(message = "login field cannot be empty")
	@Length(min = 5, max = 30, message = "field with minimum 3 characters and maximum 30")
	private String login;

	@NotBlank(message = "password field cannot be empty")
	@Length(min = 5, max = 20, message = "field with minimum 3 characters and maximum 20")
	private String password;

}
