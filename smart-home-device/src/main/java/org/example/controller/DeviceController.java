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

import jakarta.validation.Valid;
import org.example.dto.Command;
import org.example.dto.Device;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.NativeWebRequest;

@Validated
@Tag(
        name = "DeviceController",
        description = "the DeviceController API"
)
public interface DeviceController {
    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    @Operation(
            operationId = "getDeviceByDeviceId",
            summary = "Find device by deviceId",
            description = "Returns a single device",
            tags = {"DeviceController"},
            responses = {@ApiResponse(
                    responseCode = "200",
                    description = "successful operation",
                    content = {@Content(
                            mediaType = "application/json",
                            schema = @Schema(
                                    implementation = Device.class
                            )
                    )}
            ), @ApiResponse(
                    responseCode = "400",
                    description = "Invalid ID supplied"
            ), @ApiResponse(
                    responseCode = "404",
                    description = "Device not found"
            )}
    )
    @RequestMapping(
            method = {RequestMethod.GET},
            value = {"/{deviceId}"},
            produces = {"application/json"}
    )
    default ResponseEntity<Device> getDeviceByDeviceId(@Parameter(name = "deviceId",description = "ID of device to return",required = true,in = ParameterIn.PATH) @PathVariable("deviceId") Long deviceId) {
        this.getRequest().ifPresent((request) -> {
            Iterator var1 = MediaType.parseMediaTypes(request.getHeader("Accept")).iterator();

            while(var1.hasNext()) {
                MediaType mediaType = (MediaType)var1.next();
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"deviceTypeId\" : 10, \"serialNumber\" : \"#43325532\" : { \"lastUpdated\" : \"2000-01-23T04:56:07.000+00:00\", \"id\" : 10, \"type\" : \"station\" }, \"model\" : \"VIP 1\", \"id\" : 10, \"userId\" : 10, \"modules\" : [ { \"lastUpdated\" : \"2000-01-23T04:56:07.000+00:00\", \"serialNumber\" : \"#433252\", \"name\" : \"Optical interrupter\", \"id\" : 10 }, { \"lastUpdated\" : \"2000-01-23T04:56:07.000+00:00\", \"serialNumber\" : \"#433252\", \"name\" : \"Optical interrupter\", \"id\" : 10 } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }

        });
        return new ResponseEntity(HttpStatus.NOT_IMPLEMENTED);
    }

    @Operation(
            operationId = "postCommandForDeviceByDeviceId",
            summary = "Create command for device by deviceId",
            description = "Returns a single device with command",
            tags = {"DeviceController"},
            responses = {@ApiResponse(
                    responseCode = "200",
                    description = "successful operation",
                    content = {@Content(
                            mediaType = "application/json",
                            schema = @Schema(
                                    implementation = Device.class
                            )
                    )}
            ), @ApiResponse(
                    responseCode = "400",
                    description = "Invalid ID supplied"
            ), @ApiResponse(
                    responseCode = "404",
                    description = "Device not found"
            )}
    )
    @RequestMapping(
            method = {RequestMethod.POST},
            value = {"/{deviceId}/commands"},
            produces = {"application/json"},
            consumes = {"application/json"}
    )
    default ResponseEntity<Device> postCommandForDeviceByDeviceId(@Parameter(name = "deviceId",description = "ID of device to return",required = true,in = ParameterIn.PATH) @PathVariable("deviceId") Long deviceId, @Parameter(name = "Command",description = "Custom command") @RequestBody(required = false) @Valid Command command) {
        this.getRequest().ifPresent((request) -> {
            Iterator var1 = MediaType.parseMediaTypes(request.getHeader("Accept")).iterator();

            while(var1.hasNext()) {
                MediaType mediaType = (MediaType)var1.next();
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"deviceTypeId\" : 10, \"serialNumber\" : \"#43325532\" : { \"lastUpdated\" : \"2000-01-23T04:56:07.000+00:00\", \"id\" : 10, \"type\" : \"station\" }, \"model\" : \"VIP 1\", \"id\" : 10, \"userId\" : 10, \"modules\" : [ { \"lastUpdated\" : \"2000-01-23T04:56:07.000+00:00\", \"serialNumber\" : \"#433252\", \"name\" : \"Optical interrupter\", \"id\" : 10 }, { \"lastUpdated\" : \"2000-01-23T04:56:07.000+00:00\", \"serialNumber\" : \"#433252\", \"name\" : \"Optical interrupter\", \"id\" : 10 } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }

        });
        return new ResponseEntity(HttpStatus.NOT_IMPLEMENTED);
    }
}