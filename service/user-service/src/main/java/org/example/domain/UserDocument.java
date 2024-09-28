package org.example.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserDocument {

    private String id;
    private String email;
    private String name;
}
