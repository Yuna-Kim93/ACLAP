package bit.com.a.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


import bit.com.a.dto.reviewDto;


@Mapper
@Repository
public interface reviewDao {
	
	public int onedayClassWriteReview(int classNum);
	

	// 리뷰쓰기 
	boolean writeReview (reviewDto dto);
	// 리뷰 리스트 가져오기
	public List<reviewDto> getReviewList(reviewDto dto);
	

}
