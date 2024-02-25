package com.kirinslair.kirinshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.vaadin.flow.component.page.AppShellConfigurator;
import com.vaadin.flow.theme.Theme;

@SpringBootApplication
@Theme(value="kirinshop")
public class KirinShopApplication implements AppShellConfigurator {	

	public static void main(String[] args) {
		SpringApplication.run(KirinShopApplication.class, args);
	}

}
