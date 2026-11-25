public class Runner{
    public void run(){
        menu M = new menu();
        Calculation C = new Calculation();
        int choice;
        choice =M.GetChoice();
        switch(choice){
            case 1 ->{ C.KgLbs();}
            case 2 ->{  C.LbsKg();}
            default -> System.out.println("Wrong choice");
        }
    }
}