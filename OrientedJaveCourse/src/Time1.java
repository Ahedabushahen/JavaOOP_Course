
/**
 * @author Asaf Ben Shabat 312391774
 * @author Avichai Aziz 316373497
 */

public class Time1 implements Time {
		private short[] time1;
		
	public Time1(short hour,short minute,short seconds) {
			this.time1 = new short[3];
			this.time1[0] = hour;
			this.time1[1] = minute;
			this.time1[2] = seconds;
		}
	public Time1(long secondsFromMidnigt) {
		this.time1 = new short[3];
		{
		    this.time1[0] = ((short) (secondsFromMidnigt / SECS_PER_HOUR));
		    this.time1[1] = ((short) ((secondsFromMidnigt % SECS_PER_HOUR) / SECS_PER_MIN));
		    this.time1[2] = ((short) ((secondsFromMidnigt % SECS_PER_HOUR) % SECS_PER_MIN));
		}
	}
	public Time1() {
		this.time1 = new short[3];
		this.time1[0] = 0;
		this.time1[1] = 0;
		this.time1[2] = 0;
	}
	public Time1(Time t){
		this.time1 = new short[3];
		this.time1[0] = t.getHour();
		this.time1[1] = t.getMinute();
		this.time1[2] = t.getSecond();
		
	}
	
	@Override
	public short getHour() {
		return time1[0];
	}

	@Override
	public short getMinute() {
		return time1[1];
	}

	@Override
	public short getSecond() {
		return time1[2];
	}

	@Override
	public short[] getHMS() {
		short[] HMS = new short[3];
		HMS[0] = this.getHour();
		HMS[1] = this.getMinute();
		HMS[2] = this.getSecond();		
		return HMS;
	}

	@Override
	public long getSecondsFromMidnight() {
		return ((long) (this.time1[0]) * SECS_PER_HOUR)+ ((long) (this.time1[1]) * SECS_PER_MIN)+ (long) this.time1[2]; 
	}

	@Override
	public  void setHour(short hour) {
		this.time1[0] = hour;
		
	}

	@Override
	public void setMinute(short min) {
		this.time1[1] = min;
		
	}

	@Override
	public void setSecond(short sec) {
		this.time1[2] = sec;
		
	}

	@Override
	public void setHMS(short[] hms) {
		this.time1[0] = hms[0];
		this.time1[1] = hms[1];
		this.time1[2] = hms[2];
	}

	@Override
	public void setSecondsFromMidnight(long secondsFromMidnigt) {
		this.setHour((short) (secondsFromMidnigt / SECS_PER_HOUR));
		this.setMinute((short) ((secondsFromMidnigt % SECS_PER_HOUR) / SECS_PER_MIN));
		this.setSecond((short) ((secondsFromMidnigt % SECS_PER_HOUR) % SECS_PER_MIN));
	}

	@Override
	public boolean equals(Time t) {
		if (t.getSecondsFromMidnight() == this.getSecondsFromMidnight())
			return true;
		return false;
	}

	@Override
	public boolean before(Time t) {
		if(this.getSecondsFromMidnight() <= t.getSecondsFromMidnight())
			return true;
		else
		return false;
	}

	@Override
	public boolean after(Time t) {
		if(this.getSecondsFromMidnight() <= t.getSecondsFromMidnight())
			return false;
		else
		return true;
	}

	@Override
	public long difference(Time t) {
		return this.getSecondsFromMidnight() - t.getSecondsFromMidnight();
	}

	@Override
	public String toString() {
		return String.format("%02d", this.time1[0]) + ":" + String.format("%02d", this.time1[1]) + ":" + String.format("%02d", this.time1[2]);
	}
	}
