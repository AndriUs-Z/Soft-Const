package Ex2;

import java.util.Iterator;

public class NameRepository implements Containers {

    String[] names = {"John","May","Ryan"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }
    
    private class NameIterator implements Iterator{ 
        
        int index = 0 ; 
        
        public boolean hasNext() { 
            if(index < names.length) 
                return true; 
            return false; 
        } 
        
        public Object next() { 
            return names[index++]; 
        } 
        
        public void remove() { 
        
        } 
    } 

}
