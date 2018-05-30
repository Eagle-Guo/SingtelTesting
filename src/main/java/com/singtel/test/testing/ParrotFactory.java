package com.singtel.test.testing;

public class ParrotFactory {
	
	static Parrot parrot;
	static String sing;

	Parrot getParrot(String type) {
	      if(type == null){
	         return null;
	      }        
	      if(type.equalsIgnoreCase("dog")){
	         return new ParrotLikeDog();
	      } else if(type.equalsIgnoreCase("cat")){
	         return new ParrotLikeCat();
	      } else if(type.equalsIgnoreCase("rooster")){
	         return new ParrotLikeRooster();
	      }
	      return null;
	   }
	
}
