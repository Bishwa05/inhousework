package com.nayak.lms.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import java.time.LocalDateTime;

import static javax.persistence.GenerationType.AUTO;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LeaveApplication {
    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;
    private String userName;
    private Long leaveTypeId;
    private LocalDateTime startingDate;
    private LocalDateTime endDate;
    private LocalDateTime applyingDate;
    private int noOfDays;
    private String purpose;
    private String applicationStatus;


}
