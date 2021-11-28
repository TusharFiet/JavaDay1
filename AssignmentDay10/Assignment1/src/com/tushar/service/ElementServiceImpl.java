package com.tushar.service;

import java.util.ArrayList;

import com.tushar.bean.Element;
import com.tushar.persistence.ElementDao;
import com.tushar.persistence.ElementDaoImpl;

public class ElementServiceImpl implements ElementService {

private ElementDao elementDao=new ElementDaoImpl();

	@Override
	public ArrayList<Element> searchAllElements() {
		return elementDao.getAllElements();
	}

	@Override
	public Element searchElementByName(String name) {
		return elementDao.getElementByName(name);
	}

	@Override
	public boolean insertElement(Element element) {
		int rows=elementDao.addElement(element);
		if(rows>0)
			return true;
		return false;
	}

	@Override
	public boolean removeElement(String name) {
		int rows=elementDao.deleteElement(name);
		if(rows>0)
			return true;
		return false;
	}

	@Override
	public boolean updateAtomicWeightByElementName(String name, int atomicWeight) {
		int rows=elementDao.updateAtomicWeightByName(name, atomicWeight);
		if(rows>0)
			return true;
		return false;
	}
}
