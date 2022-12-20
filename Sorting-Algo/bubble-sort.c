#include <stdio.h>
void swap(int *a, int *b);
int main()
{
	int arr[20],element;
	printf("how many numbers? : ");
	scanf("%i",&element);
	//inputs
	for (int i = 0; i < element; i++)
	{
		scanf("%d",&arr[i]);
	}
	//sorting
	for (int i = 0; i < element; i++)
	{
		for (int j = 0; j < element - 1; j++)
		{
			if (arr[j] > arr[j+1])
			{
				swap(&arr[j],&arr[j+1]);			
			}
		}
	}
	//printing
	printf("number in arrange order: \n");
	for (int i = 0; i < element; i++)
	{
		printf("%d\n",arr[i]);
	}
}
void swap(int *a, int *b)
{
	int temp = *a;
	*a = *b;
	*b = temp;
	;
}
