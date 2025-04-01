//����2579 - Silver3(���̳��� ���α׷���)
#include <iostream>
#include <vector>

using namespace std;

int getMaxScore(int n, vector<int>& score) {
    //dp[i]: i��° ��ܱ��� ���� �� ������ �ִ�
    vector<int> dp(n + 1, 0);

    //�ʱ갪
    dp[1] = score[1];
    dp[2] = score[1] + score[2];

    //��ȭ��
    for (int i = 3; i <= n; i++) {
        //�� ĭ�� �������� ���� �� �����Ƿ� 
        int one_step_before = dp[i - 3] + score[i - 1];
        int two_step_before = dp[i - 2];
        dp[i] = max(one_step_before, two_step_before) + score[i];
    }
    return dp[n];
}

int main() {
    //�Է�
    int n;
    cin >> n;
    vector<int> score(n + 1, 0);

    //score[i] �϶��̰� i��° �ݾ��̱� �ٷ���
    for (int i = 1; i <= n; i++) {
        cin >> score[i];
    }

    //����
    int answer = getMaxScore(n, score);

    //���
    cout << answer;

    return 0;
}