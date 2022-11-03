//array referencing in function 
#include <stdio.h>
void getValue(int arr[])
{
	printf("%d", arr[2]);
	return;
}

int main()
{
	int chris = 0;
	int arr[5] = {1,2,3,4,5};
	
	getValue(arr);
	
	return 0;
}
