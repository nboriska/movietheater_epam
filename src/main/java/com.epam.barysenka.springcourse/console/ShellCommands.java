package com.epam.barysenka.springcourse.console;

import com.epam.barysenka.springcourse.domain.Auditorium;
import com.epam.barysenka.springcourse.domain.Event;
import com.epam.barysenka.springcourse.domain.User;
import com.epam.barysenka.springcourse.service.AuditoriumService;
import com.epam.barysenka.springcourse.service.EventService;
import com.epam.barysenka.springcourse.service.UserService;
import com.epam.barysenka.springcourse.service.impl.AuditoriumServiceImpl;
import com.epam.barysenka.springcourse.service.impl.EventServiceImpl;
import com.epam.barysenka.springcourse.service.impl.UserServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

import java.util.Set;

/**
 * Spring shell commands definitions.
 */

@ShellComponent
public class ShellCommands {
    private UserService userService;
    private AuditoriumService auditoriumService;
    private EventService eventService;
    private ClassPathXmlApplicationContext springAppContext;

    @ShellMethod("Load Context")
    public void loadContext() {
        springAppContext = new ClassPathXmlApplicationContext(BeanNameProperties.SPRING_CONFIG_LOCATION);
        userService = (UserServiceImpl) springAppContext.getBean(BeanNameProperties.USER_SERVICE_BEAN);
        auditoriumService = (AuditoriumServiceImpl) springAppContext.getBean(BeanNameProperties.AUDITORIUM_SERVICE_BEAN);
        eventService = (EventServiceImpl) springAppContext.getBean(BeanNameProperties.EVENT_SERVICE_BEAN);
    }

    @ShellMethod("Add new User to the list.")
    public User addUser(String userName, String userEmail) {
        return userService.save(new User(userName, userEmail));
    }

    @ShellMethod("Returns all existed Users.")
    public Set<User> getAllUsers(){
        return userService.getAll();
    }

    @ShellMethod("Remove user from the list.")
    public void removeUserById(Long userId){
        userService.removeById(userId);
    }

    @ShellMethod("Get User by Email")
    public User userByEmail(String userEmail){
       return userService.getUserByEmail(userEmail);
    }

    @ShellMethod("Returns auditorium list.")
    public Set<Auditorium> getAllAuditoriums() {
        return auditoriumService.getAll();
    }

    @ShellMethod("Get auditorium by name")
    public Auditorium getAuditoriumByName(String name) {return auditoriumService.getByName(name);}

    @ShellMethod("Get all events.")
    public Set<Event> getAllEvents(){
        return eventService.getAll();
    }
}
