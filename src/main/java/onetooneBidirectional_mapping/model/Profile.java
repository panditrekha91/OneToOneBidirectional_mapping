package onetooneBidirectional_mapping.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Profile {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int pid;
	@NotBlank
	private String profilename;
	
	
	public Profile() {
		super();
	}
	public Profile(int pid, @NotBlank String profilename) {
		super();
		this.pid = pid;
		this.profilename = profilename;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getProfilename() {
		return profilename;
	}
	public void setProfilename(String profilename) {
		this.profilename = profilename;
	}
	
	
	
	
	
}
