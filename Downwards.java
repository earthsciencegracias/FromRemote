package chapter10;



class Downwards {
	
	public static String fromDownwards() {
		return "From Downwards.";
	}
}

class Downwards1 extends Downwards {
	public static String fromDownwards1() {
		return "from Downwards1";
	}
}

class Downwards2 extends Downwards1 {
	public static String fromDownwards2() {
		return "from Downwards2";
	}
}

class Downwards3 extends Downwards2 {
	public static String fromDownwards1() {
		return "from Downwards3";
	}
}
