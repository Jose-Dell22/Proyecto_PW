package com.project.dto;

public class Clients_Table {
    private int client_ID;
    private String Client_Name;
    private int project_ID;
    
    public int getClient_ID() {
        return client_ID;
    }
    public void setClient_ID(int client_ID) {
        this.client_ID = client_ID;
    }
    public String getClient_Name() {
        return Client_Name;
    }
    public void setClient_Name(String client_Name) {
        Client_Name = client_Name;
    }
    public int getProject_ID() {
        return project_ID;
    }
    public void setProject_ID(int project_ID) {
        this.project_ID = project_ID;
    }
    @Override
    public String toString() {
        return "Clients_Table [client_ID=" + client_ID + ", Client_Name=" + Client_Name + ", project_ID=" + project_ID
                + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + client_ID;
        result = prime * result + ((Client_Name == null) ? 0 : Client_Name.hashCode());
        result = prime * result + project_ID;
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
        Clients_Table other = (Clients_Table) obj;
        if (client_ID != other.client_ID)
            return false;
        if (Client_Name == null) {
            if (other.Client_Name != null)
                return false;
        } else if (!Client_Name.equals(other.Client_Name))
            return false;
        if (project_ID != other.project_ID)
            return false;
        return true;
    }
    
    
}
