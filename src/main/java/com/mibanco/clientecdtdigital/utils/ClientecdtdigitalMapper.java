package com.mibanco.clientecdtdigital.utils;

import com.mibanco.clientecdtdigital.entity.ClientecdtdigitalEntity;
import com.mibanco.clientecdtdigital.gen.type.ClienteCDTDigitalType;
import com.mibanco.clientecdtdigital.gen.type.ClienteCDTTypeResponse;
import jakarta.enterprise.context.ApplicationScoped;
import org.modelmapper.ModelMapper;

@ApplicationScoped
public class ClientecdtdigitalMapper {

    public ClientecdtdigitalEntity clientecdtdigitalTypeToEntity(ClienteCDTDigitalType clienteCDTDigitalType){
        return new ModelMapper().map(clienteCDTDigitalType, ClientecdtdigitalEntity.class);
    }

    public ClienteCDTDigitalType clientecdtdigitalEntityToType(ClientecdtdigitalEntity clientecdtdigitalEntity){
        return new ModelMapper().map(clientecdtdigitalEntity, ClienteCDTDigitalType.class);
    }

    public ClienteCDTTypeResponse clientecdtdigitalEntityToTypeResponse(ClientecdtdigitalEntity clientecdtdigitalEntity){
        return new ModelMapper().map(clientecdtdigitalEntity, ClienteCDTTypeResponse.class);
    }

    public ClienteCDTTypeResponse clientecdtdigitalTypeResponse(ClientecdtdigitalEntity clientecdtdigitalEntity){
        return new ModelMapper().map(clientecdtdigitalEntity, ClienteCDTTypeResponse.class);
    }



}
