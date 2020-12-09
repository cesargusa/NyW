package com.example.NyW.ShopPage;

import java.time.LocalDate;
import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NyWShopPageApplication {

	public static void main(String[] args) {
		SpringApplication.run(NyWShopPageApplication.class, args);
		
		
	}


public static LocalDate da(){
	LocalDate date = LocalDate.now();
	return date;
}


}
