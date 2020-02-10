package kr.co.cinema.admin.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.cinema.admin.service.AdminMovieService;
import kr.co.cinema.admin.vo.AdminMovieScheduleVo;
import kr.co.cinema.admin.vo.AdminMovieVo;

@Controller
public class AdminMovieController {

	@Inject
	private AdminMovieService service;
	
	
	@GetMapping("/admin/movie/register")
	public String register() {
		return "/admin/movie/register";
	}
	
	@PostMapping("/admin/movie/register")
	public String register(AdminMovieVo vo) {
		
		
		service.insertMovie(vo);
		
		return "redirect:/admin/movie/register";
	}
	
	
	
	
	
	@GetMapping("/admin/movie/schedule")
	public String schedule() {
		return "/admin/movie/schedule";
	}
	

	@PostMapping("/admin/movie/schedule")
	public String schedule(AdminMovieScheduleVo vo) {
		
		service.insertMovieSchedule(vo);
		
		return "redirect:/admin/movie/schedule";
	}
	
}
