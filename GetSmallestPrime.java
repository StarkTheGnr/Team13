public class GetSmallestPrime
{
	int arr[];
	int sz;

	GetSmallestPrime(int arr[], int sz)
	{
		this.arr = new int[sz];
		this.sz = sz;
		this.arr = arr;
	}

	public int SmallestPrime(int arr[], int sz)
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
}
