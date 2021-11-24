package hu.me.iit.webalk.demo.Repository;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Licit {
	private Integer licit;
	private Integer userId;
	@Id
	@GeneratedValue
	private Long id;
	
	public Licit(int licit, int userId) {
		super();
		this.licit = licit;
		this.userId = userId;
	}

	public Integer getLicit() {
		return licit;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setLicit(int licit) {
		this.licit = licit;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	
}
