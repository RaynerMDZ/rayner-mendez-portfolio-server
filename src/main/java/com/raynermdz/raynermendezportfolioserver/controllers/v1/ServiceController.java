package com.raynermdz.raynermendezportfolioserver.controllers.v1;

import com.raynermdz.raynermendezportfolioserver.models.Service;
import com.raynermdz.raynermendezportfolioserver.services.ServicesService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@RestController
@RequestMapping(value = "/api/v1/service/")
@CrossOrigin(value = "${cross.origin.url}")
public class ServiceController {

    private final ServicesService servicesService;

    @PostMapping(value = "save")
    public ResponseEntity<Service> saveSkill(Service service) {
        return null;
    }

    @GetMapping(value = "{userId}/user-services")
    public ResponseEntity<List<Service>> getAllServicesByUserId(@PathVariable(value = "userId") UUID userId) {
        return null;
    }

    @GetMapping(value = "{serviceId}")
    public ResponseEntity<Service> getSkillById(@PathVariable(value = "serviceId") UUID serviceId) {
        return null;
    }

    @PatchMapping(value = "update")
    public ResponseEntity<Service> updateService(Service service) {
        return null;
    }

    @PutMapping(value = "{serviceId}/delete")
    public ResponseEntity<Boolean> deleteService(@PathVariable(value = "serviceId") UUID serviceId) {
        return null;
    }

    @PutMapping(value = "{serviceId}/activate")
    public ResponseEntity<Boolean> activateService(@PathVariable(value = "serviceId") UUID serviceId) {
        return null;
    }

    @PutMapping(value = "{serviceId}/deactivate")
    public ResponseEntity<Boolean> deactivateService(@PathVariable(value = "serviceId") UUID serviceId) {
        return null;
    }
}
