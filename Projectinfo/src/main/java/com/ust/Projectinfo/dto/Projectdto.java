package com.ust.Projectinfo.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Projectdto {

    private long projectId;

    @NotNull(message = "Project name cannot be null")
    private String projectName;

    @NotNull(message = "Project name cannot be null")
    private String projectDescription;

    @NotBlank(message = "Project name cannot be null")
    private String projectManager;

    @Min(value = 2, message = "Team must have at least one member")
    @Max(value = 200, message = "Team size cannot exceed 200")
    private String teamMembers;

    @Pattern(regexp = "^(InProgress|Completed)$", message = "Invalid project status")
    private String projectStatus;

    private String projectStartDate;

    private String projectEndDate;

    @Min(value = 1000, message = "Project budget must be at least 1000")
    private String projectBudget;

    @NotBlank(message = "Company name cannot be blank")
    private String companyName;

    private long ccode;


}
