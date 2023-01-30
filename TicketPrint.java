package TheatreOperations;

import java.text.SimpleDateFormat;
import java.io.FileWriter;
import java.io.IOException;

public class TicketPrint {

	public static void FileWriter(Ticket t1) {
          
		

        String timeStamp=new SimpleDateFormat("dd/MM/yyyy").format(new java.util.Date());
		String timeStamp2=new SimpleDateFormat("dd.MM.yyyy.HH.mm.ss").format(new java.util.Date());
		
              
		
			try {
                          
				
                String path="C:\\Users\\lenovo\\Desktop\\Tickets\\ticket"+t1.getCustomer().getCustomerName()+timeStamp2+".txt";
				FileWriter mywrite=new FileWriter(path);
				
				mywrite.write("**********TICKET ***********\n");
			    mywrite.write("DATE :- "+timeStamp);
				mywrite.write("\n----------------------------------------------------------------------\n");
				mywrite.write("NAME :- "+t1.getCustomer().getCustomerName()+"\n");
				mywrite.write(t1.customer.getShowtime().toUpperCase()+" SHOW "+" : Drishyam 2 "+"\n");
				mywrite.write("NO OF SEATS :- "+t1.getCustomer().getChoiceOfSeats().length);
				mywrite.write("\nTICKETS :- ");
				for(int i=0;i<t1.getCustomer().getChoiceOfSeats().length;i++) {
					mywrite.write(t1.getCustomer().getChoiceOfSeats()[i]+" ");
				}
				mywrite.write("\nPRICE :- "+t1.getPrice()+"\n");
				

				
				mywrite.write("\n***********THANK YOU**********\n");
				mywrite.close();
				System.out.println("Ticket Issued!!");
				
			} catch (IOException e) {
				System.out.println(e);
			}

  }
      
}