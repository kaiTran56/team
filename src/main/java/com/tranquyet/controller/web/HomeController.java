package com.tranquyet.controller.web;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.tranquyet.dto.CategoryDTO;
import com.tranquyet.dto.NewDTO;
import com.tranquyet.dto.UserDTO;
import com.tranquyet.dto.UserNewDTO;
import com.tranquyet.service.CategoryService;
import com.tranquyet.service.NewService;
import com.tranquyet.service.UserNewService;
import com.tranquyet.service.UserService;

@Controller
@RequestMapping(value = "/home")
public class HomeController {

	@Autowired
	private NewService newService;

	@Autowired
	private UserService userService;

	@Autowired
	private UserNewService userNewService;

	@Autowired
	private CategoryService categoryService;

	@ModelAttribute("roles")
	private Map<String, String> getMap() {
		Map<String, String> roleMap = new HashMap<>();
		roleMap.put("Male", "DBA");
		roleMap.put("Female", "Female");

		return roleMap;
	}

	@GetMapping("/add")
	public ModelAndView goHome(@ModelAttribute("newUser") UserDTO user, Model model) {
		ModelAndView mav = new ModelAndView("home");

		CategoryDTO cate = new CategoryDTO();
		cate.setName("CheckStatus");
		categoryService.save(cate);

		// User 0
		UserDTO newUser = new UserDTO();
		newUser.setName("TranXuanQuyet");
		newUser.setAddress("Hanoi, Vietnam");
		userService.save(newUser);

		// User 1
		UserDTO newUser_1 = new UserDTO();
		newUser_1.setName("Quyet");
		newUser_1.setAddress("Vietnam");
		userService.save(newUser_1);

		// New 0
		NewDTO newDTO = new NewDTO();
		newDTO.setContent("Hello world");
		newDTO.setCategoryCode("checkStatus");
		newService.save(newDTO);

		// New 1
		NewDTO newDTO_1 = new NewDTO();
		newDTO_1.setContent("Hello world");
		newDTO_1.setCategoryCode("checkStatus");
		newService.save(newDTO_1);

		// linking entity 0
		UserNewDTO userNewDTO = new UserNewDTO();
		userNewDTO.setStatus("Successfull");
		userNewDTO.setUser(newUser);
		userNewDTO.setNews(newDTO);
		userNewService.save(userNewDTO);

		// Linking entity 1
		UserNewDTO userNewDTO_1 = new UserNewDTO();
		userNewDTO_1.setStatus("Successfull");
		userNewDTO_1.setUser(newUser_1);
		userNewDTO_1.setNews(newDTO);
		userNewService.save(userNewDTO_1);

		return mav;
	}

	@PostMapping("/add")
	public ModelAndView saveUser(@Valid @ModelAttribute("newUser") UserDTO user, BindingResult result,
			RedirectAttributes redirectAttributes) {
		ModelAndView mav = new ModelAndView("redirect:/home/results");

		if (result.hasErrors()) {
			mav.setViewName("home");
		}

		redirectAttributes.addFlashAttribute("savedUser", user);
		return mav;
	}

	@GetMapping("/results")
	public ModelAndView success() {

		newService.findById(1L);

		ModelAndView mav = new ModelAndView("result");

		return mav;
	}

}