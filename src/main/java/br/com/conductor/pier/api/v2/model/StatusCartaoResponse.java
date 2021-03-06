package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





/**
 * Representa\u00C3\u00A7\u00C3\u00A3o do recurso Status Cart\u00C3\u00A3o
 **/

@ApiModel(description = "Representa\u00C3\u00A7\u00C3\u00A3o do recurso Status Cart\u00C3\u00A3o")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class StatusCartaoResponse   {
  
  private Long id = null;
  private String nome = null;
  private Integer flagCancelaCartao = null;
  private Integer flagCancelaNoDesbloqueio = null;
  private Long idStatusDestinoDesbloqueio = null;
  private Long idStatusDestinoConta = null;
  private Integer flagCobraTarifa = null;
  private Integer flagPermiteNovaViaCartao = null;
  private Integer flagPermiteDesbloqueio = null;
  private Integer flagCancelamento = null;
  private Integer flagPermiteBloqueio = null;
  private Integer flagReativar = null;

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Status do Cart\u00C3\u00A3o (id) 
   **/
  public StatusCartaoResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Status do Cart\u00C3\u00A3o (id) ")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Nome atribu\u00C3\u00ADdo ao Status de Entrega do Cart\u00C3\u00A3o.
   **/
  public StatusCartaoResponse nome(String nome) {
    this.nome = nome;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Nome atribu\u00C3\u00ADdo ao Status de Entrega do Cart\u00C3\u00A3o.")
  @JsonProperty("nome")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * Quando ativa, indica que ao ser atribu\u00C3\u00ADdo um idStatusCartao com essa caracter\u00C3\u00ADstica, o cart\u00C3\u00A3o ter\u00C3\u00A1 o seu idStatusCartao alterado para o que fora escolhido. Caso contr\u00C3\u00A1rio, o idStatusCartao s\u00C3\u00B3 ser\u00C3\u00A1 alterado ap\u00C3\u00B3s o desbloqueio de um novo cart\u00C3\u00A3o do mesmo Portador e Conta.
   **/
  public StatusCartaoResponse flagCancelaCartao(Integer flagCancelaCartao) {
    this.flagCancelaCartao = flagCancelaCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Quando ativa, indica que ao ser atribu\u00C3\u00ADdo um idStatusCartao com essa caracter\u00C3\u00ADstica, o cart\u00C3\u00A3o ter\u00C3\u00A1 o seu idStatusCartao alterado para o que fora escolhido. Caso contr\u00C3\u00A1rio, o idStatusCartao s\u00C3\u00B3 ser\u00C3\u00A1 alterado ap\u00C3\u00B3s o desbloqueio de um novo cart\u00C3\u00A3o do mesmo Portador e Conta.")
  @JsonProperty("flagCancelaCartao")
  public Integer getFlagCancelaCartao() {
    return flagCancelaCartao;
  }
  public void setFlagCancelaCartao(Integer flagCancelaCartao) {
    this.flagCancelaCartao = flagCancelaCartao;
  }

  
  /**
   * Quando ativa, indica que o cart\u00C3\u00A3o ativo que o portador possuir na mesma conta do cart\u00C3\u00A3o a ser desbloqueado, e que o status dele possua essa caracter\u00C3\u00ADstica, dever\u00C3\u00A1 ser cancelado quando um novo cart\u00C3\u00A3o for desbloqueado.
   **/
  public StatusCartaoResponse flagCancelaNoDesbloqueio(Integer flagCancelaNoDesbloqueio) {
    this.flagCancelaNoDesbloqueio = flagCancelaNoDesbloqueio;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Quando ativa, indica que o cart\u00C3\u00A3o ativo que o portador possuir na mesma conta do cart\u00C3\u00A3o a ser desbloqueado, e que o status dele possua essa caracter\u00C3\u00ADstica, dever\u00C3\u00A1 ser cancelado quando um novo cart\u00C3\u00A3o for desbloqueado.")
  @JsonProperty("flagCancelaNoDesbloqueio")
  public Integer getFlagCancelaNoDesbloqueio() {
    return flagCancelaNoDesbloqueio;
  }
  public void setFlagCancelaNoDesbloqueio(Integer flagCancelaNoDesbloqueio) {
    this.flagCancelaNoDesbloqueio = flagCancelaNoDesbloqueio;
  }

  
  /**
   * Indica qual o idStatusCartao que ser\u00C3\u00A1 atribu\u00C3\u00ADdo aos cart\u00C3\u00B5es que forem cancelados devido ao desbloqueio de um novo cart\u00C3\u00A3o.
   **/
  public StatusCartaoResponse idStatusDestinoDesbloqueio(Long idStatusDestinoDesbloqueio) {
    this.idStatusDestinoDesbloqueio = idStatusDestinoDesbloqueio;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Indica qual o idStatusCartao que ser\u00C3\u00A1 atribu\u00C3\u00ADdo aos cart\u00C3\u00B5es que forem cancelados devido ao desbloqueio de um novo cart\u00C3\u00A3o.")
  @JsonProperty("idStatusDestinoDesbloqueio")
  public Long getIdStatusDestinoDesbloqueio() {
    return idStatusDestinoDesbloqueio;
  }
  public void setIdStatusDestinoDesbloqueio(Long idStatusDestinoDesbloqueio) {
    this.idStatusDestinoDesbloqueio = idStatusDestinoDesbloqueio;
  }

  
  /**
   * Indica qual o idStatusCartao que ser\u00C3\u00A1 atribu\u00C3\u00ADdo a conta, caso ela seja cancelada devido ao bloqueio de um cart\u00C3\u00A3o quando for utilizado um idStatusCartao no processo de Bloqueio que possua essa caracter\u00C3\u00ADstica.
   **/
  public StatusCartaoResponse idStatusDestinoConta(Long idStatusDestinoConta) {
    this.idStatusDestinoConta = idStatusDestinoConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Indica qual o idStatusCartao que ser\u00C3\u00A1 atribu\u00C3\u00ADdo a conta, caso ela seja cancelada devido ao bloqueio de um cart\u00C3\u00A3o quando for utilizado um idStatusCartao no processo de Bloqueio que possua essa caracter\u00C3\u00ADstica.")
  @JsonProperty("idStatusDestinoConta")
  public Long getIdStatusDestinoConta() {
    return idStatusDestinoConta;
  }
  public void setIdStatusDestinoConta(Long idStatusDestinoConta) {
    this.idStatusDestinoConta = idStatusDestinoConta;
  }

  
  /**
   * Quando ativa, indica que cart\u00C3\u00B5es que tiverem um idStatusCartao atribu\u00C3\u00ADdo com essa caracter\u00C3\u00ADstica, incluir\u00C3\u00A3o a cobran\u00C3\u00A7a de uma tarifa para a conta de acordo com os valores definidos nos par\u00C3\u00A2metros do emissor.
   **/
  public StatusCartaoResponse flagCobraTarifa(Integer flagCobraTarifa) {
    this.flagCobraTarifa = flagCobraTarifa;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Quando ativa, indica que cart\u00C3\u00B5es que tiverem um idStatusCartao atribu\u00C3\u00ADdo com essa caracter\u00C3\u00ADstica, incluir\u00C3\u00A3o a cobran\u00C3\u00A7a de uma tarifa para a conta de acordo com os valores definidos nos par\u00C3\u00A2metros do emissor.")
  @JsonProperty("flagCobraTarifa")
  public Integer getFlagCobraTarifa() {
    return flagCobraTarifa;
  }
  public void setFlagCobraTarifa(Integer flagCobraTarifa) {
    this.flagCobraTarifa = flagCobraTarifa;
  }

  
  /**
   * Par\u00C3\u00A2metro que define se o status do cart\u00C3\u00A3o permite a solicita\u00C3\u00A7\u00C3\u00A3o de uma nova via, sendo: 0: Inativo e 1: Ativo.
   **/
  public StatusCartaoResponse flagPermiteNovaViaCartao(Integer flagPermiteNovaViaCartao) {
    this.flagPermiteNovaViaCartao = flagPermiteNovaViaCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Par\u00C3\u00A2metro que define se o status do cart\u00C3\u00A3o permite a solicita\u00C3\u00A7\u00C3\u00A3o de uma nova via, sendo: 0: Inativo e 1: Ativo.")
  @JsonProperty("flagPermiteNovaViaCartao")
  public Integer getFlagPermiteNovaViaCartao() {
    return flagPermiteNovaViaCartao;
  }
  public void setFlagPermiteNovaViaCartao(Integer flagPermiteNovaViaCartao) {
    this.flagPermiteNovaViaCartao = flagPermiteNovaViaCartao;
  }

  
  /**
   * Par\u00C3\u00A2metro que define se o status do cart\u00C3\u00A3o permite o desbloqueio, sendo: 0: Inativo e 1: Ativo.
   **/
  public StatusCartaoResponse flagPermiteDesbloqueio(Integer flagPermiteDesbloqueio) {
    this.flagPermiteDesbloqueio = flagPermiteDesbloqueio;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Par\u00C3\u00A2metro que define se o status do cart\u00C3\u00A3o permite o desbloqueio, sendo: 0: Inativo e 1: Ativo.")
  @JsonProperty("flagPermiteDesbloqueio")
  public Integer getFlagPermiteDesbloqueio() {
    return flagPermiteDesbloqueio;
  }
  public void setFlagPermiteDesbloqueio(Integer flagPermiteDesbloqueio) {
    this.flagPermiteDesbloqueio = flagPermiteDesbloqueio;
  }

  
  /**
   * Par\u00C3\u00A2metro que define se o status do cart\u00C3\u00A3o permite o cancelamento, sendo: 0: Inativo e 1: Ativo.
   **/
  public StatusCartaoResponse flagCancelamento(Integer flagCancelamento) {
    this.flagCancelamento = flagCancelamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Par\u00C3\u00A2metro que define se o status do cart\u00C3\u00A3o permite o cancelamento, sendo: 0: Inativo e 1: Ativo.")
  @JsonProperty("flagCancelamento")
  public Integer getFlagCancelamento() {
    return flagCancelamento;
  }
  public void setFlagCancelamento(Integer flagCancelamento) {
    this.flagCancelamento = flagCancelamento;
  }

  
  /**
   * Par\u00C3\u00A2metro que define se o status do cart\u00C3\u00A3o permite o bloqueio, sendo: 0: Inativo e 1: Ativo.
   **/
  public StatusCartaoResponse flagPermiteBloqueio(Integer flagPermiteBloqueio) {
    this.flagPermiteBloqueio = flagPermiteBloqueio;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Par\u00C3\u00A2metro que define se o status do cart\u00C3\u00A3o permite o bloqueio, sendo: 0: Inativo e 1: Ativo.")
  @JsonProperty("flagPermiteBloqueio")
  public Integer getFlagPermiteBloqueio() {
    return flagPermiteBloqueio;
  }
  public void setFlagPermiteBloqueio(Integer flagPermiteBloqueio) {
    this.flagPermiteBloqueio = flagPermiteBloqueio;
  }

  
  /**
   * Par\u00C3\u00A2metro que define se o status do cart\u00C3\u00A3o permite a reativa\u00C3\u00A7\u00C3\u00A3o do cart\u00C3\u00A3o, sendo: 0: Inativo e 1: Ativo.
   **/
  public StatusCartaoResponse flagReativar(Integer flagReativar) {
    this.flagReativar = flagReativar;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Par\u00C3\u00A2metro que define se o status do cart\u00C3\u00A3o permite a reativa\u00C3\u00A7\u00C3\u00A3o do cart\u00C3\u00A3o, sendo: 0: Inativo e 1: Ativo.")
  @JsonProperty("flagReativar")
  public Integer getFlagReativar() {
    return flagReativar;
  }
  public void setFlagReativar(Integer flagReativar) {
    this.flagReativar = flagReativar;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusCartaoResponse statusCartaoResponse = (StatusCartaoResponse) o;
    return Objects.equals(this.id, statusCartaoResponse.id) &&
        Objects.equals(this.nome, statusCartaoResponse.nome) &&
        Objects.equals(this.flagCancelaCartao, statusCartaoResponse.flagCancelaCartao) &&
        Objects.equals(this.flagCancelaNoDesbloqueio, statusCartaoResponse.flagCancelaNoDesbloqueio) &&
        Objects.equals(this.idStatusDestinoDesbloqueio, statusCartaoResponse.idStatusDestinoDesbloqueio) &&
        Objects.equals(this.idStatusDestinoConta, statusCartaoResponse.idStatusDestinoConta) &&
        Objects.equals(this.flagCobraTarifa, statusCartaoResponse.flagCobraTarifa) &&
        Objects.equals(this.flagPermiteNovaViaCartao, statusCartaoResponse.flagPermiteNovaViaCartao) &&
        Objects.equals(this.flagPermiteDesbloqueio, statusCartaoResponse.flagPermiteDesbloqueio) &&
        Objects.equals(this.flagCancelamento, statusCartaoResponse.flagCancelamento) &&
        Objects.equals(this.flagPermiteBloqueio, statusCartaoResponse.flagPermiteBloqueio) &&
        Objects.equals(this.flagReativar, statusCartaoResponse.flagReativar);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nome, flagCancelaCartao, flagCancelaNoDesbloqueio, idStatusDestinoDesbloqueio, idStatusDestinoConta, flagCobraTarifa, flagPermiteNovaViaCartao, flagPermiteDesbloqueio, flagCancelamento, flagPermiteBloqueio, flagReativar);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusCartaoResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    flagCancelaCartao: ").append(toIndentedString(flagCancelaCartao)).append("\n");
    sb.append("    flagCancelaNoDesbloqueio: ").append(toIndentedString(flagCancelaNoDesbloqueio)).append("\n");
    sb.append("    idStatusDestinoDesbloqueio: ").append(toIndentedString(idStatusDestinoDesbloqueio)).append("\n");
    sb.append("    idStatusDestinoConta: ").append(toIndentedString(idStatusDestinoConta)).append("\n");
    sb.append("    flagCobraTarifa: ").append(toIndentedString(flagCobraTarifa)).append("\n");
    sb.append("    flagPermiteNovaViaCartao: ").append(toIndentedString(flagPermiteNovaViaCartao)).append("\n");
    sb.append("    flagPermiteDesbloqueio: ").append(toIndentedString(flagPermiteDesbloqueio)).append("\n");
    sb.append("    flagCancelamento: ").append(toIndentedString(flagCancelamento)).append("\n");
    sb.append("    flagPermiteBloqueio: ").append(toIndentedString(flagPermiteBloqueio)).append("\n");
    sb.append("    flagReativar: ").append(toIndentedString(flagReativar)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}



