
public class TimeDiffer {
	long hour, minute, second;

	public TimeDiffer(long h1, long m1, long s1) {
		this.hour = h1;
		this.minute = m1;
		this.second = s1;
	}

	public static void main(String[] args) {
		TimeDiffer t1 = new TimeDiffer(04, 23, 43);
		TimeDiffer t2 = new TimeDiffer(02, 43, 48);
		TimeDiffer differ;
		differ = timeDifference(t1, t2);
		System.out.println(t1.hour + ":" + t1.minute + ":" + t1.second + " - " + t2.hour + ":" + t2.minute + ":"
				+ t2.second + " = " + differ.hour + ":" + differ.minute + ":" + differ.second);

	}

	private static TimeDiffer timeDifference(TimeDiffer t1, TimeDiffer t2) {
		TimeDiffer diff = new TimeDiffer(00, 00, 00);
		if (t2.second > t1.second) {
			--t1.minute;
			t1.second += 60;
		}
		diff.second = t1.second - t2.second;
		if (t2.minute > t1.minute) {
			--t1.hour;
			t1.minute += 60;
		}
		diff.minute = t1.minute - t2.minute;
		diff.hour = t1.hour - t2.hour;
		return diff;
	}

}
