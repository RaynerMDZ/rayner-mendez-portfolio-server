package com.raynermdz.raynermendezportfolioserver.services;

import com.raynermdz.raynermendezportfolioserver.dtos.v1.requestdto.ServiceRequestDto;
import com.raynermdz.raynermendezportfolioserver.dtos.v1.responsedto.ServiceResponseDto;
import com.raynermdz.raynermendezportfolioserver.models.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ServicesService {
    Optional<ServiceResponseDto> saveService(ServiceRequestDto service, UUID userId);
    Optional<List<ServiceResponseDto>> getAllServicesByUserId(UUID userId);
    Optional<ServiceResponseDto> getServiceById(UUID serviceId);
    Optional<ServiceResponseDto> updateService(ServiceRequestDto service, UUID userId);
    Boolean deleteService(UUID serviceId);
    Boolean activateService(UUID serviceId);
    Boolean deactivateService(UUID serviceId);
}
