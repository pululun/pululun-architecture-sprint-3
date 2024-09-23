package org.example.service;

import org.example.dto.Command;
import org.example.dto.Device;

public interface DeviceService {

    Device getById(Long deviceId);

    Device sendingCommandById(Long deviceId, Command command);

}
