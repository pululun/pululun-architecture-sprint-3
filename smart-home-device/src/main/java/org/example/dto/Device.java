package org.example.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Device {
    @Schema(
            name = "id",
            example = "10",
            requiredMode = RequiredMode.NOT_REQUIRED
    )
    @JsonProperty("id")
    private Long id;
    @Schema(
            name = "model",
            example = "VIP 1",
            requiredMode = RequiredMode.NOT_REQUIRED
    )
    @JsonProperty("model")
    private String model;
    @Schema(
            name = "serialNumber",
            example = "#43325532",
            requiredMode = RequiredMode.NOT_REQUIRED
    )
    @JsonProperty("serialNumber")
    private String serialNumber;
    @Schema(
            name = "deviceTypeId",
            example = "10",
            requiredMode = RequiredMode.NOT_REQUIRED
    )
    @JsonProperty("deviceTypeId")
    private Long deviceTypeId;
    @Schema(
            name = "userId",
            example = "10",
            requiredMode = RequiredMode.NOT_REQUIRED
    )
    @JsonProperty("userId")
    private Long userId;
    @Schema(
            name = "modules",
            requiredMode = RequiredMode.NOT_REQUIRED
    )
    @JsonProperty("modules")
    private @Valid List<@Valid Module> modules;

}
