import java.util.*;
public class letrasbucle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner teclado=new Scanner(System.in);
char letra;
int contadorerror=0;
int contadorH=0;
int contadorh=0;
System.out.println("Introduzca una letra: ");
letra=teclado.next().charAt(0);
while (letra!='0'){
	switch (letra){
	case 'a':
	case 'A':
	case 'b':
	case 'B':
	case 'c':
	case 'C':
		System.out.println("2");break;
	case 'd':
	case 'D':
	case 'e':
	case 'E':
	case 'f':
	case 'F':
		System.out.println("3");break;
	case 'g':
	case 'G':
	case 'h':
	case 'H':
	case 'i':
	case 'I':
		System.out.println("4");break;
	case 'j':
	case 'J':
	case 'k':
	case 'K':
	case 'l':
	case 'L':
		System.out.println("5");break;
	case 'm':
	case 'M':
	case 'n':
	case 'N':
	case 'ñ':
	case 'Ñ':
	case 'o':
	case 'O':
		System.out.println("6");break;
	case 'p':
	case 'P':
	case 'q':
	case 'Q':
	case 'r':
	case 'R':
	case 's':
	case 'S':
		System.out.println("7");break;
	case 't':
	case 'T':
	case 'u':
	case 'U':
	case 'v':
	case 'V':
		System.out.println("8");break;
	case 'w':
	case 'W':
	case 'x':
	case 'X':
	case 'y':
	case 'Y':
	case 'z':
	case 'Z':
		System.out.println("9");break;
	
	default:
		System.out.println("Carácter no alfabético");
		contadorerror++;
	}
	if(letra=='H'){
		contadorH++;
		
	}
	if(letra=='h'){
		contadorh++;
		
	}
	System.out.println("Introduce una letra: ");
	letra=teclado.next().charAt(0);
	
}
System.out.println("Numero de 'H': " +contadorH);
System.out.println("Número de 'h': " +contadorh);
System.out.println("Número de errores: " +contadorerror);
}

}
