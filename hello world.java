// Your First Program

class HelloWorld {

    
    public static void main(String[] args) 
    {   
        int my_roll_number_is = 10;  
        String name  = "Tanveer";
        //Switch expression  
        switch(name)
        {  //switch starts
        //Case statements  
            case "Tanveer": System.out.println("Adnan");  
        //break;  
            switch(my_roll_number_is)
                {
                    case 10: System.out.println("Adnan");  
                    break;  
                    case 2: System.out.println("Naseer");  
                    break;  
                    case 1: System.out.println("Tanveer");  
                }
            break;
            case "Naseer": System.out.println("Naseer");  
            break;  
            //Default case statement  
            default:System.out.println("None of the above");  
        }  //switch
    }
}    //class ends
