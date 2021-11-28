package com.tushar.service;

import java.util.ArrayList;

import com.tushar.bean.*;
public interface ElementService {
	
	ArrayList<Element> searchAllElements();
	Element searchElementByName(String name);
	boolean insertElement(Element element);
	boolean removeElement(String name);
	boolean updateAtomicWeightByElementName(String name,int atomicWeight);

}
