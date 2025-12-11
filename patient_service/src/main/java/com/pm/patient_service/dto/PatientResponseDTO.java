package com.pm.patient_service.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PatientResponseDTO {

    private String id;
    private String name;
    private String email;
    private String address;
    private String birthDate;

}
