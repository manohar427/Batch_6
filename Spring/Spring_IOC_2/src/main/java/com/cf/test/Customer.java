package com.cf.test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Customer {
	private String name;
	private String email[];
	private List jobs;
	private Set food;
	private Map previusjob;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String[] getEmail() {
		return email;
	}

	public void setEmail(String[] email) {
		this.email = email;
	}

	public List getJobs() {
		return jobs;
	}

	public void setJobs(List jobs) {
		this.jobs = jobs;
	}

	public Set getFood() {
		return food;
	}

	public void setFood(Set food) {
		this.food = food;
	}

	public Map getPreviusjob() {
		return previusjob;
	}

	public void setPreviusjob(Map previusjob) {
		this.previusjob = previusjob;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", email=" + Arrays.toString(email)
				+ ", jobs=" + jobs + ", food=" + food + ", previusjob="
				+ previusjob + "]";
	}

}
