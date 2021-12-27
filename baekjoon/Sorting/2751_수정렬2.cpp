#include <stdio.h>
#include <stdlib.h>

void heap_sort(int arr[], int n);
void merge_sort(int arr[], int begin, int end);
void merge(int arr[], int left, int mid, int right);

int main(void) {
	int n;
	int* arr;
	scanf("%d", &n);
	arr = (int*)malloc(sizeof(int) * n);
	for (int i = 0; i < n; i++) {
		//scanf("%d", &arr[i]);
		arr[i] = rand() % 300;
	}

	merge_sort(arr, 0, n - 1);

	for (int i = 0; i < n; i++) {
		printf("%d\n", arr[i]);
	}
	
	return 0;
}

void merge_sort(int arr[], int begin, int end) {
	if (begin >= end) return;
	int mid = begin + (end - begin) / 2;
	merge_sort(arr, begin, mid);
	merge_sort(arr, mid + 1, end);
	merge(arr, begin, mid, end);
}

void merge(int arr[], int left, int mid, int right) {
	int* left_temp = (int*)malloc(sizeof(int) * (mid - left + 1));
	int* right_temp = (int*)malloc(sizeof(int) * (right - mid));

	for (int i = 0; i < mid-left+1; i++) {
		left_temp[i] = arr[left + i];
	}
	for (int i = 0; i < right-mid; i++) {
		right_temp[i] = arr[mid + 1 + i];
	}

	int l_idx = 0, r_idx = 0;
	int arr_idx = left;

	while (l_idx < mid - left + 1 && r_idx < right - mid) {
		if (left_temp[l_idx] <= right_temp[r_idx])
			arr[arr_idx++] = left_temp[l_idx++];
		else
			arr[arr_idx++] = right_temp[r_idx++];
	}

	while (l_idx < mid - left + 1) {
		arr[arr_idx++] = left_temp[l_idx++];
	}
	while (r_idx < right - mid) {
		arr[arr_idx++] = right_temp[r_idx++];
	}
}