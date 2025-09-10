package code.annagloria.best_of_the_year.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import code.annagloria.best_of_the_year.model.Movie;
import code.annagloria.best_of_the_year.model.Song;

@Controller
@RequestMapping("/")
public class BOTYController {

    @GetMapping("/")
    public String getName(Model model) {
        model.addAttribute("name", "Anna Gloria Buchynska");
        model.addAttribute("pageName", "mainPage");
        return "BOTY";
    }

    @GetMapping("/movies")
    public String getMovies(Model model) {
        model.addAttribute("content", getBestMovies());
        model.addAttribute("pageName", "movies");
        return "BOTY";
    }

    @GetMapping("/songs")
    public String getSongs(Model model) {
        model.addAttribute("content", getBestSongs());
        model.addAttribute("pageName", "songs");
        return "BOTY";
    }

    @GetMapping("/movies/{id}")
    public String getMovie(@PathVariable String id, Model model) {
        List<Movie> movies = getBestMovies();

        for (Movie element : movies) {
            if (element.getId().equals(id)) {
                model.addAttribute("media", element);
            }
        }
        model.addAttribute("pageName", "details");
        return "BOTY";
    }

    @GetMapping("/songs/{id}")
    public String getSong(@PathVariable String id, Model model) {
        List<Song> songs = getBestSongs();

        for (Song element : songs) {
            if (element.getId().equals(id)) {
                model.addAttribute("media", element);
            }
        }
        model.addAttribute("pageName", "details");
        return "BOTY";
    }

    private List<Song> getBestSongs() {
        Song song1 = new Song("Heavy Metal", 355, "S1", "Master of Puppets");
        Song song2 = new Song("Thrash Metal", 290, "S2", "Raining Blood");
        Song song3 = new Song("Nu Metal", 225, "S3", "Duality");
        Song song4 = new Song("Symphonic Metal", 320, "S4", "Ghost Love Score");
        Song song5 = new Song("Death Metal", 270, "S5", "Hammer Smashed Face");

        return List.of(song1, song2, song3, song4, song5);
    }

    private List<Movie> getBestMovies() {
        Movie movie1 = new Movie("Christopher Nolan", 150, "M1", "Inception");
        Movie movie2 = new Movie("Peter Jackson", 201, "M2", "The Lord of the Rings: The Fellowship of the Ring");
        Movie movie3 = new Movie("Greta Gerwig", 115, "M3", "Lady Bird");
        Movie movie4 = new Movie("Quentin Tarantino", 154, "M4", "Pulp Fiction");
        Movie movie5 = new Movie("Hayao Miyazaki", 125, "M5", "Spirited Away");
        return List.of(movie1, movie2, movie3, movie4, movie5);
    }

}
