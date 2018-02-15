package io.swagger.api;

import io.swagger.model.User;
import io.swagger.service.UserService;
import io.swagger.annotations.*;

import org.springframework.beans.factory.annotation.Autowired;
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
public class UserApiController implements UserApi {

	private UserService userService;
	
    public UserService getUserService() {
		return userService;
	}
    
    @Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public ResponseEntity<Void> createUser(@ApiParam(value = "Created user object" ,required=true )  @Valid @RequestBody User body) {
        // do some magic!
		try {
			userService.createUser(body);	
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
    	
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> deleteUser(@ApiParam(value = "The user that needs to be deleted",required=true ) @PathVariable("userId") Long userId) {
        // do some magic!
    	String returnMessage=null;
    	try {
			returnMessage=userService.deleteUser(userId);	
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
    	return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<User> getUserById(@ApiParam(value = "",required=true ) @PathVariable("userId") Long userId) {
        // do some magic!
    	String returnMessage=null;
    	User user=null;
    	try {
			user=userService.getUserById(userId);	
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
    	return new ResponseEntity<User>(HttpStatus.OK);
    }

    public ResponseEntity<String> loginUser( @NotNull@ApiParam(value = "The user name for login", required = true) @RequestParam(value = "username", required = true) String username,
         @NotNull@ApiParam(value = "The password for login in clear text", required = true) @RequestParam(value = "password", required = true) String password) {
        // do some magic!
    	String returnMessage=null;
    	try {
    		
			returnMessage=userService.loginUser(username,password);	
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
    	return new ResponseEntity<String>(HttpStatus.OK);
    }

    public ResponseEntity<Void> updateUser(@ApiParam(value = "user that need to be updated",required=true ) @PathVariable("userId") Long userId,
        @ApiParam(value = "Updated user object" ,required=true )  @Valid @RequestBody User body) {
        // do some magic!
    	String returnMessage=null;
    	try {
			returnMessage =userService.updateUser(body);	
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
    	return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
