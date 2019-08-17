package com.mypack.mapper;

import java.util.List;
import com.mypack.model.Staff;

public interface StaffMapper {
	List<Staff> getStaff(Staff staff);

	int getStaffNumber(Staff staff);
	
	int insStaff(Staff staff);
	
	Staff selStaffById(int id);
	
	int updateStaff(Staff staff);
	
	int deleteStaff(int id);

	int login(Staff staff);
}
