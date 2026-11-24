package com.ouahidi.commandems.modele;

import lombok.*;



@Getter @Setter  @NoArgsConstructor @AllArgsConstructor
@ToString @Builder
public class Client {
    private Long id;
    private String name;
    private String email;
}
