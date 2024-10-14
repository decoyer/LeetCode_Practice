
class Solution {
    public List spiralOrder(int[][] matrix) {
        ArrayList result = new ArrayList<>();

        // 행렬 유효성 확인
        if (matrix == null || matrix.length == 0) {
            return result;
        }

        int row = matrix.length;
        int col = matrix[0].length;
        int top = 0, bottom = row - 1, left = 0, right = col - 1;

        // 행렬 순회 우선순위
        // 1. 오른쪽 요소 확인
        // 2. 아래쪽 요소 확인
        // 3. 왼쪽 요소 확인
        // 4. 위쪽 요소 확인
        while (top <= bottom && left <= right) {
            if (top <= bottom) {
                for (int i = left; i <= right; i++)
                    result.add(matrix[top][i]);
                top++;
            }

            if (left <= right) {
                for (int i = top; i <= bottom; i++)
                    result.add(matrix[i][right]);
                right--;
            }

            if (top <= bottom) {
                for (int i = right; i >= left; i--)
                    result.add(matrix[bottom][i]);
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--)
                    result.add(matrix[i][left]);
                left++;
            }
        }
        
        return result;
    }
}
