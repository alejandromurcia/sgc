package com.uniandes.sgc.controllers;

import com.fasterxml.jackson.core.JsonParseException;
import com.uniandes.sgc.models.Sismo;
import com.uniandes.sgc.services.SismoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;

/**
 * This controller provides the access for the receiver end point
 *
 */
@Controller
@EnableAutoConfiguration
public class SismoController {


	@Autowired
	private SismoService sismoService;
		
	/**
	 *
	 * @throws IOException
	 * @throws JsonParseException
	 */
    @RequestMapping(value = "/sismo", method = RequestMethod.POST)
    @ResponseBody
    String encode(@RequestBody Sismo sismo)  {

		sismoService.saveSismo(sismo);
    	return "Sismo registrado magnitud:"+sismo.getMagnitud()+" latitud: "+sismo.getLatitud()+" longitud: "+ sismo.getLongitud();
    }
}