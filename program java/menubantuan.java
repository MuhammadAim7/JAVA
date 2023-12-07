class menubantuan {
    public static void main(String args[]) throws java.io.IOException { char choice;
    for(;;) {
    do {
    System.out.println("Help Menu For Syntax:"); System.out.println(" 1. if");
    System.out.println(" 2. switch");
    System.out.println(" 3. for");
    System.out.println(" 4. while");
    System.out.println(" 5. do-while");
    System.out.println(" 6. break");
    System.out.println(" 7. continuen"); System.out.print("Choose one (q for exit): "); 
    do {
    choice = (char) System.in.read();
    } while(choice == 'n' | choice == 'r');
    } while( choice < '1' | choice > '7' & choice != 'q'); if(choice == 'q') break;
    System.out.println("n"); switch(choice) {
    case '1':
    System.out.println("format if:n"); System.out.println("if(condition) statement;"); 
    System.out.println("else statement;");
    break;    
    case '2':
    System.out.println("format switch:n"); System.out.println("switch(expression) {"); 
    System.out.println(" case constant:"); System.out.println(" statement sequence"); 
    System.out.println(" break;"); 
    System.out.println(" // ...");
    System.out.println("}"); 
    break;
    case '3':
    System.out.println("format for:n"); System.out.print("for(init; condition; iteration)"); 
    System.out.println(" statement;");
    break;    
    case '4':
    System.out.println("format while:n"); System.out.println("while(condition) statement;"); 
    break;
    case '5':
    System.out.println("format do-while:n"); System.out.println("do {"); System.out.println(" statement;"); 
    System.out.println("} while (condition);"); break;
    case '6':
    System.out.println("format break:n"); System.out.println("break; or break label;"); break;
    case '7':
    System.out.println("format continue:n"); System.out.println("continue; or continue label;"); 
    break;
    }
    System.out.println();
    }
    }
    }