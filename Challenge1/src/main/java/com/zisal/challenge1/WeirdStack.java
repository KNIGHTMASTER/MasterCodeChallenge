package com.zisal.challenge1;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author <a href="fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
public class WeirdStack<T> {  

    List<T> items;
    Integer popSize;
    
    public WeirdStack(Integer p_popSize) {
        this.popSize = p_popSize;
        items = new ArrayList<T>();
    }
    
    public void push(Integer p_Data){        
        items.add((T) p_Data);
    }
    
    public List<Integer> pop(){
        List<Integer> result = new ArrayList<>();
        for(int a=0; a<popSize; a++){
            int index = popSize-a;
            if (index >= items.size()){
                index--;
            }
            result.add((Integer) items.get(index));
            items.remove(index);
        }        
        return result;
    }        

    public void setPopSize(Integer p_PopSize) {
        this.popSize = p_PopSize;
    }        
}
