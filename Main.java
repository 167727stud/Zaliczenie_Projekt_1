import java.util.Scanner;
class Main {
  Scanner myInput = new Scanner( System.in );
  
  public static void main(String[] args) 
{ 
    Double I1;
    Double I2;
    Double I3;

    System.out.print( "Obliczanie wartości prądów płynącym w układzie =>V1=>R1=>" );
    System.out.print( "(R2||D1)=>" );
  System.out.print(System.lineSeparator());
   Scanner myInput = new Scanner( System.in );
   System.out.print( "Wprowadź napięcie zasilania  " );
   double V1 = myInput.nextInt();
  System.out.print(System.lineSeparator());
   System.out.print( "Wprowadź Rezystancje 1   " );
   double R1 = myInput.nextInt();
  System.out.print(System.lineSeparator());
   System.out.print( "Wprowadź Rezystancje 2   " );
   double R2 = myInput.nextInt();
    if ( V1 >0 ){
      System.out.print(System.lineSeparator());
   System.out.print( "Wprowadź Napięcie Ud diody   " );
   double Ud = myInput.nextInt();
     if(V1<=Ud)
     {
       I1=I2=(V1/(R1+R2));
       System.out.print(System.lineSeparator());
       System.out.println("Prądy I1 i I2 są sobie równe i wynoszą  "+I1);
       
     }else
     {
      I1=((V1-Ud)/R1);
      I2=(Ud/R2);
      I3=I1-I2;
      System.out.println("Prądy to odpowiednio I1= "+I1);
      System.out.print(System.lineSeparator());
      System.out.println("Prądy to odpowiednio I2= "+I2);
      System.out.print(System.lineSeparator());
      System.out.println("Prądy to odpowiednio Id= "+I3);
      System.out.print(System.lineSeparator());
     }}
      
     if(V1<=0){
      System.out.print(System.lineSeparator());
      System.out.print( "Wprowadź Napięcie Zenera lub przebicia diody  " );
      double Uz = myInput.nextInt();
       double V2=-V1;
      if(V2>=Uz)
     {
       I1=I2=(V1/(R1+R2));
       System.out.print(System.lineSeparator());
       System.out.println("Prądy  I1 i I2 są sobie równe i wynoszą  "+I1);
       
     }else
     {
      I1=((V1-Uz)/R1);
      I2=(Uz/R2);
      I3=I1-I2;
      System.out.println("Prądy to odpowiednio I1=  "+I1);
      System.out.print(System.lineSeparator());
      System.out.println("Prądy to odpowiednio I2=  "+I2);
      System.out.print(System.lineSeparator());
      System.out.println("Prądy to odpowiednio Id=  "+I3);
      System.out.print(System.lineSeparator());
     }
       
     }

}}


