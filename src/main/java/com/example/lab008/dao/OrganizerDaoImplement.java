package com.example.lab008.dao;

import com.example.lab008.entity.Event;
import com.example.lab008.entity.Organizer;
import org.springframework.context.annotation.Profile;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Repository
@Profile("manual")
public class OrganizerDaoImplement implements OrganizerDao {
    List<Organizer> orList;

    @PostConstruct
    public void init() {
        orList = new ArrayList<>();
        orList.add(Organizer.builder()
                .id(1L)
                .organizerName("Sheila Mosley")
                .address("9191 Corona Court " +
                        "Champlin, MN 55316")
                .build());
        orList.add(Organizer.builder()
                .id(2L)
                .organizerName("Violet French")
                .address("7430 Deerfield Circle " +
                        "Mechanicsburg, PA 17050")
                .build());
        orList.add(Organizer.builder()
                .id(3L)
                .organizerName("Rahul Porter")
                .address("176 Maiden St. " +
                        "Whitehall, PA 18052")
                .build());
        orList.add(Organizer.builder()
                .id(4L)
                .organizerName("Padraig James")
                .address("586 Washington St. " +
                        "Newark, NJ 07103")
                .build());
        orList.add(Organizer.builder()
                .id(5L)
                .organizerName("Shoaib Morse")
                .address("7610 Westminster Lane " +
                        "Vincentown, NJ 08088")
                .build());
        orList.add(Organizer.builder()
                .id(6L)
                .organizerName("Siena Mcdonnell")
                .address("9107 Swanson Street " +
                        "Worcester, MA 01604")
                .build());
        orList.add(Organizer.builder()
                .id(7L)
                .organizerName("Mirza Russo")
                .address("7843 Forest St. " +
                        "Fernandina Beach, FL 32034")
                .build());
        orList.add(Organizer.builder()
                .id(8L)
                .organizerName("Tyler-James Preece")
                .address("8638 Oak Meadow St. " +
                        "Port Saint Lucie, FL 34952")
                .build());
        orList.add(Organizer.builder()
                .id(9L)
                .organizerName("Haseeb Justice")
                .address("92 W. Foster Court " +
                        "Warminster, PA 18974")
                .build());
    }

    @Override
    public Integer getOrganizerSize() {
        return orList.size();
    }

    @Override
    public Page<Organizer> getOrganizers(Integer pageSize, Integer page) {
        pageSize = pageSize == null ? orList.size() : pageSize;
        page = page == null ? 1 : page;
        int firstIndex = (page - 1) * pageSize;
        return new
                PageImpl<Organizer>(orList.subList(firstIndex, firstIndex + pageSize),
                PageRequest.of(page, pageSize), orList.size());
    }

    @Override
    public Organizer getOrganizer(Long id) {
        return orList.stream().filter(event -> event.getId().equals(id)).findFirst().orElse(null);
    }

    @Override
    public Organizer save(Organizer organizer) {
        organizer.setId(orList.get(orList.size()-1).getId()+1);
        orList.add(organizer);
        return organizer;
    }
}
