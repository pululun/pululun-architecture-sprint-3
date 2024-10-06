package org.example.mapper;

import org.example.dto.DeviceType;
import org.example.entity.DeviceTypeEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DeviceTypeMapper {

    DeviceType deviceTypeEntityToDeviceType(DeviceTypeEntity deviceTypeEntity);

    DeviceTypeEntity deviceTypeToDeviceTypeEntity(DeviceType deviceType);

    List<DeviceType> deviceTypeEntitiesToDeviceTypes(List<DeviceTypeEntity> deviceTypeEntities);

    List<DeviceTypeEntity> deviceTypesToDeviceTypeEntities(List<DeviceType> deviceTypes);

}
