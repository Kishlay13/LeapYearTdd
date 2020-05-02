package com.example.demo.Controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.LeapService;

@RestController()
public class Controller {

	@Autowired
	private LeapService leapService;

	@GetMapping("/home")
	public boolean checkLeapOrNot(@RequestParam(name="year") String year) {
		System.out.println(year);

		return leapService.isLeapOrNot(Long.valueOf(year));

	}

}
