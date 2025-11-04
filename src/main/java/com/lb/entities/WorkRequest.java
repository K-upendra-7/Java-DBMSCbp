package com.lb.entities;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Table(name = "work_requests")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class WorkRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "constructor_id",referencedColumnName = "user_id" ,nullable = false)
    private Constructor constructor;
   

     @ManyToOne
    @JoinColumn(name = "mediator_id",referencedColumnName = "user_id")
    private Mediator mediator;



    @Column(length = 100)
    private String region;

    @Transient
    private String mediatorName;

    @Transient
    private String constructorName;


    private Integer numLabourers;

    private LocalDate startDate;

    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private WorkStatus status;
    
    
    // Enum field for status
}
