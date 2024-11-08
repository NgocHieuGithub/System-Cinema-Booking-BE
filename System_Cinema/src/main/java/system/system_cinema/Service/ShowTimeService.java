package system.system_cinema.Service;

import system.system_cinema.DTO.Request.ShowTimeRequestCreate;
import system.system_cinema.DTO.Request.ShowtimeRequest;
import system.system_cinema.DTO.Response.ShowtimeResponse;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public interface ShowTimeService {
    ShowtimeResponse createShowtime(String cinemaHallId, ShowtimeRequest showtimeRequest);
    void createShowTime(ShowTimeRequestCreate requestCreate);
    void updateShowTime(String showTimeId, String roomId);
    void deleteShowTime(String showTimeId);
    List<?> getListShowTime(LocalDate date);
    List<?> getAllShowTimes();
}