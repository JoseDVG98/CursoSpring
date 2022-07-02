package co.edu.utp.isc.gia.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController//Llamar desde el navegador
@RequestMapping("hello")//La ruta principal para hallar este recurso
public class HelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);
	}

	@GetMapping("/{firstName}/{lastName}")
	public String sayHello1(@PathVariable String firstName, @PathVariable String lastName){
		return String.format("hello %s %s",firstName, lastName);
	}

	@GetMapping()//Esta hace una consulta de URL con el ?
	public String sayHello2(@RequestParam String firstName, @RequestParam String lastName){//Parametros de la peticion
		return String.format("hello %s %s",firstName, lastName);
	}

}
