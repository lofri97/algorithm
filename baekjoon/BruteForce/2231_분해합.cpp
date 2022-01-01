#include <stdio.h>

int main() {
	int n, m = 0, digit = 0, temp, t;
	scanf("%d", &n);
	temp = n;
	while (temp > 0) {
		digit++;
		temp /= 10;
	}

	for (int i = n - (digit * 9 * 2); i < n; i++) {
		int sum = 0;
		temp = i;
		sum += temp;
		while (temp) {
			sum += temp % 10;
			temp /= 10;
		}
		if (sum == n) {
			m = i;
			break;
		}
	}
	printf("%d\n", m);

}