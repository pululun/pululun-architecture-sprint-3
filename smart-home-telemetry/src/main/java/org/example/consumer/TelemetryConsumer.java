package org.example.consumer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.dto.TelemetryData;
import org.example.service.TelemetryService;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class TelemetryConsumer {

    private final TelemetryService telemetryService;

    @KafkaListener(topics = "${app.kafka.topic.telemetries}")
    public void consume(TelemetryData telemetryData) {
        log.info("Request kafka message: " + telemetryData);
        Long telemetryId = telemetryService.save(telemetryData);
        log.info("Telemetry save with id: " + telemetryId);
    }

}
