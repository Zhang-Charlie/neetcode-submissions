public int Soloution(int[] heights){
	int l = 0;
	int r = 1;

	while(l<r){
		int length = l - r;
		int area = length * Math.min(heights[l],[r]);
		int max = Math.max(max, area)
		// l is greater
		if(l > r) r++;

		// r is greater
		if(l < r) {
			r = l;
			r++;
		}
		

	}

	return max;


}