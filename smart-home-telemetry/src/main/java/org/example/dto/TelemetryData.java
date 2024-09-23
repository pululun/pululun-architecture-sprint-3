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
public class TelemetryData {
    @Schema(
            name = "id",
            example = "10",
            requiredMode = RequiredMode.NOT_REQUIRED
    )
    @JsonProperty("id")
    private Long id;
    @Schema(
            name = "userId",
            example = "10",
            requiredMode = RequiredMode.NOT_REQUIRED
    )
    @JsonProperty("userId")
    private Long userId;
    @Schema(
            name = "deviceId",
            example = "10",
            requiredMode = RequiredMode.NOT_REQUIRED
    )
    @JsonProperty("deviceId")
    private Long deviceId;
    @Schema(
            name = "moduleId",
            example = "10",
            requiredMode = RequiredMode.NOT_REQUIRED
    )
    @JsonProperty("moduleId")
    private Long moduleId;
    @Schema(
            name = "operationType",
            example = "DONE",
            description = "Operation type",
            requiredMode = RequiredMode.NOT_REQUIRED
    )
    @JsonProperty("operationType")
    private OperationType operationType;
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
    @Schema(
            name = "data",
            example = "{}",
            requiredMode = RequiredMode.NOT_REQUIRED
    )
    @JsonProperty("data")
    private String data;

}
