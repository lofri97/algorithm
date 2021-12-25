//O(n^2) sorting algorithm

#include <stdio.h>

#define MAX_NUM 1000

void selection_sort(int arr[], int n);
void bubble_sort(int arr[], int n);
void insertion_sort(int arr[], int n);

void swap(int* a, int* b) {
	int tmp = *a;
	*a = *b;
	*b = tmp;
}

int main(void) {
	int n, input;
	int nums[MAX_NUM];
	scanf("%d", &n);

	for (int i = 0; i < n; i++) {
		scanf("%d", &input);
		nums[i] = input;
	}

	insertion_sort(nums, n);

	for (int i = 0; i < n; i++) {
		printf("%d\n", nums[i]);
	}
}

void selection_sort(int arr[], int n) {
	int min_idx;
	for (int i = 0; i < n - 1; i++) {
		min_idx = i;
		for (int j = i + 1; j < n; j++) {
			if (arr[j] < arr[min_idx])
				min_idx = j;
		}
		swap(&arr[i], &arr[min_idx]);
	}
}

void bubble_sort(int arr[], int n) {
	for (int i = 0; i < n-1; i++) {
		for (int j = 0; j < n - i - 1; j++) {
			if (arr[j] > arr[j + 1])
				swap(&arr[j], &arr[j + 1]);
		}
	}
}

void insertion_sort(int arr[], int n) {
	int key, j;
	for (int i = 1; i < n; i++) {
		key = arr[i];
		for (j = i - 1; j >= 0; j--) {
			if (arr[j] > key)
				arr[j + 1] = arr[j];
			else
				break;
		}
		arr[j + 1] = key;
	}
}