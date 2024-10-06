package org.example.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.dto.Command;
import org.example.dto.Device;
import org.example.entity.DeviceEntity;
import org.example.exception.DeviceNotFound;
import org.example.mapper.DeviceMapper;
import org.example.repository.DeviceRepository;
import org.example.service.DeviceService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DeviceServiceImpl implements DeviceService {

    private final KafkaTemplate<String, Command> kafkaTemplate;
    private final DeviceRepository deviceRepository;
    private final DeviceMapper deviceMapper;

    @Value("${app.kafka.topic.device-command}")
    private String topic;

    @Override
    public Device getById(Long deviceId) {
        DeviceEntity deviceEntity = deviceRepository.findById(deviceId)
                .orElseThrow(() -> new DeviceNotFound("Device not found"));
        return deviceMapper.deviceEntityToDevice(deviceEntity);
    }

    @Override
    public Device sendingCommandById(Long deviceId, Command command) {
        Device device = getById(deviceId);
        kafkaTemplate.send(topic, device.getSerialNumber(), command);
        return device;
    }
}
