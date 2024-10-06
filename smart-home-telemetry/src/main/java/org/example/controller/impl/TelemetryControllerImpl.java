package org.example.controller.impl;

import lombok.RequiredArgsConstructor;
import org.example.controller.TelemetryController;
import org.example.dto.OperationType;
import org.example.dto.TelemetryData;
import org.example.service.TelemetryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TelemetryControllerImpl implements TelemetryController {

    private final TelemetryService telemetryService;
    @Override
    public ResponseEntity<TelemetryData> getTelemetryByUserId(Long userId) {
        return ResponseEntity.ok().body(telemetryService.getByUserId(userId));
    }

    @Override
    public ResponseEntity<TelemetryData> getTelemetryByUserIdAndDeviceIdAndModuleId(Long userId, Long deviceId, Long moduleId) {
        return ResponseEntity.ok().body(telemetryService.getByUserIdAndDeviceIdAndModuleId(userId, deviceId, moduleId));
    }

    @Override
    public ResponseEntity<TelemetryData> getTelemetryByUserIdAndModuleIdAndOperationType(Long userId, Long moduleId, OperationType operationType) {
        return ResponseEntity.ok().body(telemetryService.getByByUserIdAndModuleIdAndOperationType(userId, moduleId, operationType));
    }
}
