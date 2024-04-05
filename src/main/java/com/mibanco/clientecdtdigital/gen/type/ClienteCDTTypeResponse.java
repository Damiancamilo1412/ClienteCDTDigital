package com.mibanco.clientecdtdigital.gen.type;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("ClienteCDTTypeResponse")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-04-02T12:52:39.434209100-05:00[America/Bogota]")
public class ClienteCDTTypeResponse   {
  private @Valid String tipoTelefonoPrincipal;
  private @Valid Long telefonoPrincipal = null;
  private @Valid String tipoCorreoElectronico;
  public enum GeneroEnumEnum {

    FEMENINO(String.valueOf("FEMENINO")), MASCULINO(String.valueOf("MASCULINO"));


    private String value;

    GeneroEnumEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static GeneroEnumEnum fromString(String s) {
        for (GeneroEnumEnum b : GeneroEnumEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
    }

    @JsonCreator
    public static GeneroEnumEnum fromValue(String value) {
        for (GeneroEnumEnum b : GeneroEnumEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private @Valid GeneroEnumEnum generoEnum;
  private @Valid Integer fechaNacimientoDia;
  private @Valid Integer fechaNacimientoMes;
  private @Valid Integer fechaNacimientoAno;
  private @Valid String lugarNacimientoPais;

  /**
   **/
  public ClienteCDTTypeResponse tipoTelefonoPrincipal(String tipoTelefonoPrincipal) {
    this.tipoTelefonoPrincipal = tipoTelefonoPrincipal;
    return this;
  }

  
  @JsonProperty("tipoTelefonoPrincipal")
  public String getTipoTelefonoPrincipal() {
    return tipoTelefonoPrincipal;
  }

  @JsonProperty("tipoTelefonoPrincipal")
  public void setTipoTelefonoPrincipal(String tipoTelefonoPrincipal) {
    this.tipoTelefonoPrincipal = tipoTelefonoPrincipal;
  }

  /**
   **/
  public ClienteCDTTypeResponse telefonoPrincipal(Long telefonoPrincipal) {
    this.telefonoPrincipal = telefonoPrincipal;
    return this;
  }

  
  @JsonProperty("telefonoPrincipal")
  public Long getTelefonoPrincipal() {
    return telefonoPrincipal;
  }

  @JsonProperty("telefonoPrincipal")
  public void setTelefonoPrincipal(Long telefonoPrincipal) {
    this.telefonoPrincipal = telefonoPrincipal;
  }

  /**
   **/
  public ClienteCDTTypeResponse tipoCorreoElectronico(String tipoCorreoElectronico) {
    this.tipoCorreoElectronico = tipoCorreoElectronico;
    return this;
  }

  
  @JsonProperty("tipoCorreoElectronico")
  public String getTipoCorreoElectronico() {
    return tipoCorreoElectronico;
  }

  @JsonProperty("tipoCorreoElectronico")
  public void setTipoCorreoElectronico(String tipoCorreoElectronico) {
    this.tipoCorreoElectronico = tipoCorreoElectronico;
  }

  /**
   **/
  public ClienteCDTTypeResponse generoEnum(GeneroEnumEnum generoEnum) {
    this.generoEnum = generoEnum;
    return this;
  }

  
  @JsonProperty("GeneroEnum")
  public GeneroEnumEnum getGeneroEnum() {
    return generoEnum;
  }

  @JsonProperty("GeneroEnum")
  public void setGeneroEnum(GeneroEnumEnum generoEnum) {
    this.generoEnum = generoEnum;
  }

  /**
   **/
  public ClienteCDTTypeResponse fechaNacimientoDia(Integer fechaNacimientoDia) {
    this.fechaNacimientoDia = fechaNacimientoDia;
    return this;
  }

  
  @JsonProperty("fechaNacimientoDia")
  public Integer getFechaNacimientoDia() {
    return fechaNacimientoDia;
  }

  @JsonProperty("fechaNacimientoDia")
  public void setFechaNacimientoDia(Integer fechaNacimientoDia) {
    this.fechaNacimientoDia = fechaNacimientoDia;
  }

  /**
   **/
  public ClienteCDTTypeResponse fechaNacimientoMes(Integer fechaNacimientoMes) {
    this.fechaNacimientoMes = fechaNacimientoMes;
    return this;
  }

  
  @JsonProperty("fechaNacimientoMes")
  public Integer getFechaNacimientoMes() {
    return fechaNacimientoMes;
  }

  @JsonProperty("fechaNacimientoMes")
  public void setFechaNacimientoMes(Integer fechaNacimientoMes) {
    this.fechaNacimientoMes = fechaNacimientoMes;
  }

  /**
   **/
  public ClienteCDTTypeResponse fechaNacimientoAno(Integer fechaNacimientoAno) {
    this.fechaNacimientoAno = fechaNacimientoAno;
    return this;
  }

  
  @JsonProperty("fechaNacimientoAno")
  public Integer getFechaNacimientoAno() {
    return fechaNacimientoAno;
  }

  @JsonProperty("fechaNacimientoAno")
  public void setFechaNacimientoAno(Integer fechaNacimientoAno) {
    this.fechaNacimientoAno = fechaNacimientoAno;
  }

  /**
   **/
  public ClienteCDTTypeResponse lugarNacimientoPais(String lugarNacimientoPais) {
    this.lugarNacimientoPais = lugarNacimientoPais;
    return this;
  }

  
  @JsonProperty("lugarNacimientoPais")
  public String getLugarNacimientoPais() {
    return lugarNacimientoPais;
  }

  @JsonProperty("lugarNacimientoPais")
  public void setLugarNacimientoPais(String lugarNacimientoPais) {
    this.lugarNacimientoPais = lugarNacimientoPais;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClienteCDTTypeResponse clienteCDTTypeResponse = (ClienteCDTTypeResponse) o;
    return Objects.equals(this.tipoTelefonoPrincipal, clienteCDTTypeResponse.tipoTelefonoPrincipal) &&
        Objects.equals(this.telefonoPrincipal, clienteCDTTypeResponse.telefonoPrincipal) &&
        Objects.equals(this.tipoCorreoElectronico, clienteCDTTypeResponse.tipoCorreoElectronico) &&
        Objects.equals(this.generoEnum, clienteCDTTypeResponse.generoEnum) &&
        Objects.equals(this.fechaNacimientoDia, clienteCDTTypeResponse.fechaNacimientoDia) &&
        Objects.equals(this.fechaNacimientoMes, clienteCDTTypeResponse.fechaNacimientoMes) &&
        Objects.equals(this.fechaNacimientoAno, clienteCDTTypeResponse.fechaNacimientoAno) &&
        Objects.equals(this.lugarNacimientoPais, clienteCDTTypeResponse.lugarNacimientoPais);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tipoTelefonoPrincipal, telefonoPrincipal, tipoCorreoElectronico, generoEnum, fechaNacimientoDia, fechaNacimientoMes, fechaNacimientoAno, lugarNacimientoPais);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClienteCDTTypeResponse {\n");
    
    sb.append("    tipoTelefonoPrincipal: ").append(toIndentedString(tipoTelefonoPrincipal)).append("\n");
    sb.append("    telefonoPrincipal: ").append(toIndentedString(telefonoPrincipal)).append("\n");
    sb.append("    tipoCorreoElectronico: ").append(toIndentedString(tipoCorreoElectronico)).append("\n");
    sb.append("    generoEnum: ").append(toIndentedString(generoEnum)).append("\n");
    sb.append("    fechaNacimientoDia: ").append(toIndentedString(fechaNacimientoDia)).append("\n");
    sb.append("    fechaNacimientoMes: ").append(toIndentedString(fechaNacimientoMes)).append("\n");
    sb.append("    fechaNacimientoAno: ").append(toIndentedString(fechaNacimientoAno)).append("\n");
    sb.append("    lugarNacimientoPais: ").append(toIndentedString(lugarNacimientoPais)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

