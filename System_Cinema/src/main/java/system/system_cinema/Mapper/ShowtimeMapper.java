package system.system_cinema.Mapper;

import org.springframework.stereotype.Component;
import system.system_cinema.DTO.Request.ShowtimeRequest;
import system.system_cinema.DTO.Response.ShowtimeResponse;
import system.system_cinema.Model.Movie;
import system.system_cinema.Model.Showtime;

import java.time.LocalDateTime;

@Component
public class ShowtimeMapper {

    public ShowtimeResponse toShowtimeResponse(Showtime showtime) {
        return ShowtimeResponse.builder()
                .id(showtime.getId())
                .movieTitle(showtime.getMovie().getTitle())
                .startTime(showtime.getStartTime())
                .endTime(showtime.getEndTime())
                .build();
    }

    public Showtime toShowtime(ShowtimeRequest showtimeRequest, Movie movie) {
        return Showtime.builder()
                .movie(movie)
                .startTime(showtimeRequest.getStartTime())
                .endTime(showtimeRequest.getEndTime())
                .dateCreate(LocalDateTime.now())  // Thời gian tạo hiện tại
                .build();
    }
}