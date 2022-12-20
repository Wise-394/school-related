#include <stdio.h>
int main()
{
	int count = 0,arr[20],number;
	printf("how many numbers?: ");
	scanf("%d",&number);
	
	//input
	for (int i = 0; i < number; i++)
	{
		scanf("%d",&arr[i]);
	}
	
	//counting duplicate
	for (int i = 0; i < number; i++)
	{
		for (int j = i+1; j < number; j++)
		{
			if (arr[j] == arr [i])
			{
				count++;
				break;
			}
			
		}
	}
	printf("the number of duplicated numbers is: %d",count);
}
