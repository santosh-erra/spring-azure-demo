package com.javatpoint;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/controllers")
public class HiController {
	@Autowired
	private IProductService productService;

	@GetMapping(value = "/hi")
	public String getMessage() {

		return "Welcome to azure";

	}
}
