package com.example.Tranquilo;
import org.springframework.web.bind. annotation. RequestMapping;
import org.springframework.web.bind.annotation. RestController;
import org.springframework.web.bind.annotation. PathVariable;
import org.springframework.web.bind. annotation. RequestParam;
import org.springframework.web.bind.annotation. PostMapping;

@RestController
public class TranquiloaController {

    // Conexão tipo GET HTTP
    @RequestMapping("/hello")
    public String index(){
        return "<h1>Olá mundo</h1>";
    }
    //http://localhost:8080/cadastro/bruno
    @RequestMapping("/cadastro/{nome}")
    public String dizerNome (@PathVariable String nome){
        return "Olá meu nome é " + nome ;
    }
    //http://localhost:8080/info?nome=Bruno&idade=18
    @RequestMapping("info")
    public String apresentar(@RequestParam("nome") String nome, @RequestParam("idade") int idade){
        return "<h1>Olá pessoal meu nome é " + nome + "e minha idade é " + idade + " anos</h1>";
    }

    // Conexão tipo POST HTTP
   @PostMapping("/postar")
    public String postar(){
        return "Objeto postado com sucesso";
   }

}
