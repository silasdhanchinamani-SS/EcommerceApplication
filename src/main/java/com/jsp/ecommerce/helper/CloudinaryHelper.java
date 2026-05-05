package com.jsp.ecommerce.helper;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class CloudinaryHelper {

	@Value("${cloudinary.api.name}")
	private String name;
	@Value("${cloudinary.api.key}")
	private String key;
	@Value("${cloudinary.api.secret}")
	private String secret;

	public String saveImage(MultipartFile image) {
		// Mocking Cloudinary upload for testing without real credentials
		return "https://picsum.photos/400/400?random=" + System.currentTimeMillis();
	}
}
