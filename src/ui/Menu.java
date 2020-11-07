package ui;
import model.MCS;
import java.util.Scanner;

public class Menu{
	
	public static void main(String[] args){
		MCS mcs1=new MCS();
		
		System.out.println("BIENVENIDO A MUSIC COLLECT & SHARE");
		System.out.println("\n__________________________________________________________________\n");
		System.out.println("(((((((((((((((((((((((((((((((((((((((((((((((((\n((((((((((((((((/((((((((((((((((((((((((((((((((\n(((/  .(((((((*  .((((((*        (((((/      /(((\n(((/   .((((((.  .(((((   ,((((((((((*  .((((((((\n(((/    /((((/   .((((/  ,(((((((((((.  /((((((((\n(((/     ((((*   .((((*  ,(((((((((((/   ((((((((\n(((/  *  *(((     ((((*  ,((((((((((((,  .(((((((\n(((/  /.  ((*     ((((*  *(((((((((((((,   ((((((\n(((/  //  ,(  .   ((((*  *((((((((((((((/   /((((\n(((/  *(*  ,  (   ((((*  *((((((((((((((((   /(((\n(((/  ,(/    ,(   /(((*  ,(((((((((((((((((   (((\n(((/  .((    ((   /((((  .(((((((((((((((((.  /((\n(((/  .((.  .((.  *((((,  *((((((((((((((((   /((\n(((/  .((((((((.  *(((((   *((((/,/(((((((/   (((\n(((/  .((((((((.  *((((((.        *((   .   .((((\n(((((((((((((((/*/((((((((((///(((((((////(((((((\n(((((((((((((((((((((((((((((((((((((((((((((((((\n               ./(###((///((###(*                \n           *#(,                   *((,           \n        ,#/                           ((         \n      .#*          .**/////*,.          ((       \n     *(.      .//////////////////*       *#      \n    .#,     *///////////////////////,     /(     \n    /(    *///////////////////////////    .#.    \n  ,/////,*/////////////////////////////,*////*.  \n  /////////////////////////*,...,/////////////,  \n  //////*,,,********,,.............,,,,,//////,  \n  //////*.........//*........//*.......,//////,  \n  //////*.........,,.........,,........,//////,  \n  //////*..............................,//////,  \n   *///*  ........,/.........**.......  .*///,   \n            .......,/*.....,/*.......            \n               ........,,,,.......               \n                    .........                    ");
		System.out.println("\n__________________________________________________________________\n");
		
		createUser(mcs1);
	}
	
	public static void createUser(MCS mcs1){
		String userName;
		String nick;
		String password;
		String confirmPassword;
		String category="";
		int age;
		int sharedSongs=0;
		
		Scanner sc1=new Scanner(System.in);
		Scanner sc2=new Scanner(System.in);
		
		System.out.println("Ingrese su nombre:");
		userName=sc1.nextLine();
		
		System.out.println("\nIngrese su nombre de usuario:");
		nick=sc1.nextLine();
		
		System.out.println("\nCree una contraseña:");
		password=sc1.nextLine();
		
		System.out.println("\nConfirme su contraseña:");
		confirmPassword=sc1.nextLine();
		
		System.out.println("\nIngrese su edad:");
		age=sc2.nextInt();
		
		if(password.equals(confirmPassword)){
			mcs1.addUser(nick, password, age, category, sharedSongs);
			menu(mcs1);
			
		}
	}
	
	public static void menu(MCS mcs1){
		Scanner sc1=new Scanner(System.in);
		Scanner sc2=new Scanner(System.in);
	
		int selection;
		
		System.out.println("\n¿Qué quiere hacer?");
		System.out.println("** Escriba el número de la opción que quiera elegir **");
		System.out.println("1. Ver los usuarios de MCS\n2. Crear canción para compartir en el pool\n3. Ver su categoría");
		System.out.println("4. Ver las canciones del pool\n5. Crear una playlist\n6. Ver los playlists existentes\n7. Crear un usuario");
		selection=sc2.nextInt();
		
		if(selection>=1 && selection<=7){
			switch(selection){
				case 1:
					seeTheUsers(mcs1);
					break;
				
				case 2:
					createASong(mcs1);
					break;
				
				case 3:
					seeTheCategory();
					break;
				
				case 4:
					seeTheSongs(mcs1);
					break;
				
				case 5:
					createAPlaylist();
					break;
				
				case 6:
					seeThePlaylists();
					break;
				
				case 7:
					createUser(mcs1);
					break;
					
			}
		}
		
		else{
			System.out.println("Su elección es inválida");
			
		}
	}
	
	public static void seeTheUsers(MCS mcs1){
		System.out.println(mcs1.getTheUsers());
		
		menu(mcs1);
	}
	
	public static void createASong(MCS mcs1){
		Scanner sc1=new Scanner(System.in);
		Scanner sc2=new Scanner(System.in);
		
		String songsTittle;
		String songsArtist;
		String songsReleaseDate;
		int songsDuration;
		String musicalGenre;
		
		System.out.println("\nIngrese el título de la canción:");
		songsTittle=sc1.nextLine();
		
		System.out.println("\nIngrese el nombre del artista de la canción:");
		songsArtist=sc1.nextLine();
		
		System.out.println("\nIngrese la fecha lanzamiento de la canción en formato día/mes/año:");
		songsReleaseDate=sc1.nextLine();
		
		System.out.println("\nIngrese la duración de la canción en segundos:");
		songsDuration=sc2.nextInt();
		
		System.out.println("\nIngrese el número del género de la canción:");
		System.out.println("\n1. Rock\n2. Hip hop\n3. Música clásica\n4. Reggae\n5. Salsa\n6. Metal");
		musicalGenre=sc1.nextLine();
		
		mcs1.addSong(songsTittle, songsArtist, songsReleaseDate, songsDuration, musicalGenre);
		
		menu(mcs1);
	}
	
	public static void seeTheCategory(){
		
	}
	
	public static void seeTheSongs(MCS mcs1){
		System.out.println(mcs1.getTheSongs());
		
		menu(mcs1);
	}
	
	public static void createAPlaylist(){
		
	}
	
	public static void seeThePlaylists(){
		
	}
}