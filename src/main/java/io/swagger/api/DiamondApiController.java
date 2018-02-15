package io.swagger.api;

import io.swagger.model.Diamond;
import io.swagger.model.Order;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-02-14T17:51:56.837Z")

@Controller
public class DiamondApiController implements DiamondApi {



    public ResponseEntity<Object> getInventory() {
        // do some magic!
    	//
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Order> placeOrder(@ApiParam(value = "order placed for purchasing diamond" ,required=true )  @Valid @RequestBody Diamond body) {
        // do some magic!
        return new ResponseEntity<Order>(HttpStatus.OK);
    }

}
