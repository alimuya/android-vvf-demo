package com.alimuya.resfacade.test;

public class TestUser {
	private int uid=0;
	private String password;
	private String nickname;
	private int age;
	private long time;
	
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getTime() {
		return time;
	}
	public void setTime(long time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "TestUser [uid=" + uid + ", password=" + password
				+ ", nickname=" + nickname + ", age=" + age + ", time=" + time
				+ "]";
	}
}
