package com.batch8group4.onlinebank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.batch8group4.onlinebank.dto.NetBankingLogin;
import com.batch8group4.onlinebank.model.NetBankingDetails;
import com.batch8group4.onlinebank.service.NetBankingDetailsService;
import com.batch8group4.onlinebank.utils.JwtUtil;

@RestController
@RequestMapping("/netbanking")
public class NetBankingDetailsController {

	@Autowired
    private JwtUtil jwtUtil;
    @Autowired
    private AuthenticationManager authenticationManager;

	@Autowired
	private NetBankingDetailsService netBankingDetailsService;
	
	
	@PostMapping("/create/account/{accountNumber}")
	public String createNetBankingRequest(@PathVariable String accountNumber, @RequestBody NetBankingDetails netBankingDetails)
	{
		String msg=netBankingDetailsService.registerForNetBanking(accountNumber, netBankingDetails);
		return msg;
	}

    @GetMapping("/")
    public String welcome() {
        return "This is your net banking profile";
    }

    @PostMapping("/login")
    public String generateToken(@RequestBody NetBankingLogin authRequest) throws Exception {
        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(authRequest.getUserName(), authRequest.getPassword())
            );
        } catch (Exception ex) {
            return "username not found, please register first";
        }
        return jwtUtil.generateToken(authRequest.getUserName());
    }

    
    
    @GetMapping(value = "/validate")
	public boolean getValidation(@RequestHeader("Authorization") String token){
		token = token.substring(7);
		
		if(jwtUtil.validateToken(token)) {
			
			System.out.println("Token validated");
			return true;
		}
		else {
			System.out.println("Token NOT validated");
			return false;

		}
    }

	
	@GetMapping("/get/users")
	public List<NetBankingDetails> getNetBankingUsersRequest()
	{
		return netBankingDetailsService.getAllNetBankingUsers();
	}
}


