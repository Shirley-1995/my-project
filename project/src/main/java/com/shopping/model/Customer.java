package com.shopping.model;

import javax.persistence.*;

@Entity
public class Customer {
       @Id
       @GeneratedValue(strategy=GenerationType.IDENTITY)
       private int cid;
       private String cname;
       private String cemail;
       public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCemail() {
		return cemail;
	}
	public void setCemail(String cemail) {
		this.cemail = cemail;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	private String pwd;
}
