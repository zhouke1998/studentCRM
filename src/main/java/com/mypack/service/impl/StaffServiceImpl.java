package com.mypack.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.mypack.mapper.StaffMapper;
import com.mypack.model.Staff;
import com.mypack.service.StaffService;
@Service
public class StaffServiceImpl implements StaffService{
	@Resource
	private StaffMapper staffMapper;

	@Override
	public List<Staff> getStaff(Staff staff){
		//System.out.println(staff.getPage());
		if (staff.getPage()!=-1) {
			int start = (staff.getPage() - 1) * 5;
			staff.setPage(start);
		}
		//System.out.println(staff);
		return staffMapper.getStaff(staff);
	}

	@Override
	public int getStaffNumber(Staff staff) {
		return staffMapper.getStaffNumber(staff);
	}

	@Override
	public String insStaff(Staff staff) {
		return staffMapper.insStaff(staff)==1?"OK":"NO";
	}

	@Override
	public Staff selStaffById(int id) {
		return staffMapper.selStaffById(id);
	}

	@Override
	public String updateStaff(Staff staff) {
		return staffMapper.updateStaff(staff)==1?"OK":"NO";
	}

	@Override
	public String deleteStaff(int id) {
		return staffMapper.deleteStaff(id)==1?"OK":"NO";
	}

	@Override
	public int login(Staff staff) {
		return staffMapper.login(staff);
	}
}
