package com.company;
public class Main {
    public static void main(String[] args) {
        example e = new example();
        String name;
	for(Iterator itr=e.iterator();itr.hasNext();) {
        name = itr.next();
        System.out.println(name);
    }
    }
}
