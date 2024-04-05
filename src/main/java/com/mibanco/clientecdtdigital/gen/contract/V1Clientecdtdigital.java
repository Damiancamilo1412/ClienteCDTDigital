package com.mibanco.clientecdtdigital.gen.contract;

import com.mibanco.clientecdtdigital.gen.type.ClienteCDTDigitalType;
import com.mibanco.clientecdtdigital.gen.type.ClienteCDTTypeResponse;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;




import java.io.InputStream;
import java.util.Map;
import java.util.List;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


@Path("/v1/es")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-04-02T12:52:39.434209100-05:00[America/Bogota]")
public interface V1Clientecdtdigital {

    @PUT
    @Path("/actualizaClientecdt/{id_cliente}")
    @Consumes({ "application/json" })
    Response actualizaClientecdtdigital(@PathParam("id_cliente") @Min(1) Integer idCliente,@Valid ClienteCDTDigitalType clienteCDTDigitalType);

    @GET
    @Path("/buscarClienteCDTDigital/{id_cliente}")
    @Produces({ "application/json" })
    Response buscarClienteCDTDigital(@PathParam("id_cliente") @Min(1) Integer idCliente);

    @POST
    @Path("/crearClientecdtdigital")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    Response crearClientecdtdigital(@Valid ClienteCDTDigitalType clienteCDTDigitalType);

    @DELETE
    @Path("/eliminarClientecdt/{id_cliente}")
    Response eliminarclientecdtdigital(@PathParam("id_cliente") @Min(1) Integer idCliente);
}
