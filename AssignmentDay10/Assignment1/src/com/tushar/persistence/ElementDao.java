package com.tushar.persistence;

import java.util.ArrayList;

import com.tushar.bean.*;
public interface ElementDao {
	ArrayList<Element> getAllElements();
	Element getElementByName(String name);
	int addElement(Element element);
	int deleteElement(String name);
	int updateAtomicWeightByName(String name,int atomicWeight);

}
