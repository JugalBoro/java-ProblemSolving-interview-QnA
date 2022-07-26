Brute Force: We iteratively test each bit value while tracking the number of 1 seen so far.....since we care about 1s is even or odd , we can store the number modulo 2

short Parity(unsigned long x) {
  short result = 0;
  while(x) {
    result = result ^(x&1);
    x >>=1;
  }
  return result;  
}


optimized approach:  Mapping numbers with the bit 

We can use a map or an array of the number of bits to form a nibble (a nibble consists of 4 bits, so a 16 – length array would be required). Then, we can get the nibbles of a given number.

This approach can be summarized into the following steps:

1. Build the 16 length array of the number of bits to form a nibble – { 0, 1, 1, 2, 1, 2, 2, 3, 1, 2, 2, 3, 2, 3, 3, 4 }

2. Recursively count the set of the bits by taking the last nibble (4 bits) from the array using the formula num & 0xf and then getting each successive nibble by discarding the last 4 bits using >> operator.

3. Check the parity: if the number of set bits is even, ie numOfSetBits % 2 == 0, then the number is of even parity. Else, it is of odd parity.

  
  // Java program to get the parity of the
// binary representation of a number
import java.util.*;

class Parity{

	static int[] nibble_to_bits = {
		0, 1, 1, 2, 1, 2, 2, 3, 1, 2, 2, 3, 2, 3, 3, 4
	};

	// Function to recursively get the nibble
	// of a given number and map them in the array

	static int countSetBits(int num)
	{
		int nibble = 0;
		if (0 == num)
			return nibble_to_bits[0];

		// Find last nibble
		nibble = num & 0xf;

		// Use pre-stored values to find count
		// in last nibble plus recursively add
		// remaining nibbles.
		return nibble_to_bits[nibble]
			+ countSetBits(num >> 4);
	}

	// Function to get the parity of a number
	static boolean getParity(int num)
	{
		return countSetBits(num) % 2 == 1;
	}

// Driver code
public static void main(String[] args)
{
		int n = 7;

		// Function call
		System.out.print(
			"Parity of no " + n + " = "
			+ (getParity(n) ? "odd" : "even"));
}
}

