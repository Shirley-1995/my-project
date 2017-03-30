 package com.shopping.controller;

          
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;;

@Controller
public class HelloWorldController {
	

 @RequestMapping("/")


	public ModelAndView helloWorld(){

 
 return new ModelAndView("welcome");
	}
		
 @RequestMapping("/login")
public ModelAndView login(){
			return new ModelAndView("login");
		}
  
 @RequestMapping("/signup")
public ModelAndView signup(){
	 return new ModelAndView("signup");
 }
 
  @RequestMapping("/tops")
public ModelAndView tops(){
	  return new ModelAndView("tops");
  }
  
  @RequestMapping("/shirts")
public ModelAndView shirts(){
	  return new ModelAndView("shirts");
  }
  
  @RequestMapping("/tshirts")
public ModelAndView tshirts(){
	  return new ModelAndView("tshirts");
  }
  
  @RequestMapping("/skirts")
  public ModelAndView skirts(){
  	  return new ModelAndView("skirts");
  }
  
  @RequestMapping("/palazzos")
  public ModelAndView palazzos(){
  	  return new ModelAndView("palazzos");
  }
  
  @RequestMapping("/croptops")
  public ModelAndView croptops(){
  	  return new ModelAndView("croptops");
  }
  
  @RequestMapping("/jeans")
  public ModelAndView jeans(){
  	  return new ModelAndView("jeans");
  }
  
  @RequestMapping("/trousers")
  public ModelAndView trousers(){
  	  return new ModelAndView("trousers");
  }
  
  @RequestMapping("/patialas")
  public ModelAndView patialas(){
  	  return new ModelAndView("patialas");
  }
  
  @RequestMapping("/shrugs")
  public ModelAndView shrugs(){
  	  return new ModelAndView("shrugs");
  }
  
  @RequestMapping("/jumpsuits")
  public ModelAndView jumpsuits(){
  	  return new ModelAndView("jumpsuits");
  }
  
  @RequestMapping("/kurtis")
  public ModelAndView kurtis(){
  	  return new ModelAndView("kurtis");
  }
  @RequestMapping("/salwarkameez")
  public ModelAndView salwarkameez(){
  	  return new ModelAndView("salwarkameez");
  }
  
  @RequestMapping("/leggings")
  public ModelAndView leggings(){
  	  return new ModelAndView("leggings");
  }
  
  @RequestMapping("/lehangas")
  public ModelAndView lehangas(){
  	  return new ModelAndView("lehangas");
  }
  
  @RequestMapping("/blouses")
  public ModelAndView blouses(){
  	  return new ModelAndView("blouses");
  }
  
  @RequestMapping("/partysarees")
  public ModelAndView partysarees(){
  	  return new ModelAndView("partysarees");
  }
  
  @RequestMapping("/weddingsarees")
  public ModelAndView weddingsarees(){
  	  return new ModelAndView("weddingsarees");
  }
  
  @RequestMapping("/casualsarees")
  public ModelAndView casualsarees(){
  	  return new ModelAndView("casualsarees");
  }
  
  @RequestMapping("/cottonsarees")
  public ModelAndView cottonsarees(){
  	  return new ModelAndView("cottonsarees");
  }
  
  @RequestMapping("/sweaters")
  public ModelAndView sweaters(){
  	  return new ModelAndView("sweaters");
  }
  
  @RequestMapping("/windcheaters")
  public ModelAndView windcheaters(){
  	  return new ModelAndView("windcheaters");
  }
  
  @RequestMapping("/sweatshirts")
  public ModelAndView sweatshirts(){
  	  return new ModelAndView("sweatshirts");
  }
  
  @RequestMapping("/jerkins")
  public ModelAndView jerkins(){
  	  return new ModelAndView("jerkins");
  }
  
  @RequestMapping("/gloves")
  public ModelAndView gloves(){
  	  return new ModelAndView("gloves");
  }
  
  @RequestMapping("/shawls")
  public ModelAndView shawls(){
  	  return new ModelAndView("shawls");
  }
  
  @RequestMapping("/boxers")
  public ModelAndView boxers(){
  	  return new ModelAndView("boxers");
  }
  
  @RequestMapping("/bras")
  public ModelAndView bras(){
  	  return new ModelAndView("bras");
  }
  
  @RequestMapping("/nightdresses")
  public ModelAndView nightdresses(){
  	  return new ModelAndView("nightdresses");
  }
  
  @RequestMapping("/nighties")
  public ModelAndView nighties(){
  	  return new ModelAndView("nighties");
  }
  
  @RequestMapping("/slips")
  public ModelAndView slips(){
  	  return new ModelAndView("slips");
  }
  
  @RequestMapping("/flats")
  public ModelAndView flats(){
  	  return new ModelAndView("flats");
  }
  
  @RequestMapping("/heels")
  public ModelAndView heels(){
  	  return new ModelAndView("heels"); 
  }
  
  @RequestMapping("/ballerinas")
  public ModelAndView ballerinas(){
  	  return new ModelAndView("ballerinas"); 
  }
  
  @RequestMapping("/casualshoes")
  public ModelAndView casualshoes(){
  	  return new ModelAndView("casualshoes"); 
  }
  
  @RequestMapping("/pyjamas")
  public ModelAndView pyjamas(){
  	  return new ModelAndView("pyjamas"); 
  }
  
  @RequestMapping("/ethnicslippers")
  public ModelAndView ethnicslippers(){
  	  return new ModelAndView("ethnicslippers"); 
  }
  
  @RequestMapping("/slippersandflipflops")
  public ModelAndView slippersandflipflops(){
  	  return new ModelAndView("slippersandflipflops"); 
  }
  
  @RequestMapping("/trackpants")
  public ModelAndView trackpants(){
  	  return new ModelAndView("trackpants"); 
  }
  
  @RequestMapping("/tracksuits")
  public ModelAndView tracksuits(){
  	  return new ModelAndView("tracksuits"); 
  }
  
  @RequestMapping("/caps")
  public ModelAndView caps(){
  	  return new ModelAndView("caps"); 
  }
  
  @RequestMapping("/swimsuits")
  public ModelAndView swimsuits(){
  	  return new ModelAndView("swimsuits"); 
  }
  
  @RequestMapping("/socks")
  public ModelAndView socks(){
  	  return new ModelAndView("socks"); 
  }
  
  @RequestMapping("/sportsbras")
  public ModelAndView sportsbras(){
  	  return new ModelAndView("sportsbras"); 
  }
  
  @RequestMapping("/stonewatches")
  public ModelAndView stonewatches(){
  	  return new ModelAndView("stonewatches"); 
  }
  
  @RequestMapping("/leatherwatches")
  public ModelAndView leatherwatches(){
  	  return new ModelAndView("leatherwatches"); 
  }
  
  @RequestMapping("/goldplatedwatches")
  public ModelAndView goldplatedwatches(){
  	  return new ModelAndView("goldplatedwatches"); 
  }
  
  @RequestMapping("/haircurlers")
  public ModelAndView haircurlers(){
  	  return new ModelAndView("haircurlers"); 
  }
  
  @RequestMapping("/hairstraightners")
  public ModelAndView hairstraightners(){
  	  return new ModelAndView("hairstraightners"); 
  }
  
  @RequestMapping("/hairdryers")
  public ModelAndView hairdryers(){
  	  return new ModelAndView("hairdryers"); 
  }
  
  @RequestMapping("/shavingandhairremoval")
  public ModelAndView shavingandhairremoval(){
  	  return new ModelAndView("shavingandhairremoval"); 
  }
  
  @RequestMapping("/makeup")
  public ModelAndView makeup(){
  	  return new ModelAndView("makeup"); 
  }
  
  @RequestMapping("/bodywash")
  public ModelAndView bodywash(){
  	  return new ModelAndView("bodywash"); 
  }
  
  @RequestMapping("/fragrances")
  public ModelAndView fragrances(){
  	  return new ModelAndView("fragrances"); 
  }
  }


