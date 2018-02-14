package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Diamond
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-02-14T17:51:56.837Z")

public class Diamond   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("carat")
  private Long carat = null;

  @JsonProperty("prize")
  private Long prize = null;

  @JsonProperty("userId")
  private Long userId = null;

  public Diamond id(Long id) {
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

  public Diamond type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Diamond carat(Long carat) {
    this.carat = carat;
    return this;
  }

   /**
   * Get carat
   * @return carat
  **/
  @ApiModelProperty(value = "")


  public Long getCarat() {
    return carat;
  }

  public void setCarat(Long carat) {
    this.carat = carat;
  }

  public Diamond prize(Long prize) {
    this.prize = prize;
    return this;
  }

   /**
   * Get prize
   * @return prize
  **/
  @ApiModelProperty(value = "")


  public Long getPrize() {
    return prize;
  }

  public void setPrize(Long prize) {
    this.prize = prize;
  }

  public Diamond userId(Long userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(value = "")


  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Diamond diamond = (Diamond) o;
    return Objects.equals(this.id, diamond.id) &&
        Objects.equals(this.type, diamond.type) &&
        Objects.equals(this.carat, diamond.carat) &&
        Objects.equals(this.prize, diamond.prize) &&
        Objects.equals(this.userId, diamond.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, carat, prize, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Diamond {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    carat: ").append(toIndentedString(carat)).append("\n");
    sb.append("    prize: ").append(toIndentedString(prize)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

