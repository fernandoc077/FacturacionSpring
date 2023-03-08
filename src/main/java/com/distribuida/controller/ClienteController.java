package com.distribuida.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.distribuida.entities.Cliente;
import com.distribuida.service.ClienteService;

@Controller
@RequestMapping("/clientes")
public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;
	
	@RequestMapping("/listadoClientes")
	public String frmClientes(Model model) {
		List<Cliente> clientes = clienteService.findAll();
		model.addAttribute("keyClientes",clientes);
		return "clientes";
	}
	@RequestMapping("/addForm")
	public String frmRegistroCliente(Model model) {
		Cliente cliente = new Cliente();
		model.addAttribute("clienteBind",cliente);
	    return "registroCliente";
	}
	@PostMapping("/add")
	public String add(@ModelAttribute("clienteBind") Cliente cliente,BindingResult bindingResult) {
		 if (bindingResult.hasErrors()) {
			 return "registroCliente";
		 }else {
			 clienteService.add(cliente);
			 return "redirect:/clientes/listadoClientes";
		 }
	}
	@GetMapping("/findOne")
	public String findOne(@RequestParam("id_cliente")int id,@RequestParam("opcion")int opcion, Model model) {
		Cliente cliente=clienteService.findOne(id);
		model.addAttribute("clienteBind", cliente);
		if( opcion == 0 ) {
			return "registroCliente";
		}else {
			return "EliminarClientes";
		}
	}
	@GetMapping("/del")
	public String del(@ModelAttribute("clienteBind")Cliente cliente) {
		clienteService.del(cliente.getId_cliente());
		return "redirect:/clientes/listadoClientes";
	}
	@InitBinder
	public void miBinder(WebDataBinder binder) {
		StringTrimmerEditor trimmerEditor = new StringTrimmerEditor(true);
		binder.registerCustomEditor(String.class,trimmerEditor);
	}
	
}
