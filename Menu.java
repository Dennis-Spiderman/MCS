package ui;
import model.MCS;
import model.Song;
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
		String nickName;
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
		nickName=sc1.nextLine();
		
		System.out.println("\nCree una contraseña:");
		password=sc1.nextLine();
		
		System.out.println("\nConfirme su contraseña:");
		confirmPassword=sc1.nextLine();
		
		if(password.equals(confirmPassword)){
			System.out.println("\nIngrese su edad:");
			age=sc2.nextInt();
			
			mcs1.addUser(nickName, password, age, category, sharedSongs);
			menu(mcs1, sharedSongs);
			
		}
		
		else{
			System.out.println("Las contraseñas no coinciden.");
		}
	}
	
	public static void menu(MCS mcs1, int sharedSongs){
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
					seeTheUsers(mcs1, sharedSongs);
					break;
				
				case 2:
					createASong(mcs1, sharedSongs);
					break;
				
				case 3:
					seeTheCategory(mcs1, sharedSongs);
					break;
				
				case 4:
					seeTheSongs(mcs1, sharedSongs);
					break;
				
				case 5:
					createAPlaylist(mcs1, sharedSongs);
					break;
				
				case 6:
					seeThePlaylists(mcs1, sharedSongs);
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
	
	public static void seeTheUsers(MCS mcs1, int sharedSongs){
		System.out.println(mcs1.getTheUsers());
		
		menu(mcs1, sharedSongs);
	}
	
	public static void createASong(MCS mcs1, int sharedSongs){
		Scanner sc1=new Scanner(System.in);
		Scanner sc2=new Scanner(System.in);
		
		String songsTittle;
		String songsArtist;
		String songsReleaseDate;
		int songsDuration;
		String genre;
		
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
		genre=sc1.nextLine();
		
		mcs1.addSong(songsTittle, songsArtist, songsReleaseDate, songsDuration, genre);
		
		sharedSongs+=1;
		
		menu(mcs1, sharedSongs);
	}
	
	public static void seeTheCategory(MCS mcs1, int sharedSongs){
		System.out.println("Su categoría es: ");
		System.out.println(mcs1.refreshTheCategories(sharedSongs));
		
		menu(mcs1, sharedSongs);
	}
	
	public static void seeTheSongs(MCS mcs1, int sharedSongs){
		System.out.println(mcs1.getTheSongs());
		
		menu(mcs1, sharedSongs);
	}
	
	public static void createAPlaylist(MCS mcs1, int sharedSongs){
		Scanner sc1=new Scanner(System.in);
		Scanner sc2=new Scanner(System.in);
		
		int selection;
		
		String playlistName;
		int playlistDuration=0;
		String playlistGenres="";
		String playlistAllowedUser;
		String[] playlistAllowedUsers=new String[5];
		int[] playlistCalifications=new int[10];
		double average=0;
		
		System.out.println("¿Qué tipo de playlist quiere crear?\n** Escriba el número de su elección **");
		System.out.println("1. Playlist privada\n2. Playlist restringida\n3. Playlist pública");
		selection=sc2.nextInt();
		
		System.out.println("\nIngrese el nombre de la playlist:");
		playlistName=sc1.nextLine();
			
		switch(selection){
			case 1:
				System.out.println("\nIngrese el nickname del usuario con permisos para la playlist:");
				playlistAllowedUser=sc1.nextLine();
				
				mcs1.addPlaylist(playlistName, playlistDuration, playlistGenres, playlistAllowedUser);
				
				break;
				
			case 2:
				for(int i=0; i<5; i++){
					System.out.println("\nIngrese el nombre del usuario #" + (i+1) + " con permisos:");
					playlistAllowedUsers[i]=sc1.nextLine();
					
				}
				
				mcs1.addPlaylist(playlistName, playlistDuration, playlistGenres, playlistAllowedUsers);
				
				break;
				
			case 3:
				int i=0;
				
				System.out.println("\nIngrese su calificación para esta playlist:");
				
				for(i=0; i<playlistCalifications.length; i++){
					Integer aux=new Integer(playlistCalifications[i]);
					
					if(aux==null){
						playlistCalifications[i]=sc2.nextInt();
						average+=playlistCalifications[i];
						
						break;
					}
				}
				
				average/=(i+1);
				
				mcs1.addPlaylist(playlistName, playlistDuration, playlistGenres, average);
				
				break;
				
		}
		
		actionsInThePlaylist(mcs1, sharedSongs);
	}

	public static void actionsInThePlaylist(MCS mcs1, int sharedSongs){
		Scanner sc1=new Scanner(System.in);
		Scanner sc2=new Scanner(System.in);

		int selection;
		String songToAdd;
		
		System.out.println("¿Quiere agregar una canción del pool de canciones?\n** Escriba el número de su opción **");
		System.out.println("1. Sí\n2. No");
		selection=sc2.nextInt();
		
		switch(selection){
			case 1:
				System.out.println("Las canciones disponibles en el pool de canciones son: ");
				System.out.println(mcs1.getTheSongs());
				
				System.out.println("Escriba el nombre de la canción que quiera para agregarla a su playlist: ");
				songToAdd=sc1.nextLine();
				
				mcs1.addSongToThePlaylist(songToAdd);
				
				break;
				
			case 2:
				menu(mcs1, sharedSongs);
				break;
				
		}
	}

	public static void seeThePlaylists(MCS mcs1, int sharedSongs){		
		System.out.println(mcs1.getThePlaylists());
		
		menu(mcs1, sharedSongs);
	}
}