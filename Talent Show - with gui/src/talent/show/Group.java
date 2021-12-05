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
public class Group extends Applicant implements Representative{
    


    
    public Group(String name, String type, String specification, ArrayList<Individual_info> indTemp) {
        super(name, type, specification, indTemp);
        total_groups_added++;
        
    }
    
    
    @Override
    public String toString() {
        String rep = chooseRep();
        String all = super.toString();
        for(int i = 0; i < ind.size(); i++)
            all += ind.get(i).toString();
        return all +"\n[Representative of the group is: "+rep+"]\n";
    }
    
    @Override
    public String informationEmail()
    {
        String all = "";
        for(int i = 0; i < ind.size(); i++)
            all = all +(i+1) +". [" +ind.get(i).getEmail() +"]\n";
        all += "\n";
        return all;
    }
    
    @Override
    public String chooseRep(){
        int max = 0;
        for(int i = 0; i < ind.size(); i++)
        {
            if(ind.get(max).getAge() <= ind.get(i).getAge())
                max = i;
        }
        String rep = ind.get(max).getName_surname();
        return rep;
    }
    
   
}
