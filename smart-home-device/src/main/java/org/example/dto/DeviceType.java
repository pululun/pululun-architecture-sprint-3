package org.example.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DeviceType {
    @Schema(
            name = "id",
            example = "10",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED
    )
    @JsonProperty("id")
    private Long id;
    @Schema(
            name = "type",
            example = "station",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED
    )
    @JsonProperty("type")
    private String type;
    @Schema(
            name = "lastUpdated",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED
    )
    @JsonProperty("lastUpdated")
    @DateTimeFormat(
            iso = ISO.DATE_TIME
    )
    @Valid
    private OffsetDateTime lastUpdated;

}
