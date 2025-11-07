package com.tnsif.CertificateService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.tnsif.CertificateService.entity.Certificate;
import com.tnsif.CertificateService.service.CertificateService;

@RestController
@RequestMapping("/certificate")
public class CertificateController {

    @Autowired
    private CertificateService service;

    @PostMapping("/add")
    public Certificate addCertificate(@RequestBody Certificate certificate) {
        return service.addCertificate(certificate);
    }

    @GetMapping("/all")
    public List<Certificate> getAllCertificates() {
        return service.getAllCertificates();
    }

    @GetMapping("/{id}")
    public Certificate getCertificateById(@PathVariable int id) {
        return service.getCertificateById(id);
    }

    @PutMapping("/update/{id}")
    public Certificate updateCertificate(@PathVariable int id, @RequestBody Certificate certificate) {
        return service.updateCertificate(id, certificate);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteCertificate(@PathVariable int id) {
        service.deleteCertificate(id);
        return "Certificate deleted with ID " + id;
    }
}
