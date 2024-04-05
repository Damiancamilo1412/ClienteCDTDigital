package com.mibanco.clientecdtdigital.service.impl;

import com.mibanco.clientecdtdigital.dao.ClientecdtdigitalDao;
import com.mibanco.clientecdtdigital.controller.ClientecdtdigitalController;
import com.mibanco.clientecdtdigital.entity.ClientecdtdigitalEntity;
import com.mibanco.clientecdtdigital.gen.type.ClienteCDTDigitalType;
import com.mibanco.clientecdtdigital.gen.type.ClienteCDTTypeResponse;
import com.mibanco.clientecdtdigital.utils.ApplicationException;
import com.mibanco.clientecdtdigital.utils.ClientecdtdigitalMapper;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.core.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static com.mibanco.clientecdtdigital.constant.Constant.ERROR_SERVICIO;
@ApplicationScoped
public class ClientecdtdigitalServiceImpl {
    private static final Logger LOG = LoggerFactory.getLogger(ClientecdtdigitalServiceImpl.class);

    //Inyección de dependencias
    @Inject
    ClientecdtdigitalMapper clientecdtdigitalMapper;
    @Inject
    ClientecdtdigitalDao clientecdtdigitalDao;

    @Transactional
    public ClienteCDTTypeResponse crearClientecdtdigital(ClienteCDTDigitalType clienteCDTDigitalType) {

        LOG.info("Inicia crearClientecdtdigital Impl");
        ClienteCDTTypeResponse clienteCDTTypeResponse;
        try {
            ClientecdtdigitalEntity clientecdtdigitalEntity = clientecdtdigitalMapper.clientecdtdigitalTypeToEntity(clienteCDTDigitalType);
            clientecdtdigitalDao.persist(clientecdtdigitalEntity);
            clienteCDTTypeResponse = clientecdtdigitalMapper.clientecdtdigitalEntityToTypeResponse(clientecdtdigitalEntity);
            LOG.info("Finaliza crear Clientecdtdigital Impl");
        } catch (ApplicationException e) {
            LOG.error("Error al crear Clientecdtdigital Impl" + e.getMessage());
            throw new ApplicationException(ERROR_SERVICIO + e.getMessage());

        }
        return clienteCDTTypeResponse;

    }

    @Transactional
    public void eliminarclientecdtdigital(Integer id_cliente) {
        LOG.info("Inicia eliminar Clientecdt Impl");
        try {
            Long id = Long.valueOf(id_cliente);
            clientecdtdigitalDao.deleteById(id);
            LOG.info("Se finaliza eliminacion de usuario por id Impl");
        } catch (ApplicationException e) {
            LOG.error(ERROR_SERVICIO + e.getMessage() + "Eliminar usuario Impl");
            throw new ApplicationException(ERROR_SERVICIO + e.getMessage());
        }

    }

    public List<ClienteCDTTypeResponse> buscarClienteCDTDigital(Integer id_cliente) {
        LOG.info("Inicia Listar ClientecdtImpl");
        try {
            long id = Long.valueOf(id_cliente);
            ClientecdtdigitalEntity clientecdtdigitalEntity = clientecdtdigitalDao.findById(id);
            ClienteCDTTypeResponse response = clientecdtdigitalMapper.clientecdtdigitalEntityToTypeResponse(clientecdtdigitalEntity);
            LOG.info("Finaliza listar clienteCDTdigital por id");
            return Collections.singletonList(response);
        } catch (ApplicationException e) {
            LOG.error("Se presento un error al listar clienteCDTdigital por id" + e.getMessage());
            throw new ApplicationException(ERROR_SERVICIO + e.getMessage());
        }
    }

    @Transactional

    public ClienteCDTTypeResponse actualizaClientecdtdigital(Integer id_cliente, ClienteCDTDigitalType clienteCDTDigitalType) {
        LOG.info("Inicia actualizarClienteCDTDigital service");
        try {
            ClientecdtdigitalEntity clientecdtdigitalEntity = clientecdtdigitalDao.findById(id_cliente.longValue());
            ClientecdtdigitalEntity clientecdtdigitalEntityNew = clientecdtdigitalMapper.clientecdtdigitalTypeToEntity(clienteCDTDigitalType);

            clientecdtdigitalEntity.setTipoTelefonoPrincipal(clientecdtdigitalEntityNew.getTipoTelefonoPrincipal());
            clientecdtdigitalEntity.setTelefonoPrincipal(clientecdtdigitalEntityNew.getTelefonoPrincipal());
            clientecdtdigitalEntity.setTipoCorreoElectronico(clientecdtdigitalEntityNew.getTipoCorreoElectronico());
            clientecdtdigitalEntity.setGeneroEnum(clientecdtdigitalEntityNew.getGeneroEnum());
            clientecdtdigitalEntity.setFechaNacimientoDia(clientecdtdigitalEntityNew.getFechaNacimientoDia());
            clientecdtdigitalEntity.setFechaNacimientoMes(clientecdtdigitalEntityNew.getFechaNacimientoMes());
            clientecdtdigitalEntity.setFechaNacimientoAno(clientecdtdigitalEntityNew.getFechaNacimientoAno());
            clientecdtdigitalEntity.setLugarNacimientoPais(clientecdtdigitalEntityNew.getLugarNacimientoPais());

            ClienteCDTTypeResponse response = clientecdtdigitalMapper.clientecdtdigitalEntityToTypeResponse(clientecdtdigitalEntityNew);
            LOG.info("Finaliza actualizarClienteCDTDigital service");
            return response;

        } catch (ApplicationException e) {
            LOG.error(ERROR_SERVICIO + e.getMessage() + " actualizarClienteCDTDigital service");
            throw new ApplicationException(ERROR_SERVICIO + e.getMessage());

        }
    }

}
