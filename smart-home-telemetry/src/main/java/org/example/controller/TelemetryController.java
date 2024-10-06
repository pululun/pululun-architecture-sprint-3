package org.example.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import java.util.Iterator;
import java.util.Optional;

import org.example.dto.OperationType;
import org.example.dto.TelemetryData;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.NativeWebRequest;

@Validated
@Tag(
        name = "TelemetryController",
        description = "the TelemetryController API"
)
public interface TelemetryController {
    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    @Operation(
            operationId = "getTelemetryByUserId",
            summary = "Find telemetry by UserId",
            description = "Returns a last single telemetry",
            tags = {"TelemetryController"},
            responses = {@ApiResponse(
                    responseCode = "200",
                    description = "successful operation",
                    content = {@Content(
                            mediaType = "application/json",
                            schema = @Schema(
                                    implementation = TelemetryData.class
                            )
                    )}
            ), @ApiResponse(
                    responseCode = "400",
                    description = "Invalid ID supplied"
            ), @ApiResponse(
                    responseCode = "404",
                    description = "Telemetry not found"
            )}
    )
    @RequestMapping(
            method = {RequestMethod.GET},
            value = {"/{userId}"},
            produces = {"application/json"}
    )
    default ResponseEntity<TelemetryData> getTelemetryByUserId(@Parameter(name = "userId",description = "ID of telemetry to return",required = true,in = ParameterIn.PATH) @PathVariable("userId") Long userId) {
        this.getRequest().ifPresent((request) -> {
            Iterator var1 = MediaType.parseMediaTypes(request.getHeader("Accept")).iterator();

            while(var1.hasNext()) {
                MediaType mediaType = (MediaType)var1.next();
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"lastUpdated\" : \"2000-01-23T04:56:07.000+00:00\", \"data\" : \"{}\", \"operationType\" : \"DONE\", \"id\" : 10, \"moduleId\" : 10, \"userId\" : 10, \"deviceId\" : 10 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }

        });
        return new ResponseEntity(HttpStatus.NOT_IMPLEMENTED);
    }

    @Operation(
            operationId = "getTelemetryByUserIdAndDeviceIdAndModuleId",
            summary = "Find telemetry by UserId and deviceId and ModuleId",
            description = "Returns a last single telemetry",
            tags = {"TelemetryController"},
            responses = {@ApiResponse(
                    responseCode = "200",
                    description = "successful operation",
                    content = {@Content(
                            mediaType = "application/json",
                            schema = @Schema(
                                    implementation = TelemetryData.class
                            )
                    )}
            ), @ApiResponse(
                    responseCode = "400",
                    description = "Invalid ID supplied"
            ), @ApiResponse(
                    responseCode = "404",
                    description = "Telemetry not found"
            )}
    )
    @RequestMapping(
            method = {RequestMethod.GET},
            value = {"/userId/{userId}/deviceId/{deviceId}/moduleId/{moduleId}"},
            produces = {"application/json"}
    )
    default ResponseEntity<TelemetryData> getTelemetryByUserIdAndDeviceIdAndModuleId(@Parameter(name = "userId",description = "ID of telemetry to return",required = true,in = ParameterIn.PATH) @PathVariable("userId") Long userId, @Parameter(name = "deviceId",description = "ID of telemetry to return",required = true,in = ParameterIn.PATH) @PathVariable("deviceId") Long deviceId, @Parameter(name = "moduleId",description = "ID of telemetry to return",required = true,in = ParameterIn.PATH) @PathVariable("moduleId") Long moduleId) {
        this.getRequest().ifPresent((request) -> {
            Iterator var1 = MediaType.parseMediaTypes(request.getHeader("Accept")).iterator();

            while(var1.hasNext()) {
                MediaType mediaType = (MediaType)var1.next();
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"lastUpdated\" : \"2000-01-23T04:56:07.000+00:00\", \"data\" : \"{}\", \"operationType\" : \"DONE\", \"id\" : 10, \"moduleId\" : 10, \"userId\" : 10, \"deviceId\" : 10 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }

        });
        return new ResponseEntity(HttpStatus.NOT_IMPLEMENTED);
    }

    @Operation(
            operationId = "getTelemetryByUserIdAndModuleIdAndOperationType",
            summary = "Find telemetry by UserId and ModuleId",
            description = "Returns a last single telemetry",
            tags = {"TelemetryController"},
            responses = {@ApiResponse(
                    responseCode = "200",
                    description = "successful operation",
                    content = {@Content(
                            mediaType = "application/json",
                            schema = @Schema(
                                    implementation = TelemetryData.class
                            )
                    )}
            ), @ApiResponse(
                    responseCode = "400",
                    description = "Invalid ID supplied"
            ), @ApiResponse(
                    responseCode = "404",
                    description = "Telemetry not found"
            )}
    )
    @RequestMapping(
            method = {RequestMethod.GET},
            value = {"/userId/{userId}/moduleId/{moduleId}/operationType/{operationType}"},
            produces = {"application/json"}
    )
    default ResponseEntity<TelemetryData> getTelemetryByUserIdAndModuleIdAndOperationType(@Parameter(name = "userId",description = "ID of telemetry to return",required = true,in = ParameterIn.PATH) @PathVariable("userId") Long userId, @Parameter(name = "moduleId",description = "ID of telemetry to return",required = true,in = ParameterIn.PATH) @PathVariable("moduleId") Long moduleId, @Parameter(name = "operationType",description = "ID of telemetry to return",required = true,in = ParameterIn.PATH) @PathVariable("operationType") OperationType operationType) {
        this.getRequest().ifPresent((request) -> {
            Iterator var1 = MediaType.parseMediaTypes(request.getHeader("Accept")).iterator();

            while(var1.hasNext()) {
                MediaType mediaType = (MediaType)var1.next();
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"lastUpdated\" : \"2000-01-23T04:56:07.000+00:00\", \"data\" : \"{}\", \"operationType\" : \"DONE\", \"id\" : 10, \"moduleId\" : 10, \"userId\" : 10, \"deviceId\" : 10 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }

        });
        return new ResponseEntity(HttpStatus.NOT_IMPLEMENTED);
    }
}
