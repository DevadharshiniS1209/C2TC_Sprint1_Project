package com.tnsif.CertificateService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tnsif.CertificateService.entity.Certificate;

public interface CertificateRepository extends JpaRepository<Certificate, Integer> {}
