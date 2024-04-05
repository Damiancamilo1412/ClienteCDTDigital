package com.mibanco.clientecdtdigital.dao;

import com.mibanco.clientecdtdigital.entity.ClientecdtdigitalEntity;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
@ApplicationScoped
public class ClientecdtdigitalDao implements PanacheRepository<ClientecdtdigitalEntity> {
}
