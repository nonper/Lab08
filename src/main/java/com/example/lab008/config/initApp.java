package com.example.lab008.config;

import com.example.lab008.entity.Organizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import com.example.lab008.entity.Event;
import com.example.lab008.repository.EventReps;
import com.example.lab008.repository.OrganizerRepo;

    @Component
    public class initApp implements ApplicationListener<ApplicationReadyEvent> {
        @Autowired
        EventReps eventRepository;
        @Autowired
        OrganizerRepo organizerRepo;

        @Override
        public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent) {
            eventRepository.save(Event.builder()
                    .id(123L)
                    .category("animal welfare")
                    .title("Cat Adoption Day")
                    .description("Find your new feline friendat this event.")
                    .location("Meow Town")
                    .date("January 28, 2022")
                    .time("12:00")
                    .petAllowed(true)
                    .organizer("Kat Laydee")
                    .build());
            eventRepository.save(Event.builder()
                    .id(456L)
                    .category("food")
                    .title("Community Gardening")
                    .description("Join us as we tend to the community edible plants.")
                    .location("Flora City")
                    .date("March 14, 2022")
                    .time("10:00")
                    .petAllowed(true)
                    .organizer("Fren Pollin")
                    .build());
            eventRepository.save(Event.builder()
                    .id(789L)
                    .category("sustainability")
                    .title("Beach Cleanup")
                    .description("Help pick up trash along the shore.")
                    .location("Playa Del Carmen")
                    .date("July 22, 2022")
                    .time("11:00")
                    .petAllowed(false)
                    .organizer("Carey Wales")
                    .build());
            eventRepository.save(Event.builder()
                    .id(1001L)
                    .category("animal welfare")
                    .title("Dog Adoption Day")
                    .description("Find your new canine friend at this event.")
                    .location("Woof Town")
                    .date("August 28, 2022")
                    .time("12:00")
                    .petAllowed(true)
                    .organizer("Dawg Dahd")
                    .build());
            eventRepository.save(Event.builder()
                    .id(1002L)
                    .category("food")
                    .title("Canned Food Drive")
                    .description("Bring your canned food to donate to those in need.")
                    .location("Tin City")
                    .date("September 14, 2022")
                    .time("3:00")
                    .petAllowed(true)
                    .organizer("Kahn Opiner")
                    .build());
            eventRepository.save(Event.builder()
                    .id(1003L)
                    .category("sustainability")
                    .title("Highway Cleanup")
                    .description("Help pick up trash along the highway.")
                    .location("Highway 50")
                    .date("July 22, 2022")
                    .time("11:00")
                    .petAllowed(false)
                    .organizer("Brody Kill")
                    .build());
            organizerRepo.save(Organizer.builder()
                    .id(1L)
                    .organizerName("Sheila Mosley")
                    .address("9191 Corona Court " +
                            "Champlin, MN 55316")
                    .build());
            organizerRepo.save(Organizer.builder()
                    .id(2L)
                    .organizerName("Violet French")
                    .address("7430 Deerfield Circle " +
                            "Mechanicsburg, PA 17050")
                    .build());
            organizerRepo.save(Organizer.builder()
                    .id(3L)
                    .organizerName("Rahul Porter")
                    .address("176 Maiden St. " +
                            "Whitehall, PA 18052")
                    .build());
            organizerRepo.save(Organizer.builder()
                    .id(4L)
                    .organizerName("Padraig James")
                    .address("586 Washington St. " +
                            "Newark, NJ 07103")
                    .build());
            organizerRepo.save(Organizer.builder()
                    .id(5L)
                    .organizerName("Shoaib Morse")
                    .address("7610 Westminster Lane " +
                            "Vincentown, NJ 08088")
                    .build());
            organizerRepo.save(Organizer.builder()
                    .id(6L)
                    .organizerName("Siena Mcdonnell")
                    .address("9107 Swanson Street " +
                            "Worcester, MA 01604")
                    .build());
            organizerRepo.save(Organizer.builder()
                    .id(7L)
                    .organizerName("Mirza Russo")
                    .address("7843 Forest St. " +
                            "Fernandina Beach, FL 32034")
                    .build());
            organizerRepo.save(Organizer.builder()
                    .id(8L)
                    .organizerName("Tyler-James Preece")
                    .address("8638 Oak Meadow St. " +
                            "Port Saint Lucie, FL 34952")
                    .build());

        }
    }

