package com.example.lab008.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class Organizer {
    Long id;
    String organizerName;
    String address;
}
