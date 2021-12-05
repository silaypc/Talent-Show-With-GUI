/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package talent.show;

import java.util.ArrayList;



/**
 *
 * @author HP
 */
public abstract class Applicant {
    protected int id;
    protected String name;
    protected String type;
    protected String specification;
    public static int total_groups_added = 0;
    public static int total_duos_added = 0;
    public static int total_solos_added = 0;
    protected ArrayList<Individual_info> ind = new ArrayList();
   
   
    
    

    public Applicant(String name, String type, String specification, ArrayList<Individual_info> indTemp) {
        this.id = 0;
        this.name = name;
        this.type = type;
        this.specification = specification;
        for(int i = 0; i < indTemp.size(); i++)
           {
               this.ind.add((indTemp.get(i)));
           }
    }

    public Applicant() {
        
    }

    @Override
    public String toString() {
        return "        [APPLICANT]\nApplicant ID: "+id +"\nShow Name: " +name +"\nType: " +type + "\n---------------\n" +specification;
    }
    
    
    //GETTERS AND SETTERS START

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

 
   public void setSpecification(String spec)
   {
       this.specification = spec;
               
   }
    
   
    
    //GETTERS AND SETTERS END
    
   public abstract String informationEmail();
   
  
   
   public static String formAddStatus(){
       String all = "[You have added " +(total_groups_added + total_solos_added +total_duos_added) +" application forms]\n["+total_groups_added +" groups]  ["+total_duos_added +" duos]  [" +total_solos_added +" solos]\n"
               + "[And deleted " +((total_groups_added + total_solos_added +total_duos_added)- ApplicantSys.applicant_list.size())+"]";
       return all;
   }
    
}
