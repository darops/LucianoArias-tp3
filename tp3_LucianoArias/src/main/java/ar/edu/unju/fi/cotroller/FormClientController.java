package ar.edu.unju.fi.cotroller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class FormClientController {
	@GetMapping({"/formulario"})
	public String getFormCliente() {
		return "formCliente";
	}
}