package com.mypack.service;

import java.util.List;
import com.mypack.model.Staff;

public interface StaffService {
	List<Staff> getStaff(Staff staff);

	int getStaffNumber(Staff staff);
	
	String insStaff(Staff staff);
	
	Staff selStaffById(int id);
	
	String updateStaff(Staff staff);
	
	String deleteStaff(int id);

	int login(Staff staff);

}
