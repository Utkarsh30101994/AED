<<<<<<< HEAD

package System;

/**
 *
 * @author Utkarsh
 */
import Buisness.Value;
import java.time.Period;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import System.Patient;
import java.time.Month;
import java.util.ArrayList;


public class VitalSigns extends Patient{

    
    
    ArrayList<Value> vitalSignhistory= new ArrayList<Value>();
    
    
    int pat;
   
    
    public void VitalSignsMethod(){
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Patient number:");
        pat= Integer.parseInt(sc.nextLine());
        for (int i=0; i<pat;i++)
        {
            Value vs=new Value();
        //VitalSigns vs= new VitalSigns();
        System.out.println("Enter Name");
        String name=sc.next();
        vs.setName(name);
    //Scanner sc= new Scanner(System.in);
    System.out.println("Enter Year of Birth");
   int age_y= sc.nextInt();
    vs.setAge_y(age_y);
    
        System.out.println("Enter Month of Birth");
        int age_m= sc.nextInt();
        vs.setAge_m(age_m);
        
        System.out.println("Enter Date of Birth");
       int  age_d=sc.nextInt();
        vs.setAge_d(age_d);
        //Period p= Period.between(pdate, today);
    LocalDate today= LocalDate.now();
    LocalDate pdate= LocalDate.of(age_y, age_m, age_d);
    Period p= Period.between(pdate, today);
    vs.setAge_y(p.getYears()) ;
            System.out.println(vs.getAge_y() +"age      '''''");
    //System.out.println("Years " +age_y + " Months " + age_m + " Days " + age_d);
    
    System.out.println("Enter respiration rate");
    //Scanner input2=new Scanner(System.in);
    int resp_rate=sc.nextInt();
    vs.setResp_rate(resp_rate);
    
    System.out.println("Enter heart rate");
    //Scanner input3=new Scanner(System.in);
   int  heart_rate=sc.nextInt();
    vs.setHeart_rate(heart_rate);
    
    System.out.println("Enter Blood Pressure");
    //Scanner input4=new Scanner(System.in);
   int  s_BP=sc.nextInt();
    vs.setS_BP(s_BP);
    
    System.out.println("Enter Weight in KGs");
    //Scanner input5=new Scanner(System.in);
   int  weight_k=sc.nextInt();
    vs.setWeight_k(weight_k);
    
    System.out.println("Enter weight in Pounds");
    //Scanner input6=new Scanner(System.in);
   int weight_p=sc.nextInt();
    vs.setWeight_p(weight_p);
    
    vitalSignhistory.add(vs);
    }
        
        //vsh.getVitalSignhistory().add(new VitalSigns(getName(),getAge_d(),getAge_m(),getAge_y()));
    for(Value v : vitalSignhistory)
        {
            System.out.println(v.getName());
            System.out.println(v.getAge_d());
            System.out.println(v.getAge_m());
            System.out.println(v.getAge_y());
            System.out.println(v.getHeart_rate());
            System.out.println(v.getS_BP());
            System.out.println(v.getWeight_k());
            System.out.println(v.getWeight_p());
            
            
        }
    
    System.out.println("Enter vital sign you want to cheack:");
        String vital_name=sc.next();
        System.out.println("Enter patient name");
        String patient_name=sc.next();
        
        ArrayList<Value> searchlist=new ArrayList<Value>();
        
        for(int i=0;i<pat;i++)
        {
            if(vitalSignhistory.get(i).getName().equals(patient_name) )
            {
                searchlist.add(vitalSignhistory.get(i));
                System.out.println(searchlist.get(i).getAge_d()+"&&&&&&&&&&&&&&&&&&&&&");
            }
        }
        Patient p= new Patient();
        boolean b= p.isThisVitalSignNormal(searchlist,vital_name);
        System.out.println(b);
        
}
    
                
   
    
    
    
    public static void main(String[] args) {
           
           VitalSigns vs= new VitalSigns();
           vs.VitalSignsMethod();
           
           
           
           
        }

    
}
    
    
    
    
    


=======

package System;

/**
 *
 * @author Utkarsh
 */
import Buisness.Value;
import java.time.Period;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import System.Patient;
import java.time.Month;
import java.util.ArrayList;


public class VitalSigns extends Patient{

    
    
    ArrayList<Value> vitalSignhistory= new ArrayList<Value>();
    
    
    int pat;
   
    
    public void VitalSignsMethod(){
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Patient number:");
        pat= Integer.parseInt(sc.nextLine());
        for (int i=0; i<pat;i++)
        {
            Value vs=new Value();
        //VitalSigns vs= new VitalSigns();
        System.out.println("Enter Name");
        String name=sc.next();
        vs.setName(name);
    //Scanner sc= new Scanner(System.in);
    System.out.println("Enter Year of Birth");
   int age_y= sc.nextInt();
    vs.setAge_y(age_y);
    
        System.out.println("Enter Month of Birth");
        int age_m= sc.nextInt();
        vs.setAge_m(age_m);
        
        System.out.println("Enter Date of Birth");
       int  age_d=sc.nextInt();
        vs.setAge_d(age_d);
        //Period p= Period.between(pdate, today);
    LocalDate today= LocalDate.now();
    LocalDate pdate= LocalDate.of(age_y, age_m, age_d);
    Period p= Period.between(pdate, today);
    vs.setAge_y(p.getYears()) ;
            System.out.println(vs.getAge_y() +"age      '''''");
    //System.out.println("Years " +age_y + " Months " + age_m + " Days " + age_d);
    
    System.out.println("Enter respiration rate");
    //Scanner input2=new Scanner(System.in);
    int resp_rate=sc.nextInt();
    vs.setResp_rate(resp_rate);
    
    System.out.println("Enter heart rate");
    //Scanner input3=new Scanner(System.in);
   int  heart_rate=sc.nextInt();
    vs.setHeart_rate(heart_rate);
    
    System.out.println("Enter Blood Pressure");
    //Scanner input4=new Scanner(System.in);
   int  s_BP=sc.nextInt();
    vs.setS_BP(s_BP);
    
    System.out.println("Enter Weight in KGs");
    //Scanner input5=new Scanner(System.in);
   int  weight_k=sc.nextInt();
    vs.setWeight_k(weight_k);
    
    System.out.println("Enter weight in Pounds");
    //Scanner input6=new Scanner(System.in);
   int weight_p=sc.nextInt();
    vs.setWeight_p(weight_p);
    
    vitalSignhistory.add(vs);
    }
        
        //vsh.getVitalSignhistory().add(new VitalSigns(getName(),getAge_d(),getAge_m(),getAge_y()));
    for(Value v : vitalSignhistory)
        {
            System.out.println(v.getName());
            System.out.println(v.getAge_d());
            System.out.println(v.getAge_m());
            System.out.println(v.getAge_y());
            System.out.println(v.getHeart_rate());
            System.out.println(v.getS_BP());
            System.out.println(v.getWeight_k());
            System.out.println(v.getWeight_p());
            
            
        }
    
    System.out.println("Enter vital sign you want to cheack:");
        String vital_name=sc.next();
        System.out.println("Enter patient name");
        String patient_name=sc.next();
        
        ArrayList<Value> searchlist=new ArrayList<Value>();
        
        for(int i=0;i<pat;i++)
        {
            if(vitalSignhistory.get(i).getName().equals(patient_name) )
            {
                searchlist.add(vitalSignhistory.get(i));
                System.out.println(searchlist.get(i).getAge_d()+"&&&&&&&&&&&&&&&&&&&&&");
            }
        }
        Patient p= new Patient();
        boolean b= p.isThisVitalSignNormal(searchlist,vital_name);
        System.out.println(b);
        
}
    
                
   
    
    
    
    public static void main(String[] args) {
           
           VitalSigns vs= new VitalSigns();
           vs.VitalSignsMethod();
           
           
           
           
        }

    
}
    
    
    
    
    


>>>>>>> 8852ff898aa7fd44473e054a023d0c25fb4f2b7f
