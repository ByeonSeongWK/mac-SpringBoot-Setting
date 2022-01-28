package com.byeon.blog.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TempControllerTest {
	
	@GetMapping("/temp/home")
	public String tempHome() {
		// 파일리턴 기본경로: src/main/resources/static
		// 리턴명 : /home.html
		// 풀네임 : src/main/resources/static/home.html
		return "/home.html";
	}
	@GetMapping("/temp/jsp")
	public String tempJsp() {
		// prefix : /WEB-INF/views/
		// suffix : .jsp
		// 풀네임 : /WEB-INF/views/test.jsp
		
		return "temp";
	}
}