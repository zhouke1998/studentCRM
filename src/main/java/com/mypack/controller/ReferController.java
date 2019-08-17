package com.mypack.controller;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.mypack.model.Refer;
import com.mypack.service.ReferService;

@Controller
public class ReferController{
	@Resource
	private ReferService referServiceImpl;
	
	@RequestMapping("/ajax/getRefer")
	@ResponseBody
	public List<Refer> getAllRefer(Refer refer){
		return referServiceImpl.getAllRefer(refer);
    }
	
	@RequestMapping("/index/refer")
	String stuHref(){
		return "/index/ref_er.html";
	}

	@RequestMapping("/ajax/getReferNumber")
	@ResponseBody
	public int getReferNumber(Refer refer){
		return referServiceImpl.getReferNumber(refer);
	}
	
	@RequestMapping("/ajax/createRefer")
	@ResponseBody
	public String createRefer(Refer refer){
		return referServiceImpl.insRefer(refer);
    }
	
	@RequestMapping("/ajax/getReferById")
	@ResponseBody
	public Refer getReferById(int id){
		return referServiceImpl.getReferById(id);
    }
	
	@RequestMapping("/ajax/updateRefer")
	@ResponseBody
	public String updateRefer(Refer refer){
		return referServiceImpl.updateRefer(refer);
    }
	
	@RequestMapping("/ajax/deleteRefer")
	@ResponseBody
	public String deleteteRefer(int id){
		return referServiceImpl.deleteRefer(id);
    }

	@RequestMapping("/index/baoming")
	String baomingHref(){
		return "/index/bao_ming.html";
	}

	@RequestMapping("/ajax/getBaomingNumber")
	@ResponseBody
	public int getBaomingNumber(Refer refer){
		return referServiceImpl.getBaomingNumber(refer);
	}

	@RequestMapping("/ajax/getBaoming")
	@ResponseBody
	public List<Refer> getAllBaoming(Refer refer){
		return referServiceImpl.getAllBaoming(refer);
	}

	@RequestMapping("/ajax/trasStu")
	@ResponseBody
	public String  trasStu(int id){
		return referServiceImpl.insStu_trasStu(id);
	}

}
