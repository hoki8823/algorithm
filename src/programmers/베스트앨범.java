package programmers;
import java.util.*;

public class 베스트앨범 {
	
	class GenreInfo implements Comparable<GenreInfo> {
		String genre;
		int sum;
		int count;
		int[] index = new int[2];
		
		GenreInfo(String genre) {
			this.genre = genre;
			sum = 0;
			count = 0;
			index[0] = -1;
			index[1] = -1;
		}
		
		int getSum() { return sum; }

		@Override
		public int compareTo(GenreInfo o) {
			int compareQuantity = ((GenreInfo)o).getSum();
			//내림차순
			return compareQuantity - this.sum;
		}
	}

	class MusicInfo implements Comparable<MusicInfo> {

		int id;
		String genre;
		int playCount;
		
		int getPlayCount() { return playCount; }
		
		@Override
		public int compareTo(MusicInfo o) {
			int compareQuantity = ((MusicInfo)o).getPlayCount();
			//내림차순
			return compareQuantity - this.playCount;
		}
	}
	
    public int[] solution(String[] genres, int[] plays) {
        int[] answer = {};
        
        MusicInfo[] musicInfo = new MusicInfo[genres.length];
        HashMap<String, GenreInfo> hm = new HashMap<>();
        GenreInfo[] genreInfo;
        
        // 노래정보를 array에 담고 hashing
        for(int i=0;i<genres.length;i++) {
        	musicInfo[i] = new MusicInfo();
        	musicInfo[i].id = i;
        	musicInfo[i].genre = genres[i];
        	musicInfo[i].playCount = plays[i];
        	
        	//containsKey - 키가 존재하면 true반환
        	if(false == hm.containsKey(genres[i])) {
        		GenreInfo genre = new GenreInfo(genres[i]);
        		hm.put(genres[i], genre);
        	}
        }
        
        //재생홧수 정렬
        Arrays.sort(musicInfo);
        
        //count와 상위 2개를 hashing
        for(MusicInfo music : musicInfo) {
        	GenreInfo genre = hm.get(music.genre);
        	genre.sum += music.playCount;
        	
        	if(genre.count < 2) { genre.index[genre.count] = music.id; }
        	
        	genre.count++;
        }
        
        genreInfo = new GenreInfo[hm.size()];
        int idx = 0;
        int musicCount = 0;
        
        for(String key : hm.keySet()) {
        	genreInfo[idx] = hm.get(key);
        	musicCount += Math.min(genreInfo[idx].count,2);
        	idx++;
        }
        
        //playcount(sum)기준 정렬
        Arrays.sort(genreInfo);
        
        answer = new int[musicCount];
        idx = 0;
        for(GenreInfo genre : genreInfo) {
        	int limit = Math.min(genre.count, 2);
        	for(int i=0;i<limit;i++,idx++) {
        		answer[idx] = genre.index[i];
        	}
        }
        
        return answer;
	}
}
