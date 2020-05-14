package counting;

import util.Define;

public class DoctorLimit implements BookLimitation {

	@Override
	public int getLimit(int degree) {
		int returnValue=0;
		if(degree == Define.DOCTOR) {
			returnValue=20;
		}
		return returnValue;
	}
	

}
