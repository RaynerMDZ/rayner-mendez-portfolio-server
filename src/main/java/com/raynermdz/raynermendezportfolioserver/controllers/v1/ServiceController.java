package com.raynermdz.raynermendezportfolioserver.controllers.v1;

import com.raynermdz.raynermendezportfolioserver.dtos.v1.requestdto.ServiceRequestDto;
import com.raynermdz.raynermendezportfolioserver.dtos.v1.responsedto.ServiceResponseDto;
import com.raynermdz.raynermendezportfolioserver.models.Service;
import com.raynermdz.raynermendezportfolioserver.services.ServicesService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@RestController
@RequestMapping(value = "/api/v1/services/")
@CrossOrigin(value = "${cross.origin.url}")
public class ServiceController {

    private final ServicesService servicesService;

    @PostMapping
    public ResponseEntity<ServiceResponseDto> saveSkill(ServiceRequestDto service) {
        return null;
    }

    @GetMapping(value = "{userId}/user-services")
    public ResponseEntity<List<Service>> getAllServicesByUserId(@PathVariable(value = "userId") UUID userId) {
        return null;
    }

    @GetMapping(value = "{serviceId}")
    public ResponseEntity<ServiceResponseDto> getSkillById(@PathVariable(value = "serviceId") UUID serviceId) {
        return null;
    }

    @PutMapping
    public ResponseEntity<ServiceResponseDto> updateService(ServiceRequestDto service) {
        return null;
    }

    @DeleteMapping(value = "{serviceId}")
    public ResponseEntity<Boolean> deleteService(@PathVariable(value = "serviceId") UUID serviceId) {
        return null;
    }

    @PatchMapping(value = "{serviceId}/activate")
    public ResponseEntity<Boolean> activateService(@PathVariable(value = "serviceId") UUID serviceId) {
        return null;
    }

    @PatchMapping(value = "{serviceId}/deactivate")
    public ResponseEntity<Boolean> deactivateService(@PathVariable(value = "serviceId") UUID serviceId) {
        return null;
    }
}
