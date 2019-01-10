package com.framgia.controller.admins;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.framgia.controller.BaseController;

@Controller
public class ProductsController extends BaseController {

	/*
	 * @RequestMapping(value = "/", method = RequestMethod.GET, produces =
	 * "application/json;charset=utf-8")
	 * 
	 * @ResponseBody public List<ProductInfo>
	 * showProducts(@RequestParam("pageStart") int pageStart) { return
	 * productService.getProducts(pageStart); }
	 */
	
	// show information of product by single.jsp
	@GetMapping(value = "/products/{productId}")
	public String showSingleProduct(@PathVariable("productId") Integer productId, Model model) {
		model.addAttribute("categories", categoryService.getAll());
		model.addAttribute("product", productService.findById(productId));
		return "client-single-product";
	}
}