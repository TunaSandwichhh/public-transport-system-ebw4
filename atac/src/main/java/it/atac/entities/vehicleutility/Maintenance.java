package it.atac.entities.vehicleutility;

import it.atac.entities.enums.MaintenanceType;
import it.atac.entities.vehicles.Vehicle;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "maintenances")
public class Maintenance {

    @Id
    @GeneratedValue
    private UUID id;

    @Column(name = "start_date", nullable = false)
    private LocalDate startDate;

    @Column(name = "end_date", nullable = false)
    private LocalDate endDate;

    @ManyToOne
    @JoinColumn(name = "vehicle_id")
    private Vehicle vehicle;

    private String description;

    @Enumerated(EnumType.STRING)
    @Column(name = "maintenance_type", nullable = false)
    private MaintenanceType maintenanceType;

    public Maintenance(LocalDate startDate, LocalDate endDate, Vehicle vehicle, String description, MaintenanceType maintenanceType) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.vehicle = vehicle;
        this.description = description;
        this.maintenanceType = maintenanceType;
    }

    public Maintenance(){}

    public UUID getId() {
        return id;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public MaintenanceType getMaintenanceType() {
        return maintenanceType;
    }

    public void setMaintenanceType(MaintenanceType maintenanceType) {
        this.maintenanceType = maintenanceType;
    }

    @Override
    public String toString() {
        return "Maintenance{" +
                "id=" + id +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", vehicle=" + vehicle +
                ", description='" + description + '\'' +
                ", maintenanceType=" + maintenanceType +
                '}';
    }
}
