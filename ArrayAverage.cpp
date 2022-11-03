#include <stdio.h>
void ave(int a[],int size)
{
	float averag1;
	int sum=0;
for (int i=0;i<size;i++)
{
	sum+= a[i];
	
	
	}
	averag1 = sum / size;
	printf ("%f",averag1);
}
int main()
{
int array[20],size,escape=0;
float aver;
do {
printf ("enter array size: ");
scanf ("%d",&size);
if (size <=20)
{
escape=1;

}
else{
printf ("error must be below 20\n");
}
}
while (escape != 1);
for (int i =0;i<size;i++)
{
	printf("enter value of array: ");
	scanf ("%d",&array[i]);

}
ave(array,size);
}
