package org.example.mapper;

import org.example.dto.TelemetryData;
import org.example.entity.TelemetryDataEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface TelemetryMapper {

    TelemetryData telemetryDataEntityToTelemetryData(TelemetryDataEntity telemetryDataEntity);

    List<TelemetryData> telemetryDataEntitiesToTelemetryDatas(List<TelemetryDataEntity> telemetryDataEntities);

    TelemetryDataEntity telemetryDataToTelemetryDataEntity(TelemetryData telemetryData);

}
