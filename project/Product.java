package com.shopping.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
	
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPdescription() {
		return pdescription;
	}
	public void setPdescription(String pdescription) {
		this.pdescription = pdescription;
	}
	public String getPamount() {
		return pamount;
	}
	public void setPamount(String pamount) {
		this.pamount = pamount;
	}
	public String getpCategory() {
		return pCategory;
	}
	public void setpCategory(String pCategory) {
		this.pCategory = pCategory;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int cid;
    private String pname;
    private String pdescription;
    private String pamount;
    private String pCategory;
    public int getCid() {
		return cid;
}

	       
}
