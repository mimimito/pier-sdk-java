package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import br.com.conductor.pier.api.v2.model.ProdutoResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;





/**
 * Lista de Produtos
 **/

@ApiModel(description = "Lista de Produtos")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class PageProdutoResponse   {
  
  private List<ProdutoResponse> content = new ArrayList<ProdutoResponse>();
  private Boolean first = null;
  private Boolean firstPage = null;
  private Boolean hasContent = null;
  private Boolean hasNextPage = null;
  private Boolean hasPreviousPage = null;
  private Boolean last = null;
  private Integer nextPage = null;
  private Integer number = null;
  private Integer numberOfElements = null;
  private Integer previousPage = null;
  private Integer size = null;
  private Long totalElements = null;
  private Integer totalPages = null;

  
  /**
   **/
  public PageProdutoResponse content(List<ProdutoResponse> content) {
    this.content = content;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("content")
  public List<ProdutoResponse> getContent() {
    return content;
  }
  public void setContent(List<ProdutoResponse> content) {
    this.content = content;
  }

  
  /**
   **/
  public PageProdutoResponse first(Boolean first) {
    this.first = first;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("first")
  public Boolean getFirst() {
    return first;
  }
  public void setFirst(Boolean first) {
    this.first = first;
  }

  
  /**
   **/
  public PageProdutoResponse firstPage(Boolean firstPage) {
    this.firstPage = firstPage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("firstPage")
  public Boolean getFirstPage() {
    return firstPage;
  }
  public void setFirstPage(Boolean firstPage) {
    this.firstPage = firstPage;
  }

  
  /**
   **/
  public PageProdutoResponse hasContent(Boolean hasContent) {
    this.hasContent = hasContent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("hasContent")
  public Boolean getHasContent() {
    return hasContent;
  }
  public void setHasContent(Boolean hasContent) {
    this.hasContent = hasContent;
  }

  
  /**
   **/
  public PageProdutoResponse hasNextPage(Boolean hasNextPage) {
    this.hasNextPage = hasNextPage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("hasNextPage")
  public Boolean getHasNextPage() {
    return hasNextPage;
  }
  public void setHasNextPage(Boolean hasNextPage) {
    this.hasNextPage = hasNextPage;
  }

  
  /**
   **/
  public PageProdutoResponse hasPreviousPage(Boolean hasPreviousPage) {
    this.hasPreviousPage = hasPreviousPage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("hasPreviousPage")
  public Boolean getHasPreviousPage() {
    return hasPreviousPage;
  }
  public void setHasPreviousPage(Boolean hasPreviousPage) {
    this.hasPreviousPage = hasPreviousPage;
  }

  
  /**
   **/
  public PageProdutoResponse last(Boolean last) {
    this.last = last;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("last")
  public Boolean getLast() {
    return last;
  }
  public void setLast(Boolean last) {
    this.last = last;
  }

  
  /**
   **/
  public PageProdutoResponse nextPage(Integer nextPage) {
    this.nextPage = nextPage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("nextPage")
  public Integer getNextPage() {
    return nextPage;
  }
  public void setNextPage(Integer nextPage) {
    this.nextPage = nextPage;
  }

  
  /**
   **/
  public PageProdutoResponse number(Integer number) {
    this.number = number;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("number")
  public Integer getNumber() {
    return number;
  }
  public void setNumber(Integer number) {
    this.number = number;
  }

  
  /**
   **/
  public PageProdutoResponse numberOfElements(Integer numberOfElements) {
    this.numberOfElements = numberOfElements;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("numberOfElements")
  public Integer getNumberOfElements() {
    return numberOfElements;
  }
  public void setNumberOfElements(Integer numberOfElements) {
    this.numberOfElements = numberOfElements;
  }

  
  /**
   **/
  public PageProdutoResponse previousPage(Integer previousPage) {
    this.previousPage = previousPage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("previousPage")
  public Integer getPreviousPage() {
    return previousPage;
  }
  public void setPreviousPage(Integer previousPage) {
    this.previousPage = previousPage;
  }

  
  /**
   **/
  public PageProdutoResponse size(Integer size) {
    this.size = size;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("size")
  public Integer getSize() {
    return size;
  }
  public void setSize(Integer size) {
    this.size = size;
  }

  
  /**
   **/
  public PageProdutoResponse totalElements(Long totalElements) {
    this.totalElements = totalElements;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("totalElements")
  public Long getTotalElements() {
    return totalElements;
  }
  public void setTotalElements(Long totalElements) {
    this.totalElements = totalElements;
  }

  
  /**
   **/
  public PageProdutoResponse totalPages(Integer totalPages) {
    this.totalPages = totalPages;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("totalPages")
  public Integer getTotalPages() {
    return totalPages;
  }
  public void setTotalPages(Integer totalPages) {
    this.totalPages = totalPages;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageProdutoResponse pageProdutoResponse = (PageProdutoResponse) o;
    return Objects.equals(this.content, pageProdutoResponse.content) &&
        Objects.equals(this.first, pageProdutoResponse.first) &&
        Objects.equals(this.firstPage, pageProdutoResponse.firstPage) &&
        Objects.equals(this.hasContent, pageProdutoResponse.hasContent) &&
        Objects.equals(this.hasNextPage, pageProdutoResponse.hasNextPage) &&
        Objects.equals(this.hasPreviousPage, pageProdutoResponse.hasPreviousPage) &&
        Objects.equals(this.last, pageProdutoResponse.last) &&
        Objects.equals(this.nextPage, pageProdutoResponse.nextPage) &&
        Objects.equals(this.number, pageProdutoResponse.number) &&
        Objects.equals(this.numberOfElements, pageProdutoResponse.numberOfElements) &&
        Objects.equals(this.previousPage, pageProdutoResponse.previousPage) &&
        Objects.equals(this.size, pageProdutoResponse.size) &&
        Objects.equals(this.totalElements, pageProdutoResponse.totalElements) &&
        Objects.equals(this.totalPages, pageProdutoResponse.totalPages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, first, firstPage, hasContent, hasNextPage, hasPreviousPage, last, nextPage, number, numberOfElements, previousPage, size, totalElements, totalPages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageProdutoResponse {\n");
    
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    first: ").append(toIndentedString(first)).append("\n");
    sb.append("    firstPage: ").append(toIndentedString(firstPage)).append("\n");
    sb.append("    hasContent: ").append(toIndentedString(hasContent)).append("\n");
    sb.append("    hasNextPage: ").append(toIndentedString(hasNextPage)).append("\n");
    sb.append("    hasPreviousPage: ").append(toIndentedString(hasPreviousPage)).append("\n");
    sb.append("    last: ").append(toIndentedString(last)).append("\n");
    sb.append("    nextPage: ").append(toIndentedString(nextPage)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    numberOfElements: ").append(toIndentedString(numberOfElements)).append("\n");
    sb.append("    previousPage: ").append(toIndentedString(previousPage)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    totalElements: ").append(toIndentedString(totalElements)).append("\n");
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
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



