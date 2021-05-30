package com.raynermdz.raynermendezportfolioserver.services;

import com.raynermdz.raynermendezportfolioserver.models.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ServicesService {
    Service saveService(Service service);
    List<Service> getAllServicesByUserId(UUID userId);
    Optional<Service> getServiceById(UUID serviceId);
    Optional<Service> updateService(Service service);
    Boolean deleteService(UUID serviceId);
    Boolean activateService(UUID serviceId);
    Boolean deactivateService(UUID serviceId);
}
