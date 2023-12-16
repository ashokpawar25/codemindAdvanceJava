package com.restapi.book.helper;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileUploadHelper {
	
//	public final String uploadDir="C:\\Users\\ashok\\Documents\\workspace-spring-tool-suite-4-4.19.1.RELEASE\\restapibook\\src\\main\\resources\\static\\image";
	public final String uploadDir=new ClassPathResource("static/image/").getFile().getAbsolutePath();
	
	public FileUploadHelper() throws IOException {

	}
	public boolean uploadFile(MultipartFile file) {
		boolean f=false;
		try {
			InputStream is=file.getInputStream();
			byte []data=new byte[is.available()];
			is.read(data);
			
			FileOutputStream fos=new FileOutputStream(uploadDir+"\\"+file.getOriginalFilename());
			fos.write(data);
			fos.flush();
			fos.close();
			f=true;
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return f;
	}

}
