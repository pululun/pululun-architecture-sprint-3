package org.example.controller.impl;

import lombok.RequiredArgsConstructor;
import org.example.controller.DeviceController;
import org.example.dto.Command;
import org.example.dto.Device;
import org.example.service.DeviceService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class DeviceControllerImpl implements DeviceController {

    private final DeviceService deviceService;

    @Override
    public ResponseEntity<Device> getDeviceByDeviceId(Long deviceId) {
        return ResponseEntity.ok().body(deviceService.getById(deviceId));
    }

    @Override
    public ResponseEntity<Device> postCommandForDeviceByDeviceId(Long deviceId, Command command) {
        return ResponseEntity.ok().body(deviceService.sendingCommandById(deviceId, command));
    }
}
