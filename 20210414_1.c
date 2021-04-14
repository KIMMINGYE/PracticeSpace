#include "stdio.h"
#include "math.h"
#include "ctype.h"
#include "string.h"
#include <stdio.h>
#include <windows.h>
#include "stdbool.h"
#pragma execution_character_Set("utf-8")
#pragma warning(disable:4996)
int change(int *);
void main() {

	int a = 10;

	int* p = &a; //포인터 변수 p를 선언하고 변수 a의 주소를 저장
	printf("함수 호출 이전의 a : %d\n", a);
	a=change(p); //포인터 변수를 매개변수로 넘겨줌
	
	printf("함수 호출 이후 a : %d\n", a);

	return 0;
}

int change(int *k) {//함수 호출되면 p의 값,즉 a의 주소가 전달되고 가리키게 됨

	*k = *k + *k;

	return *k;
}

















