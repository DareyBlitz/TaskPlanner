package ru.netology.javaqa.taskplanner;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MeetingTest {
    @Test
    public void testMeetingFound() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );
        boolean actual = meeting.matches("Выкатка 3й версии");
        Assertions.assertTrue(actual);
    }

    @Test
    public void testMeetingFoundFalse() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );
        boolean actual = meeting.matches("выпуск");
        Assertions.assertFalse(actual);
    }

}