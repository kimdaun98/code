#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// arr_len은 배열 arr의 길이입니다.
double solution(int arr[], size_t arr_len) {
    double answer = 0;
    for(int in=0; in< arr_len; in++){
        answer = answer+arr[in];
    }
    answer = answer/arr_len;
    return answer;
}