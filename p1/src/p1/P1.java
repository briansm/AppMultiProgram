package p1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P1 {
	
static void Ej1(){
	 for(int i=0;i<=9;i++){
			
			if( i%2==1){
				for(int k=10;k>=i;k--){
			
			if(k%2==1){
			          System.out.print( " " ); 
			   } 
			     }
			for(int j=0;j<i;j++){
				System.out.print( "*" ); 
			} 
			        System.out.println( );
			}
				} 
			
			for(int i=9;i>1;i--)
			{
			if((i%2)==1)
			{
			for(int k=i;k<=11;k++)
			{
			if((k%2)==1)
			{
			System.out.print( " " ); 
			} 
			}
			for(int j=i-2;j>0;j--)
			{
			System.out.print( "*" ); 
			} 
			System.out.println( ); 
			} 
			}
			System.out.println("----------------------------------------------");
			System.out.println("----------------------------------------------");
}
	static void Ej2(){
		int n[]=new int[7];
		int sum=0;
		System.out.println("Notas Sobre 100 pts");
		System.out.println("----------------------------------------------");
		for(int i=1;i<n.length;i++){
		System.out.println("Ingrese nota"+i);
		       Scanner s=new Scanner(System.in);
		       int nota=s.nextInt();
		       n[i]=nota;
		}
		for(int i=1;i<n.length;i++){
		    sum+=n[i];
		    }

		System.out.println("----------------------------------------------");
		    System.out.println("La media de las notas es: "+(sum/6));
		   System.out.println("---------------------------------------------");
		System.out.println("Pts     Notas");
		if(n[1]<=59){   
		System.out.println("E         "+n[1]);
		    }else if(n[1]>=60 && n[1]<70){
		System.out.println("D         "+n[1]);
		}    else if(n[1]>=70 && n[1]<80){
		System.out.println("C         "+n[1]);
		}    else if(n[1]>=80 && n[1]<90){
		System.out.println("B         "+n[1]);
		}else if(n[1]>=90 && n[1]<=100){
		System.out.println("A         "+n[1]);
		    }
		    
		    if(n[2]<=59){   
		System.out.println("E         "+n[2]);
		    }else if(n[2]>=60 && n[2]<70){
		System.out.println("D         "+n[2]);
		}    else if(n[2]>=70 && n[2]<80){
		System.out.println("C         "+n[2]);
		}    else if(n[2]>=80 && n[2]<90){
		System.out.println("B         "+n[2]);
		} else if(n[2]>=90 && n[2]<=100){
		System.out.println("A         "+n[2]);
		}
		    
		        if(n[3]<=59){   
		System.out.println("E         "+n[3]);
		    }else if(n[3]<70){
		System.out.println("D         "+n[3]);
		}    else if(n[3]>=70 && n[3]<80){
		System.out.println("C         "+n[3]);
		}    else if(n[3]>=80 && n[3]<90){
		System.out.println("B         "+n[3]);
		} else if(n[3]>=90 && n[3]<=100){
		System.out.println("A         "+n[3]);
		}
		        
		            if(n[4]<=59){   
		System.out.println("E         "+n[4]);
		    }else if(n[4]>=60 && n[4]<70){
		System.out.println("D         "+n[4]);
		}    else if(n[4]>=70 && n[4]<80){
		System.out.println("C         "+n[4]);
		}    else if(n[4]>=80 && n[4]<90){
		System.out.println("B         "+n[4]);
		} else if(n[4]>=90 && n[4]<=100){
		System.out.println("A         "+n[4]);
		}
		                if(n[5]<=59){   
		System.out.println("E         "+n[5]);
		    }else if(n[5]>=60 && n[5]<70){
		System.out.println("D         "+n[5]);
		}    else if(n[5]>=70 && n[5]<80){
		System.out.println("C         "+n[5]);
		}    else if(n[5]>=80 && n[5]<90){
		System.out.println("B         "+n[5]);
		} else if(n[5]>=90 && n[5]<=100){
		System.out.println("A         "+n[5]);
		}
		                    if(n[6]<=59){   
		System.out.println("E         "+n[6]);
		    }else if(n[6]>=60 && n[6]<70){
		System.out.println("D         "+n[6]);
		}    else if(n[6]>=70 && n[6]<80){
		System.out.println("C         "+n[6]);
		}    else if(n[6]>=80 && n[6]<90){
		System.out.println("B         "+n[6]);
		} else if(n[6]>=90 && n[6]<=100) {
		System.out.println("A         "+n[6]);
		}
		                    System.out.println("----------------------------------------------");
		                    System.out.println("----------------------------------------------");
	}
	static void Ej3(){
		 int h=0; int min=0;
         Scanner s=new Scanner(System.in);
         System.out.print("HORA: ");
         h=s.nextInt();
         System.out.print("MINUTOS: ");
         min=s.nextInt();
        
         System.out.print("LA HORA ES: ");
         if(h>0 && h<12){
             System.out.println(h+":"+min+" AM");
             
                 }else{
             System.out.println(h+":"+min+" PM");
         } 
             if(h==13){
             System.out.println(01+":"+min+" PM");
         }else if(h==14){
         System.out.println(02+":"+min+" PM");
         
         }else if(h==15){
         System.out.println(03+":"+min+" PM");
         }else if(h==16){
         System.out.println(04+":"+min+" PM");
         }else if(h==17){
         System.out.println(05+":"+min+" PM");
         }else if(h==18){
         System.out.println(06+":"+min+" PM");
         }else if(h==19){
         System.out.println(07+":"+min+" PM");
         }else if(h==20){
         System.out.println("0"+8+":"+min+" PM");
         }else if(h==21){
         System.out.println("0"+9+":"+min+" PM");
         }else if(h==22){
         System.out.println("10"+":"+min+" PM");
         }else if(h==23){
         System.out.println("11"+":"+min+" PM");
         }else if(h==24){
         System.out.println("12"+9+":"+min+" AM");
         }
   
		 System.out.println("----------------------------------------------");
	       System.out.println("----------------------------------------------");	
	}
	static void Ej4(){
		DecimalFormat decimales = new DecimalFormat("0.00");
		 Scanner s=new Scanner(System.in); 
		String op;
	       System.out.println("Que figura quiere trabajar:");
	       System.out.println("1.Circulo(C)");
	       System.out.println("2.Cuadrado(U)");
	       System.out.println("3.Circulo(T)");
	       System.out.println("--------------------------------");
	       op=s.next();
	       double x;
	       double pi=3.1416;
	       switch(op){
	           case "c":
	               System.out.println("Ingrese Radio del circulo: ");
	               x=s.nextInt();
	               System.out.println("El PERIMETRO ES: "+decimales.format(2*pi*x));
	               System.out.println("El AREA ES: "+decimales.format((pi*pi)*x));
	               System.out.println("El RADIO ES: "+x);
	               break;
	           case "u":
	               System.out.println("Ingrese Lado del cuadrado: ");
	               x=s.nextInt();
	               System.out.println("El PERIMETRO ES: "+decimales.format(4*x));
	               System.out.println("El AREA ES: "+(x*x));
	               break;
	            case "t":
	               System.out.println("Ingrese Lado del triangulo equilatero: ");
	               x=s.nextInt();
	               System.out.println("El PERIMETRO ES: "+(2*(x+x)));
	               System.out.println("La Altura es: "+decimales.format(Math.sqrt( Math.pow(x, 2)+Math.pow((x/2),2))));
	               break;    
	            default:
	                System.out.println("Ingrese una letra adecuada para una de las figuras");
	       }
	       System.out.println("----------------------------------------------");
	       System.out.println("----------------------------------------------");	
	}
	static void Ej5(){
		 int d1=0; int año1=0; int mes1;
	       int d2=0; int año2=0; int mes2; int cr; int dd;int t;
	       Scanner s=new Scanner(System.in);
	     
	       System.out.println("Ingrese primer fecha");
	       System.out.println("-----------------------");
	       System.out.print("Dia: ");
	       d1=s.nextInt();
	       System.out.print("Mes: ");
	       mes1= s.nextInt();
	       System.out.print("Año: ");
	        año1=s.nextInt();
	       System.out.println("Ingrese segunda fecha");
	       System.out.println("-----------------------");
	       System.out.print("Dia: ");
	       d2=s.nextInt();
	       System.out.print("Mes: ");
	       mes2= s.nextInt();
	       System.out.print("Año: ");
	        año2=s.nextInt();
	      if(año1<año2){
	         cr=(año2*360)+(mes2*30)+d2;
	         dd=(año1*360)+(mes1*30)+d1;
	          t= cr-dd;
	          System.out.println("Los dias son: "+t);
	      }else if(año1==año2){
	          cr=(mes2*30)+d2;
	         dd=(mes1*30)+d1;
	          t= cr-dd; 
	  System.out.println("Los dias son: "+t);
	    
	    }
		 System.out.println("----------------------------------------------");
	       System.out.println("----------------------------------------------");	
	}
	static void Ej6(){
		DecimalFormat decimales = new DecimalFormat("0.00");
        double v1; double v2;
        String opr;  double res;
        Scanner s=new Scanner(System.in);
        System.out.println("Calculadora");
        System.out.println("------------------------------");
        System.out.println("Suma(s)");
        System.out.println("Resta(r)");
        System.out.println("Multiplicacion(m)");
        System.out.println("Division(d)");
        System.out.println();
        System.out.println("Que operacion desea realizar: ");
        opr=s.next();
        switch (opr){
            case "s":
                System.out.println("Ingrese primer numero a operar: ");
                v1=s.nextDouble();
                System.out.println("Ingrese zegundo numero a operar: ");
                v2=s.nextDouble();
                res=v1+v2;
                System.out.println("La suma es: "+decimales.format(res));
                break;
            case "r":
                System.out.println("Ingrese primer numero a operar: ");
                v1=s.nextDouble();
                System.out.println("Ingrese zegundo numero a operar: ");
                v2=s.nextDouble();
                res=v1-v2;
                System.out.println("La resta es: "+decimales.format(res));
                break;
             case "m":
                System.out.println("Ingrese primer numero a operar: ");
                v1=s.nextDouble();
                System.out.println("Ingrese zegundo numero a operar: ");
                v2=s.nextDouble();
                res=v1*v2;
                System.out.println("La multiplicacion es: "+decimales.format(res));
                break;
              case "d":
                System.out.println("Ingrese primer numero a operar: ");
                v1=s.nextDouble();
                System.out.println("Ingrese zegundo numero a operar: ");
                v2=s.nextDouble();
                res=v1/v2;
                System.out.println("La division es: "+decimales.format(res));
                break;
              default:
                  System.out.println("Lo siento operacion no se encuenra");
        }
        System.out.println("----------------------------------------------");
	       System.out.println("----------------------------------------------");	
	}
	static void Ej7(){
		 int n=0;
	       Scanner s=new Scanner(System.in);
	      
	       System.out.println("Ingrese un numero entre 0-10: ");
	        n=s.nextInt();
	       System.out.println("la tabla del "+n+ " es:");
	              for(int i=10;i>=0;i--){
	               System.out.println(n + " * " + i + " = " + n*i);
	              } 
	              System.out.println("----------------------------------------------");
	   	       System.out.println("----------------------------------------------");	
	}
	static void Ej8(){
		int p1; int p2;
	    String[] Unidades = { "","un","dos","tres","cuatro","cinco","seis","siete","ocho","nueve" };
	  String[] Decena1 = { "","once","doce","trece","catorce","quince","dieciseis","diecisiete","dieciocho","diecinueve" };
	     String[] Decenas = { "","diez","veinte","treinta","cuarenta","cincuenta",
	      "sesenta","setenta","ochenta","noventa"};
	       Scanner s=new Scanner(System.in);
	       System.out.println("Ingrese limite inferior");
	       p1=s.nextInt();
	       System.out.println("Ingrese limite Superior");
	       p2=s.nextInt();
	        System.out.println(p1+" - "+ p2);
	        int R=((int)(Math.random()*(p2-p1)+p1));
	        
	    R = R % 100;
	    int decenas = R / 10;
	    int unidades = R % 10;
	     if ( decenas == 0 && unidades != 0 ) 
	      System.out.println(Unidades[unidades]);
	    
	    if ( decenas == 1 && unidades != 0 )
	     System.out.println(Decena1[unidades]);
	    
	    if ( decenas == 2 && unidades != 0 )
	      System.out.println("veinti"+Unidades[unidades]);
	    
	    if ( unidades == 0) 
	      System.out.println(Decenas[decenas]);
	    
	    if ( decenas > 2 && unidades != 0)
	      System.out.println(Decenas[decenas] + " y " + Unidades[unidades]);
	    
	    if ( unidades == 0 && decenas == 0)
	      System.out.println("cien");
	    
		 System.out.println("----------------------------------------------");
	       System.out.println("----------------------------------------------");	
	}
static void Ej9(){
	  Scanner sc=new Scanner(System.in);  
      String Unidad[]={"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};  
      String Decena[]={"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};  
      String Centena[]={"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
      String Miles[]={"","M","MM","MMM"};
      System.out.println("Ingresa numero:");  
      int nu = sc.nextInt();  
      int u=nu%10;  
      int d=(nu/10)%10;  
      int c=(nu/100)%10; 
      int m=nu/1000;
     
      if(nu>=1000){  
              System.out.println(Miles[m]+Centena[c]+Decena[d]+Unidad[u]);            
          }else{  
          if(nu>=100){  
              System.out.println(Centena[c]+Decena[d]+Unidad[u]);            
          }else{  
               if(nu>=10){  
              System.out.println(Decena[d]+Unidad[u]);            
          }else{  
              System.out.println(Unidad[nu]);                
          }            
    }
    
    }
      System.out.println("----------------------------------------------");
      System.out.println("----------------------------------------------");	
	}
static void Ej10(){
	 System.out.println("----------------------------------------------");
     System.out.println("----------------------------------------------");	
}
static void Ej11(){
	 System.out.println("----------------------------------------------");
     System.out.println("----------------------------------------------");		
}	
static void Ej12(){
	String p="";
	 Scanner s= new Scanner(System.in);
	 System.out.println("Ingrese una palabra");
	 p=s.next();

	 for (int i=0;i<p.length();i++){
	 System.out.print("*");
	 }
	 System.out.println();
	    		
	 System.out.println("----------------------------------------------");
     System.out.println("----------------------------------------------");	
}
static void Ej13(){
	 System.out.println("----------------------------------------------");
     System.out.println("----------------------------------------------");	
}
static void Ej14(){
	Scanner s=new Scanner(System.in);
    int n;
    System.out.print("Ingrese el lado del cuadrado: ");
    n=s.nextInt();
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
        if(j==1 || j==n || i==1 || i==n){
        System.out.print("* ");
        }else{
            System.out.print("  ");
        }
        }
        System.out.println();
    }
    System.out.println("----------------------------------------------");
    System.out.println("----------------------------------------------");	
}
static void Ej15(){
	 System.out.println("----------------------------------------------");
     System.out.println("----------------------------------------------");	
}
	
	public static void main(String[] args) {
		   Scanner read=new Scanner(System.in); 
		   int op=0; 

		   do{ 
		   System.out.println("Menú Principal"); 
		   System.out.println("1. EJERCICIO UNO");
		   System.out.println("2. EJERCICIO DOS");
		   System.out.println("3. EJERCICIO TRES");
		   System.out.println("4. EJERCICIO CUATRO");
		   System.out.println("5. EJERCICIO CINCO");
		   System.out.println("6. EJERCICIO SEIS");
		   System.out.println("7. EJERCICIO SIETE");
		   System.out.println("8. EJERCICIO OCHO");
		   System.out.println("9. EJERCICIO NUEVE");
		   System.out.println("10. EJERCICIO DIEZ");
		   System.out.println("11. EJERCICIO ONCE");
		   System.out.println("12. EJERCICIO DOCE");
		   System.out.println("13. EJERCICIO TRECE");
		   System.out.println("14. EJERCICIO CATORCE");
		   System.out.println("15. EJERCICIO QUINCE");
		   System.out.println("16. SALIR");
		   System.out.println("Elija una opción"); 

		   op=read.nextInt(); 

		   if(op==1){ 
			  Ej1();	
		   } 

		   else if(op==2){ 
		 Ej2();
		   } 
		   else if(op==3){ 
				Ej3();
				   }
		   else if(op==4){ 
				 Ej4();
		   }
		   else if(op==5){ 
			   Ej5();	   
		   }else if(op==6){ 
				 Ej6();
		   }
		   else if(op==7){ 
				 Ej7();
		   }
		   else if(op==8){ 
			   Ej8();
		   }
		   else if(op==9){ 
			   Ej9();
		   }
		   else if(op==10){ 
			   Ej10();
		   }
		   else if(op==11){ 
			   Ej11();
		   }
		   else if(op==12){ 
			   Ej12();
		   }
		   else if(op==13){ 
			   Ej13();
		   }
		   else if(op==14){ 
			   Ej14();
		   }
		   else if(op==15){ 
			   Ej15();
		   }
		   else if(op==16){ 
		   System.out.println("Gracias por utilizar la aplicación"); 
		   }else{ 
		   System.out.println("ERROR, por favor escriba bien"); 
		   } 

		   }while(op<16); 


	}

}
