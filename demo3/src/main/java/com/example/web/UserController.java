package com.example.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.persistence.UserMapper;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired private UserMapper userMapper;
//	@Autowired private UserService userService;
	
	@RequestMapping("/list")
	public void getList(Model model) {
		
		model.addAttribute("list", this.userMapper.findAll() );
//		model.addAttribute("list", this.userService.findAll() );
	}
}
