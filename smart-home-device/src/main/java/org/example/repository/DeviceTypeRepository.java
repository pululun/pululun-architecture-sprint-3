package org.example.repository;

import org.example.entity.DeviceTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeviceTypeRepository extends JpaRepository<DeviceTypeEntity, Long> {
}
