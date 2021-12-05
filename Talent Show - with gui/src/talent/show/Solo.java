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
public class Solo extends Applicant{
    
    

    public Solo(String name, String type, String specification, ArrayList<Individual_info> indTemp) {
        super(name, type, specification, indTemp);
        total_solos_added++;
    }
    


    @Override
    public String toString() {
        return super.toString() + ind.get(0).toString() +"\n";
    }
     
     
     @Override
     public String informationEmail(){
         return "[" +ind.get(0).getEmail() +"]\n\n";
     }
   
}
