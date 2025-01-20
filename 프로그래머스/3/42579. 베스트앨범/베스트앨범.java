import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        Map<String, List<Song>> map = new HashMap<>();
        Map<String, Integer> cntMap = new HashMap<>();
        
        for (int i = 0; i < genres.length; i++) {
            List<Song> list = map.getOrDefault(genres[i], new ArrayList<>());
            Song song = new Song(i, plays[i]);
            
            int idx = -1;
            for (int j = 0; j < list.size(); j++) {
                if (song.play > list.get(j).play || 
                    song.play == list.get(j).play && song.no < list.get(j).no) {
                    idx = j;
                    break;
                }
            }
            if (idx == -1) {
                list.add(song);
            } else {
                list.add(idx, song);
            }
            
            map.put(genres[i], list);
            
            Integer cnt = cntMap.getOrDefault(genres[i], 0);
            cntMap.put(genres[i], cnt + song.play);
        }
        
        List<String> sort = new ArrayList<>(map.keySet());
        sort.sort((v1, v2) -> cntMap.get(v2) - cntMap.get(v1));
        
        List<Integer> answer = new ArrayList<>();
        for (String s : sort) {
            List<Song> songs = map.get(s);
            
            for (int i = 0; i < songs.size(); i++) {
                answer.add(songs.get(i).no);
                if (i == 1) break;
            }
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
    
    class Song {
        int no;
        int play;
        
        Song(int no, int play) {
            this.no = no;
            this.play = play;
        }
        
        public String toString() {
            return String.format("{no:%d play:%d}", no, play);
        }
    }
}