package kr.co.jcinema.api.controller;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;

import kr.co.jcinema.api.service.ApiTheaterService;
import kr.co.jcinema.api.vo.ApiTheaterVo;

@Controller
public class ApiTheaterController {

	@Inject
	private ApiTheaterService service;
	
	@GetMapping (value ="/api/theaters", produces="text/plain;charset=UTF-8")
	@ResponseBody
	public String getTheaters() {
		
		Map<String,List<ApiTheaterVo>> theaters = service.selectTheaters();
		return new Gson().toJson(theaters);	
		
	}
	
	
}
