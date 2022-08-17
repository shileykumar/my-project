package com.xanstac.repository;

import com.xanstac.domain.ContactUs;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<ContactUs, Long> {
}
