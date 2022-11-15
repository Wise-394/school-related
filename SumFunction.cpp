//adding all of the element of an array using a sum function

#include <stdio.h>
void sum(int arr[]); 
int num1; 

int main()
{
	int arr[20];
	printf("how many numbers you like to add?\n"); 
	scanf("%d",&num1);
	
	for (int i = 0; i < num1; i++)
	{
		printf("enter num%d: ",i+1);
		scanf("%d",&arr[i]);
	}
	sum(arr); 	
}

void sum(int arr[]) 
{
	int sum = 0;
	for (int i = 0; i < num1; i++)
	{
		sum += arr[i];
	}
	printf("the sum is %d",sum);	
}