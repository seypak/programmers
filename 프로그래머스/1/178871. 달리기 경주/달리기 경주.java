import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = new String[players.length];
        
        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<players.length; i++) {
            map.put(players[i], i);
        }
        for(int i=0; i<callings.length; i++) {
            String callPlayer = callings[i];
            int callIndex = map.get(callPlayer);
            // 기존 순위를 +1
            // 1. players의 순위를 변경한다.
            String temp = players[callIndex-1];
            players[callIndex-1] = callPlayer;
            players[callIndex] = temp;
            // 순위를 -1
            // 2. map에 담긴 플레이어들의 순위를 변경한다.
            map.put(callPlayer, callIndex-1);
            map.put(temp, callIndex);
        }
        
        List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(map.entrySet());
        list.sort((o1, o2) -> o1.getValue() - o2.getValue());
        
        // for(int i=0; i<list.size(); i++) {
        //     Map.Entry<String, Integer> entry = list.get(i);
        //     answer[i] = entry.getKey();
        // }
        
        return list.stream().map(x -> x.getKey()).toArray(String[]::new);
    }
}