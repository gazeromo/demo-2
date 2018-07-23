package com.example.demo;

import com.example.demo.model.User;

import com.kloudless.KClient;
import com.kloudless.Kloudless;
import com.kloudless.exception.*;
import com.kloudless.model.File;
import com.kloudless.model.Folder;
import com.kloudless.net.KloudlessResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;

@Controller
public class CloudController {

	static KClient storageClient = null;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {
		System.out.println("Hello");
		return "index";
	}

	@RequestMapping(value = "/addService", method = RequestMethod.POST)
	@ResponseBody
	public User addService(@RequestBody User user) throws KloudlessException {
		Kloudless.apiKey = "MFGI0NG60W7up7B43V1PoosNIs1lSLyRF9AbC4VrWiqfA4Ai";
		storageClient = new KClient(user.getAccessToken(), String.valueOf(user.getAccount().getId()), null);

		HashMap<String, Object> folderParams = new HashMap<>();
		folderParams.put("parent_id", "root");
		folderParams.put("name", "test.png");
		folderParams.put("account", String.valueOf(user.getAccount().getId()));
		folderParams.put("overwrite", "true");
		//Folder folder = storageClient.create(null, Folder.class, folderParams);
		File.copy("Fx1x5Lp5yXn_1hwKOxV0MLOqQf4rY7IR7WVD_83TTWSA=", "307048960", folderParams);
		return user;
	}
}
