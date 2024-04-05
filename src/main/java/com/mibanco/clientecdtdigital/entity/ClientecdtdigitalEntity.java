package com.mibanco.clientecdtdigital.entity;

import io.quarkus.runtime.annotations.RegisterForReflection;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Entity
@RegisterForReflection
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tbl_Clientecdtdigital")
public class ClientecdtdigitalEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "clienteid")
    private Long clienteid;
    @Column(name = "tipoTelefonoPrincipal")
    private String tipoTelefonoPrincipal;
    @Column(name = "telefonoPrincipal")
    private Long telefonoPrincipal;
    @Column(name = "tipoCorreoElectronico")
    private String tipoCorreoElectronico;
    @Column(name = "GeneroEnum")
    private String GeneroEnum;
    @Column(name = "fechaNacimientoDia")
    private Integer fechaNacimientoDia;
    @Column(name = "fechaNacimientoMes")
    private Integer fechaNacimientoMes;
    @Column(name = "fechaNacimientoAno")
    private Integer fechaNacimientoAno;
    @Column(name = "lugarNacimientoPais")
    private String lugarNacimientoPais;
}