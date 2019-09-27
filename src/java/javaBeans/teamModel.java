/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaBeans;

/**
 *
 * @author Admin
 */
public class teamModel {
    private int team_id;
    private String team_name;
    private String team_icon;
    private String team_code;
    private String description;
    private String maker;
    private String team_status;

    public teamModel() {
    }

    public teamModel(int team_id, String team_name, String team_icon, String team_code, String description, String maker, String team_status) {
        this.team_id = team_id;
        this.team_name = team_name;
        this.team_icon = team_icon;
        this.team_code = team_code;
        this.description = description;
        this.maker = maker;
        this.team_status = team_status;
    }

    public String getTeam_status() {
        return team_status;
    }

    public void setTeam_status(String team_status) {
        this.team_status = team_status;
    }

    public int getTeam_id() {
        return team_id;
    }

    public void setTeam_id(int team_id) {
        this.team_id = team_id;
    }

    public String getTeam_name() {
        return team_name;
    }

    public void setTeam_name(String team_name) {
        this.team_name = team_name;
    }

    public String getTeam_icon() {
        return team_icon;
    }

    public void setTeam_icon(String team_icon) {
        this.team_icon = team_icon;
    }

    public String getTeam_code() {
        return team_code;
    }

    public void setTeam_code(String team_code) {
        this.team_code = team_code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }
    
}
