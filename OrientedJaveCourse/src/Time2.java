/**
 * @author Asaf Ben Shabat 312391774
 * @author Avichai Aziz 316373497
 */
public class Time2 implements Time {

	private short hour;
	private short minute;
	private short seconds;
	private long secondsFromMidnigt;
	public Time2(short hour,short minute,short seconds) {
		this.hour = hour;
		this.minute = minute;
		this.seconds = seconds;
	}
	@Override
	public short getHour() {
		// TODO Aut method 
		
		return hour;
	}

	@Override
	public short getMinute() {
		// TODO Auto-generated method stub
		return minute;
	}

	@Override
	public short getSecond() {
		// TODO Auto-generated method stub
		return seconds;
	}

	@Override
	public short[] getHMS() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getSecondsFromMidnight() {
		// TODO Auto-generated method stub
		return secondsFromMidnigt;
	}

	@Override
	public void setHour(short hour) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setMinute(short min) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setSecond(short sec) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setHMS(short[] hms) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setSecondsFromMidnight(long secondsFromMidnigt) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean equals(Time t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean before(Time t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean after(Time t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long difference(Time t) {
		// TODO Auto-generated method stub
		return 0;
	}
}
