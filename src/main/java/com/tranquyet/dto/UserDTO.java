package com.tranquyet.dto;

import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * #validator
 * 
 * @author tranquyet
 *
 */
public class UserDTO extends BasedDTO<UserDTO>{
	@Size(min = 2, max = 30, message = "{abc}")
	private String name;
	@NotBlank(message = "{notblank.email}")
	private String email;
	@NotNull(message = "{notnull.age}")
	private Integer age;
	@NotNull(message = "Birthday is a reqires feild ")
	@DateTimeFormat(pattern = "mm-DD-yyyy")
	private Date birthday;
	@NotBlank(message = "have value")
	private String role;
	private AddressDTO addr;
	private String address;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public AddressDTO getAddr() {
		return addr;
	}

	public void setAddr(AddressDTO addr) {
		this.addr = addr;
	}

}
