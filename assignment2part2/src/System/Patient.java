/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System;

/**
 *
 * @author Utkarsh
 */
import Buisness.Value;

import java.util.ArrayList;


public class Patient {

    /**
     *
     * @param searchlist
     * @param vital_name
     * @return
     */
    public boolean isThisVitalSignNormal(ArrayList<Value> searchlist, String vital_name) {
        
       
       
       Value vs;
        boolean b=true;
        //System.out.println("Enter the Name");
        //Scanner input= new Scanner(System.in);
        
        
        vs= searchlist.get(searchlist.size()-1);
        System.out.println(vs.getAge_d() +"Age in days, age in months, age in years" +vs.getAge_m() + vs.getAge_y());
        
        if(vs.getAge_d()<30){
            if(vital_name.contains("resp_rate")){
                    if(vs.getResp_rate()>=30 &&vs.getResp_rate()<=50){
                        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
                    }else{
                        b=false;
                    }
        }
        else if(vital_name.contains("heart_rate")){
                    if(vs.getHeart_rate()>=120&&vs.getHeart_rate()<=160){
                    }else{
                        b=false;
                    }
             }
        else if(vital_name.contains("s_BP")){
                    if(vs.getS_BP()>=50&&vs.getS_BP()<=70){
                    }else{
                        b=false;
                    }
                }
            else if(vital_name.contains("weight_k")){
                    if(vs.getWeight_k()>=2&&vs.getWeight_k()<=3){
                    }else{
                        b=false;
                    }
                }
            else if(vital_name.contains("weight_p")){
                    if(vs.getWeight_p()>=4.5&&vs.getWeight_p()<=7){
                    }else{
                        b=false;
                    }
                }
            
    }
        else if(vs.getAge_m()<12){
            
            if(vital_name.contains("resp_rate")){
                    if(vs.getResp_rate()>=20 &&vs.getResp_rate()<=30){
                    }else{
                        b=false;
                    }
                }else if(vital_name.contains("heart_rate")){
                    if(vs.getHeart_rate()>=180&&vs.getHeart_rate()<=140){
                    }else{
                        b=false;
                    }
                }else if(vital_name.contains("s_BP")){
                    if(vs.getS_BP()>=70&&vs.getS_BP()<=100){
                    }else{
                        b=false;
                    }
                }else if(vital_name.contains("weight_k")){
                    if(vs.getWeight_k()>=4&&vs.getWeight_k()<=10){
                    }else{
                        b=false;
                    }
                }else if(vital_name.contains("weight_p")){
                    if(vs.getWeight_p()>=9&&vs.getWeight_p()<=22){
                    }else{
                        b=false;
                    }
                }
            
    }
        else if(vs.getAge_y()<= 3){
                        
            if(vital_name.contains("resp_rate")){
                    if(vs.getResp_rate()>=20 &&vs.getResp_rate()<=30){
                    }else{
                        b=false;
                    }
                }else if(vital_name.contains("heart_rate")){
                    if(vs.getHeart_rate()>=80&&vs.getHeart_rate()<=130){
                    }else{
                        b=false;
                    }
                }else if(vital_name.contains("s_BP")){
                    if(vs.getS_BP()>=80&&vs.getS_BP()<=110){
                    }else{
                        b=false;
                    }
                }else if(vital_name.contains("weight_k")){
                    if(vs.getWeight_k()>=10&vs.getWeight_k()<=14){
                    }else{
                        b=false;
                    }
                }else if(vital_name.contains("weight_p")){
                    if(vs.getWeight_p()>=22&&vs.getWeight_p()<=31){
                    }else{
                        b=false;
                    }
                }
        
        }
        else if(vs.getAge_y()<72){
                        
            if(vital_name.contains("resp_rate")){
                    if(vs.getResp_rate()>=20 &&vs.getResp_rate()<=30){
                    }else{
                        b=false;
                    }
                }else if(vital_name.contains("heart_rate")){
                    if(vs.getHeart_rate()>=80&&vs.getHeart_rate()<=120){
                    }else{
                        b=false;
                    }
                }else if(vital_name.contains("s_BP")){
                    if(vs.getS_BP()>=80&&vs.getS_BP()<=110){
                    }else{
                        b=false;
                    }
                }else if(vital_name.contains("weight_k")){
                    if(vs.getWeight_k()>=14&&vs.getWeight_k()<=18){
                    }else{
                        b=false;
                    }
                }else if(vital_name.contains("weight_p")){
                    if(vs.getWeight_p()>=31&&vs.getWeight_p()<=40){
                    }else{
                        b=false;
                    }
                }
        }
        else if(vs.getAge_y()<=12){
                        
            if(vital_name.contains("resp_rate")){
                    if(vs.getResp_rate()>=20 &&vs.getResp_rate()<=30){
                    }else{
                        b=false;
                    }
                }else if(vital_name.contains("heart_rate")){
                    if(vs.getHeart_rate()>=70&&vs.getHeart_rate()<=110){
                    }else{
                        b=false;
                    }
                }else if(vital_name.contains("s_BP")){
                    if(vs.getS_BP()>=80&&vs.getS_BP()<=120){
                    }else{
                        b=false;
                    }
                }else if(vital_name.contains("weight_k")){
                    if(vs.getWeight_k()>=20&&vs.getWeight_k()<=42){
                    }else{
                        b=false;
                    }
                }else if(vital_name.contains("weight_p")){
                    if(vs.getWeight_p()>=41&&vs.getWeight_p()<=92){
                    }else{
                        b=false;
                    }
                }
        
        }else if(vs.getAge_y()>=13){
                        
             if(vital_name.contains("resp_rate")){
                    if(vs.getResp_rate()>=12 &&vs.getResp_rate()<=20){
                    }else{
                        b=false;
                    }
                }else if(vital_name.contains("heart_rate")){
                    if(vs.getHeart_rate()>=55&&vs.getHeart_rate()<=105){
                    }else{
                        b=false;
                    }
                }else if(vital_name.contains("s_BP")){
                    if(vs.getS_BP()>=110&&vs.getS_BP()<=120){
                    }else{
                        b=false;
                    }
                }else if(vital_name.contains("weight_k")){
                    if(vs.getWeight_k()>50){
                    }else{
                        b=false;
                    }
                }else if(vital_name.contains("weight_p")){
                    if(vs.getWeight_p()>110){
                    }else{
                        b=false;
                    }
                }
        
        }
            return b;
    }
}