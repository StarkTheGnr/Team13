import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Functions
{
	public static int[] transformToInt(String str)
	{
		int[] result = null;

		String[] split = str.split(",");

		if (split.length > 0)
			result = new int[split.length];

		int k = 0;
		for (int i = 0; i < split.length; i++)
		{
			try
			{
				result[k++] = Integer.parseInt(split[i]);
			} catch (NumberFormatException e)
			{
				return new int[0];
			}
		}

		return result;
	}

	public static String[] transformToString(String str)
	{
		return str.split(",");
	}

	public static boolean checksorted(int[] array)
	{
		boolean value = true;
		if (array != null && array.length > 0)
		{
			int pre_num = array[0];
			for (int i = 1; i < array.length; i++)
			{
				int stat = array[i];
				if (stat < pre_num)
				{
					value = false;
					break;
				}
				pre_num = stat;
			}
		} else
			value = false;
		return value;
	}

	public static int countPrimes(int[] a)
	{
		int counter = 0;
		boolean flag = true;
		for (int i = 0; i < a.length; i++)
		{
			flag = true;
			int n = a[i];
			for (int j = 2; j <= n / 2; ++j)
			{
				if (n % j == 0)
				{
					flag = false;
					break;
				}
			}
			if ((n == 0) || (n == 1))
			{
				flag = false;
			}
			if (flag)
			{
				counter++;
			}
		}
		return counter;
	}

	public static ArrayList<String> DistinctArray(String[] a)
	{
		ArrayList<String> Arr = new ArrayList<String>();
		for (int i = 0; i < a.length; i++)
		{
			if (!Arr.contains(a[i]))
			{
				Arr.add(a[i]);
			}
		}
		return Arr;

	}

	public static double Get_median(String[] nums)
	{
		int n = nums.length;
		int[] Nums = new int[n];
		for (int i = 0; i < n; i++)
		{
			Nums[i] = Integer.parseInt(nums[i]);
		}
		Arrays.sort(Nums);
		if (n % 2 != 0)
			return (double) Nums[n / 2];
		return (double) (Nums[(n - 1) / 2] + Nums[n / 2]) / 2.0;
	}

	public static int[] Max_three_number(int[] Array)
	{
		int len = Array.length;
		int[] B = new int[len];
		for (int i = 0; i < len; i++)
		{
			B[i] = Array[i];
		}
		Arrays.sort(B);
		int x;
		if (len == 0 || len == 1)
		{
			x = 1;
		} else
		{
			int k = 0;
			for (int i = 0; i < len - 1; i++)
			{
				if (B[i] != B[i + 1])
				{
					B[k++] = B[i];
				}
			}
			B[k++] = B[len - 1];
			x = k;
		}
		int[] C = new int[x];
		for (int i = 0; i < x; i++)
		{
			C[i] = B[i];
		}

		return new int[] { C[C.length - 1], C[C.length - 2], C[C.length - 3] };
	}

	public static int most_repeated_value(int[] array)
	{
		int counter = 1, tempCount;
		int Temp, most_repeated = array[0];

		for (int i = 0; i < array.length - 1; i++)
		{
			Temp = array[i];
			tempCount = 0;
			for (int j = 1; j < array.length; j++)
			{
				if (Temp == array[j])
					tempCount++;
			}
			if (tempCount > counter)
			{
				most_repeated = Temp;
				counter = tempCount;
			}
		}
		return most_repeated;
	}

	public static int[] ROP(int arr[])
	{
		int i, m = 0, n, flag, counter = 0, c = 0;

		for (int k = 0; k < arr.length; k++)
		{
			n = arr[k];
			flag = 0;
			m = n / 2;
			if (n == 0 || n == 1)
			{
				continue;
			} else
			{
				for (i = 2; i <= m; i++)
				{
					if (n % i == 0)
					{
						flag = 1;
						continue;
					}
				}
				if (flag == 0)
				{
					counter++;
				}
			} // end of else
		}
		int[] out = new int[counter];
		for (int k = 0; k < arr.length; k++)
		{
			flag = 0;
			n = arr[k];
			m = n / 2;
			if (n == 0 || n == 1)
			{
				continue;
			} else
			{
				for (i = 2; i <= m; i++)
				{
					if (n % i == 0)
					{
						flag = 1;
						continue;
					}
				}
				if (flag == 0)
				{
					out[c++] = arr[k];
				}
			}
		}

		return out;
	}

	public static char[] shuffleArray(char[] a)
	{
		char[] out = new char[a.length];
		for (int i = 0; i < out.length; i++)
		{
			out[i] = a[i];
		}
		int n = out.length;
		Random random = new Random();
		random.nextInt();
		for (int i = 0; i < n; i++)
		{
			int rand = random.nextInt(n);
			char tmp = out[i];
			out[i] = out[rand];
			out[rand] = tmp;
		}
		return out;
	}

	public static int[] Get_Min_3_Num(String[] arr)
	{
		int n1 = Integer.valueOf(arr[1]);
		int n2 = Integer.valueOf(arr[1]);
		int n3 = Integer.valueOf(arr[1]);
		int x = 0;
		int y = 0;
		for (int i = 0; i < arr.length; i++)
		{
			if (Integer.valueOf(arr[i]) < n1)
			{
				n1 = Integer.valueOf(arr[i]);
				x = i;
			}
		}
		for (int i = 0; i < arr.length; i++)
		{
			if (Integer.valueOf(arr[i]) < n2 && i != x)
			{
				n2 = Integer.valueOf(arr[i]);
				y = i;
			}
		}
		for (int i = 0; i < arr.length; i++)
		{
			if (Integer.valueOf(arr[i]) < n3 && i != y && i != x)
			{
				n3 = Integer.valueOf(arr[i]);
			}
		}

		int[] result = new int[3];
		result[0] = n1;
		result[1] = n2;
		result[2] = n3;

		return result;
	}

	public static boolean IsPalindrome(char[] data)
	{
		for (int i = 0, j = data.length - 1; i < data.length && j >= i; i++, j--)
		{
			if (data[i] != data[j])
				return false;
		}

		return true;
	}

	public static int SmallestPrime(int arr[], int sz)
	{
		boolean found = false;
		boolean pr = true;
		int ans = 0;
		for (int i = 0; i < sz; i++)
		{
			pr = true;
			if (arr[i] == 1 || arr[i] == 0)
				continue;
			for (int j = 2; j * j <= arr[i]; j++)
			{
				if (arr[i] % j == 0 && arr[i] != j)
				{
					pr = false;
					break;
				}

			}
			if (pr)
			{
				if (!found || arr[i] < ans)
				{
					found = true;
					ans = arr[i];
				}
			}

		}
		if (!found)
			return -1;
		return ans;
	}

	public static int getLargest(int arr[])
	{
		if (arr.length == 0)
		{
			return -1;
		}
		int larest = arr[0];
		for (int i = 0; i < arr.length; ++i)
		{
			if (larest < arr[i])
			{
				larest = arr[i];
			}
		}
		return larest;
	}

	public static ArrayList<String> positiveArray(ArrayList<String> data1)
	{
		ArrayList<String> data2 = new ArrayList<String>();
		for (int i = 0; i < data1.size(); i++)
		{
			Integer u = Integer.valueOf(data1.get(i));
			if (u < 0)
			{
				data2.add("0");
			} else
			{
				data2.add(data1.get(i));
			}
		}

		return data2;
	}

	public static char[] shift(char[] s)
	{
		char[] in2 = new char[s.length];
		int shift = 1;

		for (int i = 0; i < shift; i++)
			in2[s.length - shift + i] = s[i];

		for (int i = 0; i < s.length - 1; i++)
		{
			if (i + shift > s.length - 1)
			{
				break;
			} else
				in2[i] = s[i + shift];
		}
		return in2;
	}

	public static int[] reverse_arr(int[] arg)
	{
		int[] arr = Arrays.copyOf(arg, arg.length);

		int temp;
		int start = 0;
		int end = arr.length - 1;

		while (start < end)
		{

			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;

			start++;
			end--;
		}

		return arr;
	}

	public static int[] Sort(int[] arr)
	{
		int[] x = Arrays.copyOf(arr, arr.length);
		int s = x.length;
		for (int i = 1; i < s; i++)
		{
			for (int k = i; k > 0 && x[k - 1] > x[k]; k--)
			{
				int temp = x[k];
				x[k] = x[k - 1];
				x[k - 1] = temp;
			}
		}
		return x;
	}

	public static int GetAverage(int[] arr)
	{
		int total = 0;
		int average = 0;
		for (int i = 0; i < arr.length - 1; i++)
		{
			total += arr[i];
		}
		average = total / arr.length;
		
		return average;
	}
}
