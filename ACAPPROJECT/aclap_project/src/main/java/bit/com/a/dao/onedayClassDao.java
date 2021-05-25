package bit.com.a.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import bit.com.a.dto.onedayClassDto;
import bit.com.a.dto.onedayParam;

@Mapper
@Repository
public interface onedayClassDao {
	
	// 관리자 페이지 리스트
		public List<onedayClassDto> getClassList(onedayParam par);
		int classCount(onedayParam par);
		
	//my page
		public onedayClassDto getOnedayClass(onedayClassDto dto);
}
