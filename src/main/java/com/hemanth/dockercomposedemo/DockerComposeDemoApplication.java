package com.hemanth.dockercomposedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DockerComposeDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DockerComposeDemoApplication.class, args);

        System.out.println("docker compose demo");
    }

}
