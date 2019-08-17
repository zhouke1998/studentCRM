package com.mypack.service.impl;

import java.util.List;
import javax.annotation.Resource;

import com.mypack.model.Student;
import org.springframework.stereotype.Service;
import com.mypack.mapper.ReferMapper;
import com.mypack.model.Refer;
import com.mypack.service.ReferService;
@Service
public class ReferServiceImpl implements ReferService{
	@Resource
	private ReferMapper referMapper;

	@Override
	public List<Refer> getAllRefer(Refer refer){
		if (refer.getPage()!=-1) {
			int start = (refer.getPage() - 1) * 5;
			refer.setPage(start);
		}
		return referMapper.getAllRefer(refer);
	}

	@Override
	public int getReferNumber(Refer refer) {
		return referMapper.getReferNumber(refer);
	}

	@Override
	public String insRefer(Refer refer) {
		return referMapper.insRefer(refer)==1?"OK":"NO";
	}

	@Override
	public Refer getReferById(int id) {
		return referMapper.getReferById(id);
	}

	@Override
	public String updateRefer(Refer refer) {
		return referMapper.updateRefer(refer)==1?"OK":"NO";
	}

	@Override
	public String deleteRefer(int id) {
		return referMapper.deleteRefer(id)==1?"OK":"NO";
	}
	@Override
	public List<Refer> getAllBaoming(Refer refer){
		if (refer.getPage()!=-1) {
			int start = (refer.getPage() - 1) * 5;
			refer.setPage(start);
		}
		return referMapper.getAllBaoming(refer);
	}
	@Override
	public int getBaomingNumber(Refer refer){
		return referMapper.getBaomingNumber(refer);
	}

	@Override
	public String insStu_trasStu(int id){
		Refer refer = referMapper.getReferById(id);

		Student student = new Student();
		if(refer!=null) {
			student.setStuName(refer.getUsername());
			student.setStuSex(refer.getGender());
			student.setReferid(refer.getUserid());
			student.setRemark(refer.getRemark());
			referMapper.updateState_trasStu(id);
		}else {
			return "NO";
		}
		return referMapper.insStu_trasStu(student)==1?"OK":"NO";
	}
}
