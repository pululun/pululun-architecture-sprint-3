package org.example.repository;

import org.example.dto.OperationType;
import org.example.entity.TelemetryDataEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TelemetryDataRepository extends JpaRepository<TelemetryDataEntity, Long> {

    TelemetryDataEntity findByUserId(Long userId);
    TelemetryDataEntity findByUserIdAndDeviceIdAndModuleId(Long userId, Long deviceId, Long moduleId);
    TelemetryDataEntity findByUserIdAndModuleIdAndOperationType(Long userId, Long moduleId, OperationType operationType);

}
