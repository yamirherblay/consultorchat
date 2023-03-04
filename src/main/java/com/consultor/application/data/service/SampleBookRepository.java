package com.consultor.application.data.service;

import com.consultor.application.data.entity.SampleBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface SampleBookRepository extends JpaRepository<SampleBook, Long>, JpaSpecificationExecutor<SampleBook> {

}
