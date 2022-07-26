https://leetcode.com/problems/plus-one/

Example: If we have 99, we return 100 which includes an extra digit.
  
  
  public int[] plusOne(int[] digits) {
	for (int i = digits.length - 1; i >= 0; i--) {
		if (digits[i] < 9) {
			digits[i]++;
			return digits;
		}
		digits[i] = 0;
	}
	int[] result = new int[digits.length + 1];
	result[0] = 1;
	return result;
