package org.example.mapper;

import org.example.dto.Device;
import org.example.entity.DeviceEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring", uses = {DeviceTypeMapper.class, ModuleMapper.class})
public interface DeviceMapper {

    @Mapping(target = "deviceTypeId", source = "deviceType.id")
    Device deviceEntityToDevice(DeviceEntity deviceEntity);

    DeviceEntity deviceToDeviceEntity(Device device);

    List<Device> deviceEntitiesToDevices(List<DeviceEntity> deviceEntities);

    List<DeviceEntity> devicesToDeviceEntities(List<Device> devices);
}
