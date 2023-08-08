#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <stdbool.h>

#define MAX_ID_LEN 11
#define MAX_REPORT_LEN 1001

int index_of_list(char *id_list[], char *s, int size) {
    int i;
    for (i = 0; i < size; i++) {
        if (strcmp(id_list[i], s) == 0) {
            return i;
        }
    }
    return i;
}

int *solution(char *id_list[], int id_list_size, char *report[], int report_size, int k) {
    int i, j;
    int *answer = (int *)calloc(id_list_size, sizeof(int));
    int num_reported[MAX_REPORT_LEN] = {0};
    char mail_to[MAX_REPORT_LEN][MAX_REPORT_LEN][MAX_ID_LEN] = {0};

    for (i = 0; i < report_size; i++) {
        char sender[MAX_ID_LEN], receiver[MAX_ID_LEN];
        sscanf(report[i], "%s %s", sender, receiver);

        int receiver_index = index_of_list(id_list, receiver, id_list_size);
        bool already_reported = false;

        for (j = 0; j < num_reported[receiver_index]; j++) {
            if (strcmp(sender, mail_to[receiver_index][j]) == 0) {
                already_reported = true;
                break;
            }
        }

        if (!already_reported) {
            strncpy(mail_to[receiver_index][num_reported[receiver_index]], sender, MAX_ID_LEN - 1);
            mail_to[receiver_index][num_reported[receiver_index]][MAX_ID_LEN - 1] = '\0';
            num_reported[receiver_index]++;
        }
    }

    for (i = 0; i < id_list_size; i++) {
        if (num_reported[i] >= k) {
            for (j = 0; j < num_reported[i]; j++) {
                answer[index_of_list(id_list, mail_to[i][j], id_list_size)]++;
            }
        }
    }

    return answer;
}

int main() {
    char *id_list[] = {"muzi", "frodo", "apeach", "neo"};
    char *report[] = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
    int k = 2;

    int id_list_size = sizeof(id_list) / sizeof(id_list[0]);
    int report_size = sizeof(report) / sizeof(report[0]);

    int *result = solution(id_list, id_list_size, report, report_size, k);
    for (int i = 0; i < id_list_size; i++) {
        printf("%d ", result[i]);
    }

    free(result);
    return 0;
}
