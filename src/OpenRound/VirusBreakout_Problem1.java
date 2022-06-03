/* 
 * Enter your code here. Read input from STDIN. Print your output to STDOUT. 
 * Your class should be named CandidateCode.
 * 
 * 
 * 
 * def main(str1, str2):
    m = len(str1)
    n = len(str2)

    j = 0 # Index of str1
    i = 0 # Index of str2

    # Traverse both str1 and str2
    # Compare current character of str2 with
    # first unmatched character of str1
    # If matched, then move ahead in str1

    while j < m and i < n:
        if str1[j] == str2[i]:
            j = j+1
        i = i + 1

    # If all characters of str1 matched,
    # then j is equal to m
    return j == m

# Driver Program
str2 = str(input())
N = int(input())

for i in range(N):
    str1 = str(input())
    if main(str1, str2):
        print("POSITIVE") 
    else:
        print( "NEGATIVE")
 * 
 * 
 * 
 * 
 * 
 */

import java.util.*;
public class VirusBreakout_Techgig2021 {

	public static void main(String args[] ) throws Exception 
	{
		Scanner in = new Scanner(System.in);
		String str2 = in.nextLine();
		int N = in.nextInt();
		in.nextLine();
		for (int i = 0; i < N; i++) 
		{
			String str1 = in.nextLine();
			if(shaik(str1, str2))
			{
				System.out.println("POSITIVE");
			}
			else 
			{
				System.out.println("NEGATIVE");
			}
		}
		in.close();
	}

	private static boolean shaik(String str1, String str2)
	{
		int m = str1.length();
		int n = str2.length();

		int j = 0; // Index of str1
		int i = 0; // Index of str2

		// Traverse both str1 and str2
		// Compare current character of str2 with first unmatched character of str1
		// If matched, then move ahead in str1

		while (j < m && i < n)
		{
			if (str1.charAt(j) == str2.charAt(i) )
			{
				j = j+1;
			}
			i = i + 1;
		}
		return j == m;
	}
}
