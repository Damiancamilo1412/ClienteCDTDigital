package com.mibanco.clientecdtdigital.controller;

import com.mibanco.clientecdtdigital.constant.Constant;
import com.mibanco.clientecdtdigital.gen.contract.V1Clientecdtdigital;
import com.mibanco.clientecdtdigital.gen.type.ClienteCDTDigitalType;
import com.mibanco.clientecdtdigital.gen.type.ClienteCDTTypeResponse;
import com.mibanco.clientecdtdigital.service.impl.ClientecdtdigitalServiceImpl;
import com.mibanco.clientecdtdigital.utils.ApplicationException;
import com.mibanco.clientecdtdigital.utils.ClientecdtdigitalMapper;
import jakarta.inject.Inject;
import jakarta.ws.rs.core.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;

public class ClientecdtdigitalController implements V1Clientecdtdigital {

    private static final Logger LOG = LoggerFactory.getLogger(ClientecdtdigitalController.class);

    @Inject
    ClientecdtdigitalServiceImpl clientecdtdigitalServiceImpl; /* implemetar clientecdtdigitalservice*/

    @Inject
    ClientecdtdigitalMapper clientecdtdigitalMapper;


    @Override
    public Response actualizaClientecdtdigital(Integer id_cliente, ClienteCDTDigitalType clienteCDTDigitalType) {
        LOG.info("Inicia actualizarClienteCDTDigital controller");
        ClienteCDTTypeResponse clienteCDTTypeResponse = null;
        try {
            clienteCDTTypeResponse = clientecdtdigitalServiceImpl.actualizaClientecdtdigital(id_cliente, clienteCDTDigitalType);
        } catch (ApplicationException e) {
            LOG.error(Constant.ERROR_SERVICIO + e.getMessage() + " actualizarClienteCDTDigital controller");
            return Response.status(Response.Status.BAD_REQUEST).entity(clienteCDTTypeResponse).build();
        }
            LOG.info("Finaliza actualizarClienteCDTDigital controller");
            return Response.status(Response.Status.OK).entity(clienteCDTTypeResponse).build();
    }


    @Override
    public Response buscarClienteCDTDigital(Integer id_cliente) {
        LOG.info("Se inicia buscar Clientecdt por Id controller");
        List<ClienteCDTTypeResponse> clienteCDTTypeResponses = null;
       try {
            clienteCDTTypeResponses = clientecdtdigitalServiceImpl.buscarClienteCDTDigital(id_cliente);
       } catch (ApplicationException e){
           LOG.error(Constant.ERROR_SERVICIO + e.getMessage() + "buscarClienteCDTDigitalController");
           return Response.status(Response.Status.BAD_REQUEST).entity(clienteCDTTypeResponses).build();
    }
        LOG.info("Finaliza buscar usuario controller");
        return Response.status(Response.Status.CREATED).entity(clienteCDTTypeResponses).build();
    }


    @Override
    public Response crearClientecdtdigital(ClienteCDTDigitalType clienteCDTDigitalType) {

            LOG.info("Se inicia el proceso crearClientecdtdigital controller");
            ClienteCDTTypeResponse clienteCDTTypeResponse = null;

            try {
                clienteCDTTypeResponse  = clientecdtdigitalServiceImpl.crearClientecdtdigital(clienteCDTDigitalType);
            } catch (ApplicationException e) {
                LOG.error(Constant.ERROR_SERVICIO + e.getMessage() + "CrearUsuarioController");
                return Response.status(Response.Status.BAD_REQUEST).entity(clienteCDTDigitalType).build();
            }
            LOG.info("Finaliza la crearClientecdtdigital controller");
            return Response.status(Response.Status.CREATED).entity(clienteCDTDigitalType).build();
    }

   @Override
    public Response eliminarclientecdtdigital(Integer id_cliente) {
            LOG.info("Se inicia la eliminacion del ClienteCDT por Id Controller");
            try {
                clientecdtdigitalServiceImpl.eliminarclientecdtdigital(id_cliente)   ;
            } catch (ApplicationException e) {
                LOG.error(Constant.ERROR_SERVICIO + e.getMessage() + "eliminaUsuarioController");
                return Response.status(Response.Status.BAD_REQUEST).build();
            }
            LOG.info("Finaliza eliminacion usuario controller");
            return Response.status(Response.Status.NO_CONTENT).build();
        }


}
