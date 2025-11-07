package com.tnsif.CertificateService.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tnsif.CertificateService.entity.Certificate;
import com.tnsif.CertificateService.repository.CertificateRepository;

public interface CertificateService {
    Certificate addCertificate(Certificate certificate);
    List<Certificate> getAllCertificates();
    Certificate getCertificateById(int id);
    Certificate updateCertificate(int id, Certificate certificate);
    void deleteCertificate(int id);
}

@Service
class CertificateServiceImpl implements CertificateService {

    @Autowired
    private CertificateRepository repository;

    @Override
    public Certificate addCertificate(Certificate certificate) {
        return repository.save(certificate);
    }

    @Override
    public List<Certificate> getAllCertificates() {
        return repository.findAll();
    }

    @Override
    public Certificate getCertificateById(int id) {
        Optional<Certificate> certificate = repository.findById(id);
        return certificate.orElse(null);
    }

    @Override
    public Certificate updateCertificate(int id, Certificate certificate) {
        Certificate existing = repository.findById(id).orElse(null);
        if (existing != null) {
            existing.setStudentName(certificate.getStudentName());
            existing.setCollegeName(certificate.getCollegeName());
            existing.setCourseName(certificate.getCourseName());
            existing.setIssueDate(certificate.getIssueDate());
            existing.setValidUntil(certificate.getValidUntil());
            existing.setStatus(certificate.getStatus());
            return repository.save(existing);
        }
        return null;
    }

    @Override
    public void deleteCertificate(int id) {
        repository.deleteById(id);
    }
}
