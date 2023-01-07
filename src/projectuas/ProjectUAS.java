/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectuas;

import com.sun.javafx.fxml.expression.Expression;

/**
 *
 * @author User
 */
public class ProjectUAS {
    
    public static String[] model = new String[10];    
    public static String todo;
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    
    public static void main(String[] args) {
        
        viewShowTodoList();
        
    }
    public static void showTodoList(){
        for(int i=0;i<model.length;i++){
            String todo = model[1];
            int no = i+1;
            if(todo!=null){
                System.out.println(no+". "+todo);
            }
            
        }
    }
    public static void testShowTodoList(){
        model[0]="Project UAS Aplikasi berbasis Dekstop";
        model[1]="Aplikasi Todo List";
        model[3]="CRUD";
        showTodoList();
    
        }
    public static void addTodoList(String todo){
        boolean isFull=true;
        for (String model1 : model) {
            if (model1 == null) {
                isFull=false;
                break;
            }
        }
        if (isFull){
                String[] temp  = model;
            model = new String[model.length*2];

            for (int i=0;i< temp.length; i++){
                model[i] = temp[i];
                }
        }
            for (int i=0; i<model.length; i++){
            if (model[i]==null){
                model[i]=todo;
                break;
            }
        }
}
public static void testAddTodoList(){
    for(int i=0; i<35;i ++){
    addTodoList("Todo ke : " + i);
    }
    showTodoList();
}
  public static boolean removeTodoList(Integer number){
        if ((number - 1)>= model.length){
            return false;
        }else if (model[number - 1] == null){
            return false;
        }else{
            for (int i  = (number - 1); i < model.length; i++){
                if (1 == (model.length) - 1){
                    model[i]=null;
                }else{
                    model[i]=model[i + 1];
                }
            }
        }
        return true;
        }
  public static void testRemoveTodoList(){
      addTodoList("satu");
      addTodoList("satu");
      addTodoList("satu");
  
      showTodoList();
      System.out.println(removeTodoList(30));
      System.out.println(removeTodoList(8));
      System.out.println(removeTodoList( 2));
      
      showTodoList();

  }
  public static String input(String info){
      System.out.println(info + " : ");
      String data = scanner.nextLine();
      return data;
  }
  public static void testInput(){
      String name = input ("Name");
      System.out.println(name);
      
      String chanel = input( "Chanel");
      System.out.println(chanel);
  }
  public static void viewShowTodoList(){
      while (true){
          showTodoList();
          
          System.out.println("Menu : ");
          System.out.println("1. Tambah");
          System.out.println("2. Hapus");
          System.out.println("x. Keluar");
          
           String Input = input( "Silahkan Pilih");
           
           if (Input.equals("1")){
               viewAddTodoList();
           }else if (Input.equals("2")){
               viewremoveTodoList();
           }else if (Input.equals("x")){
               break;
           }else{
               System.out.println("Pilihan tidak dimengerti");
               
            
           }
                  
      }
  }
  public static void testViewShowTodoList(){
      addTodoList("satu");
      addTodoList("dua");
      addTodoList("tiga");
      
      
      viewShowTodoList();
  }
  public static void viewAddTodoList(){
      System.out.println("Mennambahkan TodoList");
      
      String todo = input("Masukkan todo (x jika batal)");
      
      if (todo.equals("x")){
          
      }else{
          addTodoList(todo);
      }
  }
    public static void testViewAddTodoList(){
        addTodoList("satu");
        addTodoList("dua");
       
        
        viewAddTodoList();
        
        showTodoList();
    }
    public static void viewremoveTodoList(){
        System.out.println("Menghapus TodoList");
        
        String number = input("Masukkan nomor(x jika batal)");
        
        if (number.equals("x")){
        
    }else{
          boolean succes = removeTodoList(Integer.valueOf(number));
          if (!succes){
              System.out.println("Gagal Menghapus todo nomor ke : " + number);
          }
        }
    }
     public static void testViewRemoveTodoList(){
         addTodoList("satu");
         addTodoList("dua");
         addTodoList("tiga");
         
         showTodoList();
         
         viewremoveTodoList();
         
         showTodoList();
     }
  }