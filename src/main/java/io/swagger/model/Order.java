package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Order
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-02-14T17:51:56.837Z")

public class Order   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("diamondId")
  private Long diamondId = null;

  @JsonProperty("carat")
  private Integer carat = null;

  @JsonProperty("customerId")
  private Long customerId = null;

  public Order id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Order diamondId(Long diamondId) {
    this.diamondId = diamondId;
    return this;
  }

   /**
   * Get diamondId
   * @return diamondId
  **/
  @ApiModelProperty(value = "")


  public Long getDiamondId() {
    return diamondId;
  }

  public void setDiamondId(Long diamondId) {
    this.diamondId = diamondId;
  }

  public Order carat(Integer carat) {
    this.carat = carat;
    return this;
  }

   /**
   * Get carat
   * @return carat
  **/
  @ApiModelProperty(value = "")


  public Integer getCarat() {
    return carat;
  }

  public void setCarat(Integer carat) {
    this.carat = carat;
  }

  public Order customerId(Long customerId) {
    this.customerId = customerId;
    return this;
  }

   /**
   * Get customerId
   * @return customerId
  **/
  @ApiModelProperty(value = "")


  public Long getCustomerId() {
    return customerId;
  }

  public void setCustomerId(Long customerId) {
    this.customerId = customerId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Order order = (Order) o;
    return Objects.equals(this.id, order.id) &&
        Objects.equals(this.diamondId, order.diamondId) &&
        Objects.equals(this.carat, order.carat) &&
        Objects.equals(this.customerId, order.customerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, diamondId, carat, customerId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Order {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    diamondId: ").append(toIndentedString(diamondId)).append("\n");
    sb.append("    carat: ").append(toIndentedString(carat)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
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

