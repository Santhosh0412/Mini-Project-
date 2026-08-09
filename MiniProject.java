import java.util.Scanner;
public class MiniProject {
    public static void main(String[] args) {
        int total=0;
        Scanner s=new Scanner(System.in);
        System.out.println("SELECT LANGUAGE");
        System.out.println("1.ENGLISH");
        System.out.println("2.TAMIL");
        System.out.println("ENTER THE CHOICE 1 OR 2:");
        int choice=s.nextInt();
        switch(choice){
            case 1:{
                System.out.println("SELECT CUISINE");
                System.out.println("1.NORTH INDIAN FOOD");
                System.out.println("2.SOUTH INDIAN FOOD");
                System.out.println("3.CHINESE FOOD");
                System.out.println("ENTER FOOD CHOICE 1 OR 2 OR 3:");
                int choice2=s.nextInt();
                switch(choice2){
                    case 1:{
                        System.out.println("1.BREAKFAST");
                        System.out.println("2.LUNCH");
                        System.out.println("3.DINNER");
                        System.out.println("ENTER FOOD CHOICE 1 OR 2 OR 3:");
                        int choice3=s.nextInt();
                        switch(choice3){
                            case 1:{
                                System.out.println("SELECT FOOD");
                                System.out.println("1.ALOO PORATHA");
                                System.out.println("2.PANEER PORATHA");
                                System.out.println("3.STUFFED KULCHA");
                                System.out.println("SELECT OPTION:");
                                int choice4=s.nextInt();
                                switch(choice4){
                                    case 1:{
                                        int price=80;
                                       System.out.println("ALOO PARTHA");
                                       System.out.println("Price:"+price);
                                       System.out.println("Select Quantity:");
                                       int quantiy=s.nextInt();
                                       if(quantiy>0){
                                       price=quantiy*price;
                                       total=price;
                                      }
                                      else{
                                        System.out.println("INVALID QUANTITY");
                                      }
                                        break;
                                    }
                                    case 2:{
                                        int price=100;
                                System.out.println("PANEER PARTHA");
                                System.out.println("Price:"+price);
                                System.out.println("Select Quantity:");
                                int quantiy=s.nextInt();
                                if(quantiy>0){
                                price=quantiy*price;
                                total=price;
                                }
                                else{
                                  System.out.println("INVALID QUANTITY");
                                }
                                        break;
                                    }
                                    case 3:{
                                        int price=120;
                                System.out.println("STAFFUED KULCHA");
                                System.out.println("Price:"+price);
                                System.out.println("Select Quantity:");
                                int quantiy=s.nextInt();
                                if(quantiy>0){
                                price=quantiy*price;
                                total=price;
                                }
                                else{
                                  System.out.println("INVALID QUANTITY");
                                }
                                        break;
                                    }
                                    default:{
                                        System.out.println("INVALID CHOICE");
                                        break;
                                    }
                               }
                               break;
                            }
                            case 2:{
                                System.out.println("SELECT FOOD");
                                System.out.println("1.BUTTER CHICKEN");
                                System.out.println("2.CHICKEN BIRIYANI");
                                System.out.println("3.JEERA RICE");
                                System.out.println("SELECT OPTION:");
                                int choice5=s.nextInt();
                                switch(choice5){
                                    case 1:{
                                        int price=240;
                                       System.out.println("BUTTER CHICKEN");
                                       System.out.println("Price:"+price);
                                       System.out.println("Select Quantity:");
                                       int quantiy=s.nextInt();
                                       if(quantiy>0){
                                       price=quantiy*price;
                                       total=price;
                                      }
                                      else{
                                        System.out.println("INVALID QUANTITY");
                                      }
                                        break;
                                    }
                                    case 2:{
                                        int price=220;
                                System.out.println("CHICKEN BIRIYANI");
                                System.out.println("Price:"+price);
                                System.out.println("Select Quantity:"); 
                                int quantiy=s.nextInt();
                                if(quantiy>0){
                                price=quantiy*price;
                                total=price;
                                }
                                else{
                                  System.out.println("INVALID QUANTITY");
                                }
                                        break;
                                    }
                                    case 3:{
                                        int price=120;
                                System.out.println("JEERA RICE");
                                System.out.println("Price:"+price);
                                System.out.println("Select Quantity:");
                                int quantiy=s.nextInt();
                                if(quantiy>0){
                                price=quantiy*price;
                                total=price;
                                }
                                else{
                                  System.out.println("INVALID QUANTITY");
                                }
                                        break;
                                    }
                                    default:{
                                        System.out.println("INVALID CHOICE");
                                        break;
                                    }
                                }

                                break;
                            }
                            case 3:{
                                System.out.println("SELECT FOOD");
                                System.out.println("1.PANEER TIKKA");
                                System.out.println("2.VEG PULAO");
                                System.out.println("3.THANDOORI CHICKEN");
                                System.out.println("SELECT OPTION:");
                                int choice6=s.nextInt();
                                switch(choice6){
                                    case 1:{
                                        int price=240;
                                       System.out.println("PANEER TIKKA");
                                       System.out.println("Price:"+price);
                                       System.out.println("Select Quantity:");
                                       int quantiy=s.nextInt();
                                       if(quantiy>0){
                                       price=quantiy*price;
                                       total=price;
                                      }
                                      else{
                                        System.out.println("INVALID QUANTITY");
                                     }
                                        break;
                                    }
                                    case 2:{
                                        int price=240;
                                       System.out.println("PANEER TIKKA");
                                       System.out.println("Price:"+price);
                                       System.out.println("Select Quantity:");
                                       int quantiy=s.nextInt();
                                       if(quantiy>0){
                                       price=quantiy*price;
                                       total=price;
                                      }
                                      else{
                                        System.out.println("INVALID QUANTITY");
                                     }
                                        break;
                                    }
                                    case 3:{
                                        int price=220;
                                System.out.println("THANDOORI CHICKEN");
                                System.out.println("Price:"+price);
                                System.out.println("Select Quantity:");
                                int quantiy=s.nextInt();
                                if(quantiy>0){
                                price=quantiy*price;
                                total=price;
                                }
                                else{
                                  System.out.println("INVALID QUANTITY");
                                }
                                        break;
                                    }
                                    default:{
                                        System.out.println("INVALID CHOICE");
                                        break;
                                    }
                                }
                                break;
                            }
                            default:{
                                System.out.println("INVALID CHOICE");
                                break;
                            }
                        }
                       break; 
                    }
                    case 2:{
                        System.out.println("1.BREAKFAST");
                        System.out.println("2.LUNCH");
                        System.out.println("3.DINNER");
                        System.out.println("ENTER FOOD CHOICE 1 OR 2 OR 3:");
                        int choice7=s.nextInt();
                        switch(choice7){
                            case 1:{ 
                                System.out.println("SELECT FOOD");
                                System.out.println("1.DOSA");
                                System.out.println("2.IDLY");
                                System.out.println("3.PONGAL");
                                System.out.println("SELECT OPTION:");
                                int choice5=s.nextInt();
                            switch(choice5){
                                case 1:{
                                    int price=100;
                                       System.out.println("DOSA");
                                       System.out.println("Price:"+price);
                                       System.out.println("Select Quantity:");
                                       int quantiy=s.nextInt();
                                       if(quantiy>0){
                                       price=quantiy*price;
                                       total=price;
                                      }
                                      else{
                                        System.out.println("INVALID QUANTITY");
                                 }
                                    break;
                                }
                                case 2:{
                                    int price=50;
                                System.out.println("IDLY");
                                System.out.println("Price:"+price);
                                System.out.println("Select Quantity:");
                                int quantiy=s.nextInt();
                                if(quantiy>0){
                                price=quantiy*price;
                                total=price;
                                }
                                else{
                                  System.out.println("INVALID QUANTITY");
                                }
                                    break;
                                }
                                case 3:{
                                    int price=70;
                                System.out.println("PONGAL");
                                System.out.println("Price:"+price);
                                System.out.println("Select Quantity:");
                                int quantiy=s.nextInt();
                                if(quantiy>0){
                                price=quantiy*price;
                                total=price;
                                }
                                else{
                                  System.out.println("INVALID QUANTITY");
                                }
                                    break;
                                }
                                default:{
                                    System.out.println("INVALID CHOICE");
                                    break;
                                }
                            }
                                break;
                            }
                            case 2:{
                                System.out.println("SELECT FOOD");
                                System.out.println("1.SAMBAR RICE");
                                System.out.println("2.CHICKEN BIRIYANI");
                                System.out.println("3.VEG RICE");
                                System.out.println("SELECT OPTION:");
                                int choice8=s.nextInt();
                                switch(choice8){
                                    case 1:{
                                        int price=80;
                                       System.out.println("SAMBAR RICE");
                                       System.out.println("Price:"+price);
                                       System.out.println("Select Quantity:");
                                       int quantiy=s.nextInt();
                                       if(quantiy>0){
                                       price=quantiy*price;
                                       total=price;
                                      }
                                      else{
                                        System.out.println("INVALID QUANTITY");
                                 }
                                        break;
                                    }
                                    case 2:{
                                        int price=320;
                                System.out.println("CHICKEN BIRIYANI");
                                System.out.println("Price:"+price);
                                System.out.println("Select Quantity:");
                                int quantiy=s.nextInt();
                                if(quantiy>0){
                                price=quantiy*price;
                                total=price;
                                }
                                else{
                                  System.out.println("INVALID QUANTITY");
                                }
                                        break;
                                    }
                                    case 3:{
                                        int price=90;
                                System.out.println("VEG RICE");
                                System.out.println("Price:"+price);
                                System.out.println("Select Quantity:");
                                int quantiy=s.nextInt();
                                if(quantiy>0){
                                price=quantiy*price;
                                total=price;
                                }
                                else{
                                  System.out.println("INVALID QUANTITY");
                                }
                                        break;
                                    }
                                    default:{
                                        System.out.println("INVALID CHOICE");
                                        break;
                                    }
                                }
                                break;
                            }
                            case 3:{
                                System.out.println("SELECT FOOD");
                                System.out.println("1.PORATHA");
                                System.out.println("2.DOSA");
                                System.out.println("3.CHILLI PORATHA");
                                System.out.println("SELECT OPTION:");
                                int choice9=s.nextInt();
                                switch(choice9){
                                    case 1:{
                                        int price=40;
                                       System.out.println("PORATHA");
                                       System.out.println("Price:"+price);
                                       System.out.println("Select Quantity:");
                                       int quantiy=s.nextInt();
                                       if(quantiy>0){
                                       price=quantiy*price;
                                       total=price;
                                      }
                                      else{
                                        System.out.println("INVALID QUANTITY");
                                    }
                                        break;
                                    }
                                    case 2:{
                                        int price=120;
                                System.out.println("DOSA");
                                System.out.println("Price:"+price);
                                System.out.println("Select Quantity:");
                                int quantiy=s.nextInt();
                                if(quantiy>0){
                                price=quantiy*price;
                                total=price;
                                }
                                else{
                                  System.out.println("INVALID QUANTITY");
                                }
                                        break;
                                    }
                                    case 3:{
                                        int price=150;
                                System.out.println("CHILLI PARATHA");
                                System.out.println("Price:"+price);
                                System.out.println("Select Quantity:");
                                int quantiy=s.nextInt();
                                if(quantiy>0){
                                price=quantiy*price;
                                total=price;
                                }
                                else{
                                  System.out.println("INVALID QUANTITY");
                                }
                                        break;
                                    }
                                    default:{
                                        System.out.println("INVALID CHOICE");
                                        break;
                                    }
                                }
                                break;
                            }
                            default:{
                                System.out.println("INVALID CHOICE");
                                break;
                            }
                        }
                        break;
                    }
                    case 3:{
                        System.out.println("1.BREAKFAST");
                        System.out.println("2.LUNCH");
                        System.out.println("3.DINNER");
                        System.out.println("ENTER FOOD CHOICE 1 OR 2 OR 3:");
                        int choice10=s.nextInt();
                        switch(choice10){
                            case 1:{
                                System.out.println("SELECT FOOD");
                                System.out.println("1.SPRING ROLL");
                                System.out.println("2.MOMOS");
                                System.out.println("3.SWEET CORN SOUP");
                                System.out.println("SELECT OPTION:");
                                int choice11=s.nextInt();
                                switch(choice11){
                                    case 1:{
                                        int price=120;
                                       System.out.println("SPRING ROLL");
                                       System.out.println("Price:"+price);
                                       System.out.println("Select Quantity:");
                                       int quantiy=s.nextInt();
                                       if(quantiy>0){
                                       price=quantiy*price;
                                       total=price;
                                      }
                                      else{
                                        System.out.println("INVALID QUANTITY");
                                 }
                                        break;
                                    }
                                    case 2:{
                                        int price=130;
                                       System.out.println("MOMOS");
                                       System.out.println("Price:"+price);
                                       System.out.println("Select Quantity:");
                                       int quantiy=s.nextInt();
                                       if(quantiy>0){
                                       price=quantiy*price;
                                       total=price;
                                      }
                                      else{
                                        System.out.println("INVALID QUANTITY");
                                 }
                                        break;
                                    }
                                    case 3:{
                                        int price=90;
                                       System.out.println("VEG CORN SOUP");
                                       System.out.println("Price:"+price);
                                       System.out.println("Select Quantity:");
                                       int quantiy=s.nextInt();
                                       if(quantiy>0){
                                       price=quantiy*price;
                                       total=price;
                                      }
                                      else{
                                        System.out.println("INVALID QUANTITY");
                                 }
                                        break;
                                    }
                                    default:{
                                        System.out.println("INVALID CHOICE");
                                        break;
                                    }
                                }
                                break;
                            }
                            case 2:{
                                System.out.println("SELECT FOOD");
                                System.out.println("1.CHICKEN FRIED RICE");
                                System.out.println("2.CHICKEN NOODLES");
                                System.out.println("3.GOBI MANCHURIEAN");
                                System.out.println("SELECT OPTION:");
                                int choice12=s.nextInt();
                                switch(choice12){
                                    case 1:{
                                        int price=220;
                                       System.out.println("CHICKEN FRIED RICE");
                                       System.out.println("Price:"+price);
                                       System.out.println("Select Quantity:");
                                       int quantiy=s.nextInt();
                                       if(quantiy>0){
                                       price=quantiy*price;
                                       total=price;
                                      }
                                      else{
                                        System.out.println("INVALID QUANTITY");
                                 }
                                        break;
                                    }
                                    case 2:{
                                        int price=240;
                                       System.out.println("CHICKEN NOODELS");
                                       System.out.println("Price:"+price);
                                       System.out.println("Select Quantity:");
                                       int quantiy=s.nextInt();
                                       if(quantiy>0){
                                       price=quantiy*price;
                                       total=price;
                                      }
                                      else{
                                        System.out.println("INVALID QUANTITY");
                                 }
                                        break;
                                    }
                                    case 3:{
                                        int price=180;
                                       System.out.println("GOBI MANCHURIAN");
                                       System.out.println("Price:"+price);
                                       System.out.println("Select Quantity:");
                                       int quantiy=s.nextInt();
                                       if(quantiy>0){
                                       price=quantiy*price;
                                       total=price;
                                      }
                                      else{
                                        System.out.println("INVALID QUANTITY");
                                 }
                                        break;
                                    }
                                    default:{
                                        System.out.println("INVALID CHOICE");
                                        break;
                                    }
                                }
                                break;
                            }
                            case 3:{
                                System.out.println("SELECT FOOD");
                                System.out.println("1.MIXED FRIED RICE");
                                System.out.println("2.CHICKEN MANCHURIAN");
                                System.out.println("3.HONEY CHILLI POTATO");
                                System.out.println("SELECT OPTION:");
                                int choice13=s.nextInt();
                                switch(choice13){
                                    case 1:{
                                        int price=230;
                                       System.out.println("MIXED FRIED RICE");
                                       System.out.println("Price:"+price);
                                       System.out.println("Select Quantity:");
                                       int quantiy=s.nextInt();
                                       if(quantiy>0){
                                       price=quantiy*price;
                                       total=price;
                                      }
                                      else{
                                        System.out.println("INVALID QUANTITY");
                                 }
                                        break;
                                    }
                                    case 2:{
                                        int price=240;
                                       System.out.println("CHICKEN MANCHURIAN");
                                       System.out.println("Price:"+price);
                                       System.out.println("Select Quantity:");
                                       int quantiy=s.nextInt();
                                       if(quantiy>0){
                                       price=quantiy*price;
                                       total=price;
                                      }
                                      else{
                                        System.out.println("INVALID QUANTITY");
                                 }
                                        break;
                                    }
                                    case 3:{
                                        int price=170;
                                       System.out.println("HONEY CHILLI POTATO");
                                       System.out.println("Price:"+price);
                                       System.out.println("Select Quantity:");
                                       int quantiy=s.nextInt();
                                       if(quantiy>0){
                                       price=quantiy*price;
                                       total=price;
                                      }
                                      else{
                                        System.out.println("INVALID QUANTITY");
                                 }
                                        break;
                                    }
                                    default:{
                                        System.out.println("INVALID CHOICE");
                                        break;
                                    }
                                }
                                break;
                            }
                            default:{
                                System.out.println("INVALID CHOICE");
                                break;
                            }
                        }
                        break;
                    }
                    default:{
                        System.out.println("INVALID CHOICE");
                        break;
                    }
                }

                break;
            }
            case 2:{
                break;
            }
            default:{
                System.out.println("INVALID CHOICE");
            }
        }
        System.out.println("ENTER ORDER NO:");
        int num=s.nextInt();
        s.nextLine();
        System.out.println("ENTER YOUR NAME:");
        String name=s.nextLine();
        System.out.println(" ORDER DETAILS");
        System.out.println("NAME:"+name);
        System.out.println("ORDER NO:"+num);
        System.out.println("TOTAL:"+ total);
        System.out.println("THANK YOU VIST AGAIN!!!");
    }
}
