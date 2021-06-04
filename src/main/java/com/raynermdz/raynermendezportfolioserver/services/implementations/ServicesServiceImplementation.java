package com.raynermdz.raynermendezportfolioserver.services.implementations;

import com.raynermdz.raynermendezportfolioserver.dtos.converter.DtoConverter;
import com.raynermdz.raynermendezportfolioserver.dtos.v1.requestdto.ServiceRequestDto;
import com.raynermdz.raynermendezportfolioserver.dtos.v1.responsedto.ServiceResponseDto;
import com.raynermdz.raynermendezportfolioserver.exception.EntityNotFoundException;
import com.raynermdz.raynermendezportfolioserver.models.Service;
import com.raynermdz.raynermendezportfolioserver.models.User;
import com.raynermdz.raynermendezportfolioserver.repositories.ServiceRepository;
import com.raynermdz.raynermendezportfolioserver.repositories.UserRepository;
import com.raynermdz.raynermendezportfolioserver.services.ServicesService;
import lombok.AllArgsConstructor;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@AllArgsConstructor
@org.springframework.stereotype.Service
public class ServicesServiceImplementation implements ServicesService {

    private final ServiceRepository serviceRepository;
    private final UserRepository userRepository;
    private final DtoConverter dtoConverter;

    @Override
    public Optional<ServiceResponseDto> saveService(ServiceRequestDto serviceRequestDto, UUID userId) {
        Optional<User> user = this.userRepository.findById(userId);

        if (user.isPresent()) {
            Service service = (Service) this.dtoConverter.convertToEntity(serviceRequestDto, new Service());
            service.setIsHidden(false);
            service.setCreatedDate(new Date());
            service.setUser(user.get());

            ServiceResponseDto response = (ServiceResponseDto) this.dtoConverter.convertToDto(this.serviceRepository.save(service), new ServiceResponseDto());
            return Optional.of(response);
        }
        throw new EntityNotFoundException(User.class, "id", userId.toString());
    }

    @Override
    public Optional<List<ServiceResponseDto>> getAllServicesByUserId(UUID userId) {
        Optional<User> user = this.userRepository.findById(userId);

//        if (user.isPresent()) {
//            return Optional.of(user.get().getServices());
//        }
        return Optional.empty();
    }

    @Override
    public Optional<ServiceResponseDto> getServiceById(UUID serviceId) {
        Optional<Service> service = this.serviceRepository.findById(serviceId);

//        if (service.isPresent()) {
//            return service;
//        }
        return Optional.empty();
    }

    @Override
    public Optional<ServiceResponseDto> updateService(ServiceRequestDto service, UUID userId) {
        Optional<Service> foundService = this.serviceRepository.findById(service.getId());

//        if (foundService.isPresent()) {
//            return Optional.of(this.serviceRepository.save(foundService.get()));
//        }
        return Optional.empty();
    }

    @Override
    public Boolean deleteService(UUID serviceId) {
        Optional<Service> service = this.serviceRepository.findById(serviceId);

        if (service.isPresent()) {
            this.serviceRepository.delete(service.get());
            return true;
        }
        return false;
    }

    @Override
    public Boolean activateService(UUID serviceId) {
        Optional<Service> service = this.serviceRepository.findById(serviceId);

        if (service.isPresent()) {
            service.get().setIsHidden(true);
            this.serviceRepository.save(service.get());
            return true;
        }
        return false;
    }

    @Override
    public Boolean deactivateService(UUID serviceId) {
        Optional<Service> service = this.serviceRepository.findById(serviceId);

        if (service.isPresent()) {
            service.get().setIsHidden(false);
            this.serviceRepository.save(service.get());
            return true;
        }
        return false;
    }
}
