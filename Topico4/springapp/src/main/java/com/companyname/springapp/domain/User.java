package com.companyname.springapp.domain;

import java.awt.List;
import java.util.ArrayList;

public class User  {
    
    private int id;
    private String fullName;
    private String email;
    //private String friend;
    //private List friendList=new ArrayList<>(); 
	private ArrayList<String> friendList=new ArrayList<String>();   

    private Photo like;
    
    public User() {
    }

    
    
    @Override
	public String toString() {
		return "User [id=" + id + ", fullName=" + fullName + ", email=" + email
				+ ",  friendList=" + friendList
				+ ", like=" + like + "]";
	}



	public Photo getLike() {
		return like;
	}

	public void setLike(Photo like) {
		this.like = like;
	}


	public ArrayList<String> getFriendList() {
		return friendList;
	}

	public ArrayList<String> addFriend(String name){
		friendList.add(name);
		return friendList;
	}

	public void setFriendList(ArrayList<String> friendList) {
		this.friendList = friendList;
	}



	public User(int id, String fullName, String email) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}