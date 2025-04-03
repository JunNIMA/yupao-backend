package com.yupi.yupao.utils;

import java.util.List;

public class AlgorithmUtils {
        // 动态规划求解编辑距离
        public static int editDistance(String str1, String str2) {
            int m = str1.length();
            int n = str2.length();

            // dp数组，dp[i][j]表示将str1的前i个字符变为str2的前j个字符的编辑距离
            int[][] dp = new int[m + 1][n + 1];

            // 初始化边界情况
            for (int i = 0; i <= m; i++) {
                dp[i][0] = i; // 删除操作
            }
            for (int j = 0; j <= n; j++) {
                dp[0][j] = j; // 插入操作
            }

            // 填充dp数组
            for (int i = 1; i <= m; i++) {
                for (int j = 1; j <= n; j++) {
                    if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                        dp[i][j] = dp[i - 1][j - 1]; // 相等，不需要操作
                    } else {
                        dp[i][j] = Math.min(dp[i - 1][j], // 删除
                                Math.min(dp[i][j - 1], // 插入
                                        dp[i - 1][j - 1])) + 1; // 替换
                    }
                }
            }

            // 返回编辑距离
            return dp[m][n];
        }

    public static int listEditDistance(List<String> str1, List<String> str2) {
        int m = str1.size();
        int n = str2.size();

        // dp数组，dp[i][j]表示将str1的前i个字符变为str2的前j个字符的编辑距离
        int[][] dp = new int[m + 1][n + 1];

        // 初始化边界情况
        for (int i = 0; i <= m; i++) {
            dp[i][0] = i; // 删除操作
        }
        for (int j = 0; j <= n; j++) {
            dp[0][j] = j; // 插入操作
        }

        // 填充dp数组
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (str1.get(i-1).equals(str2.get(j-1))) {
                    dp[i][j] = dp[i - 1][j - 1]; // 相等，不需要操作
                } else {
                    dp[i][j] = Math.min(dp[i - 1][j], // 删除
                            Math.min(dp[i][j - 1], // 插入
                                    dp[i - 1][j - 1])) + 1; // 替换
                }
            }
        }

        // 返回编辑距离
        return dp[m][n];
    }
}
