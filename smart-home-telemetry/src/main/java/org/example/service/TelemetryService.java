package org.example.service;

import org.example.dto.OperationType;
import org.example.dto.TelemetryData;

public interface TelemetryService {

    TelemetryData getByUserIdAndDeviceIdAndModuleId(Long userId, Long deviceId, Long moduleId);

    TelemetryData getByUserId(Long userId);

    TelemetryData getByByUserIdAndModuleIdAndOperationType(Long userId, Long moduleId, OperationType operationType);

    Long save(TelemetryData telemetryData);

}
