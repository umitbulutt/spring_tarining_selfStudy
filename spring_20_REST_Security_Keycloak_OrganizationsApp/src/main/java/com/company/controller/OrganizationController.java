package com.company.controller;

import com.company.model.Organization;
import com.company.service.OrganizationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/v1/organization")
public class OrganizationController {

    private final OrganizationService organizationService;

    public OrganizationController(OrganizationService organizationService) {
        this.organizationService = organizationService;
    }

    @GetMapping("/{organizationId}")
    public ResponseEntity<Organization> getOrganization(@PathVariable("organizationId") Long organizationId) throws Exception {
        return ResponseEntity.ok(organizationService.findById(organizationId));
    }

    @PostMapping
    public ResponseEntity<Organization> createOrganization(@RequestBody Organization organization) {
        return ResponseEntity.status(HttpStatus.CREATED).body(organizationService.create(organization));
    }

    @DeleteMapping("/{organizationId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteOrganization(@PathVariable("organizationId") Long organizationId) {
        organizationService.delete(organizationId);
    }

}
