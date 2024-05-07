package it.atac.entities;

import java.util.List;
import java.util.UUID;

public abstract class Vehicle {

  protected UUID id;
  protected static int capacity;
  protected static int maxRoutes;
  protected boolean isWorking;
  protected int totalRoutes;
  protected List<Ticket> tickets;
  protected List<Maintenance> maintenances;
  protected List<Service> services;
  protected List<VehicleRoute> vehicleRouteList ;

  public Vehicle(boolean isWorking, int totalRoutes) {
    this.isWorking = isWorking;
    this.totalRoutes = totalRoutes;
  }

  public Vehicle() {}

  public List<VehicleRoute> getVehicleRouteList() {
    return vehicleRouteList;
  }

  public UUID getId() {
    return id;
  }

  public static int getCapacity() {
    return capacity;
  }

  public static void setCapacity(int capacity) {
    Vehicle.capacity = capacity;
  }

  public static int getMaxRoutes() {
    return maxRoutes;
  }

  public static void setMaxRoutes(int maxRoutes) {
    Vehicle.maxRoutes = maxRoutes;
  }

  public boolean isWorking() {
    return isWorking;
  }

  public void setWorking(boolean working) {
    isWorking = working;
  }

  public int getTotalRoutes() {
    return totalRoutes;
  }

  public void setTotalRoutes(int totalRoutes) {
    this.totalRoutes = totalRoutes;
  }

  public List<Ticket> getTickets() {
    return tickets;
  }

  public List<Maintenance> getMaintenances() {
    return maintenances;
  }

  public List<Service> getServices() {
    return services;
  }

  @java.lang.Override
  public java.lang.String toString() {
    return "Vehicle{" +
            "id=" + id +
            ", isWorking=" + isWorking +
            ", totalRoutes=" + totalRoutes +
            ", tickets=" + tickets +
            '}';
  }
}
