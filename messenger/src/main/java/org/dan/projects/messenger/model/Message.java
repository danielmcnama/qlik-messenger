package org.dan.projects.messenger.model;

import java.util.Date;

public class Message {
	
	private long id;
	private String message;
	private Date created;
	private String author;
	private String recipient;
	private boolean palindrome;
	
	public Message() {
		
	}
	
	public Message(long id, String message, String author, String recipient) {
		this.id = id;
		this.message = message;
		this.author = author;
		this.recipient= recipient;
		this.palindrome = palindromeCheck();
		this.created = new Date();
	}
	
	public long getId() {
		return this.id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getMessage() {
		return this.message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public Date getCreated() {
		return this.created;
	}
	
	public void setCreated(Date created) {
		this.created = created;
	}
	
	public String getAuthor() {
		return this.author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}

	public String getRecipient() {
		return recipient;
	}

	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}

	public boolean getPalindrome() {
		return palindrome;
	}

	public void setPalindrome(boolean palindrome) {
		this.palindrome = palindrome;
	}
	
	//Why is this not working...?
	private boolean palindromeCheck() {
		StringBuilder sb = new StringBuilder(this.message);
		StringBuilder reverse = sb.reverse();
		return sb.equals(reverse);
	}
	
}
