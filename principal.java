import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.Random;
public class principal extends Persona{

	String[] names = {"Nemo", "Gru", "Dory", "BlancaNieves", "Aladdín", "MikeWasaousky", "Sullyvan", "DarthVader", "RalphElDemoledor", "MannyALaObra"};
	String[] listaAtributos1Fisicos = {"lenguaDeGato", "lenguaDeGato", "cabelloAfro", "cabelloAfro", "jorobaJorobada", "jorobaJorobada", "ojosSaltones", "ojosSaltones", "canasVerdes", "canasVerdes"};
	String[] listaAtributos2Adornos = {"gafas", "gafas", "perfoAesthetic", "perfoAesthetic", "bufanda", "bufanda", "pijama", "pijama", "capaDeInvisibilidad", "capaDeInvisibilidad"};
	String[] listaAtributos3Act = {"leeLibros", "leeLibros", "daClases", "daClases", "vuela", "vuela", "sabeProgramar", "sabeProgramar", "juegaPadel", "juegaPadel"};
	String[] listaAtributos4Lugar = {"viveEnTlaxcala", "viveEnTlaxcala", "viveEnNarnia", "viveEnNarnia", "viveEnWakanda", "viveEnWakanda", "viveEnHogwarts", "viveEnHogwarts", "viveEnCholula", "viveEnCholula"};
	int top = 0;
	Random generadorAleatorio = new Random();
	Scanner scan = new Scanner(System.in);
	public principal() {
		super();
	}
	
	public void cosasAleatorios(String[]names) {
		for (int i = names.length - 1; i > 0; i--) {
            int indiceAleatorio = generadorAleatorio.nextInt(i + 1);
            String temporal = names[indiceAleatorio];
            names[indiceAleatorio] = names[i];
            names[i] = temporal;
        }
	}
	
	public String pop(String[]stack, int top) {
		this.top = top;
		if(top==0) {
			System.out.println("Stack is empty");
			return (stack[top]);
		}else {
			String eliminado;
			eliminado = stack[top-1];
			top--;
			return eliminado;
		}
	}
	
	public void generarPersonajes() throws IOException {
		Persona[] individuos = new Persona[10];
		int tope = names.length;
		int numRandom = generadorAleatorio.nextInt(10);
		
		cosasAleatorios(names);
		cosasAleatorios(listaAtributos1Fisicos);
		cosasAleatorios(listaAtributos2Adornos);
		cosasAleatorios(listaAtributos3Act);
		cosasAleatorios(listaAtributos4Lugar);
		
		for(int i = 0; i < names.length; i++) {
			individuos[i] = new principal();
			individuos[i].setNombre(pop(names,tope));
			individuos[i].setAtributo1(pop(listaAtributos1Fisicos, tope));
			individuos[i].setAtributo2(pop(listaAtributos2Adornos, tope));
			individuos[i].setAtributo3(pop(listaAtributos3Act, tope));
			individuos[i].setAtributo4(pop(listaAtributos4Lugar, tope));
			tope--;
		}
		
		System.out.println("\t\t BIENVENIDO A \n\t\t ADIVINA QUIÉN \n");
		System.out.println("Para jugar, ingresa tu nombre de usuario: ");
		String usuario = scan.nextLine();
		System.out.println("\n");
		
		for(int j = 0; j < names.length; j++) {
			System.out.print(individuos[j].getNombre()+": "+ individuos[j].getAtributo1() +", " + individuos[j].getAtributo2() +", "+ individuos[j].getAtributo3() +", "+ individuos[j].getAtributo4() + "\n");
		}
	
		//System.out.println("\t\t BIENVENIDO A \n\t\t ADIVINA QUIÉN \n");
		
		
		System.out.println("Tus personajes y sus respectivos atributos son los anteriores: \n");
		System.out.print("Sus atributos están en el orden de atributosFísicos, accesorios, actividad y lugarDeVivienda");
		System.out.println("\nPIENSA DETENIDAMENTE, PORQUE SOLO ME PODRÁS HACER 3 PREGUNTAS...");
		System.out.println(individuos[numRandom].getNombre());
		for(int a = 0; a < 3; a++) {
			System.out.print("\nAsí que, ¿qué atributo quisieras evaluar?");
			System.out.print("\n1. AtributosFísicos \n2. Accesorios \n3. Actividad \n4. LugarDeVivienda");
			String str = scan.nextLine();
			int eleccion = Integer.parseInt(str);
			switch(eleccion) {
			case 1: 
				System.out.println("¿Qué característica física crees que tiene mi personaje?");
				System.out.println("1. lenguaDeGato  2. cabelloAfro  3. jorobaJorobada  4. ojosSaltones 5. canasVerdes\n");
				String fisico = scan.nextLine();
				int seleccion1 = Integer.parseInt(fisico);
				switch(seleccion1) {
				case 1:
					if ("lenguaDeGato" == individuos[numRandom].getAtributo1()) {
		        		for(int i=0;i<10;i++) {
		        			if(individuos[i].getAtributo1()==individuos[numRandom].getAtributo1()){
		        			System.out.println(individuos[i].getNombre()+": tiene "+individuos[i].getAtributo1()+" , "+individuos[i].getAtributo2()+", "+individuos[i].getAtributo3()+" , "+individuos[i].getAtributo4());
		        	        } else {
		        	        	System.out.println(individuos[i].getNombre()+"---,---- y --- ");
		        	        	}
		        	    }
		        	}else {
		        		System.out.println("El personaje no tiene ese físico, intente con otro");
		        	}
		        	break;
		        
				case 2: 
					if ("cabelloAfro" == individuos[numRandom].getAtributo1()) {
		        		for(int i=0;i<10;i++) {
		        			if(individuos[i].getAtributo1()==individuos[numRandom].getAtributo1()){
		        			System.out.println(individuos[i].getNombre()+": tiene "+individuos[i].getAtributo1()+" , "+individuos[i].getAtributo2()+", "+individuos[i].getAtributo3()+" , "+individuos[i].getAtributo4());
		        	        } else {
		        	        	System.out.println(individuos[i].getNombre()+"---,---- y --- ");
		        	        	}
		        	    }
		        	}else {
		        		System.out.println("El personaje no tiene ese físico, intente con otro"); 
		        	}
		        	break;
				case 3: 
					if ("jorobaJorobada" == individuos[numRandom].getAtributo1()) {
		        		for(int i=0;i<10;i++) {
		        			if(individuos[i].getAtributo1()==individuos[numRandom].getAtributo1()){
		        			System.out.println(individuos[i].getNombre()+": tiene "+individuos[i].getAtributo1()+" , "+individuos[i].getAtributo2()+", "+individuos[i].getAtributo3()+" , "+individuos[i].getAtributo4());
		        	        } else {
		        	        	System.out.println(individuos[i].getNombre()+"---,---- y --- ");
		        	        	}
		        	    }
		        	} else {
		        		System.out.println("El personaje no tiene ese físico, intente con otro");
		        	}
		        	break;
				case 4: 
					if ("ojosSaltones" == individuos[numRandom].getAtributo1()) {
		        		for(int i=0;i<10;i++) {
		        			if(individuos[i].getAtributo1()==individuos[numRandom].getAtributo1()){
		        			System.out.println(individuos[i].getNombre()+": tiene "+individuos[i].getAtributo1()+" , "+individuos[i].getAtributo2()+", "+individuos[i].getAtributo3()+" , "+individuos[i].getAtributo4());
		        	        } else {
		        	        	System.out.println(individuos[i].getNombre()+"---,---- y --- ");
		        	        	}
		        	    }
		        	} else {
		        		System.out.println("El personaje no tiene ese físico, intente con otro");
		        	}
		        	break;
				case 5: 
					if ("canasVerdes" == individuos[numRandom].getAtributo1()) {
		        		for(int i=0;i<10;i++) {
		        			if(individuos[i].getAtributo1()==individuos[numRandom].getAtributo1()){
		        			System.out.println(individuos[i].getNombre()+": tiene "+individuos[i].getAtributo1()+" , "+individuos[i].getAtributo2()+", "+individuos[i].getAtributo3()+" , "+individuos[i].getAtributo4());
		        	        } else {
		        	        	System.out.println(individuos[i].getNombre()+"---,---- y --- ");
		        	        	}
		        	    }
		        	} else {
		        		System.out.println("El personaje no tiene ese físico, intente con otro");
		        	}
		        	break;
				}
				break;
			case 2:
				System.out.println("¿Qué accesorio crees que tiene mi personaje?");
				System.out.println("1. gafas  2. perfoAesthetic  3. bufanda  4. pijama  5. capaDeInvisibilidad");
				String accesorio = scan.nextLine();
				int seleccion2 = Integer.parseInt(accesorio);
				switch(seleccion2) {
				case 1: 
					for(int i=0;i<10;i++) {
	            		String prenda = individuos[i].getAtributo2();
	            		if (prenda == "gafas") {
	            			System.out.println(individuos[i].getNombre()+": tiene "+individuos[i].getAtributo1()+" , "+individuos[i].getAtributo2()+", "+individuos[i].getAtributo3()+" , "+individuos[i].getAtributo4());
	            	    } else {
	            	    	System.out.println(individuos[i].getNombre()+"---,---- y --- ");	
	            	    }
	            	}
					break;
				case 2: 
					for(int i=0;i<10;i++) {
	            		String prenda = individuos[i].getAtributo2();
	            		if (prenda == "perfoAesthetic") {
	            			System.out.println(individuos[i].getNombre()+": tiene "+individuos[i].getAtributo1()+" , "+individuos[i].getAtributo2()+", "+individuos[i].getAtributo3()+" , "+individuos[i].getAtributo4());
	            	    } else {
	            	    	System.out.println(individuos[i].getNombre()+"---,---- y --- ");	
	            	    }
					}
					break;
				case 3: 
					for(int i=0;i<10;i++) {
	            		String prenda = individuos[i].getAtributo2();
	            		if (prenda == "bufanda") {
	            			System.out.println(individuos[i].getNombre()+": tiene "+individuos[i].getAtributo1()+" y "+individuos[i].getAtributo2()+", "+individuos[i].getAtributo3()+" y es "+individuos[i].getAtributo4());
	            	    } else {
	            	    	System.out.println(individuos[i].getNombre()+"---,---- y --- ");	
	            	    }
					}
					break;
				case 4:
					for(int i=0;i<10;i++) {
	            		String prenda = individuos[i].getAtributo2();
	            		if (prenda == "pijama") {
	            			System.out.println(individuos[i].getNombre()+": tiene "+individuos[i].getAtributo1()+" , "+individuos[i].getAtributo2()+", "+individuos[i].getAtributo3()+" , "+individuos[i].getAtributo4());
	            	    } else {
	            	    	System.out.println(individuos[i].getNombre()+"---,---- y --- ");	
	            	    }
					}
					break;
				case 5:
					for(int i=0;i<10;i++) {
	            		String prenda = individuos[i].getAtributo2();
	            		if (prenda == "capaDeInvisibilidad") {
	            			System.out.println(individuos[i].getNombre()+": tiene "+individuos[i].getAtributo1()+" , "+individuos[i].getAtributo2()+", "+individuos[i].getAtributo3()+" , "+individuos[i].getAtributo4());
	            	    } else {
	            	    	System.out.println(individuos[i].getNombre()+"---,---- y --- ");	
	            	    }
					}
					break;
				}
				break;
			case 3: 
				System.out.println("¿Qué hace mi personaje?");
				System.out.println("1. leeLibros  2. daClases  3. vuela  4. sabeProgramar  5. juegaPadel");
				String actividad = scan.nextLine();
				int seleccion3 = Integer.parseInt(actividad);
				switch(seleccion3) {
				case 1: 
					for(int i=0;i<10;i++) {
	            		String act = individuos[i].getAtributo3();
	            		if (act == "leeLibros") {
	            			System.out.println(individuos[i].getNombre()+": tiene "+individuos[i].getAtributo1()+" , "+individuos[i].getAtributo2()+", "+individuos[i].getAtributo3()+" , "+individuos[i].getAtributo4());
	            	    } else {
	            	    	System.out.println(individuos[i].getNombre()+"---,---- y --- ");	
	            	    }
					}
					break;
				case 2: 
					for(int i=0;i<10;i++) {
	            		String act = individuos[i].getAtributo3();
	            		if (act == "daClases") {
	            			System.out.println(individuos[i].getNombre()+": tiene "+individuos[i].getAtributo1()+" , "+individuos[i].getAtributo2()+", "+individuos[i].getAtributo3()+" , "+individuos[i].getAtributo4());
	            	    } else {
	            	    	System.out.println(individuos[i].getNombre()+"---,---- y --- ");	
	            	    }
					}
					break;
				case 3: 
					for(int i=0;i<10;i++) {
	        		  String act = individuos[i].getAtributo3();
	        		  if (act == "vuela") {
	        			 System.out.println(individuos[i].getNombre()+": tiene "+individuos[i].getAtributo1()+" , "+individuos[i].getAtributo2()+", "+individuos[i].getAtributo3()+" , "+individuos[i].getAtributo4());
	        	      } else {
	        	    	 System.out.println(individuos[i].getNombre()+"---,---- y --- ");	
	        	      }
				    } 
				   break;
				case 4:
					for(int i=0;i<10;i++) {
	            		String act = individuos[i].getAtributo3();
	            		if (act == "sabeProgramar") {
	            			System.out.println(individuos[i].getNombre()+": tiene "+individuos[i].getAtributo1()+" , "+individuos[i].getAtributo2()+", "+individuos[i].getAtributo3()+" , "+individuos[i].getAtributo4());
	            	    } else {
	            	    	System.out.println(individuos[i].getNombre()+"---,---- y --- ");	
	            	    }
					}
					break;
				case 5: 
					for(int i=0;i<10;i++) {
	            		String act = individuos[i].getAtributo3();
	            		if (act == "juegaPadel") {
	            			System.out.println(individuos[i].getNombre()+": tiene "+individuos[i].getAtributo1()+" , "+individuos[i].getAtributo2()+", "+individuos[i].getAtributo3()+" , "+individuos[i].getAtributo4());
	            	    } else {
	            	    	System.out.println(individuos[i].getNombre()+"---,---- y --- ");	
	            	    }
					}
					break;
				}
				break;
			case 4:
				System.out.println("¿Dónde vive mi personaje?");
				System.out.println("1. viveEnTlaxcala  2. viveEnNarnia  3. viveEnWakanda  4. viveEnHogwarts  5. viveEnCholula");
				String vive = scan.nextLine();
				int seleccion4 = Integer.parseInt(vive);
				switch(seleccion4) {
				case 1: 
					for(int i=0;i<10;i++) {
	            		String act = individuos[i].getAtributo4();
	            		if (act == "viveEnTlaxcala") {
	            			System.out.println(individuos[i].getNombre()+": tiene "+individuos[i].getAtributo1()+" , "+individuos[i].getAtributo2()+", "+individuos[i].getAtributo3()+" , "+individuos[i].getAtributo4());
	            	    } else {
	            	    	System.out.println(individuos[i].getNombre()+"---,---- y --- ");	
	            	    }
					}
					break;
				case 2: 
					for(int i=0;i<10;i++) {
	            		String act = individuos[i].getAtributo4();
	            		if (act == "viveEnNarnia") {
	            			System.out.println(individuos[i].getNombre()+": tiene "+individuos[i].getAtributo1()+" , "+individuos[i].getAtributo2()+", "+individuos[i].getAtributo3()+" , "+individuos[i].getAtributo4());
	            	    } else {
	            	    	System.out.println(individuos[i].getNombre()+"---,---- y --- ");	
	            	    }
					}
					break;
				case 3: 
					for(int i=0;i<10;i++) {
	            		String act = individuos[i].getAtributo4();
	            		if (act == "viveEnWakanda") {
	            			System.out.println(individuos[i].getNombre()+": tiene "+individuos[i].getAtributo1()+" , "+individuos[i].getAtributo2()+", "+individuos[i].getAtributo3()+" , "+individuos[i].getAtributo4());
	            	    } else {
	            	    	System.out.println(individuos[i].getNombre()+"---,---- y --- ");	
	            	    }
					}
					break;
				case 4:
					for(int i=0;i<10;i++) {
	            		String act = individuos[i].getAtributo4();
	            		if (act == "viveEnHogwarts") {
	            			System.out.println(individuos[i].getNombre()+": tiene "+individuos[i].getAtributo1()+" , "+individuos[i].getAtributo2()+", "+individuos[i].getAtributo3()+" , "+individuos[i].getAtributo4());
	            	    } else {
	            	    	System.out.println(individuos[i].getNombre()+"---,---- y --- ");	
	            	    }
					}
					break;
				case 5:
					for(int i=0;i<10;i++) {
	            		String act = individuos[i].getAtributo4();
	            		if (act == "viveEnCholula") {
	            			System.out.println(individuos[i].getNombre()+": tiene "+individuos[i].getAtributo1()+" , "+individuos[i].getAtributo2()+", "+individuos[i].getAtributo3()+" , "+individuos[i].getAtributo4());
	            	    } else {
	            	    	System.out.println(individuos[i].getNombre()+"---,---- y --- ");	
	            	    }
					}
					break;
				}
				break;
				
				default:
					System.out.println("Opción inválida...");
					break;
		}
	}
		System.out.println("\n¿Ahora lo sabes? Adivina el nombre de mi personaje y escribe el número a continuación...");
		String choice = scan.nextLine();
		int decision = Integer.parseInt(choice);
		int games = 0;
		int wins = 0;
		int losses = 0;
		if(decision == numRandom) {
			System.out.println("FELICIDADES, en efecto "+individuos[numRandom].getNombre()+" era mi personaje");
			System.out.println("Gracias por jugar conmigo <3");
			games++;
			wins++;
			losses = losses;
		} else {
			System.out.println("LO SIENTO MUCHO, mi personaje era "+ individuos[numRandom].getNombre() +", pero fue un buen intento");
			System.out.println("Gracias por jugar conmigo <3");
			games++;
			losses++;
			wins = wins;
		}
		PruebaFile docs = new PruebaFile(usuario, wins, losses, games);
		docs.crear();
   }
}