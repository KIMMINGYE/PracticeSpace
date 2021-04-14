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

	int* p;
    int a[] = { 10,20,30,40,50 };

	p = &a[0]; //10의 주소값을 포인터 변수 p에 저장

	printf("*p   ==%d\n", *p);

	printf("*p++ ==%d\n", *p++); //포인터 p의 값을 출력후 주소 1증가(4byte)

	printf("*++p ==%d\n", *++p); //포인터 p의 주소를 1 증가(4byte) 증가 후 포인터 값 출력

	p = p + 2; //여기서 +2는 포인터 변수 p의 주소값을 2로 증가시키는 것 
	           //지금의 주소값은 30을 가리키고 있음 여기서 2증가(8byte) 즉 50을 가리키게 됨

	printf("*p  ==%d\n", *p);

	printf("*p  ==%d\n", *p+2); //위에 과정까지의 *p의 값 자체는 50 여기에 2를 더함 
	                            // 주소의 값을 2증가시키는게 아님
	// *(p+2) (p번지 +2)번지의 내용
	// *p+2 : p번지의 내용에 2를 더한 값



	return 0;
}



















