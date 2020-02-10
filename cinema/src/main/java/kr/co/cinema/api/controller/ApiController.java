package kr.co.cinema.api.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import kr.co.cinema.admin.vo.AdminMovieScheduleVo;
import kr.co.cinema.admin.vo.AdminMovieVo;
import kr.co.cinema.api.service.ApiService;
import kr.co.cinema.api.vo.ApiTheaterVo;

@Controller
public class ApiController {

	@Inject
	private ApiService service;
	
	@GetMapping(value="/api/theaters", produces="text/plain;charset=UTF-8")
	@ResponseBody
	public String getTheaters() {
		
		Map<String, List<ApiTheaterVo>> theaters = service.selectTheaters();
		return new Gson().toJson(theaters);
	}
	
	@GetMapping(value="/api/movies", produces="text/plain;charset=UTF-8")
	@ResponseBody
	public String getMovieTitles(String title) {
		
		List<AdminMovieVo> movies = service.selectMovies(title);	
		
		return new Gson().toJson(movies);
	}
	
	@GetMapping(value="/api/movie-schedule", produces="text/plain;charset=UTF-8")
	@ResponseBody
	public String getMovieSchedule(AdminMovieScheduleVo vo){
		AdminMovieScheduleVo movieSchedule = service.selectMovieSchedule(vo);
		return new Gson().toJson(movieSchedule);
	}
	
	@GetMapping(value="/api/movie-roundview", produces="text/plain;charset=UTF-8")
	@ResponseBody
	public String getMovieRoundView(AdminMovieScheduleVo vo){
		
		List<AdminMovieScheduleVo> movieSchedules = service.selectMovieRoundView(vo);
		List<List<AdminMovieScheduleVo>> movieSchedulesList = new ArrayList<List<AdminMovieScheduleVo>>(); 
		movieSchedulesList.add(movieSchedules);
		
		return new Gson().toJson(movieSchedulesList);
	}
	
	
	@GetMapping(value="/api/schedule/movies", produces="text/plain;charset=UTF-8")
	@ResponseBody
	public String getMovies(int theater_no, String schedule_date) {
		
		AdminMovieScheduleVo vo = new AdminMovieScheduleVo();
		vo.setSchedule_theater_no(theater_no);
		vo.setSchedule_date(schedule_date);
		
		List<AdminMovieVo> movies = service.selectMovies(vo);
		return new Gson().toJson(movies);
	}
}
