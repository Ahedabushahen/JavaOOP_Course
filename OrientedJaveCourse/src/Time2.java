
public class Time2 implements Time {

	//fields
	private long secondsFromMidnight;
	
	//constructors
	public Time2(short hours, short minutes, short seconds) { //constructor that gets hours, minutes and seconds respectively
		this.secondsFromMidnight = (hours * SECS_PER_HOUR) + (minutes * SECS_PER_MIN) + (seconds);
	}
	
	public Time2(long secondsFromMidnight) { //constructor that gets the seconds from midnight
		this.secondsFromMidnight = secondsFromMidnight;
	}
	
	public Time2(Time time) {
		this.secondsFromMidnight = time.getSecondsFromMidnight();
	}
	
	public Time2() { //default constructor
		this.secondsFromMidnight = 0;
	}
	
	//methods
	
	@Override
	public short getHour() { //hour between 0-23
		
		return (short)((this.secondsFromMidnight/SECS_PER_HOUR) % HOURS_PER_DAY);
	}

	@Override
	public short getMinute() { //minutes between 0-59
		return (short)((this.secondsFromMidnight/SECS_PER_MIN) % MINS_PER_HOUR);
	}

	@Override
	public short getSecond() { //seconds between 0-59
		return (short)(this.secondsFromMidnight % SECS_PER_MIN);
	}

	@Override
	public short[] getHMS() {
		short[] hms = new short[3];
		hms[0] = (short) ((short) (this.secondsFromMidnight/SECS_PER_HOUR) % HOURS_PER_DAY); //hours
		hms[1] = (short) ((short) (this.secondsFromMidnight/SECS_PER_MIN) % MINS_PER_HOUR); //minutes
		hms[2] = (short) ((short) (this.secondsFromMidnight) % SECS_PER_MIN); //seconds
		
		return hms;
	}

	@Override
	public long getSecondsFromMidnight() {
		return this.secondsFromMidnight;
	}

	@Override
	public void setHour(short hour) {
		this.secondsFromMidnight -= (((short)(this.secondsFromMidnight/SECS_PER_HOUR)) * SECS_PER_HOUR);
		this.secondsFromMidnight += (hour * SECS_PER_HOUR);
	}

	@Override
	public void setMinute(short min) {
		this.secondsFromMidnight -= (((this.secondsFromMidnight/SECS_PER_HOUR) - ((short)this.secondsFromMidnight/SECS_PER_HOUR)) * SECS_PER_HOUR);
		this.secondsFromMidnight += (min * SECS_PER_MIN);
	}

	@Override
	public void setSecond(short sec) {
		this.secondsFromMidnight -= ((this.secondsFromMidnight % SECS_PER_HOUR) % SECS_PER_MIN);
		this.secondsFromMidnight += sec;
	}

	@Override
	public void setHMS(short[] hms) {
		 this.secondsFromMidnight = ((hms[0] * SECS_PER_HOUR));
		 this.secondsFromMidnight += ((hms[1] * SECS_PER_MIN));
		 this.secondsFromMidnight += hms[2];
	}

	@Override
	public void setSecondsFromMidnight(long secondsFromMidnigt) {
		this.secondsFromMidnight = secondsFromMidnigt;
	}

	@Override
	public boolean equals(Time t) {
		return (this.secondsFromMidnight == t.getSecondsFromMidnight());
	}

	@Override
	public boolean before(Time t) {
		return ((this.secondsFromMidnight - t.getSecondsFromMidnight()) < 0);
	}

	@Override
	public boolean after(Time t) {
		return ((this.secondsFromMidnight - t.getSecondsFromMidnight()) > 0);
	}

	@Override
	public long difference(Time t) {
		
		return (this.secondsFromMidnight - t.getSecondsFromMidnight());
	}

	@Override
	public String toString() {
		return String.format("%02d:%02d:%02d", this.getHour(), this.getMinute(), this.getSecond());
	}
}
