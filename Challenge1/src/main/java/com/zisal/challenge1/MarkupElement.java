package com.zisal.challenge1;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author <a href="fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
public class MarkupElement {

    protected String content;
    protected String output;
    protected String openingTag;
    protected String closingTag;
    protected List<MarkupElement> children = new ArrayList<>();
    
    public MarkupElement(String openingTag, String closingTag){
        this.openingTag = openingTag;
        this.closingTag = closingTag;        
        output = openingTag.concat(closingTag);
    }

    public void setContent(String content) {
        this.content = content;
        output = openingTag + content + closingTag;
    }
    
    public String produceOutput(){
        if(children.size() >= 1){
            for(MarkupElement markupElement : children){                
                output = openingTag.concat(markupElement.produceOutput()).concat(closingTag);
            }            
        }
        return output;
    }
    
    public void addChildren(MarkupElement element){
        children.add(element);
    }
}
