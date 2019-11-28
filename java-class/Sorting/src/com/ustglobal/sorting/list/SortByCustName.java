package com.ustglobal.sorting.list;

import java.util.Comparator;

public class SortByCustName  implements Comparator<Custmer>{
	@Override
	public int compare(Custmer o1, Custmer o2) {
		String s = o1.name;
		String s1 = o2.name;
		return s.compareTo(s1);
	}

}
