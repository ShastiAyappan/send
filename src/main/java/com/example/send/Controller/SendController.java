package com.example.send.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.send.Pojo.SendPojo;

@RestController
public class SendController {
@RequestMapping(value="/")
	public SendPojo send() {
		SendPojo sendPojo = new SendPojo();
		sendPojo.setId(1);
		sendPojo.setName("Mano");
		return sendPojo;
}
}
