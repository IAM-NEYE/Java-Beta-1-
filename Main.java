/*Program that assigns any value to variable 'purchase' and then calculates the discounted price*/
class Main
{
  public static void main(String[] args) 
  {
    /*variable declaration, assignment and computation*/
      int purchase=5500; //enter amount here
      int discount=10;
      double amount=purchase-(purchase*discount)/100;
        //Display
      
    if(purchase>=5000)
      {
           System.out.println("purchase :"+purchase+"Rs");
           System.out.println("discount :"+discount+"%");
           System.out.println("Total amount :"+amount+"Rs");    
      }//end of if
    else
        {System.out.println("total amount :"+purchase+"Rs");
          }//end of else
  }//end of main
}//end of class