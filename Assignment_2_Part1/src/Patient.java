
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Utkarsh
 */
public class Patient {
      private static int age;
    
    
    
    public static void main(String[] args){
    Scanner sn = new Scanner(System.in);
    VitalSigns vs = new VitalSigns();
    
    

    System.out.println("Enter Year: ");
    int years = sn.nextInt();
    vs.setYears(years);
    System.out.println("Enter Month: ");
    int months = sn.nextInt();
    vs.setMonths(months);
    System.out.println("Enter date: ");
    int days = sn.nextInt();
    vs.setDays(days);
    System.out.println("Enter Respiratory Rate: ");
    int respiratoryRate = sn.nextInt();
    vs.setRespiratoryRate(respiratoryRate);
    System.out.println("Enter the Heart Rate : ");
    int heartRate = sn.nextInt();
    vs.setHeartRate(heartRate);
    System.out.println("Enter Blood Pressure: ");
    int systolicBloodPressure = sn.nextInt();
    vs.setSystolicBloodPressure(systolicBloodPressure);
    System.out.println("Enter Weight In Kilos : ");
    int weightInKilos = sn.nextInt();
    vs.setWeightInKilos(weightInKilos);
    System.out.println("Enter Weight In Pounds : ");
    double weightInPouds = sn.nextDouble();
    vs.setWeightInPounds(weightInPouds);
    System.out.println("Patient 7: " +vs);
          boolean isNormal = isPatientNormal(vs);
        if(isNormal == true){
            System.out.println(" Patient is normal");
        }
        else{
            System.out.println("Patient is Abnormal");
        }
    }
    
    public static boolean isPatientNormal(VitalSigns vs)
    {
    System.out.println("Date" + vs.getYears());
    LocalDate birthday = LocalDate.of(vs.getYears(),vs.getMonths(),vs.getDays());
    LocalDate now = LocalDate.now();
    Period diff = Period.between(birthday, now);
    System.out.println(diff.getYears() + "years" + diff.getMonths() + "months" + diff.getDays() + "days");
    
// newborn

if (diff.getYears()==0){
    if(diff.getMonths()==0){
        if(vs.getRespiratoryRate()>=30 && vs.getRespiratoryRate()<=50){  
            
           if (vs.getHeartRate()>=120 && vs.getHeartRate()<=160){
                
               if (vs.getSystolicBloodPressure()>=50 && vs.getSystolicBloodPressure()<=70){
                    
                   if (vs.getWeightInKilos()>=2 && vs.getWeightInKilos()<=3){
                       
                       if (vs.getWeightInPounds()>=4.5 && vs.getWeightInPounds()<=7){
                          
                            return true;
                       }
                        else{
                           if(vs.getWeightInPounds()< 4.5 ){
                               System.out.println("Patient Weight in Pounds is Ab-Normal i.e less than 4.5");
                           }
                           else if(vs.getWeightInPounds()>7){
                              System.out.println("Patient Weight in Pounds is Ab-Normal i.e greater than 7");
                           }
                           return false;
                       }
                   }
                    else {
                       if (vs.getWeightInKilos()<2 ){
                        System.out.println("Patient weightInKilos is Ab-Normal i.e less than 2");
                       }
                       else if(vs.getWeightInKilos()<3){
                        System.out.println("Patient Weight in Kilos is Ab-Normal i.e greater than 3");
                        }
                        return false;
                    }
               }else {
                    if (vs.getSystolicBloodPressure()<50 ){
                        System.out.println("Patient SystolicBloodPressure is Ab-Normal i.e less than 50");
                       }
                       else if(vs.getSystolicBloodPressure()>70){
                        System.out.println("Patient SystolicBloodPressure is Ab-Normal i.e greater than 70");
                        }
                       return false;
                    }
            }else{
                if (vs.getHeartRate()<120 ){
                    System.out.println("Patient HeartRate is Ab-Normal i.e less than 120");
                    }
                    else if(vs.getHeartRate()>160){
                        System.out.println("Patient HeartRate is Ab-Normal i.e greater than 160");
                        }
                    return false;
                }
        }else{
            if (vs.getRespiratoryRate()<30 ){
                System.out.println("Patient RespiratoryRate is Ab-Normal i.e less than 30");
                }
                    else if(vs.getRespiratoryRate()>50){
                        System.out.println("Patient RespiratoryRate is Ab-Normal i.e greater than 50");
                        }
                    return false;
                    }
    }
}       

// infant    
if(diff.getYears()==0){
    if (diff.getMonths()<1){
        if(vs.getRespiratoryRate()>=20 && vs.getRespiratoryRate()<=30){  
                
                if (vs.getHeartRate()>=80 && vs.getHeartRate()<=140){
                    
                   if (vs.getSystolicBloodPressure()>=70 && vs.getSystolicBloodPressure()<=100){
                        
                        if (vs.getWeightInKilos()>=4 && vs.getWeightInKilos()<=10){
                          
                            if (vs.getWeightInPounds()>=9 && vs.getWeightInPounds()<=22){
                                
                                return true;
                            }
                            else{
                           if(vs.getWeightInPounds()< 9){
                               System.out.println("Patient Weight in Pounds is Ab-Normal i.e less than 9");
                           }
                           else if(vs.getWeightInPounds()>22){
                              System.out.println("Patient Weight in Pounds is Ab-Normal i.e greater than 22");
                           }
                           return false;
                       }
                   }
                    else {
                       if (vs.getWeightInKilos()<4 ){
                        System.out.println("Patient WeightInKilos is Ab-Normal i.e less than 4");
                       }
                       else if(vs.getWeightInKilos()<10){
                        System.out.println("Patient Weight in Kilos is Ab-Normal i.e greater than 10");
                        }
                        return false;
                    }
               }else {
                    if (vs.getSystolicBloodPressure()<70 ){
                        System.out.println("Patient SystolicBloodPressure is Ab-Normal i.e less than 70");
                       }
                       else if(vs.getSystolicBloodPressure()>100){
                        System.out.println("Patient SystolicBloodPressure is Ab-Normal i.e greater than 100");
                        }
                       return false;
                    }
            }else{
                if (vs.getHeartRate()<80 ){
                    System.out.println("Patient HeartRate is Ab-Normal i.e less than 80");
                    }
                    else if(vs.getHeartRate()>140){
                        System.out.println("Patient HeartRate is Ab-Normal i.e greater than 140");
                        }
                    return false;
                }
        }else{
            if (vs.getRespiratoryRate()<20 ){
                System.out.println("Patient RespiratoryRate is Ab-Normal i.e less than 20");
                }
                    else if(vs.getRespiratoryRate()>30){
                        System.out.println("Patient RespiratoryRate is Ab-Normal i.e greater than 30");
                        }
                    return false;
                    }
    }
}

// toodler                                
    if (diff.getYears()>=1 && diff.getYears()<=3){
        if(vs.getRespiratoryRate()>=20 && vs.getRespiratoryRate()<=30){  
            
            if (vs.getHeartRate()>=80 && vs.getHeartRate()<=130){
               
                if (vs.getSystolicBloodPressure()>=80 && vs.getSystolicBloodPressure()<=110){
                    
                    if (vs.getWeightInKilos()>=10 && vs.getWeightInKilos()<=14){
                        
                        if (vs.getWeightInPounds()>=22 && vs.getWeightInPounds()<=31){
                            
                            return true;
                        }
                        else{
                           if(vs.getWeightInPounds()< 22 ){
                               System.out.println("Patient Weight in Pounds is Ab-Normal i.e less than 22");
                           }
                           else if(vs.getWeightInPounds()>31){
                              System.out.println("Patient Weight in Pounds is Ab-Normal i.e greater than 31");
                           }
                           return false;
                       }
                   }
                    else {
                       if (vs.getWeightInKilos()<10){
                        System.out.println("Patient WeightInKilos is Ab-Normal i.e less than 10");
                       }
                       else if(vs.getWeightInKilos()>14){
                        System.out.println("Patient Weight in Kilos is Ab-Normal i.e greater than 14");
                        }
                        return false;
                    }
               }else {
                    if (vs.getSystolicBloodPressure()<80 ){
                        System.out.println("Patient SystolicBloodPressure is Ab-Normal i.e less than 80");
                       }
                       else if(vs.getSystolicBloodPressure()>110){
                        System.out.println("Patient SystolicBloodPressure is Ab-Normal i.e greater than 110");
                        }
                       return false;
                    }
            }else{
                if (vs.getHeartRate()<80 ){
                    System.out.println("Patient HeartRate is Ab-Normal i.e less than 80");
                    }
                    else if(vs.getHeartRate()>130){
                        System.out.println("Patient HeartRate is Ab-Normal i.e greater than 130");
                        }
                    return false;
                }
        }else{
            if (vs.getRespiratoryRate()<20 ){
                System.out.println("Patient RespiratoryRate is Ab-Normal i.e less than 20");
                }
                    else if(vs.getRespiratoryRate()>30){
                        System.out.println("Patient RespiratoryRate is Ab-Normal i.e greater than 30");
                        }
                    return false;
                    }
    }
//preschooler
    if (diff.getYears()<=3 && diff.getYears()<=5){
        if(vs.getRespiratoryRate()>=20 && vs.getRespiratoryRate()<=30){  
           
            if (vs.getHeartRate()>=80 && vs.getHeartRate()<=120){
               
                if (vs.getSystolicBloodPressure()>=80 && vs.getSystolicBloodPressure()<=110){
                    
                    if (vs.getWeightInKilos()>=14 && vs.getWeightInKilos()<=18){
                      
                        if (vs.getWeightInPounds()>=31 && vs.getWeightInPounds()<=40){
                            
                            return true;
                        }
                        else{
                           if(vs.getWeightInPounds()< 31 ){
                               System.out.println("Patient Weight in Pounds is Ab-Normal i.e less than 31");
                           }
                           else if(vs.getWeightInPounds()>40){
                              System.out.println("Patient Weight in Pounds is Ab-Normal i.e greater than 40");
                           }
                           return false;
                       }
                   }
                    else {
                       if (vs.getWeightInKilos()<14 ){
                        System.out.println("Patient WeightInKilos is Ab-Normal i.e less than 14");
                       }
                       else if(vs.getWeightInKilos()>18){
                        System.out.println("Patient Weight in Kilos is Ab-Normal i.e greater than 18");
                        }
                        return false;
                    }
               }else {
                    if (vs.getSystolicBloodPressure()<80 ){
                        System.out.println("Patient SystolicBloodPressure is Ab-Normal i.e less than 80");
                       }
                       else if(vs.getSystolicBloodPressure()>110){
                        System.out.println("Patient SystolicBloodPressure is Ab-Normal i.e greater than 110");
                        }
                       return false;
                    }
            }else{
                if (vs.getHeartRate()<80 ){
                    System.out.println("Patient HeartRate is Ab-Normal i.e less than 80");
                    }
                    else if(vs.getHeartRate()>120){
                        System.out.println("Patient HeartRate is Ab-Normal i.e greater than 120");
                        }
                    return false;
                }
        }else{
            if (vs.getRespiratoryRate()<20 ){
                System.out.println("Patient RespiratoryRate is Ab-Normal i.e less than 20");
                }
                    else if(vs.getRespiratoryRate()>30){
                        System.out.println("Patient RespiratoryRate is Ab-Normal i.e greater than 30");
                        }
                    return false;
                    }
    }
                    
//school age
    if (diff.getYears()>=6 && diff.getYears()<=12){
        if(vs.getRespiratoryRate()>=20 && vs.getRespiratoryRate()<=30){  
          
            if (vs.getHeartRate()>=70 && vs.getHeartRate()<=110){
              
                if (vs.getSystolicBloodPressure()>=80 && vs.getSystolicBloodPressure()<=120){
                    
                    if (vs.getWeightInKilos()>=20 && vs.getWeightInKilos()<=42){
                       
                        if (vs.getWeightInPounds()>=41 && vs.getWeightInPounds()<=92){
                            
                            return true;
                        }
                        else{
                           if(vs.getWeightInPounds()< 41 ){
                               System.out.println("Patient Weight in Pounds is Ab-Normal i.e less than 41");
                           }
                           else if(vs.getWeightInPounds()>92){
                              System.out.println("Patient Weight in Pounds is Ab-Normal i.e greater than 92");
                           }
                           return false;
                       }
                   }
                    else {
                       if (vs.getWeightInKilos()<20 ){
                        System.out.println("Patient weightInKilos is Ab-Normal i.e less than 20");
                       }
                       else if(vs.getWeightInKilos()>42){
                        System.out.println("Patient Weight in Kilos is Ab-Normal i.e greater than 42");
                        }
                        return false;
                    }
               }else {
                    if (vs.getSystolicBloodPressure()<80 ){
                        System.out.println("Patient SystolicBloodPressure is Ab-Normal i.e less than 80");
                       }
                       else if(vs.getSystolicBloodPressure()>120){
                        System.out.println("Patient SystolicBloodPressure is Ab-Normal i.e greater than 120");
                        }
                       return false;
                    }
            }else{
                if (vs.getHeartRate()<70 ){
                    System.out.println("Patient HeartRate is Ab-Normal i.e less than 70");
                    }
                    else if(vs.getHeartRate()>110){
                        System.out.println("Patient HeartRate is Ab-Normal i.e greater than 110");
                        }
                    return false;
                }
        }else{
            if (vs.getRespiratoryRate()<20 ){
                System.out.println("Patient RespiratoryRate is Ab-Normal i.e less than 20");
                }
                    else if(vs.getRespiratoryRate()>30){
                        System.out.println("Patient RespiratoryRate is Ab-Normal i.e greater than 30");
                        }
                    return false;
                    }
    }   
            
// adolescent                                                           
    if (diff.getYears()>=13){
        if(vs.getRespiratoryRate()>=12 && vs.getRespiratoryRate()<=20){  
            
            if (vs.getHeartRate()>=55 && vs.getHeartRate()<=105){
               
                if (vs.getSystolicBloodPressure()>=110 && vs.getSystolicBloodPressure()<=120){
                    
                    if (vs.getWeightInKilos()>50){
                       
                        if (vs.getWeightInPounds()>110){
                                
                            return true;
                        }
                    else{
                           if(vs.getWeightInPounds()<110 ){
                               System.out.println("Patient Weight in Pounds is Ab-Normal i.e less than 110");
                           }
                           return false;
                       }
                   }
                    else {
                       if (vs.getWeightInKilos()<50 ){
                        System.out.println("Patient WeightInKilos is Ab-Normal i.e less than 50");
                       }
                        return false;
                    }
               }else {
                    if (vs.getSystolicBloodPressure()<110 ){
                        System.out.println("Patient SystolicBloodPressure is Ab-Normal i.e less than 110");
                       }
                       else if(vs.getSystolicBloodPressure()>120){
                        System.out.println("Patient SystolicBloodPressure is Ab-Normal i.e greater than 120");
                        }
                       return false;
                    }
            }else{
                if (vs.getHeartRate()<55){
                    System.out.println("Patient HeartRate is Ab-Normal i.e less than 55");
                    }
                    else if(vs.getHeartRate()>105){
                        System.out.println("Patient HeartRate is Ab-Normal i.e greater than 105");
                        }
                    return false;
                }
        }else{
            if (vs.getRespiratoryRate()<12 ){
                System.out.println("Patient RespiratoryRate is Ab-Normal i.e less than 12");
                }
                    else if(vs.getRespiratoryRate()>20){
                        System.out.println("Patient RespiratoryRate is Ab-Normal i.e greater than 20");
                        }
                    return false;
                    }
    }    
return true;
}
    
}
