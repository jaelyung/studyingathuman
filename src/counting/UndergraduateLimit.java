package counting;

import util.Define;

public class UndergraduateLimit implements BookLimitation {

	@Override
	public int getLimit(int degree) {
		int returnValue=0;
		if(degree == Define.UNDERGRADUATE) {
			returnValue=10;
		}
		return returnValue;
	}

}
