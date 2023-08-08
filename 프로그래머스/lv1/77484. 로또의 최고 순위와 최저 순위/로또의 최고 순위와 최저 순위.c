#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// lottos_len은 배열 lottos의 길이입니다.
// win_nums_len은 배열 win_nums의 길이입니다.
int* solution(int lottos[], size_t lottos_len, int win_nums[], size_t win_nums_len) {
    int* answer = (int*)malloc(2 * sizeof(int));
    int zero = 0;
    int cnt = 0;

    for (int i = 0; i < lottos_len; i++) {
        int num = lottos[i];
        if (num < 0 || num > 45) continue;
        if (num == 0) zero++;

        for (int j = 0; j < win_nums_len; j++) {
            int win = win_nums[j];
            if (num == win) {
                cnt++;
                break;
            }
        }
    }

    answer[0] = (cnt + zero == 0) ? 6 : 7 - (zero + cnt);
    answer[1] = (cnt == 0) ? 6 : 7 - cnt;
    return answer;
}

int main() {
    int lottos[] = {44, 1, 0, 0, 31, 25};
    int win_nums[] = {31, 10, 45, 1, 6, 19};
    int* answer;

    answer = solution(lottos, sizeof(lottos) / sizeof(int), win_nums, sizeof(win_nums) / sizeof(int));

    printf("%d %d\n", answer[0], answer[1]);
    free(answer);
    return 0;
}
