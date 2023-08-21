#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
#include <string.h>

bool solution(const char* s) {
    bool answer = true;
    int count = 0;

    // 첫 번째 문자가 ')' 인 경우는 처리하지 않았습니다.
    if (s[0] == ')') {
        return false;
    }

    for (int i = 0; s[i] != '\0'; i++) {
        if (s[i] == '(') {
            count++;
        } else if (s[i] == ')') {
            count--;
        }

        // 괄호의 갯수가 음수가 되는 경우 (')'가 더 많은 경우) 처리하지 않았습니다.
        if (count < 0) {
            return false;
        }

        // 마지막 문자가 '(' 인 경우를 처리하지 않았습니다.
        if (s[i + 1] == '\0' && s[i] == '(') {
            return false;
        }
    }

    // 괄호의 갯수가 0이 아니면 균형이 맞지 않습니다.
    if (count != 0) {
        return false;
    }

    return true;
}