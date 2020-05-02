package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class LeapService {

	public boolean isLeapOrNot(Long year) {
		if (year % 4 != 0)
			return false;
		else
			return true;
	}

}
