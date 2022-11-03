//Passing a pointer to a function

#include <stdio.h> 
void swap(int *a,int *b);
int main (void)
{
	int x = 5,y = 10;
	printf ("%d,%d\n",x,y);
	swap(&x,&y);
	printf ("%d,%d",x,y);
}


//Swap function

void swap(int *a,int *b)
{
	int temp;
	temp = *a;
	*a = *b;
	*b = temp;
	return;

	}
