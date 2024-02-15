문제
컴퓨터에 여러가지 파일이 있다. 파일의 종류는 다음과 같다.

music (확장자 : mp3, aac, flac)
image (확장자 : jpg, bmp, gif)
movie (확장자 : mp4, avi, mkv)
other (위와 다른 확장자들, 예 : 7z, txt, zip)
문자열로 예시 입력처럼 당신의 컴퓨터에 있는 파일명과 용량이 입력된다고 했을때 각 종류별로 용량을 계산하여 출력하라. 출력의 순서는 music > image > movie > other 순서이다.

입력은 문자열 배열 strings이고, 각 문자열에는 파일명과 용량이 기록되어 있다.

용량의 단위는 'b'이며, 파일명과 용량은 공백 ' '으로 구분된다.

입력설명
0 < s.length <= 10000
출력설명
종류별 용량을 순서대로 정수 배열로 출력

매개변수 형식
strings = {"mv.song.mp3 11b", "greatSong.flac 1000b", "not3.txt 5b", "video.mp4 200b", "game.exe 100b", "mov1e.mkv 10000b"}

반환값 형식
{1011, 0, 10200, 105}
