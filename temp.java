///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package ad.project.pkg5;
//
///**
// *
// * @author SMarziSM
// */
//public class temp {
//    public int getLeafVal(Board tmpBoard){
//        int laefVal=0;
//        int computersRowScore= max(max(max(scoreOfRow('c', 0),scoreOfRow('c', 1)),max(scoreOfRow('c', 2),scoreOfRow('c', 3))),max(scoreOfRow('c', 4),scoreOfRow('c', 5)));
//        int computersColScore= max(max(max(scoreOfCol('c', 0),scoreOfCol('c', 1)),max(scoreOfCol('c', 2),scoreOfCol('c', 3))),max(scoreOfCol('c', 4),scoreOfCol('c', 5)));
//        
//        
//        int playersRowScore= min(min(min(scoreOfRow('p', 0),scoreOfRow('p', 1)),min(scoreOfRow('p', 2),scoreOfRow('p', 3))),min(scoreOfRow('p', 4),scoreOfRow('p', 5)));
//        int playersColScore= min(min(min(scoreOfCol('p', 0),scoreOfCol('p', 1)),min(scoreOfCol('p', 2),scoreOfCol('p', 3))),min(scoreOfCol('p', 4),scoreOfCol('p', 5)));
//        
//        
//        return laefVal;
//    }
//    public int win() {
//        //player
//        if (scoreOfRow('c', 1) > 4 || scoreOfRow('c', 2) > 4 || scoreOfRow('c', 3) > 4
//                || scoreOfRow('c', 4) > 4 || scoreOfRow('c', 5) > 4 || scoreOfRow('c', 0) > 4) {
//            return 1;
//        }
//        if (scoreOfCol('c', 1) > 4 || scoreOfCol('c', 2) > 4 || scoreOfCol('c', 3) > 4
//                || scoreOfCol('c', 4) > 4 || scoreOfCol('c', 5) > 4 || scoreOfCol('c', 0) > 4) {
//            return 1;
//        }
//        if (scoreOfDiagonal('c') > 4) {
//
//            return 1;
//        }
//
//        //computer
//        if (scoreOfRow('p', 1) < -4 || scoreOfRow('p', 2) < -4 || scoreOfRow('p', 3) < -4
//                || scoreOfRow('p', 4) < -4 || scoreOfRow('p', 5) < -4 || scoreOfRow('p', 0) < -4) {
//            return -1;
//        }
//        if (scoreOfCol('p', 1) < -4 || scoreOfCol('p', 2) < -4 || scoreOfCol('p', 3) < -4
//                || scoreOfCol('p', 4) < -4 || scoreOfCol('p', 5) < -4 || scoreOfCol('p', 0) < -4) {
//            return -1;
//        }
//        if (scoreOfDiagonal('p') < -4) {
//
//            return -1;
//        } else {
//
//            return 0;
//        }
//    }
//
//    int scoreOfRow(char c, int rowNum) {
//        int scoreOfRow = 0;
//        for (int k = 0; k < 5; k++) {
//            if (c == 'c') {
//                if (board[rowNum][k] == 1) {
//                    scoreOfRow += board[rowNum][k];
//                }
//            } else if (c == 'p') {
//                if (board[rowNum][k] == -1) {
//                    scoreOfRow += board[rowNum][k];
//                }
//            }
//
//        }
//        System.out.println("scoreOfRow "+ scoreOfRow);
//        return scoreOfRow;
//    }
//
//    int scoreOfCol(char c, int colNum) {
//        int scoreOfCol = 0;
//        for (int k = 0; k < 5; k++) {
//            if (c == 'c') {
//                if (board[k][colNum] == 1) {
//                    scoreOfCol += board[k][colNum];
//                }
//            } else if (c == 'p') {
//                if (board[k][colNum] == -1) {
//                    scoreOfCol += board[k][colNum];
//                }
//            }
//
//        }
//        
//        System.out.println("scoreOfCol "+ scoreOfCol);
//        return scoreOfCol;
//    }
//
//    int scoreOfDiagonal(char c) {
//        int scoreOfMainD = 0, scoreOfMinorD = 0;
//
//        for (int i = 0; i < 5; i++) {
//
//            for (int j1 = 0; j1 < 6; j1++) {
//
//                if (c == 'c') {
//                    if (board[i][j1] == 1) {
//                        scoreOfMainD += board[i][j1];
//                    }
//                } else if (c == 'p') {
//                    if (board[i][j1] == -1) {
//                        scoreOfMainD += board[i][j1];
//                    }
//                }
//
//            }
//            for (int j2 = 5; j2 > -1; j2--) {
//                if (c == 'c') {
//                    if (board[i][j2] == 1) {
//                        scoreOfMinorD += board[i][j2];
//                    }
//                } else if (c == 'p') {
//                    if (board[i][j2] == -1) {
//                        scoreOfMinorD += board[i][j2];
//                    }
//                }
//            }
//        }
//        if (c == 'c') {
//            
//        System.out.println("scoreOfMainD "+ scoreOfMainD);
//        System.out.println("scoreOfMinorD "+ scoreOfMinorD);
//            return max(scoreOfMainD, scoreOfMinorD);
//        } else {
//            
//        System.out.println("scoreOfMainD "+ scoreOfMainD);
//        System.out.println("scoreOfMinorD "+ scoreOfMinorD);
//            return min(scoreOfMainD, scoreOfMinorD);
//        }
//    }
//}
