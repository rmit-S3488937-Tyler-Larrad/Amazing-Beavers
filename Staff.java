package SportsStore;

public class Staff {


	private String staffID;
	private String staffName;
	private String password;
	private String staffType;

	public Staff(String staffID, String staffName, String password, String staffType) {
		super();
		this.staffID = staffID;
		this.staffName = staffName;
		this.password = password;
		this.staffType = staffType;
	}

	public String getStaffID() {
		return staffID;
	}

	public void setStaffID(String staffID) {
		this.staffID = staffID;
	}

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getStaffType() {
		return staffType;
	}

	public void setStaffType(String staffType) {
		this.staffType = staffType;
	}

	}

