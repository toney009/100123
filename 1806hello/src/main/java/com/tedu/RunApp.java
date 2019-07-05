package com.tedu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//启动类，标识是一个springboot应用程序
//这个类必须放在所有运行服务@Controller，@Servise父级目标，死规矩
@SpringBootApplication
public class RunApp {
	//入口函数
	public static void main(String[] args) {
		//启动整个程序，暗含启动tomcat
		SpringApplication.run(RunApp.class, args);
	}
}
