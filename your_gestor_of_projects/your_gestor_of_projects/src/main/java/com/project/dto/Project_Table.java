package com.project.dto;

public class Project_Table {
    private int Project_Id;
    private String Project_Name;
    private double price;
    public Project_Table() {}
    
    public Project_Table(int project_Id, String project_Name, double price) {
        Project_Id = project_Id;
        Project_Name = project_Name;
        this.price = price;
    }
        public String getType() {
            return getType();
        }
        
    public int getProject_Id() {
        return Project_Id;
    }

    public void setProject_Id(int project_Id) {
        Project_Id = project_Id;
    }

    public String getProject_Name() {
        return Project_Name;
    }

    public void setProject_Name(String project_Name) {
        Project_Name = project_Name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Project [Project_Id=" + Project_Id + ", Project_Name=" + Project_Name + ", price=" + price + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Project_Id;
        result = prime * result + ((Project_Name == null) ? 0 : Project_Name.hashCode());
        long temp;
        temp = Double.doubleToLongBits(price);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Project_Table other = (Project_Table) obj;
        if (Project_Id != other.Project_Id)
            return false;
        if (Project_Name == null) {
            if (other.Project_Name != null)
                return false;
        } else if (!Project_Name.equals(other.Project_Name))
            return false;
        if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
            return false;
        return true;
    }


    
}
