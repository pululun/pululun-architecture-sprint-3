package org.example.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Command {
    @Schema(
            name = "command",
            example = "ON",
            requiredMode = RequiredMode.NOT_REQUIRED
    )
    @JsonProperty("command")
    private String command;

}
