import java.util.LinkedList;
import java.util.Scanner;

class Node {
  public static String value;
  int item;
  Node left, right;

  public Node(int key) {
  item = key;
  left = right = null;
  }
}

class Main {
  // root of Tree
  Node root;

  Main() {
  root = null;
  }

  // method to count leaf nodes
  public static int countLeaf(Node node) {
    if(node == null) {
      return 0;
    }

    // if left and right of the node is null
    // it is leaf node
    if (node.left == null && node.right == null) {
      return 1;
    }
    else {
      return countLeaf(node.left) + countLeaf(node.right);
    }
  }

}
public class App {
    public static void main(String[] args) throws Exception {
       info();
    }

    public static void info(){
        System.out.println();
        System.out.println();
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Nov - L'evanir Application");
        System.out.println();

        System.out.println("Please enter your name: ");
        String username = scan.next();

        System.out.println();
        System.out.println("Hello " + username + ", welcome to the Nov - L'evanir");
        System.out.println("are you ready to explore the Binary Search Tree?");
        System.out.println();
        System.out.println("Enter [yes] to continue...");
        System.out.println("Enter [no] to go back...");
        System.out.print(">> ");
        String userInput = scan.next();

        if (userInput.equalsIgnoreCase("yes")) {
        System.out.println();
        System.out.println("----------------------------------------------------------------");
        System.out.println("Backgroud of Binary Search Tree");
        System.out.println("What is Binary Search Tree? ");
        System.out.println("Binary search tree is a data structure that quickly allows us to maintain a sorted list of numbers.\r\n" + //
                "\r\n" + //
                "It is called a binary tree because each tree node has a maximum of two children.\r\n" + //
                "It is called a search tree because it can be used to search for the presence of a number in O(log(n)) time.");
                System.out.println();
                System.out.println("Do you want to continue?");
                System.out.println("Enter [yes] to continue...");
                System.out.println("Enter [no] to go back...");
                System.out.print(">> ");
                String userInput2 = scan.next();
                if (userInput2.equalsIgnoreCase("yes")){
                    level1();
                    L1Question();
                } else if (userInput2.equalsIgnoreCase("no")){
                    info();
                }

        } else if (userInput.equalsIgnoreCase("no")){
            info();
          
        }

    }

    public static void level1(){
        
            System.out.println();
            System.out.println("----------------------------------------------------------------");
            System.out.println("Level 01");
            System.out.println();
            System.out.println("About the developers section");
            System.out.println("Developer 1");
            System.out.println("Name: Regina Tomacruz");
            System.out.println("Age: 20");
            System.out.println("Birthday: August 11, 2003");

            System.out.println();
            System.out.println("Developer 2");
            System.out.println("Name: Bianca Louise Rosales");
            System.out.println("Age: 18");
            System.out.println("Birthday: December 18, 2004");

            System.out.println();
            System.out.println("Developer 3");
            System.out.println("Name: Joshua Guimbaolibot");
            System.out.println("Age: 20");
            System.out.println("Birthday: October 7, 2003");

            System.out.println();
            System.out.println("Developer 4");
            System.out.println("Name: Paul Andrei Aguilar");
            System.out.println("Age: 19");
            System.out.println("Birthday: January 6, 2004");
    }

    public static void L1Question(){
            

        int lives = 2;
            System.out.println();
            System.out.println("Instruction: To make a binary tree or to proceed to level 02, you must answer the following questions");
            System.out.println();
            System.out.println("Q1: It is called a search tree because it can be used to search for the presence of a number in O(log(n)) time.");
            System.out.println();
            System.out.println("Choose the correct answer: ");
            System.out.println("A. True");
            System.out.println("B. False");
            System.out.print(">> ");
            Scanner scan = new Scanner(System.in);
            String userInput3 = scan.next();


            if (userInput3.equalsIgnoreCase("a")){
                System.out.println();
                System.out.println("--------------------------------------");
                System.out.println("Congratulations, proceed to the level 02");
                System.out.println("geting infos...");
                System.out.println("completed!");

                System.out.println();
                System.out.println("Regina T. [8, 11]");
                System.out.println("Bianca R. [12, 18]");
                System.out.println("Joshua G. [10, 7]");
                System.out.println("Paul A. [1, 6]");
                System.out.println("--------------------------------------");
                Level2();

            } else {
                if (userInput3.equalsIgnoreCase("b")){
                    System.out.println(userInput3 + " is a wrong! try again");    
                    L1Question();

                } 
            }
            }

        public static void Level2(){

        System.out.println();
        System.out.println("----------------------------------------------------------------");
        System.out.println("Level 02");
        System.out.println("Keep going; we're almost halfway done creating your binary search tree.");
        System.out.println();
        L2Question();

        }

        public static void L2Question(){
        System.out.println("Q2: It is called a binary tree because each tree node has a maximum of two children.");
        System.out.println();
        System.out.println("Choose the correct answer: ");
        System.out.println("A. False");
        System.out.println("B. True");
        System.out.print(">> ");
        Scanner scan = new Scanner(System.in);
        String userInput4 = scan.next();

        if (userInput4.equalsIgnoreCase("a")){
            
            System.out.println(userInput4 + " is a wrong answer, try again");
            L2Question();

        } else if (userInput4.equalsIgnoreCase("b")){
        System.out.println();
        System.out.println("Congratulations!! ");
        System.out.println("The system is now creating your Binary search Tree");
        System.out.println("Wait a moment....");

        Main tree = new Main();
        tree.root = new Node(6); 
        tree.root.left = new Node(1); 
        tree.root.right = new Node(8); 

        
        //child of right nodes
        tree.root.right.left = new Node(7); 
        tree.root.right.right = new Node(11); 
        tree.root.right.right.left = new Node(10); 
        tree.root.right.right.right = new Node(12);
        tree.root.right.right.right.left = new Node(18);


        LinkedList<String> values = new LinkedList<String>();
            values.add("6");
            values.add("1");
            values.add("8");
            values.add("7");
            values.add("11");
            values.add("10");
            values.add("12");
            values.add("18");
           
        System.out.println();
        System.out.println("Done Creating your Binary Search Tree");
        System.out.println("Here is your Binary Search Tree values: ");
        System.out.println(values);
        System.out.println("Congratulations, Proceed to the final level");
        Level3();
        
    }
        }

    public static void Level3(){
        System.out.println();
        System.out.println("----------------------------------------------------------------");
        System.out.println("Level 03");
        System.out.println("Congratulations, welcome to the final level");
        System.out.println("You must respond to the final question in order to obtain the illustration of your tree.");
        L3Question();

    }

    public static void L3Question(){
        System.out.println();
        System.out.println("Q3: It is a data structure that quickly allows us to maintain a sorted list of numbers ");
        System.out.println("Choose the correct letter");
        System.out.println("A. Graph");
        System.out.println("B. Hash");
        System.out.println("C. Trees");
        System.out.println("D. Heap");
        System.out.print(">> ");
        Scanner scan = new Scanner(System.in);
        String userInput5 = scan.next();



        if (userInput5.equalsIgnoreCase("c")){
            System.out.println("--------------------- Congratuations ---------------------");
            System.out.println("he're the final output of your tree");
            System.out.println("        6        ");
            System.out.println("       / \\       ");
            System.out.println("      1   8       ");
            System.out.println("         / \\       ");
            System.out.println("        7  11      ");
            System.out.println("           / \\    ");
            System.out.println("          10 12    ");
            System.out.println("               \\");
            System.out.println("               18");

        System.out.println();
        System.out.println("Thank you for using Nov L'evanir Application!");
        System.out.println();
        System.out.println();

        info();
        } else {
            if (userInput5.equalsIgnoreCase("a") || userInput5.equalsIgnoreCase("b") || userInput5.equalsIgnoreCase("d")){
                System.out.println(userInput5 + " is a wrong answer! Try again");
                L3Question();

            }
        }
        
    }

    }
