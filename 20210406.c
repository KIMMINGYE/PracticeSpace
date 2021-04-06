#include "stdio.h"
#include "math.h"
#include "ctype.h"
#include "string.h"
#include <stdio.h>
#include <windows.h>
#include "stdbool.h"
#pragma execution_character_Set("utf-8")
#pragma warning(disable:4996)

void swap0(int x, int y);
void swap1(int* x, int* y);


void main() {

	int a = 3, b = 5;
	printf("call by value\n\n");
	printf("a=%d,b=%d\n", a, b);

	swap0(a, b);

	printf("a=%d,b=%d\n\n", a, b);

	//No Change

	int c = 3, d = 5;
	printf("call by reference\n\n");
	printf("a=%d,b=%d\n", c, d);

	swap1(&c, &d);

	printf("a=%d,b=%d", c, d);

	//Change 

	return 0;
}

void swap0(int x, int y) {

	int temp = 0;

	temp = x;

	x = y;

	y = temp;

	printf("a=%d,b=%d\n", x, y);
}

void swap1(int* x, int* y) {

	int temp = 0;

	temp = *x;

	*x = *y;

	*y = temp;

	printf("a=%d,b=%d\n", *x, *y);
}













