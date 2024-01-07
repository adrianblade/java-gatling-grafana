package com.mango.tech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TechApplication {

	public static void main(String[] args) {
		SpringApplication.run(TechApplication.class, args);
	}

	@GetMapping("/")
	public String home() {
		return "hello";
	}

	@Service
	static class MangoService {
		private final MangoDao mangoDao = new MangoDao();

		public String message() {
			return mangoDao.returnMsgFromDb();
		}

	}

	@Repository
	static class MangoDao {
		public String returnMsgFromDb() {
			return "my message";
		}
	}

}
