package com.springmvc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.springmvc.domain.Product;
import com.springmvc.form.ProductForm;
import com.springmvc.service.ProductService;
import com.sun.xml.internal.bind.v2.model.core.ID;

@Controller
//@RequestMapping("/springmvc")
public class ProductController {
	private static final Logger logger = Logger.getLogger(ProductController.class);

	// �Զ�ע���������ݿ�д���ݵ����
	@Autowired
	private ProductService productService;
	//���
	@RequestMapping(value = "/product_input")
	public String inputProduct() {
		logger.info("inputProduct �����ã�");
		return "ProductForm";
	}
	//�޸�
	@RequestMapping(value = "/product_modiform") 
	public String modifyProduct(@RequestParam Long id, Model model) {
		// ʹ��@requestparam ��ȡurl·���ϣ�����Ĳ�������serlet����ʹ��Request�����getParameter()����
		List<Product> pList= productService.show();
		int Id=Integer.valueOf(id-1+"");
		Product product =pList.get(Id);
		model.addAttribute("product", product);
		return "ProductModify";
	}
	@RequestMapping(value = "/product_modify", method = RequestMethod.POST) 
	public String modProduct(@RequestParam Integer id ,ProductForm productForm,HttpServletRequest request) {
		Product product = new Product();
		product.setId(id);
		product.setName(productForm.getName());
		product.setDescription(productForm.getDescription());
		
		try {
			product.setPrice(Double.parseDouble(productForm.getPrice()));
		} catch (Exception e) {
			e.printStackTrace();
		}
		product.setColor(productForm.getColor());
		product.setNumber(productForm.getNumber());
		List<Product> pList= productService.modify(id,product);
		request.setAttribute("pList", pList);
		return "redirect:/product_list.action";
	}
	
	@RequestMapping(value = "/product_save", method = RequestMethod.POST)
	public String saveProduct(ProductForm productForm, RedirectAttributes redirectAttributes) {
		logger.info("saveProduct �����ã�");

		Product product = new Product();
		product.setName(productForm.getName());
		product.setDescription(productForm.getDescription());

		try {
			product.setPrice(Double.parseDouble(productForm.getPrice()));
		} catch (Exception e) {
			e.printStackTrace();
		}
		product.setColor(productForm.getColor());
		product.setNumber(productForm.getNumber());
		// add product
		Product saveProduct = productService.add(product);
		// ʹ������Ķ��󣬿��Ը��ض���ֵ��
		redirectAttributes.addFlashAttribute("message", "The product was successfully added!");
		return "redirect:/product_view/" + saveProduct.getId() + ".action";
	}

	// http://localhost:8080/SpringMvc4.3-Start-self/product_view/2.action
	@RequestMapping(value = "/product_view/{id}") // {}��idΪ·������
	public String viewProduct(@PathVariable Long id, Model model) {
		Product product = productService.get(id);
		model.addAttribute("product", product);
		return "ProductView";
	}

	// http://localhost:8080/SpringMvc4.3-Start-self/product_retrieve.action?id=1
	@RequestMapping(value = "/product_retrieve") 
	public String sendProduct(@RequestParam Long id, Model model) {
		// ʹ��@requestparam ��ȡurl·���ϣ�����Ĳ�������serlet����ʹ��Request�����getParameter()����
		Product product = productService.get(id);
		model.addAttribute("product", product);
		return "ProductView";
	}
	//��ʾ��Ʒlist
	@RequestMapping(value = "/product_list") 
	public String showProduct(HttpServletRequest request) {
		List<Product> pList= productService.show();
		request.setAttribute("pList", pList);
	/*	ModelAndView mView=new ModelAndView("ProductList");
		mView.addObject(pList);*/
		return "ProductList";
	}
	//ɾ����Ʒ
	@RequestMapping(value = "/product_del") 
	public String delProduct(@RequestParam Integer id ,HttpServletRequest request) {
		List<Product> pList= productService.delete(id);
		request.setAttribute("pList", pList);
		return "ProductList";
	}
	
}
