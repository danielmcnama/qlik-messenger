package org.dan.projects.messenger.model;

public class Profile {
	private long id;
	private String profileName;
	
	public Profile() {
		
	}
	
	public Profile(long id, String profileName) {
		this.id = id;
		this.profileName = profileName;
	}
	
	public long getId() {
		return this.id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getProfileName() {
		return this.profileName;
	}
	
	public void setProfileName(String profileName) {
		this.profileName = profileName;
	}
	
}
