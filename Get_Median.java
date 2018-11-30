import java.util.Arrays;

public class Get_Median {

	public static double Get_median(String [] nums) {
		int n = nums.length;
		int []Nums=new int[n];
		for(int i=0;i<n;i++)
		{
			Nums[i]=Integer.parseInt(nums[i]);
		}
		Arrays.sort(Nums);
		if (n % 2 != 0)
			return (double) Nums[n / 2];
		return (double) (Nums[(n - 1) / 2] + Nums[n / 2]) / 2.0;
	}
}
