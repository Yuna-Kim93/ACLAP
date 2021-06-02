package bit.com.a.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import bit.com.a.dto.reviewDto;

@Mapper
@Repository
public interface reviewDao {
	
	// class 생성 후 리뷰 초기화
	public int onedayClassWriteReview(int classNum);
	
	// 리뷰쓰기 
	boolean writeReview (reviewDto dto);

}
