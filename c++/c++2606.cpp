//����2606 - Silver3
//1�� ��ǻ�͸� ���� �� ���̷����� �ɸ��� �Ǵ� ��ǻ���� ��? 
#include <iostream>
#include <vector>
using namespace std;

vector <vector<int>> graph;      //���� ����Ʈ �׷����� �湮 üũ �迭 ����
vector<bool> visited;

int count = 0;             // 1�� ��ǻ�͸� ���� ������ ��ǻ�� ��

// DFS �Լ�: ���� ��忡�� ���� ������ Ž���ϸ� ���� Ȯ��
void dfs(int node) {
    visited[node] = true;

    for (int i = 0; i < graph[node].size(); i++) {
        int next = graph[node][i];
        if (!visited[next]) {
            count++;        // ���� ������ ��ǻ�� �� ����
            dfs(next);      // ��� ȣ��� ����� ��ǻ�� Ž��
        }
    }
}


int main() {
    ios::sync_with_stdio(false);
    cin.tie(NULL);

    int n, m;
    cin >> n >> m;

    // �׷����� �湮 �迭 ũ�� ���� (1������ �����ϹǷ� n+1)
    graph.resize(n + 1);
    visited.resize(n + 1, false);

    // ��Ʈ��ũ ���� ���� �Է�
    for (int i = 0; i < m; i++) {
        int a, b;
        cin >> a >> b;
        // ����� ����
        graph[a].push_back(b);
        graph[b].push_back(a);
    }

    // 1�� ��ǻ�Ϳ��� DFS ����
    dfs(1);

    // 1���� ������ ������ ��ǻ�� �� ���
    cout << count << endl;

    return 0;
}