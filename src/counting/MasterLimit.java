package counting;

import util.Define;

public class MasterLimit implements BookLimitation {

	@Override
	public int getLimit(int degree) {
		int returnValue=0;
		if(degree == Define.MASTER) {
			returnValue=15;
		}
		return returnValue;
	}

}
