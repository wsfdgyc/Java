package DaoInfo;

import Model.Film;
import Model.FilmComment;
import Model.FilmListing;

import java.util.List;


public interface FilmDaoInf
{

    List<Film> getAllFilms();
    List<FilmComment> getAllFilmComment();
    List<FilmListing> getAllFilmListing(int filmID);
    public  void viewFilmList();

}