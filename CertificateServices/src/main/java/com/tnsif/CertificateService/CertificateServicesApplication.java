package com.tnsif.CertificateService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CertificateServicesApplication {
    public static void main(String[] args) {
        SpringApplication.run(CertificateServicesApplication.class, args);
        System.out.println("✅ Certificate Service started on port 3000...");
    }
}
