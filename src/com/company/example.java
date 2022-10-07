package com.company;

public class example implements Contain {
    public String name[] = {"Sruthi", "Sree Dhanya", "Harsidh Krishna", "Hemalatha", "Ramesh"};
    int i;
    public Iterator iterator() {
        return new iteratorexample();
    }
    private class iteratorexample implements Iterator{
        public boolean hasNext()
        {
            if(i<name.length)
                return true;
            return false;
        }
        public String next()
        {
            if(this.hasNext())
            {
                return name[i++];
            }
            return null;
        }
    }
}
