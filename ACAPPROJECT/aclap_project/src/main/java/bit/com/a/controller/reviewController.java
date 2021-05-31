package bit.com.a.controller;

import java.io.File;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.swing.filechooser.FileSystemView;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import bit.com.a.dto.reviewDto;
import bit.com.a.service.reviewService;

@RestController
public class reviewController {
	
	@Autowired
	reviewService rService;
/*	
	// 리뷰 쓰기
	@RequestMapping(value = "/writeReview", method = RequestMethod.POST)
	public String writeReview(reviewDto dto, MultipartHttpServletRequest req,
							@RequestParam("uploadFile") List<MultipartFile> files) throws Exception {
		System.out.println("oneDayClassController writeReview() " + new Date());
		System.out.println(dto.toString());
		
		
		
	//	String rootPath = FileSystemView.getFileSystemView().getHomeDirectory().toString();  //C:\Users\82102\Desktop
	//	System.out.println(rootPath);
	//	String basePath = rootPath + "/";
	
		 // 파일 업로드(여러개) 처리 부분
	    for(MultipartFile file : files) {
	        String originalName = file.getOriginalFilename();
	      //  String filePath = basePath + "/" + originalName;
	        String filePath = originalName;

	        
	        
	        File dest = new File(filePath);
	        file.transferTo(dest);
	        
	        System.out.println(dest);
	        //dto 이미지경로 세팅
	    }		
		return "uploaded";
	}
*/
	// 리뷰 쓰기
		@RequestMapping(value = "/writeReview", method = RequestMethod.POST)
		public String writeReview(reviewDto dto, MultipartHttpServletRequest req,
								@RequestParam("uploadFile") List<MultipartFile> files) throws Exception {
			System.out.println("oneDayClassController writeReview() " + new Date());
			System.out.println(dto.toString());
			
			if(req.getFiles("file").get(0).getSize() != 0) {
				files = req.getFiles("file");
			}
		
			 // 파일 업로드(여러개) 처리 부분
		    for(MultipartFile file : files) {
		        String originalName = file.getOriginalFilename();
		      //  String filePath = basePath + "/" + originalName;
		        String filePath = originalName;

		        
		        
		        File dest = new File(filePath);
		        file.transferTo(dest);
		        
		        System.out.println(dest);
		        //dto 이미지경로 세팅
		    }		
			return "uploaded";
		}
	
}
