 package com.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "StudentsMTM")
public class Students { 
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer stdid;
	private String stdname;
	private String stdemail;
	private String stdmobno;
	
	
	@ManyToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="courseid", referencedColumnName = "courseid") 
	Set<Course> course;  
	
	
	public Set<Course> getCourse() {
		return course;
	}
	public void setCourse(Set<Course> course) {
		this.course = course;
	}
	public Integer getStdid() {
		return stdid;
	}
	public void setStdid(Integer stdid) {
		this.stdid = stdid;
	}
	public String getStdname() {
		return stdname;
	}
	public void setStdname(String stdname) {
		this.stdname = stdname;
	}
	public String getStdemail() {
		return stdemail;
	}
	public void setStdemail(String stdemail) {
		this.stdemail = stdemail;
	}
	public String getStdmobno() {
		return stdmobno;
	}
	public void setStdmobno(String stdmobno) {
		this.stdmobno = stdmobno;
	}
	
	
	
}
