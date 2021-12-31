#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <algorithm>

int main(void) {
	char a[10002], b[10002];
	char* result;
	int temp = 0, sum = 0, r_idx = 0;
	scanf("%s %s", &a, &b);

	int a_idx = strlen(a)-1, b_idx = strlen(b)-1;

	result = (char*)malloc(sizeof(char) * (std::max(a_idx, b_idx) + 1));
	while (a_idx >= 0 || b_idx >= 0) {
		
		if (a_idx >= 0 && b_idx >= 0) 
			sum = a[a_idx--] + b[b_idx--] - 2 * '0' + temp;
		else if (a_idx < 0)
			sum = temp + b[b_idx--] - '0';
		else if (b_idx < 0)
			sum = temp + a[a_idx--] - '0';
		temp = sum / 10;
		result[r_idx++] = sum % 10 + '0';
	}
	if (temp != 0)
		result[r_idx++] = temp + '0';
	for (int i = r_idx - 1; i >= 0; i--) {
		printf("%c", result[i]);
	}
	return 0;
}