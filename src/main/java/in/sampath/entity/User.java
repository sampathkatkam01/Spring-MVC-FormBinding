package in.sampath.entity;

public class User {
	
	private String Uname;
	private String EmailID;
	private long PhoneNumber;
	public String getUname() {
		return Uname;
	}
	public void setUname(String uname) {
		Uname = uname;
	}
	public String getEmailID() {
		return EmailID;
	}
	public void setEmailID(String emailID) {
		EmailID = emailID;
	}
	public long getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "User [Uname=" + Uname + ", EmailID=" + EmailID + ", PhoneNumber=" + PhoneNumber + "]";
	}
	

}
