package java8practice.song;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TestSongs {
    public static void main(String[] args) {
        List<Songs> songs = SongsData.getSongs();
//        findAllRockSongs(songs);
        /* all songs having artist Beatles, greater than 1995 and starting with "H" */
//		exampleOne(songs);

//		listAllGenres(songs);

        /*take songTitle = "With a Little Help from My Friends" and artist should not be
        beatles*/
//		notOriginalArtist(songs);

//		sortSongs(songs);
//        joinWords(songs);

//        return boolean
//        genreExistOrNot(songs);
        findFirstOccurrence(songs);
    }

    private static void findFirstOccurrence(List<Songs> songs) {
        songs.stream().filter(s->s.getYear() == 1970).limit(1).forEach(System.out::println);

        Optional<Songs> opt = songs.stream().filter(s->s.getYear() == 1970).findFirst();
        System.out.println(opt);
    }

    private static void genreExistOrNot(List<Songs> songs) {
        Boolean exist = songs.stream()
                .anyMatch(s->s.getGenre().equalsIgnoreCase("R&B"));
        System.out.println(exist);
    }

    private static void joinWords(List<Songs> songs) {
        String word = songs.stream().map(s->s.getArtist())
                .distinct()
                .collect(Collectors.joining(","));
        System.out.println(word);
    }

    private static void sortSongs(List<Songs> songs) {
//        songs.stream().sorted((s1,s2)->-s1.getTitle().compareTo(s2.getTitle()))
//                .forEach(System.out::println);
//        By year
        songs.stream().sorted((s1,s2)->
                (s1.getYear()>s2.getYear())?-1:(s1.getYear()<s2.getYear())?1:0)
                .forEach(System.out::println);
    }

    private static void notOriginalArtist(List<Songs> songs) {
        String songTitle = "With a Little Help from My Friends";
        songs.stream().filter(s->s.getTitle().equalsIgnoreCase(songTitle))
                .filter(s->!s.getArtist().contains("Beatles"))
                .forEach(System.out::println);
    }

    private static void listAllGenres(List<Songs> songs) {
        songs.stream().map(s->s.getGenre()).distinct().forEach(System.out::println);
    }

    private static void exampleOne(List<Songs> songs) {
        songs.stream().filter(s->s.getArtist().contains("Beatles"))
                .filter(s->s.getYear()>1995)
                .filter(s->s.getTitle().startsWith("H"))
                .forEach(System.out::println);
    }

    private static void findAllRockSongs(List<Songs> songs) {
       songs.stream().filter(s->s.getGenre().toUpperCase().contains("ROCK"))
               .forEach(System.out::println);
    }
}
