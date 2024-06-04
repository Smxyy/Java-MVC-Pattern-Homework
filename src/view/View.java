package view;

import controller.UserController;
import model.dto.UserDto;

import java.util.Scanner;

public class View {
    private static final UserController userController
             = new UserController();
    public static void UI() {
        while(true){
            System.out.println("=".repeat(50));
            System.out.println("1.Add user".toUpperCase());
            System.out.println("2.List all users".toUpperCase());
            System.out.println("3.Remove user".toUpperCase());
            System.out.println("4.Exit".toUpperCase());
            System.out.println("=".repeat(50));
            System.out.print("> Insert option: ");
            int option = new Scanner(System.in).nextInt();
            System.out.println("=".repeat(50));
            switch(option){
                case 1 -> {
                    System.out.println("> Insert user's info".toUpperCase());
                    System.out.print("[+] Insert user's name: ");
                    String name = new Scanner(System.in).nextLine();
                    System.out.print("[+] Insert user's email: ");
                    String email = new Scanner(System.in).nextLine();
                    UserDto userDto = new UserDto(name, email);
                    userController.addNewUser(userDto);
                    System.out.println("[+] User added successfully.");
                }
                case 2 -> {
                    System.out.println("This is view: ");
                    userController.getAllUsers().forEach(System.out::println);
                }
                case 3->{
                    System.out.println("[*] Delete user by ID".toUpperCase());
                    System.out.print(">> Insert student's ID: ");
                    Integer id = new Scanner(System.in).nextInt();
                    int status =  userController.deleteUser(id);
                    if(status==1){
                        System.out.println("[-] User deleted successfully.");
                    }else
                        System.out.println("[!] Fail to delete user.");
                }
                case 4-> System.exit(0);
                default -> System.out.println("[!] Invalid option");
            }
        }
    }
}

