#include <stdio.h>

int main(void) {
	int a, b, v;
	int d = 1;
	scanf("%d %d %d", &a, &b, &v);

	d += (v - a)/(a - b);
	if ((v - a) % (a - b) != 0) d++;
	if (v <= a) d = 1;
	printf("%d\n", d);
	return 0;
}