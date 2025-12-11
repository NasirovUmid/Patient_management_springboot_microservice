package com.pm.patient_service;

import com.pm.patient_service.grpc.BillingServiceGrpcClient;
import com.pm.patient_service.service.PatientService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.pm.patient_service.grpc","com.pm.patient_service.controller","com.pm.patient_service.service","com.pm.patient_service.repository"})
//@Import({BillingServiceGrpcClient.class})
public class PatientServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PatientServiceApplication.class, args);
    }

}
