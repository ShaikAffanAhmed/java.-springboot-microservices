package com.api.book.controller;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class FileUploadController {

	@PostMapping("/upload-file")
	public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file)
	{
	    System.out.println(file.getOriginalFilename());
	    System.out.println(file.getSize());
	    System.out.println(file.getContentType());
	    System.out.println(file.getName());
	    
	    if(file.isEmpty())
	    {
	    	return ResponseEntity.ok("File not found.");
	    }
		return ResponseEntity.ok("File found");
		
	}
}
