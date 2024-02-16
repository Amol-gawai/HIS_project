package com.amol.utils;
import org.springframework.stereotype.Service;
@Service
public class AppNoGeneration {

		final String appconstant = "1234567890";
	public int generate(int min, int max) {
		return min + (int) (Math.random() * ((max - min) + 1));

	}

}
