class Prog1 {

	int ai;
	Prog1 left, right;

	Prog1 (int h, Prog1 L, Prog1 R) {
		ai = h; left = L; right = R;					// 7
	}

	int total () {
		return ai + total (left) + total (right);		// 11
	}

	static int total (Prog1 t) {
		if (t == null)
			return 0;
		else
			return t.total ();
	}

	public static void main (String[] args) {
		int xi = 3, yi = 19;
		double xd = 1.125, yd = -6.25e-2;
		String s1 = "Hello,", s2 = " world!\n";
		boolean b = false;
		Prog1[] a1 =  {
			new Prog1 (8, 
					   new Prog1 (4, null, new Prog1 (5, null, null)),
					   new Prog1 (20,
								  new Prog1 (15, null, null),
								  new Prog1 (30, null, null))),
			new Prog1 (0, null,
					   new Prog1 (1, null,
								  new Prog1 (2, null,
											 new Prog1 (3, null, null))))
		};
		System.out.printf ("Totals: a1[0] = %d, a1[1] = %d%n",
						   total (a1[0]), total (a1[1]));

		a1[0].left.left = a1[1];						// 40
		a1[1].left = a1[0];
					   
		for (String arg : args) {
			System.out.println (arg);					// 44
		}
	}

}
