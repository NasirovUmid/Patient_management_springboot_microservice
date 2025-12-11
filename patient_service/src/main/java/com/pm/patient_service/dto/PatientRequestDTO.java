package com.pm.patient_service.dto;

import com.pm.patient_service.dto.validators.CreatePatientValidationGroup;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PatientRequestDTO {


    @NotBlank(message = "Name is required")
    @Size(max = 100,message = "name cant be exceeded 100 characters")
    private String name;

    @NotBlank(message = "Email is required")
    @Email(message = "Email should be valid")
    private String email;

    @NotBlank(message = "Address is required")
    private String address;

    @NotBlank(message = "BirthDate is required")
    private String birthDate;

    @NotBlank(groups = CreatePatientValidationGroup.class, message = "RegisteredDate is required")
    private String registeredDate;

}
