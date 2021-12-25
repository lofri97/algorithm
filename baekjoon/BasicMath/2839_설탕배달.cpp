#include <stdio.h>

int main(void) {
	int n, a, b;
	scanf("%d", &n);

	a = n / 5;

	while (a > -1) {
		if ((n - (5 * a)) % 3 == 0) {
			a += (n - (5 * a)) / 3;
			break;
		}
		a--;
	}
	printf("%d\n", a);
	return 0;
}