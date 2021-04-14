#include "stdio.h"
#include "math.h"
#include "ctype.h"
#include "string.h"
#include <stdio.h>
#include <windows.h>
#include "stdbool.h"
#pragma execution_character_Set("utf-8")
#pragma warning(disable:4996)

void main() {

	int days = 365;
	int month = 12;
	int table[5] = { 1,2,3,4,5 };

	printf("Pointer of days = %x \n", &days);

	printf("Pointer of month = %x \n", &month);

	printf("Pointer of Table = %x \n", &table);

	printf("Pointer of Table[0] = %x \n", &table[0]);

	printf("Pointer of Table[1] = %x \n", &table[1]);

	int* p, i = 3, j;

	p = &i; //i의 주소값을 포인터 변수 p에 대입

	j = *p; //j에 포인터 변수 p가 가리키는 주소값의 내용을 대입

	j++;

	printf("*p=%d\n", *p);

	printf("p=%x\n", p);

	printf("j=%d\n", j);

	return 0;
}

















