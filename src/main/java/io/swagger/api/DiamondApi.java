/**
 * NOTE: This class is auto generated by the swagger code generator program (2.2.3).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Diamond;
import io.swagger.model.Order;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-02-14T17:51:56.837Z")

@Api(value = "diamond", description = "the diamond API")
public interface DiamondApi {

    @ApiOperation(value = "Returns diamond inventories", notes = "", response = Object.class, tags={ "diamond", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Object.class) })
    
    @RequestMapping(value = "/diamond/inventory",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Object> getInventory();


    @ApiOperation(value = "Place an order for diamond", notes = "", response = Order.class, tags={ "diamond", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Order.class),
        @ApiResponse(code = 400, message = "Invalid Order", response = Void.class) })
    
    @RequestMapping(value = "/diamond/order",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Order> placeOrder(@ApiParam(value = "order placed for purchasing diamond" ,required=true )  @Valid @RequestBody Diamond body);

}