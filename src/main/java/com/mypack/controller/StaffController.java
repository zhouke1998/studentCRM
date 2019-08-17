package com.mypack.controller;

import java.text.ParseException;
import java.util.List;
import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.mypack.model.Staff;
import com.mypack.service.StaffService;
import com.mypack.tools.TraDate;

@Controller
public class StaffController{
	@Resource
	private StaffService staffServiceImpl;
	
	@RequestMapping("/ajax/getStaff")
	@ResponseBody
	public List<Staff> getAllStaff(Staff staff){
		return staffServiceImpl.getStaff(staff);
    }
	
	@RequestMapping("/index/staff")
	String stuHref(){
		return "/index/sta_ff.html";
	}
	
	@RequestMapping("/ajax/createStaff")
	@ResponseBody
	public String createStaff(Staff staff,String birthday2,String onDutyDate2){
		try {
			staff.setBirthday(TraDate.traDate(birthday2));
			staff.setOnDutyDate(TraDate.traDate(onDutyDate2));
		} catch (ParseException e) {
			return "NO";
		}
		return staffServiceImpl.insStaff(staff);
    }
	
	@RequestMapping("/ajax/getStaffNumber")
	@ResponseBody
	public int getStaffNumber(Staff staff){
		return staffServiceImpl.getStaffNumber(staff);
    }

	@RequestMapping("/ajax/getStaffById")
	@ResponseBody
	public Staff getStaffById(int id){
		return staffServiceImpl.selStaffById(id);
	}
	
	@RequestMapping("/ajax/updateStaff")
	@ResponseBody
	public String updateStaff(Staff staff,String birthday2,String onDutyDate2){
		try {
			staff.setBirthday(TraDate.traDate(birthday2));
			staff.setOnDutyDate(TraDate.traDate(onDutyDate2));
		} catch (ParseException e) {
			return "NO";
		}
		return staffServiceImpl.updateStaff(staff);
    }
	
	@RequestMapping("/ajax/deleteStaff")
	@ResponseBody
	public String deleteStaff(int id){
		return staffServiceImpl.deleteStaff(id);
    }

	@RequestMapping("/ajax/login")
	@ResponseBody
	public String login(Staff staff, HttpSession session){
		if(staff.getLoginName() != null &&  staff.getLoginPwd() != null){
			if(staffServiceImpl.login(staff)>0){
				session.setAttribute("USER", staff);
				return "1";
			}
		}
		return "0";
	}

	@RequestMapping("/login")
	public String loginHref(){
		return "/login/login.html";
	}

	@RequestMapping("/logout")
	public String loginout(HttpSession session){
		session.removeAttribute("USER");
		return "redirect:/login";
	}
}
