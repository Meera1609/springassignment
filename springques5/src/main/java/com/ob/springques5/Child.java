package com.ob.springques5;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Child {
	private String name;
	private int age;
	private String gender;
	private int standard;
	private List<String> hobbies;
	private Set<String> subjectsStudying;
	private Map<String, String> friendsAndGender;
	private Pet pet;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getStandard() {
		return standard;
	}
	public void setStandard(int standard) {
		this.standard = standard;
	}
	public List<String> getHobbies() {
		return hobbies;
	}
	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}
	public Set<String> getSubjectsStudying() {
		return subjectsStudying;
	}
	public void setSubjectsStudying(Set<String> subjectsStudying) {
		this.subjectsStudying = subjectsStudying;
	}
	public Map<String, String> getFriendsAndGender() {
		return friendsAndGender;
	}
	public void setFriendsAndGender(Map<String, String> friendsAndGender) {
		this.friendsAndGender = friendsAndGender;
	}
	public Pet getPet() {
		return pet;
	}
	public void setPet(Pet pet) {
		this.pet = pet;
	}
  
}
