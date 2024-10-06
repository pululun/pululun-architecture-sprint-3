package org.example.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import java.time.OffsetDateTime;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Module {
    @Schema(
            name = "id",
            example = "10",
            requiredMode = RequiredMode.NOT_REQUIRED
    )
    @JsonProperty("id")
    private Long id;
    @Schema(
            name = "name",
            example = "Optical interrupter",
            requiredMode = RequiredMode.NOT_REQUIRED
    )
    @JsonProperty("name")
    private String name;
    @Schema(
            name = "serialNumber",
            example = "#433252",
            requiredMode = RequiredMode.NOT_REQUIRED
    )
    @JsonProperty("serialNumber")
    private String serialNumber;
    @Valid
    @DateTimeFormat(
            iso = ISO.DATE_TIME
    )
    @Schema(
            name = "lastUpdated",
            requiredMode = RequiredMode.NOT_REQUIRED
    )
    @JsonProperty("lastUpdated")
    private OffsetDateTime lastUpdated;
}
