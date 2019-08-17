package com.mypack.service;

import java.util.List;
import com.mypack.model.Refer;
import com.mypack.model.Student;

public interface ReferService {
	List<Refer> getAllRefer(Refer refer);

	int getReferNumber(Refer refer);
	
	String insRefer(Refer refer);
	
	Refer getReferById(int id);
	
	String updateRefer(Refer refer);
	
	String deleteRefer(int id);

	List<Refer> getAllBaoming(Refer refer);

	int getBaomingNumber(Refer refer);

	String  insStu_trasStu(int id);
}
