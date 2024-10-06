package org.example.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.dto.OperationType;
import org.example.dto.TelemetryData;
import org.example.entity.TelemetryDataEntity;
import org.example.mapper.TelemetryMapper;
import org.example.repository.TelemetryDataRepository;
import org.example.service.TelemetryService;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
@RequiredArgsConstructor
public class TelemetryServiceImpl implements TelemetryService {

    private final TelemetryDataRepository telemetryDataRepository;
    private final TelemetryMapper telemetryMapper;

    @Override
    public TelemetryData getByUserIdAndDeviceIdAndModuleId(Long userId, Long deviceId, Long moduleId) {
        return telemetryMapper.telemetryDataEntityToTelemetryData(telemetryDataRepository
                .findByUserIdAndDeviceIdAndModuleId(userId, deviceId, moduleId));
    }

    @Override
    public TelemetryData getByUserId(Long userId) {
        return telemetryMapper.telemetryDataEntityToTelemetryData(telemetryDataRepository.findByUserId(userId));
    }

    @Override
    public TelemetryData getByByUserIdAndModuleIdAndOperationType(Long userId, Long moduleId, OperationType operationType) {
        return telemetryMapper.telemetryDataEntityToTelemetryData(telemetryDataRepository
                .findByUserIdAndModuleIdAndOperationType(userId, moduleId, operationType));
    }

    @Override
    public Long save(TelemetryData telemetryData) {
        TelemetryDataEntity telemetryDataEntity = telemetryDataRepository
                .findByUserIdAndDeviceIdAndModuleId(telemetryData.getUserId(), telemetryData.getDeviceId(), telemetryData.getModuleId());
        if (Objects.nonNull(telemetryDataEntity)) {
            telemetryData.setId(telemetryDataEntity.getId());
        }
        return telemetryDataRepository.save(telemetryMapper.telemetryDataToTelemetryDataEntity(telemetryData)).getId();
    }
}
