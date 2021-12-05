/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package talent.show;


import java.util.ArrayList;
import java.util.LinkedHashSet;


/**
 *
 * @author HP
 */
public class ApplicantSys {
      public static ArrayList<Applicant> applicant_list  = new ArrayList();
      public static LinkedHashSet<String> temp = new LinkedHashSet();
      public static LinkedHashSet<String> schedule = new LinkedHashSet();
      public static final double STARTING_TIME = 19;
      public static double end = 0;
      public static double end_time;
      
      
      
      public static void addApplicant(String name, String type, ArrayList<Individual_info> indTemp, String spec) 
      {
          int order = applicant_list.size() + 1;
          if(indTemp.size() == 1)
          {
           Solo s = new Solo(name, type, spec, indTemp);
           s.setId(order);
           //s.ind.add(indTemp.get(0));
           applicant_list.add(s);  
          }else if(indTemp.size() == 2)
          {
              Duo d = new Duo(name, type, spec, indTemp);
           d.setId(order);
           //d.ind.add(indTemp.get(0));
           //d.ind.add(indTemp.get(1));
           applicant_list.add(d);
          }
          else if(indTemp.size() >= 3)
          {
               Group g = new Group(name,type, spec, indTemp);
           g.setId(order);
           /*for(int i = 0; i < indTemp.size(); i++)
           {
               g.ind.add((indTemp.get(i)));
           }*/
           applicant_list.add(g);
          }
      }
      
      public static String[] getApplicant()
      {
          String[] all = new String[applicant_list.size()];
       for(int i = 0; i < applicant_list.size(); i++)
       {
           all[i] = applicant_list.get(i).getName();
       }
       return all;
      }
      
      
       public static boolean deleteApplicant(int id){
           int i;
           for(i = 0; i < applicant_list.size(); i++){
               int no = applicant_list.get(i).getId();
               if(id == no){
                   applicant_list.remove(i);
                   return true;
               }
           }return false;
       }
       
        public static boolean deleteApplicant(String title){
           int i;
           for(i = 0; i < applicant_list.size(); i++){
               String name = applicant_list.get(i).getName();
               if(name.equals(title)){
                   applicant_list.remove(i);
                   return true;
               }
           }return false;
       }
       
       public static Applicant searchApplicant(String title)
       {
           for(int i = 0; i < applicant_list.size(); i++)
           {
               String name = applicant_list.get(i).getName();
               if(name.equals(title))
                   return applicant_list.get(i);
           }
           return null;
   }
   
       public static String display(){
       
        String all = "";
        for(int i = 0; i < ApplicantSys.applicant_list.size(); i++)
           {
               all += ApplicantSys.applicant_list.get(i).toString() +"\n\n";   
               }
       return all;
      }
   
       
       public static String listOfApplicants()
    {
        if(!applicant_list.isEmpty())
        {
       String all = "[Short list of applications(ID/Name/Type)]\n--------------------------------\n";
        for(int i = 0; i < ApplicantSys.applicant_list.size(); i++)
           all += "  " +ApplicantSys.applicant_list.get(i).getId() +"  " +ApplicantSys.applicant_list.get(i).name + "  ["+ApplicantSys.applicant_list.get(i).type +"]\n";
        all += "--------------------------------";
        all += "\n[Number of applicants is]: " +ApplicantSys.applicant_list.size();
        return all;} else return null;
    } 
       
    
      public static void createSchedule(double lgh)
      {
          
          double start = 19.05;
          int i;
          
          
          
          
          
          lgh *= 0.01;
          System.out.println(lgh);
          
          
          for(String nameTemp: temp)
          {
              end = start + lgh;
              start = (int)(Math.round(start * 100))/100.0;
              if((end > 19.59 && end < 19.99) || (end > 20.59 && end < 20.99) || (end > 21.59 && end < 21.99))
                  end += 0.40;
              
              end = (int)(Math.round(end * 100))/100.0;
              schedule.add(nameTemp + " -> start: " +start +" end: " +end);
              //breaks will be 3 minutes
              start = end + 0.03;
              if((start > 19.59 && start < 19.99) || (start > 20.59 && start < 20.99) || (start > 21.59 && start < 21.99))
                  start += 0.40;
              start = (int)(Math.round(start * 100))/100.0;
              
          }
          end_time = end + 0.15;
          if((end_time > 19.59 && end_time < 19.99) || (end_time > 20.59 && end_time < 20.99) || (end_time > 21.59 && end_time < 21.99))
                  end_time += 0.40;
           end_time = (int)(Math.round(end_time * 100))/100.0;
          
          
     }      
     
      public static String displaySchedule()
      {
          String all = "Schedule not created yet.";
          if(temp.size() >= 3 && temp.size() <=12){
              all = "     [SCHEDULE]\n---------------------------\n[Intro] -> start: 19.00 end: 19.05\n";
          for (String s : schedule) 
            all += s + "\n";
          //end = end + 0.05;
           if((end > 19.59 && end < 19.99) || (end > 20.59 && end < 20.99) || (end > 21.59 && end < 21.99))
                  end -= 0.40;
          end = (int)(Math.round(end * 100))/100.0;
           
             
             
        all += "[Voting] -> start: " +end +" end: " +end_time; 
          }
         return all;
      }
      
      public static String emailList(){
          String all = "";
          if(!temp.isEmpty()){
              
          all += "[Email list]: \n--------------\n";
          
          for(String tempName : temp)
          {
              all += (searchApplicant(tempName)).informationEmail();
          }
          }
          return all;
          
      }
      
     
}
