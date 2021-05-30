package com.raynermdz.raynermendezportfolioserver.services.implementations;

import com.raynermdz.raynermendezportfolioserver.models.Service;
import com.raynermdz.raynermendezportfolioserver.repositories.ServiceRepository;
import com.raynermdz.raynermendezportfolioserver.repositories.UserRepository;
import com.raynermdz.raynermendezportfolioserver.services.ServicesService;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@AllArgsConstructor
@org.springframework.stereotype.Service
public class ServicesServiceImplementation implements ServicesService {

    private final ServiceRepository serviceRepository;
    private final UserRepository userRepository;

    @Override
    public Service saveService(Service service) {
        return null;
    }

    @Override
    public List<Service> getAllServicesByUserId(UUID userId) {
        return null;
    }

    @Override
    public Optional<Service> getServiceById(UUID serviceId) {
        return Optional.empty();
    }

    @Override
    public Optional<Service> updateService(Service service) {
        return Optional.empty();
    }

    @Override
    public Boolean deleteService(UUID serviceId) {
        return null;
    }

    @Override
    public Boolean activateService(UUID serviceId) {
        return null;
    }

    @Override
    public Boolean deactivateService(UUID serviceId) {
        return null;
    }
}
