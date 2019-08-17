package com.mypack.mapper;

import java.util.List;
import com.mypack.model.Refer;
import com.mypack.model.Student;

public interface ReferMapper {
	List<Refer> getAllRefer(Refer refer);



	int getReferNumber(Refer refer);
	
	int insRefer(Refer refer);
	
	Refer getReferById(int id);
	
	int updateRefer(Refer refer);
	
	int deleteRefer(int id);

	List<Refer> getAllBaoming(Refer refer);

	int getBaomingNumber(Refer refer);

	int updateState_trasStu(int id);

	int insStu_trasStu(Student student);
}
