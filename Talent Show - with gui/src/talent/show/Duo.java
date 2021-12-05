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
public class Duo extends Applicant implements Representative{
    
   


    public Duo(String name, String type, String specification, ArrayList<Individual_info> indTemp) {
        super(name, type, specification, indTemp);
         total_duos_added++;
    }
    

    @Override
    public String toString() {
        String rep = chooseRep();
        String all = super.toString();
        for(int i = 0; i < 2; i++)
            all += ind.get(i).toString();
       return all +"\n[Representative of the duo is: " +rep +"]\n";
    }

    @Override
     public String informationEmail(){
         return "[" +ind.get(0).getEmail() +"] & [" +ind.get(1).getEmail() +"]\n\n";
     }
     
    @Override
    public String chooseRep()
    {
        String rep;
        if(ind.get(0).getAge() <= ind.get(1).getAge())
        rep = ind.get(1).getName_surname();
        else rep = ind.get(0).getName_surname();
        return rep;
    }
   
     
}
